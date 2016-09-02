
/**
 * Stephen Stockman
 * AP Java
 * Sphere
 * Due:11/23/15
 */
public class Sphere
{
    //declaration of variables
    private double radius, density;
    private String material;
    public String name;

    //default constructor for Sphere
    public Sphere()
    {
        radius=100.0;
        density=1.00;
        material="Water";
        name="Fluffy";
    }

    //overloaded constructor for Sphere
    public Sphere(String nam,String mat,double rad,double den)
    {
        this.name=nam;
        this.material=mat;
        this.radius=rad;
        this.density=den;
    }

    //return sphere's material
    public String getMaterial()
    {
        return material;
    }

    //set sphere's material
    public void setMaterial(String mat)
    {
        material=mat;
    }

    //return sphere's radius
    public double getRadius()
    {
        return radius;
    }

    //set sphere's radius
    public void setRadius(double rad)
    {
        radius=rad;
    }

    //return sphere's density
    public double getDensity()
    {
        return density;
    }

    //set sphere's density
    public void setDensity(double den)
    {
        density=den;
    }
}