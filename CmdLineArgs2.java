class CmdLineArgs2
{
  public static void main(String args[])
  {
     System.out.println("number of values in args "+args.length);
     double sum=0;
     for(int c=0;c<args.length;c++)
        sum=sum+Double.parseDouble(args[c]);

     System.out.println("sum is "+sum);
  }
}
