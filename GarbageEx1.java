class Sample
{
   void show()
   {
     System.out.println("hello");
   }
   public static void main(String args[])
   {
     Sample obj=new Sample();
     System.out.println("object created at "+obj);
     obj.show();
     obj=null;
     System.gc();
     System.out.println("end of program");
   }
   public void finalize()
   {
     System.out.println("object being removed at "+this);
   }
}