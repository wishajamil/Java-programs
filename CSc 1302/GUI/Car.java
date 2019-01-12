import javax.swing.JFrame;
import javax.swing.JPanel;

public class Car 
{
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame();
      JPanel panel = new CarPanel();
      frame.add(panel);
      frame.setSize(950, 250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
