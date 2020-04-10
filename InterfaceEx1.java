interface I1
{
  int x=10;
  void f1();
  void f2();
}
class CL1 implements I1
{
  public void f1()
  {
    System.out.println("overridden method f1");
    System.out.println(x);
    int y=x;
    System.out.println(y);
  } 
  public void f2()
  {
    System.out.println("overridden method f2");
  }
  public static void main(String args[])
  {
    CL1 obj=new CL1();
    obj.f1();
    obj.f2();
    System.out.println(obj.x);
    System.out.println(I1.x);
  } 
}