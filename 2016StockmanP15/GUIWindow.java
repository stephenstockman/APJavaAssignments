import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * GUIWindow Class- design and function of all the UI stuff
 * 
 * @author Stephen Stockman
 * @version 01/26/2016
 */
public class GUIWindow extends JFrame{

    private  UnitConverter unitC = new  UnitConverter();

    //JLabel declaration and initialization
    private JLabel usLabel = new JLabel("US Dollar:");
    private JLabel canLabel = new JLabel("CAN Dollar:");
    private JLabel euroLabel = new JLabel("EURO Dollar:");
    private JLabel gbpLabel = new JLabel("GBP Dollar:");
    private JLabel audLabel = new JLabel("AUD Dollar:");

    //JTextField declaration and initialization
    private JTextField  usField = new JTextField("");
    private JTextField canField = new JTextField("");
    private JTextField  euroField = new JTextField("");
    private JTextField gbpField = new JTextField("");
    private JTextField  audField = new JTextField("");

    //JButton delaration and initialization
    private JButton  usButton = new JButton("Convert >>>");
    private JButton  canButton = new JButton("Convert >>>");
    private JButton  euroButton = new JButton("Convert >>>");
    private JButton  gbpButton = new JButton("Convert >>>");
    private JButton  audButton = new JButton("Convert >>>");

    /**
     * Default constructor for GUIWindow
     */
    public GUIWindow(){
        //create and fill my JPanel
        JPanel myPanel = new JPanel(new GridLayout(5, 3));

        myPanel.add(usLabel);
        myPanel.add(usField);
        myPanel.add(usButton);

        myPanel.add(canLabel);
        myPanel.add(canField);
        myPanel.add(canButton);

        myPanel.add(euroLabel);
        myPanel.add(euroField);
        myPanel.add(euroButton);

        myPanel.add(gbpLabel);
        myPanel.add(gbpField);
        myPanel.add(gbpButton);

        myPanel.add(audLabel);
        myPanel.add(audField);  
        myPanel.add(audButton);

        //set and center container
        Container container = getContentPane();
        container.add(myPanel, BorderLayout.CENTER);

        // Attach a listener to the convert button
        usButton.addActionListener(new usDollarListener());
        canButton.addActionListener(new canDollarListener());
        euroButton.addActionListener(new euroDollarListener());
        gbpButton.addActionListener(new gbpDollarListener());
        audButton.addActionListener(new audDollarListener());
    }

    //When buttons pressed convert values
    private class usDollarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                unitC.setUS(Double.parseDouble(usField.getText()));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Only numbers please");
            }
            usField.setText(unitC.getUS());
            canField.setText(unitC.getCAN());
            euroField.setText(unitC.getEURO());
            gbpField.setText(unitC.getGBP());
            audField.setText(unitC.getAUD());

        }
    }

    private class canDollarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                unitC.setCAN(Double.parseDouble(canField.getText()));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Only numbers please");
            }
            canField.setText(unitC.getCAN());
            usField.setText(unitC.getUS());
            euroField.setText(unitC.getEURO());
            gbpField.setText(unitC.getGBP());
            audField.setText(unitC.getAUD());

        }
    }
    private class euroDollarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                unitC.setEURO(Double.parseDouble(euroField.getText()));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Only numbers please");
            }
            euroField.setText(unitC.getEURO());
            canField.setText(unitC.getCAN());
            usField.setText(unitC.getUS());
            gbpField.setText(unitC.getGBP());
            audField.setText(unitC.getAUD());

        }
    }
    private class gbpDollarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                unitC.setGBP(Double.parseDouble(gbpField.getText()));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Only numbers please");
            }
            gbpField.setText(unitC.getGBP());
            canField.setText(unitC.getCAN());
            usField.setText(unitC.getUS());
            euroField.setText(unitC.getEURO());
            audField.setText(unitC.getAUD());

        }
    }
    private class audDollarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                unitC.setAUD(Double.parseDouble(audField.getText()));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Only numbers please");
            }
            audField.setText(unitC.getAUD());
            canField.setText(unitC.getCAN());
            usField.setText(unitC.getUS());
            gbpField.setText(unitC.getGBP());
            euroField.setText(unitC.getEURO());

        }
    }
}