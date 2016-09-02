import TurtleGraphics.Pen;
/**
 * The Shape interface - All objects implementing this interface MUST
 * redefine the following methods.
 * 
 * @Mike Attan 
 * @Date Created: 3/11/2013
 */
public interface Shape {
    public double   area();                         // returns the area of the shape
    public void     draw(Pen p);                    // draw the shape using
    public double   getXPos();                      // returns the center (x)  of the shape
    public double   getYPos();                      // returns the center (y)  of the shape
    public void     move(double xLoc, double yLoc); // (re)set the center pos
    public String   toString();                     // what to return when object is printed
}