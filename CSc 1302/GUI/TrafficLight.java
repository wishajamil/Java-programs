import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLight 
{
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame();
      JPanel panel = new TrafficLightPanel();
      frame.add(panel);
      frame.setSize(250, 350);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}