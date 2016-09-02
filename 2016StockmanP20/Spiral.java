import TurtleGraphics.*;
public class Spiral extends Circle
{
    private double numLoops;
    public Spiral()
    {
        super();
        numLoops=10;
    }

    public Spiral(double xp,double yp,double r,double nl)
    {
        super(xp,yp,r);
        numLoops=nl;
    }

    public void draw(Pen p)
    {
        double numSides=120*numLoops;
        double sideLength=(2/numLoops*Math.PI*radius/120.0);
        
        p.up();
        p.move(xPos+radius,yPos);//*numLoops
        p.setDirection(90);
        p.down();
        for(int numLength=0; numLength <numSides;numLength++)
        {
            p.move((numLoops*(numSides-numLength)/(double)numSides)*sideLength);
            p.turn(3);
        }
    }
}