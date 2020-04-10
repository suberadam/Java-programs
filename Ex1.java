import apec.Areas;
class Ex1
{
  public static void main(String args[])
  {
     Areas obj=new Areas();
     double radius=obj.p;
     System.out.println(obj.circleArea(radius));
     System.out.println(apec.Areas.rectangleArea(6,3));
  }
}
