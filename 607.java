//customException
class  AgeException extends Exception
{
  AgeException(String s)
  {
    super(s);
  }
}

class test
{
  int age;
  
  void get(int age)throws AgeException
  {
    if(age<18)
    {
      throw new AgeException("invalid age");
    }
    else
    {
      this.age=age;
      System.out.println(age);
    }
  }   
    public static void main(String...s)
    {
      test t=new test();
      try
      {
        t.get(3);
      }
  
      catch(AgeException e)
      {
        System.out.println(e);
      }
    }
}
  