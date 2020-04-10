class CmdLineArgs1
{
  public static void main(String args[])
  {
     System.out.println("number of values in args "+args.length);
     for(int c=0;c<args.length;c++)
        System.out.println(args[c]);
     System.out.println("end of program");
  }
}
