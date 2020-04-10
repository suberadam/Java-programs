package datadot;
public class Logics
{
   static public int biggest(int a, int b)
   {
      return (a>b)?a:b;
   }
   public void evenodd(int n)
   {
     System.out.println(n+" is "+((n%2==0)?"even":"odd"));
   }
   int reverseNumber(int n)
   {
     int rev=0;
     do{
       rev=(rev*10)+(n%10);
       n=n/10;
     }while(n!=0);
     return rev;
   }
}