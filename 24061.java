class base
{
int x=10;
}
class child extends base
{ int x=20;

 void show()
 {
 System.out.println(super.x);/*super holds base class reference
 */System.out.println(x);
 }
 
 public static void main(String...s)
 {
 child c=new child();
       c.show();
 }
}