
/**
 * Stephen Stockman
 * AP Java
 * MatrixFunctions
 * Due:
 */
public class MatrixFunctions
{
    //create an array starting with first and increasing each index by diff
    public static int[] createArithmeticSeq(int sideLength, int first, int diff) {
        int[] arr = new int[sideLength*sideLength];
        arr[0]=first;
        for(int i=1;i < sideLength*sideLength;i++)
        {
            arr[i]=arr[i-1]+diff;
        }
        return arr;
    }

    //convert an array to a two dimensional square array
    public static int[][] matricize(int[] someList) {
        int sideLength = (int)Math.sqrt(someList.length);
        int[][] twoArr = new int[sideLength][sideLength];
        for(int row=0;row < sideLength;row++)
        {
            for(int col=0;col < sideLength;col++)
            {
                twoArr[row][col] = someList[col + row*sideLength];
            }
        }
        return twoArr;
    }

    //print out a matrix with proper formatting to terminal
    public static void printMatrix(int[][] someMatrix) {  
        for (int i = 0; i < someMatrix.length; i++) {
            for (int j = 0; j < someMatrix[0].length; j++) {
                System.out.print(someMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    //take the two diagonals of the matrix and reverse them
    public static int[][] reverseDiagonal(int[][] someMatrix) {
        //get necessary values for reversing
        int sideLength = someMatrix[0].length;
        int[][] finalM = new int[sideLength][sideLength];
        for (int i = 0; i < someMatrix.length; i++) {
            for (int j = 0; j < someMatrix[0].length; j++) {
                finalM[i][j] = someMatrix[i][j];
            }
        }

        //reverse bot left to top right
        int tempLength = sideLength;
        for(int i = 0; i < sideLength;i++)
        {
            finalM[tempLength-1][i] = someMatrix[i][tempLength-1];
            tempLength--;
        }

        //reverse top left to bot right
        tempLength = sideLength;
        for(int i = 0; i < sideLength;i++)
        {
            finalM[i][sideLength-tempLength] = someMatrix[sideLength-1-i][sideLength-1-i];
            tempLength--;
        }
        return finalM;
    }

    //checks to see if sum of each row,col, and diagonal is equal to magic number
    public static boolean magicCheck(int[][] someMatrix) {
        //calculates magic number
        int sum=0;
        for (int i = 0; i < someMatrix.length; i++) 
        {
            for (int j = 0; j < someMatrix[0].length; j++) 
            {
                sum += someMatrix[i][j];
            }
        }
        int magicNumber = sum/someMatrix[0].length;

        //checks all rows
        for (int row = 0; row < someMatrix[0].length; row++)
        {
            sum=0;
            for (int col = 0; col < someMatrix[0].length; col++) 
            {
                sum+=someMatrix[row][col];
            }
            if(sum != magicNumber)
            {
                return false;
            } 
        }

        //checks all col
        for (int row = 0; row < someMatrix[0].length; row++)
        {
            sum=0;
            for (int col = 0; col < someMatrix[0].length; col++) 
            {
                sum+=someMatrix[col][row];
            }
            if(sum != magicNumber)
            {
                return false;
            } 
        }

        //checks diagonals
        int sideLength = someMatrix[0].length;
        int tempLength = sideLength;
        sum=0;
        for(int i = 0; i < sideLength;i++)
        {
            sum += someMatrix[i][tempLength-1];
            tempLength--;
        }
        if(sum != magicNumber)
        {
            return false;
        } 
        sum=0;
        tempLength = sideLength;
        for(int i = 0; i < sideLength;i++)
        {
            sum += someMatrix[i][sideLength-tempLength];
            tempLength--;
        }
        if(sum != magicNumber)
        {
            return false;
        } 

        return true;
    }
}