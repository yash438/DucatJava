interface my
{
  default void show()
  {
    System.out.println("interface reengineering work");
  }
  void disp();

}

class child implements my
{
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