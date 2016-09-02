/**
 * Stephen Stockman
 * AP Java
 * StockmanP03
 * Due: 10/1/15
 */

import javax.swing.*;
import java.awt.*;
public class StockmanP03
{
    //France declaration and initialization
    static JFrame fFrance = new JFrame("France");
    static JPanel panelB = new JPanel();
    static JPanel panelW = new JPanel();
    static JPanel panelR = new JPanel();
    static Color myBlue = new Color(0,0,200);

    //Bulgaria declaration and initialization
    static JFrame fBulgaria = new JFrame("Bulgaria2");
    static JPanel panelW2 = new JPanel();
    static JPanel panelG2 = new JPanel();
    static JPanel panelR2 = new JPanel();
    static Color myGreen = new Color(50,120,50);

    //Mine declaration and initialization
    static JFrame fMine = new JFrame("Mine");
    static JPanel panelGNeon = new JPanel();
    static JPanel panel217 = new JPanel();
    static JPanel panelBRoyal = new JPanel();
    static Color myBlueRoyal = new Color(25,10,70);
    static Color my217 = new Color(217,217,217);
    static Color myGreenNeon = new Color(10,250,100);
   
    
    public static void main(String [] args) 
    {
        //setup frame propeties for France
        fFrance.setVisible(true);
        fFrance.setSize(600,400);
        fFrance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fFrance.setLayout(new GridLayout(1,3));
        fFrance.setLocation(0,0);

        //set color of panels
        panelR.setBackground(Color.RED);
        panelW.setBackground(Color.WHITE);        
        panelB.setBackground(myBlue);

        //add panels to France frame
        fFrance.add(panelB);
        fFrance.add(panelW);
        fFrance.add(panelR);

        
        /////////////////////////////////////////////////////////////////////////////////////
       
        //setup frame properties for Bulgaria
        fBulgaria.setVisible(true);
        fBulgaria.setSize(600,400);
        fBulgaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fBulgaria.setLocation(600,0);
        fBulgaria.setLayout(new GridLayout(3,1));
        
        //set colors of panels
        panelR2.setBackground(Color.RED);
        panelW2.setBackground(Color.WHITE);
        panelG2.setBackground(myGreen);

        //add panels to Bulgaria frame
        fBulgaria.add(panelW2);
        fBulgaria.add(panelG2);
        fBulgaria.add(panelR2);
       
        /////////////////////////////////////////////////////////////////////////////////////

        //setup frame properties for Mine
        fMine.setVisible(true);
        fMine.setSize(600,400);
        fMine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMine.setLayout(new GridLayout(1,3));
        fMine.setLocation(1200,0);

        //set color of panels
        panelGNeon.setBackground(myGreenNeon);
        panel217.setBackground(my217);       
        panelBRoyal.setBackground(myBlueRoyal);

        //add panels to Mine frame
        fMine.add(panelBRoyal);
        fMine.add(panel217);
        fMine.add(panelGNeon);  
    }
}