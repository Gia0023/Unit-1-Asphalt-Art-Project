import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {


System.out.println("fish are my favorite sea-creature!");

// Instantiating all the Painters
    
    BackgroundPainter lily = new BackgroundPainter();
    BubblePainter jeff = new BubblePainter();
    FishPainter bob = new FishPainter();

  // giving the painters tasks and colors to paint  

    lily.paintBackground("blue");

System.out.println("did you know that fish sleep with their eyes open?");
    
    jeff.getToBubbleStart();
    jeff.paintBigBubble("PowderBlue");
    jeff.getToBoxStart();
    jeff.paintBox("PowderBlue");

    bob.getToFishStart();
    bob.paintFish("orange");
    

    
  }
}
