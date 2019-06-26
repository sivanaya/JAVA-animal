import java.util.Scanner;

public class sudokuAnimal {

	public static int col, row, k = 0;
	//public static Animal i;
	static String given;
	public static Animal[][] sudoku = new Animal[6][6];
	public static Animal[][] copySudoku = new Animal[6][6];
	public static Animal[] AnimalList = { new monkey("monkey"), new zebra("zebra"), new lion("lion"),
			new viper("viper"), new iguana("iguana"), new turtles("turtle"), new shark("shark"), new piranha("piranha"),
			new salmon("salmon") };
	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {

		placeGivens();
		putNullOnBoard();
		pointOnFirstCell();
		while (!endOfSudokuBoard()) {
			while (startTheGame()) {
				nextPosition();
				finnishGame();
			}
			backToLastK();
		}

	}

	public static void placeGivens() {//getting the animals inputs from the users

		welcomeToFatma();
		getGiven();
		while (!checkNot00()) {
			getLocation();
			putAnimal();
			getGiven();
		}
		copySudoku();
		
		
		
	}

	public static void putNullOnBoard() {//method that put null on board where there is not a given

		for (int z = 0; z < sudoku.length; z++) {
			for (int x = 0; x < sudoku.length; x++) {

				if (!(sudoku[z][x] != null))
					sudoku[z][x] = null;

			}
		}
	}

	public static void pointOnFirstCell() {//pointing on first cell

		row = 0;
		col = 0;

	}

	public static boolean endOfSudokuBoard() {//not the end of the game

		return (row == 6);
	}

	public static boolean startTheGame() {//start the game after the users give all the givens

		if (checkExist())
			return true;

		while (checkK()) {

			if (canPlaceAnimal()) {
				putAnimalList();

				return true;
			}
			PlusK();

		}
		return false;

	}

	public static void nextPosition() {//continue to next position in board

		k = 0;
		if (col == 5) {
			col = 0;
			row = row + 1;
		} else
			col++;
	}

	public static void finnishGame() {//method that check if were finished the game successfully

		if (endOfSudokuBoard()) {
			printSudoku();
			System.exit(0);
		}
		return;

	}

	public static void backToLastK() {//running backward on the sudoku board

		minusPlace();

		while (checkExist()) {
			minusPlace();
			if (gameLost())
				System.exit(0);
		}
	}

	public static boolean checkNot00() {//when the user finish to give all his given

		return (given.equals("00"));
	}

	public static void getLocation() {//function that split the string the user give to row, col and given

		row = (int) given.charAt(0) - '0';
		col = (int) given.charAt(1) - '0';
		given = given.substring(2);

	}

	public static void putAnimal() {//checking the type (name) of the animal and creating new object (animal) and placing it on the board

		if (given.equals("monkey"))
			sudoku[row][col] = new monkey(given);

		if (given.equals("zebra"))
			sudoku[row][col] = new zebra(given);

		if (given.equals("lion"))
			sudoku[row][col] = new lion(given);

		if (given.equals("viper"))
			sudoku[row][col] = new viper(given);

		if (given.equals("iguana"))
			sudoku[row][col] = new iguana(given);

		if (given.equals("turtle"))
			sudoku[row][col] = new turtles(given);

		if (given.equals("shark"))
			sudoku[row][col] = new shark(given);

		if (given.equals("piranha"))
			sudoku[row][col] = new piranha(given);

		if (given.equals("salmon"))
			sudoku[row][col] = new salmon(given);

	}

	public static void getGiven() {//getting the given (animal) from the user

		System.out.println("Please enter a given animal and its location");
		given = sc.nextLine();

	}

	public static void copySudoku() {//copy the original sudoku- before start playing

		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {

				copySudoku[i][j] = sudoku[i][j];
			}

		}

	}

	public static boolean checkExist() {//not given

		return (copySudoku[row][col] != null);

	}

	public static boolean checkK() {//checking if were not in the end of AnimalList- meaning we checked all the animals by there rules.

		if (k > 8) {//end of AnimalList array

			sudoku[row][col] = null;
			
			return false;
		}

		return true;
	}

	public static boolean canPlaceAnimal() {//sending the animal the the checkGiven method in all the animals classes

		return (AnimalList[k].checkGiven(sudoku, row, col));
	}

	public static void putAnimalList() {//if by all the rules we can place the animal- placing the animal

		sudoku[row][col] = AnimalList[k];
	}

	public static void PlusK() {

		k++;
	}

	public static void printSudoku() {//printing if there is a solution

		System.out.println("Looking for a solution...");
		System.out.println("This is the solution:");

		for (int rows = 0; rows < sudoku.length; rows++) {

			for (int cols = 0; cols < sudoku.length; cols++) {
				
				System.out.print(sudoku[rows][cols].getName());
				
				numOf_space(sudoku[rows][cols].getName());//function of spacing
				
				if (cols == 5)
					System.out.println();
			}
		}

	}

	public static void numOf_space(String name) {// how much spacing to put between each animal printing

		int spacing = 10 - (name.length() + 1);
		for (int s = 0; s <= spacing; s++)
			System.out.print(" ");
	}

	public static void minusPlace() {//going back one position on the sudoku board

		if (col == 0) {
			col = 5;
			row = row - 1;
		} else {
			col--;
		}

		findK();
	}

	public static void findK() {//find out in which K position in the AnimalList array are we in

		for (int place = 0; place < AnimalList.length; place++) {
			if (sudoku[row][col].getName().equals(AnimalList[place].getName())) {
				k = place + 1;
				break;
			}
		}

	}

	public static boolean gameLost() {//there is no solution to the sudoku

		if (row == 0 && col == 0) {
			System.out.println("Looking for a solution...");
			System.out.println("no valid solution");
			return true;
		}

		return false;
	}

	public static void welcomeToFatma() {//printing 

		System.out.println("Welcome to java-Sudoku! To start the game press enter");

		sc.nextLine();
	}
} 				
	      			


