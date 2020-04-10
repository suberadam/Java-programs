class Sample
{
  int x;
  double y;
  char z;
  Sample()
  {
    x=10; y=5.7; z='a';
    System.out.println("default constructor executed");
  }
  void show()
  {
    System.out.println("x value is "+x);
    System.out.println("y value is "+y);
    System.out.println("z value is "+z);
  }
  public static void main(String args[])
  {
     Sample ob1=new Sample();
     Sample ob2=new Sample();
     Sample ob3=new Sample();
     ob1.show();
     ob2.show();
     ob3.show();
  }
}


