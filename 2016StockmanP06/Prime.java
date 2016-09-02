
/**
 * Stephen Stockman
 * AP Java
 * Prime
 * Due:10/28/15
 */
import java.util.*;
public class Prime
{
    public static void main(String [] args) 
    {
        boolean provenPrime = false;
        double number=1.0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the prime number tester! \n");
        System.out.println("Enter an integer greater than 1 to check for prime(-1 exits)");

        //initial correct input check with error throws
        do{
            number = reader.nextDouble();

            //checks if integer
            if(number != (int)number)
            {
                System.out.println(number + " IS NOT an integer");
                System.out.println("Enter an integer greater than 1 to check for prime(-1 exits)");
            }

            //checks if greater than 1
            if(( (number < 1)  && (number != -1) ))
            {
                System.out.println(number + " IS NOT GREATER THAN 1");
                System.out.println("Enter an integer greater than 1 to check for prime(-1 exits)");
            }
        }while((number != (int)number) || ( (number < 1)  && (number != -1) ) );

        //determination of prime or not loop
        while( number != -1)
        {
            //iterates through all possible factors
            for (int divisor = 2; divisor < number; divisor ++) {
                if (number % divisor == 0)
                {
                    if(provenPrime == false)
                    {
                        System.out.println((int)number + " IS NOT a prime number! It is evenly divisible by:");
                        provenPrime = true;
                    }
                    System.out.print(divisor + " ");
                }

            }

            //cchecks if at end of factor check if not factors are found will print its primek
            if(provenPrime == false)
            {
                System.out.print((int)number + " IS a prime number!");
            }
            provenPrime = false;
            System.out.println("\nEnter an integer greater than 1 to check for prime(-1 exits)");

            //looped correct input check with error throws
            do{
                number = reader.nextDouble();

                //checks if integer
                if(number != (int)number)
                {
                    System.out.println(number + " is NOT AN INTEGER");
                    System.out.println("Enter an integer greater than 1 to check for prime(-1 exits)");
                }

                //checks if greater than 1
                if(( (number < 1)  && (number != -1) ))
                {
                    System.out.println(number + " IS NOT GREATER THAN 1");
                    System.out.println("Enter an integer greater than 1 to check for prime(-1 exits)");
                }
            }while((number != (int)number) || ( (number < 1)  && (number != -1) ) );

        }
        //-1 exit succesful
        System.out.println("Fin");
    }
}