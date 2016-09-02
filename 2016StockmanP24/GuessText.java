/**
 * This is the custom class for all our JTextField 
 * It ensures all JTextField have similar properties
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class GuessText extends JTextField
{
    public GuessText()
    {

        this.setBackground(new Color(255,255,255));
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setText("");
        this.setVisible(true);

    }
}
