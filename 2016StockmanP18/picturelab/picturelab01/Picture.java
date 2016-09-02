import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import javax.swing.*;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Simple Starting class for student use  - MA 
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 * @author Edited by Attan
 */
public class Picture extends SimplePicture {
    public float perc=1;
    /**
     * Constructor that takes no arguments 
     */
    public Picture () { 
        super(); 
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) { 
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width) { 
        super(width,height); 
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) { 
        super(copyPicture); 
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) { 
        super(image); 
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;  
    }

    /** Method to set the blue to 0 */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                pix.setBlue(0);
            }
        }
    }

    /** Method to set the red to 0 */
    public void zeroRed() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                pix.setRed(0);
            }
        }
    }

    /** Method to convert image to grayscale*/
    public void grayscale()
    {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                int aveC= (pix.getRed() + pix.getGreen() + pix.getBlue())/3;
                pix.setRed(aveC);
                pix.setGreen(aveC);
                pix.setBlue(aveC);
            }
        }
    }

    public void alterBrightness(float percent)
    {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                perc=percent;
                pix.setRed((int)((float)pix.getRed()*percent));
                pix.setGreen((int)((float)pix.getGreen()*percent));
                pix.setBlue((int)((float)pix.getBlue()*percent));
            }
        } 
    }

    /** Method to convert image to binary image with threshhold*/
    public void thresholdU(float perc)
    {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                float red = pix.getRed();
                float green = pix.getGreen();
                float blue = pix.getBlue();
                float redThresh = 50*perc;
                float greenThresh=120*perc;
                float blueThresh=110*perc;
                float blueThreshMax=160*perc;
                if(redThresh > 255)
                    redThresh=255;
                if(greenThresh > 255)
                    greenThresh=255;
                if(blueThresh > 255)
                    blueThresh=255;
                if(blueThreshMax > 255)
                    blueThreshMax=255;

                if( (red <= redThresh) && (green >= greenThresh) && (blue >= blueThresh) && (blue <= blueThreshMax ))
                {
                    pix.setColor(Color.white);
                }
                else
                {
                    pix.setColor(Color.black);
                }
            }
        }
    }

    public void copyHorizontal() {
        Pixel[][] pixels = this.getPixels2D();
        int half = pixels.length/2;
        Color c;
        for(int row=0; row < half;row++)
        {
            for(int col=0; col < pixels[row].length;col++)
            {
                c = pixels[row][col].getColor();
                pixels[half+row][col].setColor(c);
            }
        } 
    }

    public void quadMirror()
    {
        Pixel[][] pixels = this.getPixels2D();

        //quad 2 mirored t quad 1
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int midpoint = getWidth()/2;
        int width = getWidth();
        for(int row = 0;row < getHeight()/2;row++){
            for(int col = 0;col < midpoint;col++){
                leftPixel = getPixel(col,row);
                rightPixel = getPixel(width-1-col,row);
                rightPixel.setColor(leftPixel.getColor());
            }
        }

        //quad 1 and 2 mirrored to quad 3 and 4
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int midpointH = getHeight()/2;
        int height = getHeight();
        for(int col = 0;col < getWidth();col++){
            for(int row = 0;row < midpointH;row++){
                topPixel = getPixel(col,row);
                bottomPixel = getPixel(col,height-1-row);
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    } 

    public void messUpColors(int range)
    {
        Pixel[][] pixels = this.getPixels2D();

        for(Pixel[] arr : pixels)
        {
            for(Pixel pix : arr)
            {
                int randRed =(int)(Math.random()* range)+1;
                int randGreen=(int)(Math.random()* range)+1;
                int randBlue=(int)(Math.random()* range)+1;
                pix.setRed(randRed);
                pix.setGreen(randGreen);
                pix.setBlue(randBlue);

            }
        }
    }

    public void fractal(int iter)
    {
        Pixel[][] pixels = this.getPixels2D();
        int height = getHeight()/2;
        int width= getWidth()/2;
        
          
            //top left
            for(int i = 0; i < height;i++)//Pixel[] arr : pixels
            {
                for(int j=0; j < width;j++)//Pixel pix : arr
                {
                    pixels[i+20/iter][j+20/iter].setColor(pixels[i][j].getColor());

                }
            }
         
            //top right
            for(int i = 0; i < height;i++)//Pixel[] arr : pixels
            {
                for(int j=width; j < width*2;j++)//Pixel pix : arr
                {
                    pixels[i+20/iter][j-20/iter].setColor(pixels[i][j].getColor());

                }
            }
            
            //bottom
            for(int i = height; i < height*2;i++)//Pixel[] arr : pixels
            {
                for(int j=0; j < width*2-20/iter;j++)//Pixel pix : arr
                {
                    pixels[i][j+20/iter].setColor(pixels[i][j].getColor());

                }
            }
        
    }

    public static void main(String[] args) 
    {
        Picture pic = new Picture("beach.jpg"); 
        pic.explore();
        Picture picFRC = new Picture("505.jpg");
        picFRC.explore();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perc: ");
        float perc = scanner.nextFloat();
        System.out.print("Enter fracks: ");
        int fracks = scanner.nextInt(); 

        pic.fractal(fracks);
        pic.explore();

        picFRC.thresholdU(perc);
        picFRC.explore();

    }
} 
