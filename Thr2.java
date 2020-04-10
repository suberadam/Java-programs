class Thr2 extends Thread
{
   public static void main(String args[]) throws InterruptedException
   {
     Thr2 obj=new Thr2();
     obj.start();
     for(int c=101;c<=105;c++)
     {
       System.out.println(c);
       Thread.currentThread().sleep(1000);
     }
   }
   public void run() 
   {
     for(int c=1;c<=5;c++)
     {
       System.out.println(c);
       try{  Thread.currentThread().sleep(1000);   }
       catch(InterruptedException e) {    }
     }
   }
}