final class base
{
  final void show()
  {
    System.out.println("show base");
  }
}

class child extends base
{
  final void show()
  {
    System.out.println("show base");
  }

  public static void main(String...s)
  { 
    child c=new child();
          c.show();
  }
}  