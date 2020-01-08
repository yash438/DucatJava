//finally (exception handler)
class exp
{
  public static void main(String...s)
  {
    try
    {
      int x=10/0;
    }
    
    catch(Exception e)
    {
      System.out.println(e);
    }

    finally
    {
      System.out.println("har hal mai execute lastly block");
    }
  }
}