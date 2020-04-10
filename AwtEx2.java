// button example with ActionListener 
import java.awt.event.*;
import java.awt.*;
class SingleButton extends Frame implements ActionListener
{
   Label l=new Label();
   TextField tf=new TextField();
   public static void main(String args[])
   {
     SingleButton ob=new SingleButton();
     Frame f=new Frame("first swing");
     Button b=new Button("click me");
     ob.l.setBounds(50,50,100,30);
     ob.tf.setBounds(50,100,100,50);
     ob.l.setText("hello AWT");
     ob.l.setBackground(Color.RED);
     ob.l.setForeground(Color.YELLOW);

     b.setBounds(50,250,100,50);
     f.add(ob.l);
     f.add(b);
     f.add(ob.tf);
     b.addActionListener(ob);
     f.setSize(1000,1000);
     f.setLayout(null);
     f.setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
     l.setText("hello "+tf.getText());
   }
}
