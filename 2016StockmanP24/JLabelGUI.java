/**
 * This is the custom class for all our JLabels 
 * It ensures all JLabels have similar properties
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class JLabelGUI extends JLabel
{
    
    public JLabelGUI(String s)
    {
        this.setBackground(new Color(214,217,223));
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setText(String.format("<html><div WIDTH=%d>%s</div><html>", 500, s));
        this.setVisible(true);
    }
}
