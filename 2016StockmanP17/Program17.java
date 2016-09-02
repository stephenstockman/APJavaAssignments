import java.util.*;
/**
 *@author Stephen Stockman
 *AP Java
 * Program17
 * @version 2/8/16
 */
public class Program17
{   
    private
    static  char[][] boardval = 
            {{'1','1','1','1','1'},
            {'1','2','2','2','1'},
            {'1','2','3','2','1'},
            {'1','2','2','2','1'},
            {'1','1','1','1','1'}};
    static Square[][] board = new Square[5][5];
    /**
     * main functio that plays game
     */
    public static void main(String [] args) 
    {
        resetBoard();
        System.out.println("Welcome to Penny Toss");
        int num=0;
        int sum=0;
        for(int toss=1; toss <=5; toss++)
        {
            System.out.println("Press <enter> to throw a penny/continue.");
            new Scanner(System.in).nextLine();

            int randx = (int)(Math.random()*5);
            int randy = (int)(Math.random()*5);
            num =(int)boardval[randx][randy] - '0';
            board[randx][randy].setSquareValue('x');

            System.out.println("Throw #" + toss + " of 5\n");
            displayBoard();
            System.out.println("\nYou got a " + num +".");
            sum += num;
            if(toss == 5)
            {
                System.out.println("Your final score was: " + sum);
                System.out.println("Do you want to play again? (y/n)");
                if(new Scanner(System.in).nextLine().equalsIgnoreCase("y"))
                {
                    toss = 0;
                    sum=0;
                    resetBoard();
                }

            }
            else
                System.out.println("Your total score so far is: " + sum);

        }

    }

    /**
     * fuction that displays board
     */
    static void displayBoard()
    {
        for(Square[] y : board)
        {
            for(Square x : y)
            {
                System.out.printf("%3c",x.getSquareValue());
            }
            System.out.println();
        }
    }

    /**
     * function that sets up a fresh board
     */
    static void resetBoard()
    {
        System.out.println("Enter size of board: ");
        for(int i = 0; i < 5;i++)
        {
            for(int j = 0;j <5 ;j++)
            {
                board[i][j] = new Square(boardval[i][j]);
            }
        }
    }


}
