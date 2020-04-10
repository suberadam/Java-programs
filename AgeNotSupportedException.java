class AgeNotSupportedException extends Exception
{
  void showReason()
  {
    System.out.println("given age is less to the criteria");
  }
}
