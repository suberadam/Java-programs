// enums
import java.util.Scanner;
class Sample
{
   enum Signal
   {
      RED, 
      GREEN, 
      YELLOW   
   };
   public static void main(String Args[])
   {
     System.out.println("enter signal value ");
     String x=(new Scanner(System.in).next()).toUpperCase();
     if (Signal.valueOf(x)==Signal.GREEN)
        System.out.println("you may go");     
     else if (Signal.valueOf(x)==Signal.YELLOW)
        System.out.println("get ready to go");     
     else if (Signal.valueOf(x)==Signal.RED)
        System.out.println("stop now");     
     else
        System.out.println("invalid input");
   }
}
//  String k=Signal.GREEN.toString();
