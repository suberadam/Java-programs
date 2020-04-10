package apec;
import java.util.Scanner;
public class Areas
{
  public static final double PI=3.14;
  public double p=1.5;
  public static int acceptIntValue()
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    return t;
  }
  public double circleArea(double rad)
  {
    return PI*rad*rad;
  }
  public static double rectangleArea(double l, double b)
  {
    return l*b;
  }
}