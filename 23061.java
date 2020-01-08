class base
{
private int x,y;
void input(int x,int y)
{
this.x=x;
this.y=y;
}
void disp()
{
System.out.println(x);
System.out.println(y);
  }
}
class child extends base
{
  int a,b;
  void setdata(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  void getdata()
  {
    System.out.println(a); 
    System.out.println(b);
  }
  public static void main(String...s)
  {
child c=new child();
      c.input(10,20);
      c.disp();
      c.setdata(30,40);
      c.getdata();
  }
}