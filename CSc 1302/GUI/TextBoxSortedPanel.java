import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;

public class TextBoxSortedPanel extends JPanel
{
   private JLabel label;
   private JTextField num1, num2, num3, num4, num5;
   private JButton button;

   public TextBoxSortedPanel()
   {
      num1 = new JTextField(5);
      num2 = new JTextField(5);
      num3 = new JTextField(5);
      num4 = new JTextField(5);
      num5 = new JTextField(5);
      
      label = new JLabel();
      button = new JButton("Button");
      button.addActionListener(new ButtonListener());
      
      add(num1);
      add(num2);
      add(num3);
      add(num4);
      add(num5);
      add(button);
      add(label);
   
      setPreferredSize(new Dimension(300, 75));
      setBackground(Color.yellow);
   }
   private class ButtonListener implements ActionListener{
   
      public void actionPerformed(ActionEvent e) {
         int a[] = new int[5];
         a[0] = Integer.parseInt(num1.getText());
         a[1] = Integer.parseInt(num2.getText());
         a[2] = Integer.parseInt(num3.getText());
         a[3] = Integer.parseInt(num4.getText());
         a[4] = Integer.parseInt(num5.getText());
         bubbleSort(a);
         String text = "";
         for(int i=0; i<a.length; i++){
            if(i == a.length-1){
               text = text + a[i];
            }
            else{
               text = text + a[i]+", ";
            }
         }
         label.setText(text);
      }
        
   }
   private static void bubbleSort(int[] a) {
      int n = a.length;
      int temp = 0;
         
      for(int i=0; i < n; i++){
         for(int j=1; j < (n-i); j++){
                         
            if(a[j-1] > a[j]){
                                 
               temp = a[j-1];
               a[j-1] = a[j];
               a[j] = temp;
            }              
         }
      }
   }
}