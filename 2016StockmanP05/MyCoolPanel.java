
/**
 * Stephen Stockman
 * AP Java
 * MyCoolPanel
 * Due:10/19/15
 */
import javax.swing.*; 
import java.awt.*; 

class MyCoolPanel extends JPanel 
{ 
    @Override 
    public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            //ceate salmon color
            Color salmon = new Color(255,128,0);
         
            //crete green oval
            g.setColor(Color.green);
            g.fillOval(0,0,450,100);
            
            //create yellow rectangle
            g.setColor(Color.yellow);
            g.fillRect(20,40,400,20);
            
            //create magenta rectagle
            g.setColor(Color.magenta);
            g.drawRect(175,40,120,20);
            
            //draw salmon fish
            g.setColor(salmon);
            g.drawLine(300,100,400,200);
            g.drawLine(300,300,400,200);
            g.drawLine(300,100,100,300);
            g.drawLine(300,300,100,100);
            g.drawLine(100,100,100,300);
            
            //draw fishes black eye and mouth
            g.setColor(Color.black);
            g.fillArc(300,150,30,30,0,320);
            g.drawLine(400,200,300,200);
            
            //draw text Beach Life!
            g.setColor(Color.black);
            Font myfont = new Font("Courier", Font.BOLD, 14);
            g.setFont(myfont);
            g.drawString("Beach Life!",180 ,55 );
            
            //create,scale, and paint beach image
            ImageIcon myJpg,newIcon;
            myJpg = new ImageIcon("beach.jpg");
            Image img = myJpg.getImage();
            Image newimg = img.getScaledInstance(500, 270,  java.awt.Image.SCALE_SMOOTH);
            newIcon = new ImageIcon(newimg);
            newIcon.paintIcon(this,g,0,300);
}
}