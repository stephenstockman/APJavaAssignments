
/**
 * Stephen Stockman
 *AP Java
 * Program13
 * Due:
 */
import javax.swing.*;
public class Program13
{
    public static void main(String [] args) 
    {
        String myS,month="6",date="6",year="6",monthName="";
        DateObject mydo = new DateObject();
        do
        {
            myS=JOptionPane.showInputDialog(null, "Enter a date in the form MM/DD/YYYY:");

            if(myS.length() == 10)
            {
                month=myS.substring(0,2);
                date=myS.substring(3,5);
                year=myS.substring(6,myS.length());
                switch(mydo.setDate(Integer.parseInt(date),Integer.parseInt(month),Integer.parseInt(year))){
                    case 1:
                    JOptionPane.showMessageDialog(null,"Day sent in is invalid");
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null,"Month sent in is invalid");
                    break;
                    case 3:
                    JOptionPane.showMessageDialog(null,"Year sent in is invalid");
                    break;
                }
                monthName=mydo.mName();
                JOptionPane.showMessageDialog(null, mydo.toString());
            }
            else
                JOptionPane.showMessageDialog(null,"Your format is wrong");
        }while(mydo.setDate(Integer.parseInt(date),Integer.parseInt(month),Integer.parseInt(year)) != 0);

    }
}
