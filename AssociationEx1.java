// one to one association example
class A
{
   int x=10;
   void show1()
   { 
     System.out.println("show1() of class A");
   }
}
class B
{
   public static void main(String args[])
   { 
      A ob1=new A();
      System.out.println(ob1.x);
      ob1.show1();
   }
}
