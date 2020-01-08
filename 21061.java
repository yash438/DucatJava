class copycan{
int x;
int y;

copycan(int x, int y)
{ this.x=x;
this.y=y;
}
copycan(copycan z)
{ this.x=z.x;
this.y=z.y;
}
void show()
{ System.out.println(x);
System.out.println(y);
}
public static void main(String...s)
{ copycan c1=new copycan(10,20);
          c1.show();
  copycan c2=new copycan(c1);
          c2.show();
}
}