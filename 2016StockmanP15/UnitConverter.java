
/**
 * Unit Converter class that holds methods to convert currency
 * 
 * @author Stephen Stockman
 * @version 01/26/2016
 */
public class UnitConverter
{
    private double us=0;
    private String unfString="";

    /**Default constructor for class UnitConverter
     * 
     */
    public UnitConverter()
    {
        us=0;
    }

    /**
     * Returns formatted string of value of currency in Great Britian Pounds 
     * 
     * @return Formatted String
     */
    public String getUS()
    {
        return unfString =String.format("%.4f",us);
    }

    /**
     * Set the current value for US Dollars
     * 
     * @param c<double> is the amount of US Dollars
     */
    public void setUS(double c)
    {
        us=c;
    }

    /**Returns formatted string of value of currency in Canadian Dollars    
     * 
     * @return Formatted String
     */
    public String getCAN()
    {
        return unfString =String.format("%.4f",us *1.458219);
    }

    /**
     * Set the current value for Canadian Dollars
     * 
     * @param c<double> is the amount of Canadian Dollars
     */
    public void setCAN(double c)
    {
        us=c/1.458219;
    }

    /**Returns formatted string of value of currency in Euros  
     * 
     * @return Formatted String
     */
    public String getEURO()
    {
        return unfString = String.format("%.4f",us*.916815);
    }

    /**
     * Set the current value for Euros
     * 
     * @param c<double> is the amount of Euros
     */
    public void setEURO(double c)
    {
        us=c/.916815;
    }

    /**Returns formatted string of value of currency in Great Britian Pounds   
     * 
     * @return Formatted String
     */

    public String getGBP()
    {
        return unfString = String.format("%.4f",us*.706348);
    }

    /**
     * Set the current value for Great Britian Pounds
     * 
     * @param c<double> is the amount of Great Britian Pounds
     */
    public void setGBP(double c)
    {
        us=c/.706348;
    }

    /**Returns formatted string of value of currency in Australian Dollars  
     * 
     * @return Formatted String
     */
    public String getAUD()
    {
        return unfString = String.format("%.4f",us*1.446834);
    }

    /**
     * Set the current value for Australian Dollars
     * 
     * @param c<double> is the amount of Australian Dollars
     */
    public void setAUD(double c)
    {
        us=c/1.446834;
    }
}