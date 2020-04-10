import java.util.Scanner;
class Rectangle
{
   int len, br, ar, pr;
   void getValues()
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter length and breadth ");
      len=sc.nextInt();
      br=sc.nextInt();
   }
   void showArea()
   {
      ar=len*br;
      pr=2*(len+br);
      System.out.println("area is "+ar+" perimeter is "+pr);
   }
   public static void main(String args[])
   {
      Rectangle r1=new Rectangle();
      r1.getValues();
      r1.showArea();
      Rectangle r2=new Rectangle();
      r2.getValues();
      r2.showArea();
   }
}

