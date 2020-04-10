 // example awt using ActionListener

import java.awt.*;
import java.awt.event.*;
class MyEvent extends Frame implements ActionListener
{
  TextField tf;
  Button b1;
  Button b2;
  Label l;
  MyEvent()
  {
    setSize(400,400);
    setLayout(null);
    setTitle("Wish");
    tf=new TextField("enter ur name");
    tf.setBounds(40,40,100,40);
    b1=new Button("Birthday");
    b1.setBounds(150,40,80,40);
    b1.addActionListener(this);
    b2=new Button("Marriage Day");
    b2.setBounds(250,40,80,40);
    b2.addActionListener(this);
    l=new Label();
    l.setBounds(60,100,300,40);
    add(tf);add(b1);add(b2);add(l);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String s=e.getActionCommand();
    if(s.equalsIgnoreCase("birthday"))
      l.setText("Happy Birthday to "+tf.getText());
    else
      l.setText("Happy Married Life to "+tf.getText());
  }
  public static void main(String args[])
  {
    //new MyEvent();   // anonymus object
    MyEvent e1=new MyEvent();
  }
}
