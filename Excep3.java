import java.util.*;
class  Excep3
{
  public static void main(String args[])
  {
    Stack st=null;
    try
    {
      st.push(45);
    }
    catch(NullPointerException e)
    {
      System.out.println("stack object not created yet");
    }
  }
}
