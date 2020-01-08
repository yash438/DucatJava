//String Handling
class test
{
  public static void main(String...s)
  {
    String s1="java";
    String s2="java";
    if(s1==s2)
    {
      System.out.println("ref match");
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
    }
    else
    {
      System.out.println("ref not match");
    }
  }
}
