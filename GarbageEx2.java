class CL1
{
  int x=10,y=48;
  void show1()
  {
    System.out.println("using show function x value is "+x+"  y value is "+y);
  }
  public void finalize()
  {
    System.out.println(this+"  "+this.x+"   "+this.y);
  }
}
class CL2
{
  int z=100,w=300;
  void show2()
  {
    System.out.println("z value is "+z+"   w value is "+w);
  }
  public static void main(String args[])
  {
    CL1 ob1=new CL1();
    ob1.show1();
    ob1=null;
    System.gc();
    System.out.println("end of program");
  }
}  