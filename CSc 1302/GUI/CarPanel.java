import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarPanel extends JPanel implements ActionListener 
{
   Timer time = new Timer(50, this);
   int x = 0, val = 3;
   Timer t = new Timer(50, this);
   int y = 10, valY = 3;
   Timer ti = new Timer(50, this);
   int z = 60, valZ = 3;
   
   public void paintComponent(Graphics g) 
   {
      super.paintComponent(g);
      
      g.setColor(Color.RED);
      g.fillRect(x, 50, 90, 50);
      time.start(); 
      g.setColor(Color.BLACK);
      g.fillOval(y, 100, 20, 20);
      t.start();     
      g.setColor(Color.BLACK);
      g.fillOval(z, 100, 20, 20);
      ti.start();
   }
   
   public void actionPerformed(ActionEvent e)
   {
      x = x + val;
      y = y + valY;
      z = z + valZ;
      repaint();
   }
}