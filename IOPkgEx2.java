import java.io.*;
class IOPkgEx2
{
   public static void main(String args[])
   {
     try 
     {
        FileOutputStream fos = new FileOutputStream("mydata.txt",true);
         // in the above line 'true' means append status 
        String x="ravi shastry";
        fos.write((int)'\n');
        for(int c=0;c<x.length();c++)
        {
           fos.write((int)(x.charAt(c)));   // writes each into the file
        }
        fos.close();
     }
     catch(Exception e)    {   }
   }
}
