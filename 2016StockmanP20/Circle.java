import TurtleGraphics.*;
public class Circle extends AbstractShape
{
    protected double radius;
    public Circle()
    {
        super();
        radius=8.0;
    }

    public Circle(double xp,double yp,double r)
    {
        xPos=xp;
        yPos=yp;
        radius=r;
    }

    public void draw(Pen p)
    {
        p.up();
        p.home();
        p.move(xPos,yPos+radius);
        p.setDirection(180);
        p.down();
        for(int i=0; i <120;i++)
        {
            p.move(2*Math.PI*radius/120);
            p.turn(360/120);
        }
    }

    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }

}