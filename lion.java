
public class lion extends Mammal {

	public lion(String name) {//sending to mammal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return chekingLion(sudoku, row, col) && super.checkGiven(sudoku, row, col);
	}

	private boolean chekingLion(Animal[][] sudoku, int row, int col) {//checking if is it possible to put lion by the sudoku rules

		boolean Legalvalue = true;

		for (int t = col; t < 6 && Legalvalue; t++)
			if (sudoku[row][t] instanceof lion || sudoku[row][t] instanceof zebra)
				Legalvalue = false;

		for (int m = col; m >= 0 && Legalvalue; m--)
			if (sudoku[row][m] instanceof lion || sudoku[row][m] instanceof zebra)
				Legalvalue = false;

		return Legalvalue;

	}
}
