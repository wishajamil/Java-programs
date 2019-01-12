import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomCounterPanel extends JPanel
{
   private int randomNumber;
   private Random gen;
   private JButton random;
   private JLabel label;
   
   public RandomCounterPanel()
   {
      gen = new Random();
      randomNumber = 0;
   
      
      random = new JButton("Random Generater!");
      label = new JLabel("Random: " + randomNumber);
      random.addActionListener(new ButtonListener());
      add(random);
      add(label);
         
      setBackground(Color.cyan);
      setPreferredSize(new Dimension(300,40));
   }
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent events)
      {
         randomNumber = gen.nextInt(100)+1;
         label.setText("Pushes: " + randomNumber);
      }
   }
}