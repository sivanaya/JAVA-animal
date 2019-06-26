
abstract public class Animal {

	private char sex;
	private int age;
	protected String name;

	public Animal() {//constructor that apply sex and age to any animal
		age = (int)(Math.random() * 100);//giving random name
		if (Math.random() <= 0.5)//giving random sex
			sex = 'F';
		 else
			sex = 'M';

	}

	public Animal(String name) {//the constructor that i'm using in the work to create new animal
		this();//sending to age+sex constructor
		this.name = name + "";

	}

	public String getName() {
		return new String(name);
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	abstract public boolean checkGiven(Animal[][] sudoku, int row, int col);//abstract method of checking rules

}
     			





     