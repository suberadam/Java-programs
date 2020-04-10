import java.util.*;
class PriorityQueueEx
{
  public static void main(String args[])
  {
    Queue pq1=new PriorityQueue();
    pq1.add(50);
    pq1.add(10);
    pq1.add(70);
    pq1.add(30);
    pq1.add(40);
    pq1.add(20);
    System.out.println(pq1);
    System.out.println(pq1.peek());
    System.out.println(pq1.remove());
    System.out.println(pq1);
    pq1.add(55);
    System.out.println(pq1);
    System.out.println(pq1.contains(40));
    System.out.println(pq1.contains(44));
    pq1.clear();
    System.out.println(pq1);
  }
}