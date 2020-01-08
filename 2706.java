//abstraction via interface
interface my
{
  void show();
}

class child implements my
{
  public void show()
  {
    System.out.println("my show");
  }

  public static void main(String...s)
  {
    child c=new child();
          c.show();
  }
}