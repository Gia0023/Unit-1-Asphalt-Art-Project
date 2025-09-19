import org.code.neighborhood.*;

public class FishPainter extends PainterPlus{

   /* ------ Fish Painter ------
  *Will paint the body and eyes of the fish
  *First must navigate to starting position then work
  * its way up and down, painting the body
  * then it comes back around to paint the eyes last
  */

// navigates to start of fish (front)
  
  public void getToFishStart(){
    
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    
  }

  // Actually paints the fish body and eyes/blush details

public void paintFish(String color){

  // setting the paint so the painter has enough to paint the fish body and eyes
    setPaint(68);
  
  //painting the body of the fish
    paintThree(color);
    turnAndMove();
    turnRight();
    move();
    move();
    turnAround();
    paintFive(color);
    turnAndMove();
    turnLeft();
    move();
    move();
    turnAround();
    paintSeven(color);
    turnAndMove();
    turnRight();
    move();
    move();
    turnAround();
    paintNine(color);
    turnAndMove();
    turnLeft();
    move();
    move();
    turnAround();
    paintEleven(color);
    turnAndMove();
    turnLeft();
    move();
    paintSeven(color);
    turnAndMove();
    turnRight();
    paintFive(color);
    turnAndMove();
    turnLeft();
    paintThree(color);
    turnAndMove();
    turnRight();
    move();
    paint(color);
    turnAndMove();
    turnLeft();
    move();
    move();
    move();
    turnAround();
    paintFive(color);
    move();
    move();
    turnLeft();
    move();
    turnLeft();
    paintThree(color);
    move();
    paintThree(color);

  // painting the eyes and blush on the fish
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    paint("white");
    move();
    paint("black");
    turnLeft();
    move();
    paint("black");
    turnLeft();
    move();
    paint("black");
    turnRight();
    move();
    turnRight();
    move();
    paint("pink");
  
  
}

// paints three boxes in a line of three (used in body painting)
  
  public void paintThree(String color){
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    
  }

  // paints five boxes in a line of five (used in body painting)

  public void paintFive(String color){
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    
  }

  // paints seven boxes in a line of seven (used in body painting)


  public void paintSeven(String color){
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  // paints nine boxes in a line of nine (used in body painting)


   public void paintNine(String color){
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  // paints eleven boxes in a line of eleven (used in body painting)


 public void paintEleven(String color){
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
   
  }


// moves the fishPainter once it gets to the end of a collumn in the body
  // allows the painter to turn right or left depending on the direction
  // its facing (north or south)
  
  public void turnAndMove(){
    if(isFacingSouth()){
      turnLeft();
      move();
    }

    if(isFacingNorth()){
      turnRight();
      move();
    }
    
    
  }

















  
}

