class Sample
{
   int x=10,y=20;
   static int z=50;
   void f1()
   {
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
   }
   static void f2()
   {
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
   }
   public static void main(String args[])
   {
     System.out.println(x);
     System.out.println(y);     
   }
}
   