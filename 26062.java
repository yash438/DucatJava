//Dynamic binding
class base
{
  void disp()
  {
    System.out.println("base class disp");
  }
  void show()
  {
    System.out.println("child show");
  }
}

class child extends base
{
  void disp()
  { 
    super.disp();//for overriding
    System.out.println("child class disp");
  }

  public static void main(String...s)
  { 
    base b=new child();
         b.disp();
         b.show();
  }
}