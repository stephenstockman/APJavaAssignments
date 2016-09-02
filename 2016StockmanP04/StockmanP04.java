
/**
 * Stephen Stockman
 * Program04
 * Due: 10/12/15
 */
import java.util.Scanner;
public class StockmanP04
{
    static Scanner console = new Scanner(System.in);
    public static void main(String [] args) 
    {
     //constants
     final int VELOCITY = 20; 
     final double PI = 3.14159; 
     
     //variables
     int radius;
     double density;
     double mass;
     double volume;
     double joules;
     String material;
     
     //get input
     System.out.print("What type of material is your projectile? ");
     material = console.next();
     System.out.print("What is the density of " + material + " (in grams per cubic centimeter)? ");
     density = console.nextDouble();
     System.out.print("What is the radius of the " + material + " projectile (in whole millimeters)? ");
     radius =  console.nextInt();
     
     //calculations
     double newRadius = (double) radius *.1;
     volume= (Math.round(1.33333333333 * PI * newRadius * newRadius * newRadius*1000)/1000.000);
     mass = (Math.round(density * volume *1000))/1000.000;
     joules = (Math.round(.5 * mass * VELOCITY * VELOCITY))/1000.000;
     
     //send results
     System.out.println("\nA(n) " + material + " projectile with a density of " + ""+ density + "0" + " g/cm3 and a radius of " + Math.round(newRadius*1000)/100 + " mm\nwill have a mass of " + mass + " grams. Its volume will be " + volume +" cm3.");
     System.out.print("\nIf launched with a velocity of 20 m/s, its kinetic energy will be an amazing " + joules + " joules.");
    }
}

//expected output
//What type of material is your projectile? Aluminum
//What is the density of Aluminum (in grams per cubic centimeter)? 2.70
//What is the radius of the Aluminum projectile (in whole millimeters)? 50
//A(n) Aluminum projectile with a density of 2.70 g/cm3 and a radius of 50 mm
//will have a mass of 1413.715 grams. Its volume will be 523.598 cm3.
//If launched with a velocity of 20 m/s, its kinetic energy will be an amazing
//282.743 joules.