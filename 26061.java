//constructor can be reused
//constructor reusability under inheritance
class base
{
  base()
  {
    System.out.println("base class def const");
  }
  base(int x)
  {
    System.out.println(x);
  }
}

class child extends base
{  
  child()
  {  
    System.out.println("child def const");
  }
  child(int y)
  {
    super(10);
    System.out.println(y);
  }
  
  public static void main(String...s)
  {
    child c=new child();
    child c1=new child(20);

}
}        