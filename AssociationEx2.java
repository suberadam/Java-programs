// one to many - homogenous association example
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
      A ob2=new A();
      A ob3=new A();
      System.out.println(ob1.x);
      System.out.println(ob2.x);
      System.out.println(ob3.x);
      ob1.show1();
      ob2.show1();
      ob3.show1();
   }
}