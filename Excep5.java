import java.util.*;
class  Excep5
{
  public static void main(String args[])
  {
    System.out.println("enter a number");
    String x = new Scanner(System.in).next();
    System.out.println(x+10);
    System.out.println(x+3.5);

    try {  System.out.println(Integer.parseInt(x)+10);
             System.out.println(Double.parseDouble(x)+3.5);}
    catch(NumberFormatException e)
    { System.out.println("enter only integer values");
    }  
    System.out.println("end of program ");
  }
}
