import javax.swing.JFrame;

public class TextBoxSorted
{

   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Numbers");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      TextBoxSortedPanel panel = new TextBoxSortedPanel();
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}