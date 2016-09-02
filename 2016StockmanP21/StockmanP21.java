
/**
 * Stephen Stockman
 * AP Java
 * StockmanP21
 * Due:4/18/16
 */
import javax.swing.*;
public class StockmanP21
{
    public static void main(String [] args) 
    {
        //Get input and print original sentence
        String sentence = JOptionPane.showInputDialog(new JFrame(),"Enter in sentence: ","input box",JOptionPane.PLAIN_MESSAGE);
        System.out.println("Original: " + sentence);

        //alter sentence for analysis
        sentence = sentence.toLowerCase().trim();
        sentence = killSpace(sentence);

        //perform analysis and print results to terminal
        System.out.println("Number of words: "+ numWords(sentence));
        System.out.println("Average Length of a word: "+ aveLength(sentence));
        System.out.println("Number of the letter e: "+ numChar(sentence, 'e'));
    }

    //find the number of words in a sentence
    static int numWords(String s)
    {
        int numWords=1;
        for(int i=0;i < s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                numWords++;
            }
        }
        return numWords;
    }

    //find the average length of a word in a sentence
    static float aveLength(String s)
    {
        s=s+" ";
        float aveLength=0;
        float[] wordLength = new float[numWords(s) - 1];
        int pos=0;
        float sum=0;
        for(float i=0;i < s.length();i++)
        {
            if(s.charAt((int)i) == ' ')
            {
                if(pos == 0)
                    wordLength[pos] = i;
                else
                    wordLength[pos] = i - sum-pos;

                sum += wordLength[pos];
                pos++;
            }
        }
        aveLength = sum/(float)(numWords(s)-1);
        return aveLength;
    }

    //find the number of instances of a character in a sentence
    static int numChar(String s,char c)
    {
        int numChar=0;
        for(int i=0;i < s.length();i++)
        {
            if(s.charAt(i) == c )
            {
                numChar++;
            }
        }
        return numChar;
    }

    //get rid ofmultiple spaces in a word
    static String killSpace(String s)
    {
        for(int i=0;i < s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(s.charAt(i+1) == ' ')
                {
                    s = s.substring(0,i) + s.substring(i+1, s.length());
                    i--;
                }
            }
        }
        return s;
    }
}