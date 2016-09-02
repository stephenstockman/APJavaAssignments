
/**
 * Stephen Stockman
 * AP Java
 * StockmanP07
 * Due:11/4/15
 */
import java.util.*;
public class StockmanP07
{
    public static void main(String [] args) 
    {
        //declaration and initialization of objects and variables
        Scanner reader = new Scanner(System.in);
        double estPi=0;
        double success=0;
        int radius=0;
        int counter=0;
        while(true)
        {
            success=0;
            estPi=0;
            
            //user input radius
            System.out.print("Enter the radius of the circle(-1 to exit): ");
            radius = reader.nextInt();
            
            //exits loop
            if(radius == -1)
                break;

            //user input number of samples
            System.out.print("Enter the number of samples: ");
            int numSamp = reader.nextInt();
            counter = numSamp;

            //randomly selects random coordinates and tests to see if they are within the circle
            while(counter >= 1)
            {
                double xCor = (double)((Math.random()*2*radius)-radius);
                double yCor = (double)((Math.random()*2*radius)-radius);
                if((xCor*xCor + yCor*yCor) < (radius*radius))
                {
                    success++;
                }
                counter--;
            }

            //calculates Pi and outputs variables used and result
            estPi=(4*success)/numSamp;
            System.out.println("\nRadius of the circle = " + radius);
            System.out.println("Number of points tried = " + numSamp);
            System.out.println("Estimation of Pi = " + estPi + "\n----");
        }
        System.out.println("fin");
    }
}