// creating a window/frame
import java.awt.*;
class Hello extends Frame
{
  Hello()
  { 
    setSize(500,500);   // to set window width, height
    setTitle("hello");  // to set the window title
    setLayout(null);
    Image i=Toolkit.getDefaultToolkit().getImage("D:\\All Images\\cricketers\\sachin1.jpg");
    setIconImage(i);
    setBackground(Color.yellow);
    Label l=new Label("Welcome to AWT");
    l.setBounds(50,50,100,40);
    TextField t=new TextField("Enter name");
    t.setBounds(50,100,200,40);
 //l.setAlignment(Label.RIGHT);
    add(l);
//    add(t);
    setVisible(true);
  }
  public static void main(String args[])
  {
    Hello h=new Hello();
  }
}
