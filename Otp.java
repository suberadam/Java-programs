// program to generate 4 digit OTP with no zeros in it
class Otp
{
   public static void main(String args[])
   {
      long otp=0, n, count=-1; boolean validotp=false;
      do
      {
         otp=n=Math.round(Math.random()*10000);
         count=0;
         while(count==0 && n!=0 && otp>=1000 && otp<=9999)
         {
            if (n%10==0)
              count++;
            n=n/10;
         }
         if (count>0)
            validotp=false;
         else
	    validotp=true;
    }while(validotp==false || otp<1000);
    System.out.print(otp);
  }
}
