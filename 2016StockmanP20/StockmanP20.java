import TurtleGraphics.*;
import java.util.*;
public class StockmanP20 {
    public static void main (String[] args) {

        int xPos=0,yPos=0,spoke=0,spire=0;
        double radius=0;
        String shape="";
        boolean loop=true,preCondMet=false;
        
        SketchPadWindow pad = new SketchPadWindow(600,600);     

        // make a pen and associate it with the window
        StandardPen p = new StandardPen(pad);
        //p.home();
        p.down();

        Scanner scan = new Scanner(System.in);
        while(loop)
        {
            while(!preCondMet)
            {
                System.out.print("\nEnter an xPos: ");
                xPos=scan.nextInt();
                System.out.print("\nEnter a yPos: ");
                yPos=scan.nextInt();
                System.out.print("\nEnter a radius/half of sides lengths: ");
                radius=scan.nextDouble();
                System.out.print("\nEnter a shape(circle,square,spiral,starburst): ");
                shape=scan.next();

                if((Math.abs(xPos)+radius) <300)
                {
                    preCondMet=true;
                }
                else
                {
                    System.out.println("Bad input");
                }
            }

            if(shape.equals("circle"))
            {
                Circle cir = new Circle(xPos,yPos,radius);
                cir.draw(p);
            }

            if(shape.equals("square"))
            {
                Square sq = new Square(xPos,yPos,2*radius);
                sq.draw(p);
            }

            if(shape.equals("spiral"))
            {
                System.out.print("\nEnter a number of spirals ");
                spire=scan.nextInt();
                Spiral sp = new Spiral(xPos,yPos,radius,spire);
                sp.draw(p);
            }

            if(shape.equals("starburst"))
            {
                System.out.print("\nEnter number of spokes: ");
                spoke=scan.nextInt();
                Starburst sb = new Starburst(xPos,yPos,radius,spoke);
                sb.draw(p);
            }

            System.out.print("Want to draw another shape?(y/n) ");
            if(scan.next().equals("n"))
            {
                loop=false;
            }
            preCondMet=false;
        }
    }
}
