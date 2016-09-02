
import TurtleGraphics.*;

// Notice the use of the word "abstract" in the class header.
// This class implements the Shape interface.

abstract public class AbstractShape implements Shape {

   // Here we declare variables common to all subclasses.
   
   protected double xPos;
   protected double yPos;
   

   // Even though this class is never instantiated, it needs constructors
   // to initialize its variables.
   
   public AbstractShape (){
      xPos = 0;
      yPos = 0;
   }
   
   public AbstractShape (double xLoc, double yLoc){
      xPos = xLoc;
      yPos = yLoc;
   }
   

   // There is no code for the next two methods; therefore, they are abstract
   // and terminate with a semicolon. All subclasses must define these methods.
   
   abstract public double area();
   
   abstract public void draw (Pen p);
   
   // These next three methods will never be changed in a subclass; therefore,
   // they are declared final, meaning they cannot be overridden.
   
   public final double getXPos(){
      return xPos;
   }
   
   public final double getYPos(){
      return yPos;
   }

   public void move (double xLoc, double yLoc){
      // We must override this method in class Triangle, so it can no longer 
      // be final. 
      xPos = xLoc;
      yPos = yLoc;
   }
   
   public String toString(){
      // Some general information to be printed about this object
      String str = "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                 + "Area: " + area();
      return str;
   }

}


