
public class Mammal extends Animal {

	public Mammal(String name) {//sending to animal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {//checking rules

		return (checkRowMamal(sudoku, row, col) && canPlaceMamal(sudoku, row, col));

	}

	private boolean checkRowMamal(Animal[][] sudoku, int row, int col) {//checking sudoku row for another mammal
		boolean Legalvalue = true;

		for (int z = col; z < 6 && Legalvalue; z++)
			if (sudoku[row][z] instanceof Mammal)
				Legalvalue = false;

		for (int k = col; k >= 0 && Legalvalue; k--)
			if (sudoku[row][k] instanceof Mammal)
				Legalvalue = false;

		return Legalvalue;
	}

	private boolean canPlaceMamal(Animal[][] sudoku, int row, int col) {//checking diagonal for vipers

		boolean ans = true;
		for (int i = 0; i < 6 && ans; i++) {
			for (int j = 0; j < 6 && ans; j++) {
				if (sudoku[i][j] instanceof viper) {
					ans = checkforviper(i, j, row, col);

				}

			}
		}
		return ans;
	}

	private boolean checkforviper(int i, int j, int row, int col) {//checking diagonal

		if ((row - i) == (col - j))
			return false;
		if ((row - i) == (j - col))
			return false;
		return true;
	}
}
