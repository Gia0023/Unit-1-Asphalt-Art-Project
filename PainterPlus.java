import org.code.neighborhood.*;
public class PainterPlus extends Painter {

   /* ------ Painter Plus ------
  *Already saved as one of our java files and
  * contains many basic methods to move and navigate
  * better
  */

  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

  
  public void takeAllPaint(){
  while(isOnBucket()){
    takePaint();
  }

    
     }

  public void moveFast(){
    while(canMove()){
      move();
    }

    
  }

  public void paintToEmpty(String color){
    while(hasPaint()){
      move();
      paint(color);
      
    }

    
  }

public void paintDonut(String color){
while(hasPaint()){
    move();
  paint(color);
  turnRight();
  move();
  paint(color);
}

}

 public void turnAround(){
    turnLeft();
    turnLeft();
  } 


  
}

  