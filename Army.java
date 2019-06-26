import Turtle.*;
import java.util.Scanner;

public class Army {
	protected static Turtle[] army = new Turtle[5]; // making army of 5 turtles

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;

		while ( i != 5) { //menu to choose 5 turtles for showing
			System.out.println("Choose the type of a turtle:");
			System.out.println("1.	Simple");
			System.out.println("2.	Smart");
			System.out.println("3.	Drunk");
			System.out.println("4.	Jumpy");
			System.out.println("5.	Eight");
     		int option = sc.nextInt();

			if(option==1) 
				army[i] = new Turtle();
			if(option==2)
				army[i] = new SmartTurtle();
			if(option==3)
				army[i] = new DrunkTurtle();
			if(option==4)
				army[i] = new JumpyTurtle();
			if(option==5)
				army[i] = new EightTurtle();
			if(option<1|| option>5)
				i--;
		 else
			i++;
		} // while

		armyLineUp(); //moving the turtles by number of stages
		armyTailDown();
		armyMove(65);
		armyTurnLeft(40);
		armyMove(75);
		paint();
		armyHide();
		
	}

	public static void armyLineUp() { //organizing the turtles at one line
		for (int j = 0; j < 5; j++) {
			army[j].tailUp();
			if (army[j] instanceof DrunkTurtle) { 
				((DrunkTurtle) army[j]).TurnRightLikeYourFather(90);
				((DrunkTurtle) army[j]).MoveLikeYourFather(120 * j);
				((DrunkTurtle) army[j]).TurnLeftLikeYourFather(90);
			} else if(army[j] instanceof JumpyTurtle){
				army[j].turnRight(90);
				((JumpyTurtle)army[j]).moveJumpyForward(120 * j);
				army[j].turnLeft(90);
			}else {
				army[j].turnRight(90);
				army[j].moveForward(120 * j);
				army[j].turnLeft(90);
			}
		}
	}

	public static void armyTailDown() {
		for (int j = 0; j < 5; j++) {
			army[j].tailDown();
		}
	}
	public static void armyMove(int x) {

		for (int i = 0; i < 5; i++) {
			 if (army[i] instanceof DrunkTurtle) { // do the same for DrunkTurtle
				((DrunkTurtle) army[i]).moveForward(x);
			} else if(army[i] instanceof JumpyTurtle){
				((JumpyTurtle)army[i]).moveForward(x);
			} else{
				army[i].moveForward(x);
			}
		}
	}

	public static void armyTurnLeft(int y) { // all turtles turn left
		for (int j = 0; j < 5; j++) {
			if (army[j] instanceof DrunkTurtle) {
				((DrunkTurtle) army[j]).turnLeft(y);
			} else{
				army[j].turnLeft(y);
			}
		}
	}

	

	public static void paint() { // check which turtle is and use the special turtle draw 

		for (int i = 0; i < 5; i++) {
			if (army[i] instanceof JumpyTurtle) { 
				((JumpyTurtle) army[i]).draw(6, 40);
			} else if (army[i] instanceof EightTurtle) {
				((EightTurtle) army[i]).draw(6, 40);
			} else if (army[i] instanceof SmartTurtle) {
				((SmartTurtle) army[i]).draw(6, 40);
			}
		}
	} // only box.smart.jumpy turtles draws polygon

	public static void armyHide() { // all the army are hidden from the screen
		for (int j = 0; j < 5; j++) {
			army[j].hide();
		}
	}
}