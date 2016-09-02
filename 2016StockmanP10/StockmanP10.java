
/**
 * Stephen Stockman
 * AP Java
 * StockmanP10
 * Due: 11/22/15
 */
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class StockmanP10
{
    public static void main(String [] args) 
    {
        //get input via a JOptionPane and sets strings
        String input = JOptionPane.showInputDialog("Enter the phrase to be converted!");
        String tempword="", total = "" + input + " converts to: " +"\n\n";

        input=input.replaceAll("[^a-zA-Z ]", ""); //remove all punctuation
        input=input.toLowerCase(); //convert to Lower case

        int counter =0;
        char letter;
        letter = input.charAt(counter);

        //loop to ensure all charcters in string are converted
        while(input.length() != counter)
        {
            letter = input.charAt(counter);

            //prints IACO word for char
            switch(letter)
            {
                case 'a':
                tempword ="Alfa";
                break;
                case 'b':
                tempword ="Bravo";
                break;
                case 'c':
                tempword ="Charlie";
                break;
                case 'd':
                tempword ="Delta";
                break;
                case 'e':
                tempword ="Echo";
                break;
                case 'f':
                tempword ="Foxtrot";
                break;
                case 'g':
                tempword ="Golf";
                break;
                case 'h':
                tempword ="Hotel";
                break;
                case 'i':
                tempword ="India";
                break;
                case 'j':
                tempword ="Juliet";
                break;
                case 'k':
                tempword ="Kilo";
                break;
                case 'l':
                tempword ="Lima";
                break;
                case 'm':
                tempword ="Mike";
                break;
                case 'n':
                tempword ="November";
                break;
                case 'o':
                tempword ="Oscar";
                break;
                case 'p':
                tempword ="Papa";
                break;
                case 'q':
                tempword ="Quebec";
                break;
                case 'r':
                tempword ="Romeo";
                break;
                case 's':
                tempword ="Sierra";
                break;
                case 't':
                tempword ="Tango";
                break;
                case 'u':
                tempword ="Uniform";
                break;
                case 'v':
                tempword ="Victor";
                break;
                case 'w':
                tempword ="Whiskey";
                break;
                case 'x':
                tempword ="X-ray";
                break;
                case 'y':
                tempword ="Yankee";
                break;
                case 'z':
                tempword ="Zulu";
                break;
                default:
                tempword = "";
            }
            total= total + tempword + "\n";
            counter++;//increment counter
        }
        JOptionPane.showMessageDialog(null,"" +total,"WINDOW",1);
    }
}