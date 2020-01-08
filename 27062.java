//can class consist more than 1 interface
interface my1
{
  void show();
}

interface my2
{
  void disp();
}

class child implements my1,my2
{
  public void show()
  {
    System.out.println("show child");
  }
  
  public void disp()
  {
    System.out.println("disp child");
  }

  public static void main(String...s)
  {
    child c=new child();
          c.show();
          c.disp();
  }
}
//yes a class can contain more than 1 interface