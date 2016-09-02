/**
 * Stephen Stockman
 * AP Java
 * StockmanP05
 * Due:10/19/15
 */

import javax.swing.*;
import java.awt.*;

public class StockmanP05
{
    public static void main(String [] args) 
    {
        //declare and initialize objects
        JFrame myWindow; 
        MyCoolPanel panelOne,panelTwo,panelThree,panelFour; 
        Container contentPane; 
        myWindow = new JFrame(); 
        panelOne = new MyCoolPanel();
        panelTwo = new MyCoolPanel();
        panelThree = new MyCoolPanel();
        panelFour = new MyCoolPanel();
        contentPane = myWindow.getContentPane();
       
        
        //set JFrames properties
        myWindow.setTitle("A more Complex Window");
        myWindow.setSize(1000, 1200);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setLayout(new GridLayout(2,2));
        
        //set backgrounds of panels
        panelOne.setBackground(Color.blue);
        panelTwo.setBackground(Color.red);
        panelThree.setBackground(Color.green);
        panelFour.setBackground(Color.yellow);
        
        //add panels to contentpane
        contentPane.add(panelOne);
        contentPane.add(panelTwo);
        contentPane.add(panelThree);
        contentPane.add(panelFour);
    
        //set frame to visible
        myWindow.setVisible(true);
        
       
 System.out.println( Math.log(18) );
    }
}