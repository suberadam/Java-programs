// File class methods
import java.util.*;
import java.io.*;
class FileEx1
{
  public static void main(String args[]) throws Exception
  {
    File f1=new File("zyx.txt");
    if (f1.createNewFile()==true)
      System.out.println("file created");
    else
      System.out.println("cannot create the file");
    System.out.println("enter new name for zyx.txt file ");
    String x=new Scanner(System.in).next();
    File f2=new File(x);
    f1.renameTo(f2);
    System.out.println(f1.getAbsolutePath());
    System.out.println(f2.getAbsolutePath());
  }
}
