abstract class A
{
  void f1()
  {
    System.out.println("f1");
  }
}
class Test
{
  public static void main(String args[])
  {
    A ob1=new A();
//    System.out.println(ob1);
    ob1.f1();
  }
}
