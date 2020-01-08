class construct
{
int x;
String na;
float y;
construct()
{
x=10;
na="yash";
y=20.5f;
}
void input(int x,String na,float y)
{
this.x=x;
this.na=na;
this.y=y;
}
void disp()
{
System.out.println(x);
System.out.println(na);
System.out.println(y);
}
public static void main(String...s)
{ 
construct t = new construct();
System.out.println("Before call");
t.disp();
System.out.println("After implicit call");
t.input(10,"ashish",20);
t.disp();
}
}

