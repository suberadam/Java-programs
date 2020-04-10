class Thr3 extends Thread
{
   public void run() 
   {
       System.out.println("Thread id is "+Thread.currentThread().getId());
   }
}

class Sample
{
   public static void main(String args[])
   {
     for(int c=1;c<=10;c++)
     {
       Thr3 obj=new Thr3();
       obj.start();
     }
   }
}