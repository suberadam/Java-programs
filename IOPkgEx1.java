import java.io.*;
class IOPkgEx1
{
   public static void main(String args[])
   {
     try 
     {
        FileOutputStream fos = new FileOutputStream("mydata.txt");
        fos.write(65);   // writes 'A' into the file
        fos.write(90);   // writes 'Z' into the file
        fos.close();
     }
     catch(Exception e)    {   }
   }
}
