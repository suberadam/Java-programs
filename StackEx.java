import java.util.*;
class StackEx
{
  public static void main(String args[])
  {
     Stack<Integer> stobj=new Stack<Integer>();
     System.out.println(stobj.empty());
     stobj.push(43);
     stobj.push(275);
     stobj.push(74);
     stobj.push(76);
     System.out.println(stobj);
     System.out.println(stobj.empty());
     System.out.println(stobj.peek());
     System.out.println("deleted value is "+stobj.pop());
     System.out.println(stobj); 
     System.out.println(stobj.search(90));
     System.out.println(stobj.search(50));
     System.out.println(stobj.search(76));
  }
}
