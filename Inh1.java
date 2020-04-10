class Cl1
{
   private int x=10;
   void f1()
   {
      System.out.println("f1 function of BASE class");
   }
}
class Cl2 extends Cl1
{
   int y=25;
   void f2()
   {
      System.out.println(x);
      f1();
      System.out.println("f2 function of DERIVED class");
   }
}
class Test
{
   public static void main(String args[])
   {
      Cl2 obj=new Cl2();
      System.out.println(obj.x);
      obj.f1();
      System.out.println(obj.y);
      obj.f2();
   }
}
