class test
{
  public static void main(String...s)
  {
    String a=new String("Hello");
    String s1="Hello";
    String s2=a.intern();
    if(s2==s1)
    {
      System.out.println("ref match");
    }
    else
    {
      System.out.println("ref not match");
    }
  }
}