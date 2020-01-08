class base
{
int x=10;
}
class child extends base
{ static int x=20;

 void show()
 {
 System.out.println(x);
 System.out.println(x);
 }
 
 public static void main(String...s)
 {
 child c=new child();
       c.show();
 }
}