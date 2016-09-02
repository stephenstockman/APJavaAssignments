
/**
 * Stephen Stockman
 * AP Java
 * StockmanP22
 * Due:
 */
import java.util.*;
import java.io.*;
public class StockmanP22
{
    static List<TeamObject> list = new ArrayList<TeamObject>();
    public static void main(String [] args) throws IOException
    {

        fileToArray();
        int mode=1;
        while(mode != 4)
        {
            mode=displayMenu();
            switch(mode)
            {
                case 1:
                sortName();
                displaySort();
                break;
                case 2:
                sortNum();
                displaySort();
                break;
                case 3:
                sortAvgScore();
                displaySort();
                break;
                case 4:
                break;
            }
        }
    }

    static int displayMenu()
    {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("\nWelcome to FRC Data Sort!");
        System.out.println("1: Display the list sorted by team name");
        System.out.println("2: Display the list sorted by team number");
        System.out.println("3: Display the list sorted by average score");
        System.out.println("4: Exit the program");
        System.out.print("How would you like your data sorted(1-4): ");
        return inputReader.nextInt();
    }

    static void displaySort()
    {
        System.out.println();
        for(TeamObject t : list)
        {
            System.out.print(t.getName() + " " + t.getNumber() + " ");
            for(int i : t.getScores())
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void sortName()
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            int min = i;
            for (int j = i+1; j < list.size(); j++)
            {
                if ((list.get(j).getName().compareToIgnoreCase(list.get(min).getName()))<0) 
                {
                    min = j;
                }
            }
            TeamObject temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    static void sortNum()
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            int min = i;
            for (int j = i+1; j < list.size(); j++)
            {
                if (list.get(j).getNumber() < list.get(min).getNumber()) 
                {
                    min = j;
                }
            }
            TeamObject temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    static void sortAvgScore()
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            int min = i;
            for (int j = i+1; j < list.size(); j++)
            {
                if (list.get(j).getAverage() < list.get(min).getAverage()) 
                {
                    min = j;
                }
            }
            TeamObject temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    static void fileToArray() throws IOException
    {
        Scanner fileReader = new Scanner(new File("program22test.txt"));
        String name;
        int num;
        int iter=0;
        
        while(fileReader.hasNext())
        {
            name=fileReader.next();
            num=fileReader.nextInt();
            int[] scores = new int[8];
            while(fileReader.hasNextInt())
            {
                scores[iter]=fileReader.nextInt();
                iter++;
            }
            TeamObject temp = new TeamObject(num,name,scores);
            list.add(temp);
            iter=0;
        }

    }
}