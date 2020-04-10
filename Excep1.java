import java.util.*;
class  Excep1
{
  public static void main(String args[])
  {
    int x, y;
    System.out.println("enter x and y as integer values ");
    try
    {
      x=new Scanner(System.in).nextInt();
      y=new Scanner(System.in).nextInt();
      System.out.println("given values are "+x+", "+y);
      System.out.println((double)x/y);
    }
    catch(InputMismatchException e)
    {
      System.out.println("sorry wrong input given...try again");
    }
    catch(ArithmeticException e)
    {
       System.out.println("demoninator cannot be zero in a division");
    }
    System.out.println("thankyou for using this program");
  }
}