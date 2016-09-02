
/**
 * Stephen Stockman
 * AP Java
 * Program14
 * Due:12/22/15
 */
import javax.swing.*;
public class Program14
{

    public static void main(String [] args) 
    {
        Fibonacci fib= new Fibonacci();
        long start,end,newo;
        String output="";
        do
        {
            //reset vars
            start=0;
            end=1;
            newo=0;
            output="";
            do//obtain input from user
            {
                start=Long.parseLong(JOptionPane.showInputDialog(null,"What is the starting generation?"));
                end=Long.parseLong(JOptionPane.showInputDialog(null,"What is the ending generation?"));
                if(start > end || start<1 || end<1)//ensure input is valid
                    JOptionPane.showMessageDialog(null,"incorect entry");
            }while( start > end || start<1 || end<1);//loop until input is valid
            
            //create string with final output of fibonacci numbers
            for(int i=(int)start; i <= end;i++)
            {
                output+= i + " - "+fib.getFibonacci(i) + "\n";
            }
            
            //print out final string
            JOptionPane.showMessageDialog(null,"Generation " + start + " through "
            + end + " will have the sizes:\n" + output);
        }while(JOptionPane.showConfirmDialog(null,"Do you want to try again?") == 0);//ask if user wants to go again
    }
}