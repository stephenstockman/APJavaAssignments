

/**
 * Program 16_2
 * 
 * @author Stephen Stockman
 * @version 1/29/16
 */
public class Program16_2
{
    /**
     * Creteates two randomly filled 5x5 arrays
     * then sums them together into a third 5x5 array.
     */
    public static void main(String [] args) 
    {
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] array3 = new int[5][5];

        //fill array1 with random digits from 0-9
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                array1[i][j]=(int)(Math.random() * 10);
            }
        }
        //fill array2 with random digits from 0-9
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                array2[i][j]=(int)(Math.random() * 10);
            }
        }

        //fill array3 with sum of array1 and array2
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                array3[i][j]=array1[i][j] + array2[i][j];
            }
        }
        
        //print out array1
        System.out.println("Array1");
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.printf("%3d",array1[i][j]);
            }
            System.out.println();
        }

        //print out array2
        System.out.println("\nArray2");
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.printf("%3d",array2[i][j]);
            }
            System.out.println();
        }

        //print out array3
        System.out.println("\nArray3");
        for(int i=0;i <5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.printf("%3d",array3[i][j]);
            }
            System.out.println();
        }
    }
}