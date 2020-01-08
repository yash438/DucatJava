//abstraction
abstract class animal
{
 abstract void fly();
 void nonfly()
 {
   System.out.println("nonfly animal");
 }
}

class bird extends animal
{
  void show()
  {
    System.out.println("bird show");
  }
  void fly()
  {
    System.out.println("fly bird");
  }

  public static void main(String...s)
  {
    bird b=new bird();
         b.nonfly();
         b.show();
         b.fly();
  }
}