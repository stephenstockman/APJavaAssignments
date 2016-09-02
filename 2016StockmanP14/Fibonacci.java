
/**
 * Stephen Stockman
 * AP Java
 * Fibonacci
 * Due:12/22/15
 */
public class Fibonacci
{

    public long getFibonacci(int index)
    {
        long fib=1,a=1,b=1,count=3;
        while(count <=index)
        {
            fib=a+b;
            a=b;
            b=fib;
            count++;
        }
        return fib;
    }

}