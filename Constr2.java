import java.util.Scanner;
class A
{
   int x,y,z;
   A(int p, int q)
   {
     x=p;
     y=q;
     System.out.println("object created using parameterized constructor");
   }
   A()
   {
     System.out.println("object created using null constructor");  
   }
   void getValues()
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 2 values ");
     x=sc.nextInt();
     y=sc.nextInt();
   }
   void showSum()
   {
      System.out.println("x value is "+x);      
      System.out.println("y value is "+y);
      z=x+y;
      System.out.println("sum of values is "+z);
   }
   public static void main(String args[])
   {
      A ob1=new A(6,3);
      ob1.showSum();

      A ob2=new A(10,3);
      ob2.getValues();
      ob2.showSum();
   }   
}