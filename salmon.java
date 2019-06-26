public class salmon extends Fish {

	public salmon(String name) {//sending to mammal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return checksalmon(sudoku, row, col);

	}

	private boolean checksalmon(Animal[][] sudoku, int row, int col) {//checking if is it possible to put salmon by the sudoku rules

		boolean Legalvalue = true;

		int rowSquare = (row / 2) * 2;
		int colSquare = (col / 2) * 2;
		for (int s = 0; s < 2 && Legalvalue; s++) {
			for (int m = 0; m < 2 && Legalvalue; m++) {

				if (sudoku[rowSquare + s][colSquare + m] instanceof shark)
					Legalvalue = false;
			}

		}
		return Legalvalue;
	}
}
