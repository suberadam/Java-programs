import java.util.*;
class  Excep2
{
  public static void main(String args[])
  {
    int age;
    String name;
    System.out.println("enter age and name of person ");
    try
    {
      age=new Scanner(System.in).nextInt();
      name=null;  //new Scanner(System.in).nextLine();
      System.out.println("given name "+name+" contains "+name.length()+"characters");
    }
    catch(InputMismatchException e)
    {
      System.out.println("sorry wrong input given...try again");
    }
    catch(NullPointerException e)
    {
       System.out.println("Name cannot be null");
    }
    System.out.println("thankyou for using this program");
  }
}