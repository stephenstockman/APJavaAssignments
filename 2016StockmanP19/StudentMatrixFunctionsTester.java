 public class StudentMatrixFunctionsTester {

    public static void main(String[] args) {

        int[] oneDim;
        int[][] twoDim;
        int[][] twoDimReversed;

        int side = 4;
        int begin = 21;
        int diff = 5;

        oneDim = MatrixFunctions.createArithmeticSeq(side, begin, diff);

        System.out.println("The 1 dimensional array of numbers");
        for(int a:oneDim)
            System.out.printf("%4d",a);
        System.out.println("\n");

        twoDim = MatrixFunctions.matricize(oneDim);
        System.out.println("The 2 dimensional array of numbers");
        MatrixFunctions.printMatrix(twoDim);
        System.out.println("Magic = "+MatrixFunctions.magicCheck(twoDim));
        System.out.println("\n");

        twoDimReversed = MatrixFunctions.reverseDiagonal(twoDim);
        System.out.println("The 2-d array with diags reversed");
        MatrixFunctions.printMatrix(twoDimReversed);
        System.out.println("Magic = "+MatrixFunctions.magicCheck(twoDimReversed));
        System.out.println("\n");

        System.out.println("The original 2 dimensional array of numbers");
        MatrixFunctions.printMatrix(twoDim);
        System.out.println("Magic = "+MatrixFunctions.magicCheck(twoDim));
        System.out.println("\n");

    }
}