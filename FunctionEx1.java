class FunctionEx1
{
  public static void main(String args[])
  {
    String arr[]={"10","60","20","80"};
    int res=getSum(arr);
    System.out.println(res);
  }
  static int getSum(String a[])
  {
     int sum=0;
     for(int c=0;c<a.length;c++)
        sum=sum+Integer.parseInt(a[c]);
     return sum;
  }
}
