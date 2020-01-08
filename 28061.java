//dynamic binding interface
interface my1
{
  void show();
}

interface my2
{ 
  void show();
}

class child implements my1,my2
{
  public void show()
  {
    System.out.println("child show");
  }
  
  public static void main(String...s)
  {
     my1 m1= new child();
         m1.show();
    
     my2 m2=new child();
         m2.show();
  }
}
//hence, we achieved 100% dynamic binding