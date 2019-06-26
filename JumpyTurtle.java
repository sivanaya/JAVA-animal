import Turtle.*;
public class JumpyTurtle extends SmartTurtle {
	private boolean tailStatus; 
	
	public JumpyTurtle(){
		super();
		tailStatus = true;	
	}
	
	public void tailUp(){ // checking if the tail is up or down
		super.tailUp();
		tailStatus = false;
	}
	
	public void tailDown(){
		super.tailDown();
		tailStatus = true;
	}
	
	
	public void drawLikeYourFather(int sides, double size){
		super.draw(sides, size);
	}
	
		public void moveForward (double x){
			
				while(x>4){ // the turtle walking like a broken line
					if(tailStatus){
						super.moveForward(5);
						this.tailUp();
						x=x-5;
					} else{
						super.moveForward(5);	
						this.tailDown();
						x=x-5;
					}
			}
				
				super.moveForward(x); // the x%5 left the turtle to move
			}
		
		public void moveJumpyForward(double x){
			super.moveForward(x);
		}
}

	