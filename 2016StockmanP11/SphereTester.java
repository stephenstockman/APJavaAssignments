
/**
 * Stephen Stockman
 *AP Java
 * SphereTester
 * Due:
 */
public class SphereTester {
    public static void main(String[] args){
        // Make two sphere objects, one using each constructor
        Sphere sphereDefault = new Sphere();
        Sphere sphereWithArgs = new Sphere("Shiny","Aluminum",50.0,2.70);
        
        // Display the info from the default sphere
        System.out.println("The default sphere has the following information:");
        System.out.println("Name = "+sphereDefault.name); // public variable
        System.out.println("Material = "+sphereDefault.getMaterial());
        System.out.println("Radius = "+ sphereDefault.getRadius());
        System.out.println("Density = "+ sphereDefault.getDensity());
        
        // display the info from the second sphere
        System.out.println("=================================================");
        System.out.println("The other sphere has the following information:");
        System.out.println("Name = "+sphereWithArgs.name); // public variable
        System.out.println("Material = "+sphereWithArgs.getMaterial());
        System.out.println("Radius = "+ sphereWithArgs.getRadius());
        System.out.println("Density = "+ sphereWithArgs.getDensity());
        
        // change some info
        sphereDefault.name = "I have a new name!";
        sphereDefault.setMaterial("Gold");
        sphereDefault.setRadius(75.0);
        sphereDefault.setDensity(19.3);
        
        // and display the new (modified) info
        System.out.println("=================================================");
        System.out.println("The mutated sphere has the following information:");
        System.out.println("Name = "+sphereDefault.name); // public variable
        System.out.println("Material = "+sphereDefault.getMaterial());
        System.out.println("Radius = "+ sphereDefault.getRadius());
        System.out.println("Density = "+ sphereDefault.getDensity());
        
    }
}