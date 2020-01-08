class dadaji
{
  int x=10;
}
class papaji extends dadaji
{
  int x=20;
}
class child extends papaji
{
  int x=30;
  void disp()
  {
    System.out.println(x);
    System.out.println(super.x);
    System.out.println(((dadaji)this).x);
  }
  
  public static void main(String...s)
  {
    new child().disp();
  }
}