class Sample
{
   int x=28;
   void greet()
   {
     System.out.println("Hello");
   }
}
class CL1
{
   public static void main(String args[])
   {
     new Sample().greet();
     System.out.println(new Sample().x);
     System.out.println(new Sample(){int y=348;}.y);
     new Sample(){
		   int k=88;
                   void show()
                   { 
                     System.out.println(k+10);
                   }
                 }.show();
   }
}

