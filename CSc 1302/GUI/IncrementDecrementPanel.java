import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IncrementDecrementPanel extends JPanel
{
   private int count;
   private JButton increment, decrement;
   private JLabel label;
   private JPanel buttonPanel;

   public IncrementDecrementPanel()
   {
      count = 50;
      increment = new JButton("Increment");
      decrement = new JButton("Decrement");
      
      ButtonListener listener = new ButtonListener();
      increment.addActionListener(listener);
      decrement.addActionListener(listener);
      
      label = new JLabel("Push a button");
      buttonPanel = new JPanel();
      buttonPanel.setPreferredSize(new Dimension(200, 40));
      buttonPanel.setBackground(Color.blue);
      buttonPanel.add(increment);
      buttonPanel.add(decrement);
      
      setPreferredSize(new Dimension(200, 80));
      setBackground(Color.cyan);
      add(label);
      add(buttonPanel);
   }
   private class ButtonListener implements ActionListener
   {
   
      public void actionPerformed(ActionEvent event)
      {
         if (event.getSource() == increment)
            label.setText(Integer.toString (count++));
         else
            label.setText(Integer.toString (count--));
      }
   }
}
