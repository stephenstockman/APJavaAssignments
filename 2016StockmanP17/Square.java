
/**
 *@author Stephen Stockman
 *AP Java
 * Program17
 * @version 2/8/16
 */
public class Square
{
    /**
     * variable to hold value and if covered
     */
    public
    char squareValue;
    boolean present;
    /**
     * default constructor
     */
    public Square()
    {
        squareValue=1;
        present=false;
    }

    /**
     * constructor 
     * @param char
     */
    public Square(char val)
    {
        squareValue=val;
        present=false;
    }

    /**
     * get value of square
     */
    public char getSquareValue()
    {
        return squareValue;
    }

    /**
     *set square value
     *@param char
     **/
    public void setSquareValue(char val)
    {
        squareValue = val;
    }

    /**
     * determine if penny is on mark
     */
    public boolean hasPenny()
    {
        return present;
    }

    /**
     * set penny to true
     */
    public void setPenny()
    {
        present=true;
    }

}