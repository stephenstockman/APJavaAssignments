
/**
 * Stephen Stockman
 * AP Java
 * StockmanP09
 * Due: 11/11/15
 */
import java.io.*;
import java.util.*;
public class StockmanP09
{
    public static void main(String [] args) throws IOException
    {
        //declare amd initialize objects and vars
        Scanner fileReader = new Scanner(new File("rawscores.txt"));
        PrintWriter printer = new PrintWriter(new File("studentgrades.txt"));
        String first, last,grade;
        Double s1,s2,s3,s4,s5, aveS;
        
        //loop that continues to read in and print as long as numbers exist in the buffer
        while( fileReader.hasNext())
        {
            //input data from file
            last = fileReader.next();
            first = fileReader.next();
            s1 = fileReader.nextDouble();
            s2 = fileReader.nextDouble();
            s3 = fileReader.nextDouble();
            s4 = fileReader.nextDouble();
            s5 = fileReader.nextDouble();
            
            //calculate average to hundredths place and determine letter grade from average
            aveS = ((int)(((s1 + s2 + s3 + s4 + s5)/5.00) * 100.00))/100.00;
            if(aveS >= 90)
            grade = "A";
            else if(aveS >= 80)
            grade = "B";
            else if (aveS >= 70)
            grade = "C";
            else if(aveS >= 60)
            grade = "D";
            else
            grade = "F";
            
            //output new data to file in specific format
            printer.println(first + " " + last + " " + s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 + " Ave:" + aveS + " Grade:" + grade); 
        }
        
        //close both the scanner and printwriter
        fileReader.close();
        printer.close();
    }
}