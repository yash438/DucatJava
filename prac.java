class Sum
{ 
   int sum=0,a,b;
  
   void input(int a, int b)
   {
     sum=a+b;
   }
  
   void disp()
   {
     System.out.println(sum);
   }
    
   public static void main(String arg[])
   {
     Sum sum1 = new Sum();
         sum1.input(1,2);
         sum1.disp();
     
     Sum sum2 = new Sum();
         sum2.input(2,3);
         sum2.disp();
   }
}