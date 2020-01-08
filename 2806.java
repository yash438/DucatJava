//can interface extend interface
interface my1
{ 
  void disp();
}

interface my2 extends my1
{
  void show();
}

class child implements my2
{
  public void disp()
  {
    System.out.println("child disp");
  }

  public void show()
  {
    System.out.println("child show");
  }

  public static void main(String...s)
  {
    child c=new child();
          c.disp();
          c.show();
  }
}
//yes,an interface can extend interface