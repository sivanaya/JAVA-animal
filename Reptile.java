
public class Reptile extends Animal {

	public Reptile(String name) {//sending to animal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return checkreptile(sudoku, row, col);

	}

	public boolean checkreptile(Animal[][] sudoku, int row, int col) {//checking for only one reptile in each col

		boolean Legalvalue = true;

		for (int t = row; t < 6 && Legalvalue; t++)
			if (sudoku[t][col] instanceof Reptile)
				Legalvalue = false;

		for (int m = row; m >= 0 && Legalvalue; m--)
			if (sudoku[m][col] instanceof Reptile)
				Legalvalue = false;

		return Legalvalue;

	}
}
