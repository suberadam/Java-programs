
class Sample
{
  int x;
  static int y;
  void show1()
  {
    x=10;
    y=100;
    System.out.println(x);
    System.out.println(y);    
  }
  static void show2()
  {
//    x=10;
     y=y+40;
//    System.out.println(x);
    System.out.println(y);    
  }
  public static void main(String args[])
  {
    Sample obj=new Sample();
    obj.show1();
    show2();
    obj.x=y+10;
    System.out.println(" "+obj.x);
    System.out.println(y);
    System.out.println(obj.y);
    obj.x=obj.x+10;
    System.out.println(obj.x);
  }
}
