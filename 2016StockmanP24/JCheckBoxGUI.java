/**
 * This is the custom class for all our JCheckBoxes 
 * It ensures all JCheckBoxes have similar properties
 * 
 * @author Stephen Stockman
 * @version 5-26-16
 */
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
public class JCheckBoxGUI extends JCheckBox
{
    public JCheckBoxGUI(String s)
    {
        this.setBackground(new Color(214,217,223));
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setText(s);
        this.setVisible(true);
    }
    
    /**
     * @param bg the button group of the checkboxes
     * @param check the checkbox that was selected
     * 
     * clears the checklist and select the one clicked
     */
    public void select(ButtonGroup bg,JCheckBoxGUI check)
    {
        bg.clearSelection();
        check.setSelected(true);
    }

}
