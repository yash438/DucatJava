class system
{
  static printStream out;
  static
  {
    out=new printStream();
  }
}
class printStream
{
  void println(int x)
  {
    S.O.P(x);
  }
}
class temp1
  {   public static void main(String...s)
      {
         S.O.P(10);
         S.O.P("System.out.print");
      }
  }
