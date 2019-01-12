import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class TrafficLightDrawing extends JComponent 
{
   Color go = Color.gray; 
   Color slow = Color.gray;
   Color stop = Color.red;
   
   String activeLight = "red";
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      g.setColor(Color.black);
      g.fillRect(0, 0, 150, 250);
      g.setColor(Color.black);
      g.drawRect(0, 0, 150, 250);
      g.setColor(stop);
      g.fillOval(50, 30, 50, 50);
      g.setColor(slow);
      g.fillOval(50, 100, 50, 50);
      g.setColor(go);
      g.fillOval(50, 170, 50, 50);
   }
   
   public void changeColor()
   {
      go = Color.gray; 
      slow = Color.gray;
      stop = Color.gray;
       
      if(activeLight.equals("green")){
         activeLight = "yellow";
         go = Color.green; 
      } else if(activeLight.equals("red")){
         activeLight = "green";
         slow = Color.yellow;
      } else {
         activeLight = "red";
         stop = Color.red;
      }
      repaint();
   }  
}