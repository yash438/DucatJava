class test
{
  void air()throws Exception
  {
    int x=10/0;
  }

  void ary()throws Exception
  {
    int y[] = new int[10];
      y[20] = 100;
  }
 
  public static void main(String...s)
  {
    test t = new test();
    try
    {
   // t.air();
      t.ary();
    }
     
    catch(Exception e)     
    {
      System.out.println(e);
    }
  }
}