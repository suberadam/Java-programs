class OverloadingEx2
{
   double showArea(double r)
   {
     System.out.println("calculating area of circle");
     return Math.PI*Math.pow(r,2);
   }
   double showArea(double l, double b)
   {
     System.out.println("calculating area of rectangle");
     return l*b;
   }
   double showArea(double a,double b, double c)
   {
     System.out.println("calculating area of triangle");
     double s=(a+b+c)/2;
     return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }
   public static void main(String args[])
   {
      OverloadingEx2 obj=new OverloadingEx2();
      System.out.println(obj.showArea(5.8));
      System.out.println(obj.showArea(7, 3, 5));
      System.out.println(obj.showArea(9.4, 3.3));
   }
}
