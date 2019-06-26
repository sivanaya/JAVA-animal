import Turtle.*;
public class EightTurtle extends SmartTurtle {

	public EightTurtle(){
		super();
	}
		
		public void draw (int sides, double size){
			
			int Probability = (int) (Math.random() * 100);
			if(Probability<50){ // in Probability of 50
				super.draw(8, size);
				
			} else{
				super.draw(sides, 18);
			
				}
				
				
			}
		
		}
	
