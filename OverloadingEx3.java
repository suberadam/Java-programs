class OverloadingEx3
{
  void showGrade(double avg)
  {
     if (avg>=60)
       System.out.println("GRADE A");
     else if (avg>=50)
       System.out.println("GRADE B");
     else if (avg>=40)
       System.out.println("GRADE C");
     else
       System.out.println("GRADE D");
  }
  void showGrade(int s1, int s2, int s3)
  {
    double av=(s1+s2+s3)/3;
    showGrade(av);
  }
  void showGrade(int tot, int subs)
  {
    double av=tot/subs;
    showGrade(av);
  }
  public static void main(String args[])
  {
     OverloadingEx3 obj=new OverloadingEx3();
     obj.showGrade(85.6);
     obj.showGrade(40,70,60);
     obj.showGrade(110,3);
  }
}