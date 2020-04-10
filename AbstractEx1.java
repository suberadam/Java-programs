abstract class A
{
  abstract void f1();
  void f2()
  {
    System.out.println("f2 of class A");
  }
} 
class B extends A
{
  void f1()
  {
    System.out.println("Overridden function f1 of class B");
  }
  void f3()
  {
    System.out.println("f3 of class B");
  }
}
class Test
{
   public static void main(String args[])
   {
      B obj=new B();
      obj.f1();
      obj.f2();
      obj.f3();
   }
}
  