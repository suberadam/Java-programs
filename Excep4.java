import java.util.*;
class  Excep4
{
  public static void main(String args[])
  {
    int x[]={20,50,38,86,66,343,54,34,436};
    String name[]={"ramu","kiran","suresh","vijay"};
    int n=0;
    System.out.println("enter index position ");
    try {  n=new Scanner(System.in).nextInt(); }
    catch(InputMismatchException e)
    {   System.out.println("wrong input value "); }

    try      {   System.out.println(x[n]); }
    catch(ArrayIndexOutOfBoundsException e)
    { System.out.println("array index range value is 0 to "+(x.length-1)); }

    try     {   System.out.println(name[n]); }
    catch(ArrayIndexOutOfBoundsException e)
    { System.out.println("name indices range is 0 to "+(name.length-1)); }
    System.out.println("end of program ");
  }
}
