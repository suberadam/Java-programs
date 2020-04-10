final class Final0
{
  final void f1()
  {
    System.out.println("Hello");
  }
}
class Final1 extends Final0
{
  void f1()
  {
    System.out.println("hai....");
  }
  public static void main(String args[])
  {
     final int x=10;
//     x++;	  error
     Final1 obj=new Final1();
     obj.f1();
  }
}
