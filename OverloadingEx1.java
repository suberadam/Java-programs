class OverloadingEx1
{
   void f1()
   {
     System.out.println("f1() with no args");
   }
   void f1(int x, double y)
   {
     System.out.println("f1() with int and double");
   }
   void f1(double x, int y)
   {
     System.out.println("f1() with double and int args");
   }
   void f1(char x)
   {
     System.out.println("f1() with char args");
   }
   public static void main(String args[])
   {
      OverloadingEx1 obj=new OverloadingEx1();
      obj.f1('a');
      obj.f1();
      obj.f1(8.5, 10);
      obj.f1(10, 8.5);
   }
}

