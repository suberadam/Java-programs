import java.util.*;
class StringTokenizerEx
{
   public static void main(String args[])
   {
//     String str="entertainment elements";
     String str="raju,kiran kumar,vijay,prasad";
     StringTokenizer stk1=new StringTokenizer(str,",");
     int n=stk1.countTokens();
     System.out.println(n);
     for(int c=0;c<n;c++)
	System.out.println(stk1.nextToken());
   }
}

//    nt rtainm nt  l m nts