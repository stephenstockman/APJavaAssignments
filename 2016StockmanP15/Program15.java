
import javax.swing.*;
import java.awt.event.*;
/**
 * Program 15 class- initializes window and gives its settings
 * 
 * @author Stephen Stockman
 * @verion 1/26/16
 */
public class Program15
{
    /**
     * Creates GUI stuff
     */
    public static void main(String [] args) 
    {
        GUIWindow theGUI = new GUIWindow();
        theGUI.setTitle("Currency Converter");
        theGUI.setSize(400,200);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theGUI.setVisible(true); //Make the window visible
    }

}