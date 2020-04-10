import java.util.Scanner;
class Shape
{
  double dim1, dim2, area;
  void getDimensions()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter values for dim1, dim2 ");
     dim1=sc.nextDouble();
     dim2=sc.nextDouble();
  }
  void showArea()  {   }  // empty body function written to provide overriding
}
class Rectangle extends Shape
{
  void showArea()
  {
     getDimensions();
     area=dim1*dim2; 
     System.out.println("area of rectangle is "+area);
  }
}
class Triangle extends Shape
{
  void showArea()
  {
     getDimensions();
     area=0.5*dim1*dim2; 
     System.out.println("area of triangle is "+area);
  }
}
class Test
{
   public static void main(String args[])
   {
      Shape obj;	// Shape class reference
      obj=new Rectangle();
      obj.showArea();
      obj=new Triangle();
      obj.showArea();
   }
}