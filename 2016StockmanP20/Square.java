import TurtleGraphics.*;
public class Square extends AbstractShape
{
   protected double sideLength;
    public Square()
    {
        xPos=0;
        yPos=0;
        sideLength=100;
    }

    public Square(double xp,double yp,double sl)
    {
        xPos=xp;
        yPos=yp;
        sideLength=sl;
    }

    public void draw(Pen p)
    {
        p.up();
        p.home();
        p.move(xPos+sideLength/2,yPos-sideLength/2);
        p.setDirection(180);
        p.down();
        for(int i=0; i <4;i++)
        {
            p.move(sideLength);
            p.turn(-90);
        }
    }
    public double area()
    {
        return sideLength*sideLength;
    }
}