
public class zebra extends Mammal {

	public zebra(String name) {//sending to mammal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return checkzebra(sudoku, row, col) && super.checkGiven(sudoku, row, col);
	}

	private boolean checkzebra(Animal[][] sudoku, int row, int col) {//checking if is it possible to put zebra by the sudoku rules
		boolean Legalvalue = true;

		for (int t = col; t < 6 && Legalvalue; t++)
			if (sudoku[row][t] instanceof lion)
				Legalvalue = false;

		for (int m = col; m >= 0 && Legalvalue; m--)
			if (sudoku[row][m] instanceof lion)
				Legalvalue = false;

		return Legalvalue;

	}
}