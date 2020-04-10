class OTP2
{
  public static void main(String args[])
  {
     long otp;
     int z;
     do
     {
        otp=Math.round(Math.random()*1000);     //  605
        z=countZeros(otp);
     }while(!(otp>=100 && otp<=999) || (z>=1));
     System.out.println(otp);
  }
  static int countZeros(long otp)
  {
     Long l=new Long(otp);
     String s=l.toString();		//  String s="605"
     char x[]=s.toCharArray();          //  char x[]={'6','9','8','5'}
     int zeros=0;
     for (int c=0;c<x.length;c++)
     {
        if (x[c]=='0')
          zeros++;
     }
     return zeros;
  }
}
