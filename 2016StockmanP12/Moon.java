
/**
 * Stephen Stockman
 * AP Java
 * Moon
 * Due:12/8/15
 */
public class Moon extends Sphere
{
    private double altitude;
    private double G=6.67*Math.pow(10,-11),M_E=5.98*Math.pow(10,24),R_E=6.38*Math.pow(10,6);//constants
    private String sciDen,sciRad,sciMass,sciAlt,sciForce,sciPer;//scientific notation
    
    public Moon()
    {    
        super();
        setMaterial("Aluminum");
        altitude=1000;
    }

    public Moon(String nam, String mat,double rad, double den, double alt)
    {
        name=nam;
        setMaterial(mat);
        setRadius(rad);
        setDensity(den);
        altitude=alt;
    }
    //print current vars
    public String toString()
    { 
        //convert to scientific notation
        sciDen=String.format("%9.3e",getDensity());
        sciRad=String.format("%9.3e",getRadius());
        sciMass=String.format("%9.3e",getMass());
        sciAlt=String.format("%9.3e",getAltitude());
        sciForce=String.format("%9.3e",getForce());
        sciPer=String.format("%9.3e",getPeriod());
        
        //return a giant string chock full of info
        return "Moon Material = " + getMaterial() + "\nMoon Radius = " + sciRad + " meters" 
        + "\nMoon Density = " + sciDen + " grams/cm3" + "\nMoon Mass = " + sciMass + " Kilograms" +
        "\nMoon's Altitude = " + sciAlt + " meters" + "\n\nThe gravitational force between the Moon and the earth would be\n"
        + sciForce + " Newtons." + "\nThe moon would have a period of rotation of\n" + sciPer + " days.";
    }

    //return altitude
    public double getAltitude()
    {
        return altitude;
    }

    //set altitude
    public void setAltitude(double alt)
    {
        altitude=alt;
    }

    //return volume
    public double getVolume()
    {
        return (4.0/3.0) * Math.PI* Math.pow((getRadius()),3);
    }

    //return mass
    public double getMass()
    {
        return getDensity() * getVolume() *1000;//unit conv
    }

    //return force
    public double getForce()
    {
        return (G*getMass()*M_E)/(Math.pow(altitude+R_E+getRadius(),2));  
    }

    //return period
    public double getPeriod()
    {
        return (2*Math.PI*Math.sqrt(Math.pow((getRadius()+R_E+altitude),3)/(G*(getMass()+M_E))))/(60*60*24);
    }
}