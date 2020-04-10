// program to uncompress a file Ex2.txt and create with another name Ex3.txt
import java.util.zip.*;
import java.io.*;
class UnCompressFile
{
  public static void main(String args[]) throws Exception
  {
     FileInputStream fis=new FileInputStream("Ex2.txt");
     InflaterInputStream iis=new InflaterInputStream(fis);

     FileOutputStream fos=new FileOutputStream("Ex3.txt");
     int i;
     while((i=iis.read())!=-1)
       fos.write(i);

     fos.close();
     fis.close();
  }
}
