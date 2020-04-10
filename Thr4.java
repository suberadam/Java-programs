// default(main) and user given threads running parellel
// different objects trying to access same resource(memory)
class T1 extends Thread
{
  static Thr thr=new Thr();
  public void run()
  {  thr.print(55,60);   }
}
class Thr extends Thread
{
   public static void main(String args[]) throws InterruptedException
   {
      T1 t1=new T1();      T1 t2=new T1();      T1 t3=new T1();   
      System.out.println(t1.getPriority()+"\t"+t2.getPriority()+"\t"+t3.getPriority());
      t2.start();     t1.start();    t3.start();
   }
   synchronized void print(int x, int y)  //use synchronized to see diff
   {
     for (int c=x;c<=y;c++)
     {
       System.out.println(Thread.currentThread().getName()+"  "+c);
       try {  Thread.currentThread().sleep(1000);  }
       catch (InterruptedException e)  {  }
     }   
   }
}  