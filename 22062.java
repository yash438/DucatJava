class overlode
{  
   void sum(int x, int y)
   { System.out.println(x+y);
   }
   void sum(int x,int y, int z)
   { System.out.println(x+y+z);
   }
   
   public static void main(String...s)
  { overlode o=new overlode();
             o.sum(10,20);
             o.sum(10,20);
  }
}