// enums
enum Colour 
{
   RED, 
   GREEN, 
   YELLOW   
};
class Sample
{
   enum Weekday {SUN, MON, TUE, WED, THU, FRI, SAT};
   public static void main(String Args[])
   {
     System.out.println(Colour.GREEN);
     System.out.println(Weekday.WED);     
     for (Colour c : Colour.values())
       System.out.println(c);
     for (Weekday d : Weekday.values())
       System.out.println(d);      
   }
}