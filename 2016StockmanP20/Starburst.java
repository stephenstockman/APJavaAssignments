import TurtleGraphics.*;
public class Starburst extends Circle
{
    private double numSpokes;
    public Starburst()
    {
        super();
        numSpokes=10;
    }

    public Starburst(double xp,double yp,double r,double ns)
    {
        xPos=xp;
        yPos=yp;
        radius=r;
        numSpokes=ns;
    }

    public void draw(Pen p)
    {
        for(int i=0;i < numSpokes;i++)
        {
            p.up();
            p.move(xPos,yPos);
            p.setDirection(((numSpokes-i)/(double)numSpokes)*360);
            p.down();
            p.move(radius);
        }
    }
}