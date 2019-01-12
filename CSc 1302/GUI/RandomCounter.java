import javax.swing.JFrame;

public class RandomCounter
{ 
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Push Counter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RandomCounterPanel panel = new RandomCounterPanel();
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}