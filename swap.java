class Swap
{ 
   int a,b,temp;
    
   void input(int a,int b)
   { 
      temp = a;
         a = b;
         b = temp;
   }
   
   void disp()
   { 
      System.out.println(a);
      System.out.println(b);
   }

   public static void main(String...s)
   {
      Swap a1=new Swap();
           a1.input(3,7);
           a1.disp();
      
      Swap a2=new Swap( );
           a2.input ( 6 , 5);
           a2.disp( );
   }
}
