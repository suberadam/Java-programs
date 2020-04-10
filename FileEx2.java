// File class methods
import java.util.*;
import java.io.*;
class FileEx2
  {
  public static void main(String args[]) throws Exception
 {
    File f1=new File("d:\\10-11java\\First.class");
    if (f1.exists())
    {
      System.out.print("Are you sure to delete the file "+f1.getAbsolutePath()+" y/n ");
      char ch=(char)System.in.read();
      if (ch=='y' || ch=='Y')
      {
         f1.deleteOnExit();
         System.out.println("file is deleted ");
      }
      else
        System.out.println("file NOT deleted ");  
    }
    else
       System.out.println("File not found");
//    System.out.println(f1.getName());
  }
}
