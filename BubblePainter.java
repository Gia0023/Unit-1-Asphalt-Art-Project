import org.code.neighborhood.*;

public class BubblePainter extends PainterPlus{


  /* ------ Bubble Painter ------
  *Will paint the bubbles that the fish is breathing
  *First must navigate to starting position then work
  * its way through the big and little bubble painting
  */

  // navigates to start
  public void getToBubbleStart(){
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    setPaint(9);
  }

  // paints bigger bubble first

  public void paintBigBubble(String color){
    paintDonut(color);
    setPaint(1);
if (!isFacingNorth()){
  turnRight();
}
  move();
  paint(color);
  }

// navigates to little bubble start
  
public void getToBoxStart(){
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    turnRight();
    move();

  }

//paints the little box-bubble
  
public void paintBox(String color){
  setPaint(5);
  paint(color);
  move();
  paint(color);
  
if (isFacingWest()){
  turnLeft();
}
  
if (isFacingEast()){
  turnRight();
}

  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  
}  
  
}
    


    
