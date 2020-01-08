//method overriding
class base{
static void disp()
{
System.out.println("base disp");
}
}
class child extends base{
static void disp()
{ System.out.println("child disp");
  //super.disp();  //method hiding
}
public static void main(String...s)
{
child c=new child();
      c.disp();
      c.disp();
}
}