class demo
{ int x=10;
  int y=20;
  void input(int x,int y)
  { this.x=x;
    this.y=y;
  }
  void show()
  { 
    System.out.println(x);
    System.out.println(y);
  }
  public static void main(String...s)
  { 
    demo d1=new demo();
         d1.input(30,40);
         d1.show();
  }
}