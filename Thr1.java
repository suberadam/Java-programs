class Thr1 extends Thread
{
   public static void main(String args[])
   {
     Thr1 obj=new Thr1();
     obj.start();
     System.out.println(Thread.currentThread().getName());
   }
   public void run()
   {
     for(int c=1;c<=5;c++)
        System.out.println(c);
     System.out.println(Thread.currentThread().getName());
   }
}
