// program to list the java packages installed
public class Sample
{
  public static void main(String args[])
  {
    Package p[]=Package.getPackages();
    for (int c=0;c<p.length;c++)
    {
//      System.out.println(p[c]);
      System.out.println((c+1)+"  "+p[c].getName());
      System.out.println(p[c].getSpecificationTitle());
      System.out.println(p[c].getSpecificationVersion());
      System.out.println(p[c].getSpecificationVendor());
      System.out.println("----------------------------");
    }
    System.out.println("No. of Pkgs "+p.length);
  }
}
