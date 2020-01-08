class cons
{ 
int x,y;
cons()
{
x=y=101;
}
cons(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String...s)
{
cons c1=new cons(10,20);
     c1.show();
}
}