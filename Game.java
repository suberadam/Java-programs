import java.util.Scanner;
class Game
{
  public static void main(String args[])
  {
    long n=-1;
    int uservalue;
    Scanner sc=new Scanner(System.in);
    System.out.println("guess a value 1 to 6");
    uservalue=sc.nextInt();
    while(!(n>=1 && n<=6))
    {
      n=Math.round(Math.random()*10);
//      System.out.println(n);
    }
    if (uservalue==n)
      System.out.println("You win");
    else
      System.out.println("You lose");
  }
}