
public class shark extends Fish {
	
	public shark(String name) {//sending to mammal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return checkshark(sudoku, row, col);

	}

	private boolean checkshark(Animal[][] sudoku, int row, int col) {//checking if is it possible to put shark by the sudoku rules

		boolean Legalvalue = true;

		int rowSquare = (row / 2) * 2;
		int colSquare = (col / 2) * 2;
		for (int s = 0; s < 2 && Legalvalue; s++) {
			for (int m = 0; m < 2 && Legalvalue; m++) {

				if (sudoku[rowSquare + s][colSquare + m] instanceof shark)
					Legalvalue = false;

				if (sudoku[rowSquare + s][colSquare + m] instanceof salmon)
					Legalvalue = false;
			}

		}
		return Legalvalue;

	}
}
