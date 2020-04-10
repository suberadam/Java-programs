import java.util.*;
class DateEx
{
   public static void main(String args[])
   {
     Date d1=new Date();
     System.out.println(d1);
     Date d2=new Date(120,11,31);
     System.out.println(d2);
     System.out.println(d1.before(d2));
     System.out.println(d2.before(d1));
     System.out.println(d1.toGMTString());
     System.out.println(d1.getTimezoneOffset());
   }
}
