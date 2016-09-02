
/**
 * Stephen Stockman
 * AP Java
 * StockmanP08
 * Due: 11/11/15
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class StockmanP08
{
    public static void main(String [] args) 
    {
        //declare and initialize objects
        JFrame myWindow = new JFrame();; 
        JPanel panel = new JPanel(); 
        Container contentPane = myWindow.getContentPane();; 
        JLabel winLab = new JLabel(new ImageIcon("win.jpg"));
        JLabel lossLab = new JLabel(new ImageIcon("loss.jpg"));
        Scanner reader = new Scanner(System.in);

        //set JFrames properties
        myWindow.setTitle("A more Complex Window");
        myWindow.setSize(200, 200);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setLayout(new GridLayout(1,1));

        //vars declared and initialized
        int wins = 0, losses=0;
        int numGuess=1;
        boolean playAgain=true;
        int chosen;
        int myChoice =0, randSay;
        String hilo = "", playAgainS;

        //loop with flag
        while(playAgain)
        {
            //prompt and chooses random num
            chosen = (int)(Math.random()*101);
            System.out.println("I'm thinking of a number, what do you think it is?");

            //loop limits number of guesses to 10
            while(numGuess <= 10)
            {
                System.out.print("Guess #" + numGuess + ": ");
                numGuess++;
                myChoice = reader.nextInt();

                //decides appropriate outpu based on guesses
                if( myChoice > chosen)//guessed high
                {
                    hilo = "high";
                    randSay = (int)(Math.random() *4)+1;
                    if(numGuess != 11)
                    {
                        switch(randSay)
                        {
                        case 1:
                        System.out.println("Nope my number is lower");
                        break;
                        case 2:
                        System.out.println("You should guess a lower number");
                        break;
                        case 3:
                        System.out.println("I'm too low for you");
                        break;
                        case 4:
                        System.out.println("Drop your guess down low");
                        break;
                        }
                    }
                }

                if( myChoice < chosen)//guessed low
                {
                    hilo = "low";
                    randSay = (int)(Math.random() *4)+1;
                    if(numGuess != 11)
                    {
                        switch(randSay)
                        {
                        case 1:
                        System.out.println("Nope my number is higher");
                        break;
                        case 2:
                        System.out.println("You should guess a higher number");
                        break;
                        case 3:
                        System.out.println("I'm too high for you");
                        break;
                        case 4:
                        System.out.println("Raise your guess up high");
                        break;
                        }
                    }
                }

                if(myChoice == chosen)//if choice is right smiley face and exit loop
                {
                    contentPane.remove(lossLab);
                    contentPane.add(winLab);
                    contentPane.repaint();
                    System.out.println("You Win! My number was " + chosen + "!");
                    wins++;
                    break;
                }
                if((myChoice != chosen) && (numGuess == 11))//if choice s wrong frowny face
                {
                    contentPane.remove(winLab);
                    contentPane.add(lossLab);
                    contentPane.repaint();
                    System.out.println("You Loss. " + myChoice + " was too "+ hilo + ".");
                    System.out.println("The correct answer was " + chosen + "!");
                    losses++;

                }
            }

            myWindow.setVisible(true);
            System.out.println("Do you want me to think of another number? (y/n)");
            playAgainS = reader.next();

            //determine if player wants to play again
            if(playAgainS.equals("y"))
            {
                myWindow.setVisible(false);
                playAgain=true;
                playAgainS= "";
                numGuess=1;
                System.out.println();
            }
            else
            {
                myWindow.setVisible(false);
                System.out.println();
                playAgain=false;
                System.out.println("You won a total of " + wins + " games, and lost " + losses);
            }
        }
    }
}