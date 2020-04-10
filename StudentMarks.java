import java.util.Scanner;
class StudentMarks
{
   int rno, sub1, sub2, sub3, tot;
   String name;
   double avg;
   static Scanner sc=new Scanner(System.in);
   void getStudentData()
   {
      System.out.print("enter rno, name and 3 subject marks ");
      rno=sc.nextInt();
      name=sc.next();
      sub1=sc.nextInt();
      sub2=sc.nextInt();
      sub3=sc.nextInt();
   }
   void calculateResults()
   {
      tot=sub1+sub2+sub3;
      avg=tot/3.0;
   }
   void showResults()
   {
      System.out.println("total marks "+tot);
      System.out.println("average marks "+avg);
   }
   void listResults()
   {
     System.out.println(rno+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+tot+"\t"+avg);
   }
   public static void main(String args[])
   {
      StudentMarks st1=new StudentMarks();
      st1.getStudentData();
      st1.calculateResults();
      st1.showResults();
        // array of objects
      System.out.print("how many students information is required ");
      int n=sc.nextInt();
      StudentMarks obj[]=new StudentMarks[n];
      for(int c=0;c<obj.length;c++)
      {
         obj[c]=new StudentMarks();
         obj[c].getStudentData();
         obj[c].calculateResults();
      }
      for(int c=0;c<obj.length;c++)
         obj[c].listResults();
   }
}