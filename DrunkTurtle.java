import Turtle.*;
public class DrunkTurtle extends Turtle {
	
	public DrunkTurtle(){
		super();
	}
	public void moveForward(double x) {

		int distance = (int) (Math.random() * x); //check probability
		this.show();
		this.tailDown();
		super.moveForward(distance);//using super because we need to use in the default constructors
								//of moveForward for the turtle to move as regular turtle

		if  ((boolean) (Math.random()* 100 <= 30)){
		super.turnLeft((int) x);
			
		}
		
		distance= (int) (Math.random() * x);
		super.moveForward(distance);
		
	}

         public void turnLeft(int y) {
        	 int Zavit=  (int) (Math.random()*2*y);
        	 super.turnLeft(Zavit);
        	 
}
         public void turnRight(int y) {
        	 int Zavit=  (int) (Math.random()*2*y);
        	 super.turnRight(Zavit); 
        	 
         }
         
         public void MoveLikeYourFather(double x) { //when the turtle will go as a normal turtle (using in army)
     		
     		super.moveForward(x);
     	}
     	
     	public void TurnLeftLikeYourFather(int y){
     		
     		super.turnLeft(y);
     		
     	}
     	public void TurnRightLikeYourFather(int y){
     		
     		super.turnRight(y);
     		
     	}
     }

         
         
         
         
