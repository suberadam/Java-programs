class Sample
{
  int x;
  static int y;
  public static void main(String args[])
  {
     Sample ob1=new Sample();
     Sample ob2=new Sample();
     y=5;
     ob1.y++;
//     ob2.y--;
     System.out.println(Sample.y--);
     ob1.x=9;
     ob2.x=8;
     System.out.println(ob1.x);   // 9
     System.out.println(ob2.x);   // 8
     ob1.y=1000;
     ob2.y=700;
     Sample.y=500;
     y=300;
     System.out.println(ob1.y);      // 300
     System.out.println(ob2.y);      // 300
     System.out.println(Sample.y);   // 300
     System.out.println(y);          // 300
  }
}
