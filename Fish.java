
public abstract class Fish extends Animal {

	public Fish(String name) {//sending to animal constructor
		super(name);

	}

	abstract public boolean checkGiven(Animal[][] sudoku, int row, int col);//abstract method
}