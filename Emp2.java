class Emp
{  int eid;
   String ename,address;
   
   void input( int e, String en, String a)
   {
     eid=e;
     ename=en;
     address=a;
   }
   void disp()
   {
     System.out.println(eid);
     
     System.out.println(ename);
     
     System.out.println(address);
   }
    
   public static void main(String arg[])
   {
     Emp e1 = new Emp();
         e1.input(1,"xyz","Delhi");
         e1.disp();
     Emp e2 = new Emp();
         e2.input(2,"abc","Mumbai");
         e2.disp();
   }
}