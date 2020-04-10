import apec.Areas;
class Sample
{
   int x,y,z;
   void get2Values()
   {
     System.out.println("enter 2 values ");
     y=Areas.acceptIntValue();
     System.out.println("x and y values are  "+x+"  "+y);
   }
   void getzValue()
   {
     System.out.println("enter z values ");
     z=Areas.acceptIntValue();
     System.out.println("value of z is "+z);
   }
   public static void main(String args[])
   {
     Sample obj=new Sample();
     obj.get2Values();
     obj.getzValue();
     System.out.println("enter a value ");
     int a=Areas.acceptIntValue();
     System.out.println("value of a is "+a);
   }
}  