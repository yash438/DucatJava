//throw keyword
class test
{
  int age; 
  
  void show(int age)
  {

  if( age>18 )
  {
    try
    {
      throw new ArithmeticException("invalid age go out of website");
    }
  
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  }

  public static void main(String...s)
  {
    test t = new test();
         t.show(20);
  }
}

     