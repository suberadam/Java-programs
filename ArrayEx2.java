// array of arrays of multiple datatypes
class ArrayEx2
{
  public static void main(String args[])
  {
    Integer rno[]={10, 20, 30, 40};
    String name[]={"raju", "vijay", "udya", "kiran"};
    Double avg[]={6.4, 7.3, 8.3, 5.9};
    Object a[][]={rno,name,avg};
    for(int r=0;r<a.length;r++)
    {
      System.out.println();
      for(int c=0;c<a[r].length;c++)
      {
        System.out.print("\t"+a[r][c]);
      }
    }
  }
}