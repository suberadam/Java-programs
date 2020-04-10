// program to compress a file Ex1.txt and create with another name Ex2.txt
import java.util.zip.*;
import java.io.*;
class CompressFile
{
  public static void main(String args[]) throws Exception
  {
     FileInputStream fis=new FileInputStream("Ex1.txt");
     DeflaterInputStream dis=new DeflaterInputStream(fis);  
	//present in java.util.zip

     FileOutputStream fos=new FileOutputStream("Ex2.txt");
     int i;
     while((i=dis.read())!=-1)
       fos.write(i);

     fos.close();
     fis.close();
  }
}
