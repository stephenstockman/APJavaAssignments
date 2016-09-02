
/**
 * Stephen Stockman
 * AP Java
 * StockmanP23
 * Due:
 */
import java.util.*;
public class StockmanP23
{
    static int num=0;
    static int div=2;
    public static void main(String [] args) 
    {
        int mode=1;
        while(mode != 5)
        {
            mode=displayMenu();
            switch(mode)
            {
                case 1:
                System.out.println(sum(num));
                break;
                case 2:
                System.out.println(factorial(num));
                break;
                case 3:
                System.out.println(isPrime(num));
                break;
                case 4:
                System.out.println(fib(num));
                break;
                case 5:
                break;

            }
        }
    }

    static int displayMenu()
    {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("\nWelcome to Recursive Calculations!");
        System.out.print("Enter your number: ");
        num=inputReader.nextInt();
        System.out.println("\n1: Display the sum of all the digits from 1 to n, inclusive.");
        System.out.println("2: Display the factorial of n aka (n!)");
        System.out.println("3: Display whether n is prime");
        System.out.println("4: Display the fibonacci number in the sequence at position n");
        System.out.println("5: Exit the Program");
        System.out.print("How would you like your number calculated(1-5): ");
        return inputReader.nextInt();
    }

    //The sum of all the digits from 1 to n, inclusive.
    static int sum(int n)
    {
        int sum=0;
        if(n==0)
        {
            return sum;
        }
        else
        {
            return sum= n + sum(n-1);
        }
    }
    //n!
    static int factorial(int n)
    {
        int fac=1;
        if(n==0)
        {
            return fac;
        }
        else
        {
            return fac = n * factorial(n-1);
        }
    }
    //if prime
    static boolean isPrime(int n)
    {
        if(n == div || n==1)
        {
            div=2;
            return true;
        }
        else
        if(n % div == 0)
        {
            return false;
        }
        else
        {
            div++;
            return isPrime(n);
        }
    }
    //fib number at pos n f(n) = [f(n-1) + f(n-2)] where f(0) = f(1) = 1
    static int fib(int n)
    {
        int fib=0;
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return fib = fib(n-1) + fib(n-2);
        }
    }
}