class test
{ 
   int x;
   int y;
   
   void input(int x1,int y1)
   {
     x=x1;
     y=y1;
   }
   
   void show()
   { 
     System.out.println(x);
     System.out.println(y);
   }
   
   public static void main(String...s)
   { 
     test t=new test();
     t.input(10,20); 
     t.show();
     test t1= new test();
     t1.input(30,10);
     t1.show();
     System.out.println(t.hashCode());
     System.out.println(t1.hashCode());
   }
}  