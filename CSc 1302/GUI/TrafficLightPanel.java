import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TrafficLightPanel extends JPanel 
{
   TrafficLightDrawing light = new TrafficLightDrawing();
   
   public TrafficLightPanel()
   {  
      JButton changeButton = new JButton("switch");
      light.setPreferredSize(new Dimension(160, 260));
      
      buttonListener l = new buttonListener();
      changeButton.addActionListener(l);
      
      add(light);
      add(changeButton);
   }
    
   class buttonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         light.changeColor();
      }
   }
}