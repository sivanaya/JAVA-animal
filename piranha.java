public class piranha extends Fish {
	
	public piranha(String name) {//sending to mammal constructor
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {
		
		return checkforpiranha(sudoku, row, col );
	}
	
	private boolean checkforpiranha(Animal[][] sudoku, int row, int col){//checking if is it possible to put piranha by the sudoku rules
		
		boolean ans = true;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (sudoku[i][j] instanceof piranha && i != row && j != col) {
					ans = checkforpiranhaindiagnol(i, j, row, col);
					if (!ans)
						return ans;
				}
			}
		}
		return ans;
		
		
	}

	private boolean checkforpiranhaindiagnol(int i, int j, int row, int col) {//checking diagonal by the rules

		if ((row - i) == (col - j))
			return false;
		if ((row - i) == (j - col))
			return false;
		return true;
	}

}
