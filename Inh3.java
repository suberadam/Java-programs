// method overriding
class A
{
  int x=10;
  void f1()
  {
    System.out.println("Hello all");
  }
}
class B extends A
{
  int x=80;
  void f1()
  {
    System.out.println("Hai all");
  }
  void f2()
  {
    System.out.println(x);
    System.out.println(super.x);
    super.f1();
    f1();
    System.out.println("bye all");
  }
}
class Test
{
  public static void main(String args[])
  {
    B obj=new B();
    obj.f1();
    obj.f2();
  }
}
