//multiple exceptions not possible in try
class test
{
  public static void main(String...s)
  {
    try
    {
    int x=10/8;
    int y[]=new int[10];
    y[20]=1000;
    }
    catch(ArithmeticException r)
    {
      System.out.println(r);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
  }
}