class Cl1
{
   private int x=10;
   void f1()
   {
      System.out.println("f1 function of BASE class");
   }
   int getx()
   {
      return x;
   }
}
class Cl2 extends Cl1
{
   int y=25;
   void showSum()
   {
      int tot=getx()+y;
      System.out.println("sum is "+tot);
   }
}
class Test
{
   public static void main(String args[])
   {
      Cl2 obj=new Cl2();
      obj.showSum();
   }
}