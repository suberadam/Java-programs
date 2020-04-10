class ConversionEx2
{
   public static void main(String args[])
   {
      double x=30;		// implicit casting
      System.out.println(x);
      byte y=47;
      int a=47;
      byte b;
      b=(byte)a;	// explicit castint
      double c;
      c=a;		// implicit
      float d;
      d=(float)9.5;     // or   d=9.5f;   //explicit

      char e=90;      // implicit  ASCII char
      System.out.println(e);
      int f='A';	// implicit
      System.out.println(f);
      System.out.println((int)'a');    //explicit

      double g=(int)'a';    // mixed  casting
   }
}


RAMESH
16012020
9948578387



