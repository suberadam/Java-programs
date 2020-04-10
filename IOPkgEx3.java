// accepting input from user  System.in.read();
import java.io.*;
class Sample
{
   public static void main(String args[]) throws Exception
   {
     int i;          // accepting single character
     FileOutputStream fos=new FileOutputStream("myfile1.txt");
     System.out.println(" Type any text and press enter key ");
     while ((i=System.in.read())!=-1) 
     {
         fos.write(i);
     }
     //-1 means ctrl+c (EOF)  , 13 means enterkey
     fos.close();
   }
}
