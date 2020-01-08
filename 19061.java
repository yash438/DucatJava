class test
{ 
  int x=10;
  
  void disp(int x,test p)
  {
    System.out.println(x);
  
    System.out.println(this.x);
    
    System.out.println(this);
  }
  
  public static void main(String...s)
  {  test t1=new test();
          t1.disp(20,t1);
          System.out.println(t1);

     test t2=new test();
          t2.disp(30,t2);
   System.out.println(t2);
}
}