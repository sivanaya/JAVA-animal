import Turtle.*;

public class SmartTurtle extends Turtle {
	public SmartTurtle(){
		super();

	}
	public void draw (int sides, double size){
    // draw a polygon in the given sides and size
        this.show();
		this.tailDown();
		
		double sumZavit = (sides-2)*180; //checks what is the sum of angles of the polygon
		double Zavit =180- (sumZavit/sides); //checks what is the internal angle of the polygon
		
		for(int i=0; i<sides;i++){
	
			this.turnLeft((int)Zavit);
			this.moveForward(size);
		
		}

	}



	}

