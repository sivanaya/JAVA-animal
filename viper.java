public class viper extends Reptile {
	public viper(String name) {
		super(name);

	}

	public boolean checkGiven(Animal[][] sudoku, int row, int col) {

		return checkformamal(sudoku, row, col) && super.checkGiven(sudoku, row, col);

	}

	private boolean checkformamal(Animal[][] sudoku, int row, int col) {//checking if is it possible to put viper by the sudoku rules

		boolean ans = true;
		for (int i = 0; i < 6 && ans; i++) {
			for (int j = 0; j < 6 && ans; j++) {
				if (sudoku[i][j] instanceof Mammal) {
					ans = checkforMammalindiagnol(i, j, row, col);

				}
			}
		}
		return ans;

	}

	private boolean checkforMammalindiagnol(int i, int j, int row, int col) {//checking diagonal by the rules

		if ((row - i) == (col - j))
			return false;
		if ((row - i) == (j - col))
			return false;
		return true;
	}

}