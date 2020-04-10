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
      // array of objects
      Rectangle r[]=new Rectangle[5];
      for (int c=0;c<r.length;c++)
      {
         r[c]=new Rectangle();   // create instance for each ref.var.
         System.out.println(r[c]);
         r[c].getValues();
      }
      for(int c=0;c<r.length;c++)
         r[c].showArea();
   }
}

