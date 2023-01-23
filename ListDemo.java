import java.applet.Applet;  
import java.awt.List;  
import java.awt.Color; 
import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
public class ListDemo extends Applet implements ActionListener { 
List l; 
Button button1, button2;
TextField tf;
 public void init() {  
  l = new List(10, true);  
  l.add("Desktop");  
  l.add("Laptop");  
  l.add("Tablet");  
  l.add("Phone");  
  l.add("Kindle");  
  l.add("Screen");  
  l.add("System");  
  add(l);  
  setBackground(Color.blue); 
  button1 = new Button("Remove");
  add(button1);
  button1.addActionListener(this);
  tf=new TextField(20);  
  tf.setBounds(20,150,60,50);
  add(tf);
  button2 = new Button("Add");
  add(button2); 
  button2.addActionListener(this);
 
  
      
 } 
public void actionPerformed(ActionEvent ae)  
      {  
          if (ae.getSource() == button1) {
            int index = l.getSelectedIndex();
	    l.remove(index);
          }
          else{
            String s = tf.getText();
            l.add(s);
          } 
      }

}  
 