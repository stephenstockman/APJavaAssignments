/**
 * This is the custom class for all our JButton
 * It ensures all JButton have similar properties
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
public class JButtonGUI extends JButton
{
    public JButtonGUI(String text)
    {
        this.setBackground(new Color(214,217,223));
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setText(text);
        this.setVisible(true);
    }
}
