// every class is a sub class of java.lang.Object class
class Sample
{
   int x=10, y=29;
   public String toString()  // overriding toString() of Object class
   {
      System.out.println("x value is "+x);
      System.out.println("y value is "+y);
//      return "sum is "+(x+y);
   }
}
class Test
{
   public static void main(String args[])
   {
      Sample obj=new Sample();
      System.out.println(obj);   // this executes toString() method
   }
}
