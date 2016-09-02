
/**
 * Stephen Stockman
 * AP Java
 * Program03-Makin' Hexes
 * Due: 9/25/15
 */
import java.util.Scanner;
public class StockmanP03
{
    static Scanner console = new Scanner(System.in);//declare scanner
    public static void main(String [] args) 
    { 
        System.out.print("What is the value to covert?: ");
        int total = console.nextInt();//take input
        
        int four = total / powhex(4);
        int three = total % powhex(4) / powhex(3);
        int two = total % powhex(3) / powhex(2);
        int one = total % powhex(2) / powhex(1);
        int zero = total % powhex(1);
        
        System.out.println( "\n" + total + " is converted to:");
        System.out.println(four + " 16^4(s),");
        System.out.println(three + " 16^3(s),");
        System.out.println(two + " 16^2(s),");
        System.out.println(one + " 16^1(s),");
        System.out.println(zero + " 16^(s)");
    }
   
    static int powhex(int exp)
    {
        return (int)Math.pow(16,exp);
    }
    
    
}