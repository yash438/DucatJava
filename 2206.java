class staticblock
{
  static int x=10;
  public static void main(String...s)
  {
    System.out.println("static block"+x);
  }
}
class static_block1
{
  public static void main(String...s)
  {
    System.out.println(staticblock.x);
  }
}
class static_block2
{ public static void main(String...d)
  { System.out.println(staticblock.x);
  }
}