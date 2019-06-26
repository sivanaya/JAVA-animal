import Turtle.*;

	public class TwoTurtles {
		
		
 
			public static void main( String[]args){
				
				TwoTurtles t = new TwoTurtles();
	         	t.createAB();
	         	
			}
		
	
	public void createAB(){
		
		
		Turtle Messi= new Turtle();
        Turtle Cristiano=new Turtle();
	Messi.show(); // show yourself
	Messi.tailUp ();
	Messi.turnRight (90); // turn right in the given degrees
	Messi.moveForward (100); 
	Messi.tailDown (); // lower the tail
	Messi.turnLeft (135); // turn left in the given degrees
	Messi.moveForward (130); 
	Messi.turnRight (135);
	Messi.tailUp ();
	Messi.moveForward (70);
	Messi.turnRight (90);
	Messi.tailDown (); 
	Messi.moveForward (70); 
	Messi.tailUp ();
	Messi.moveForward (20);
	Messi.turnRight (90);
	Messi.moveForward (55);
	Messi.turnRight (90);
	Messi.tailDown (); 
	Messi.moveForward (75);
	Messi.hide ();
	
	
	
	Cristiano.show (); // show yourself
	Cristiano.turnLeft (90);
	Cristiano.tailUp (); 
	Cristiano.moveForward (30);
	Cristiano.tailDown ();
	Cristiano.moveForward (100);
	Cristiano.turnRight (90);
	Cristiano.tailUp (); 
	Cristiano.moveForward (100);
	Cristiano.turnRight (90);
	Cristiano.tailDown ();
	Cristiano.moveForward (70);
	Cristiano.turnRight (90);
	Cristiano.moveForward (95);
	Cristiano.hide ();
	
	
	
	
	
	
	}
}

	

