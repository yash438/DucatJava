class test
{
  public static void main(String...s)
  {
    try
    {
    int x=10/0;
    }
    catch(ArithmeticException r)
    {
      System.out.println(r);
    }
  }
}