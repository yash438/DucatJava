//constructor can be reused
//constructor reusability under inheritance
class base
{
  base()
  {
    System.out.println("base class def const");
  }
}

class child extends base
{  
  child()
  {  
    System.out.println("child def const");
  }
  
  public static void main(String...s)
  {
    child c=new child();
  }
}        