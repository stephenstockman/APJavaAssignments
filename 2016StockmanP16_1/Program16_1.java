import java.util.*;
/**
 * Program 16
 * 
 * @author Stephen Stockman
 * @version 1/29/16 
 */
public class Program16_1
{
    /**main asks for 10 user inputted numbers and 
     * determines if they are odd,even, or negative
     * then puts them in their own respective array.
     */
    public static void main(String [] args) 
    {
        //initialize arrays and index varaiables
        int[] origList = new int[10];
        int[] evenList = new int[10];
        int[] oddList = new int[10];
        int[] negList = new int[10];
        int indexE=0,indexO=0,indexN=0;

        Scanner scan = new Scanner(System.in);

        //terminal input for original list
        for(int i=0;i <10;i++)
        {
            System.out.print("Enter number for array at index " + i+ ": ");
            origList[i]=scan.nextInt();
        }

        //sort values from originl list and organze them in other list
        for(int i=0;i <10;i++)
        {
            //even
            if( ( (origList[i] % 2) == 0) && (origList[i] != 0) )
            {
                evenList[indexE] = origList[i];
                indexE++;
            }

            //odd
            if( ( ( (origList[i] %2) == 1) || ( (origList[i] % 2) == -1) ) && (origList[i] != 0))
            {
                oddList[indexO]=origList[i];
                indexO++;
            }

            //negative
            if(Math.abs(origList[i]) != origList[i])
            {
                negList[indexN]= origList[i];
                indexN++;
            }
        }

        //print out original integers
        System.out.print("The original integers were: ");
        for(int i=0;i < 10;i++)
        {
            System.out.print(origList[i] + " ");
        }

        //print out even integers
        System.out.print("\nThe even integers are: ");
        for(int i=0;i < indexE;i++)
        {
            System.out.print(evenList[i] + " ");
        }

        //prit out odd integers
        System.out.print("\nThe odd integers are: ");
        for(int i=0;i < indexO;i++)
        {
            System.out.print(oddList[i] + " ");
        }

        //print out negative integers
        System.out.print("\nThe negative integers are: ");
        for(int i=0;i < indexN;i++)
        {
            System.out.print(negList[i] + " ");
        }

    }
}