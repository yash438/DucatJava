//abstraction via interface
interface my
{
  void show();
  void disp();
}

class child implements my
{
  public void show()
   {
    System.out.println("my show");
   }
 /* public void disp()
  {
    System.out.println("disp child");
  }*/
}
class child1 implements my
{ 
  public void disp()
  {
    System.out.println("child1 disp"); 
  }

  public static void main(String...s)
  {
    child c=new child();
          c.show();
          c.disp(); 
  }
}