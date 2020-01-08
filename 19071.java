//multiple tasking acting on single object
class Reserve implements Runnable
{ 
  //Available birth are=1
  int available=1;
  int wanted;
  
  //accept wanted berth at run time
 
  Reserve(int i)
  {
    wanted=i;
  }
  
  public void run()
  {
    synchronized(this)
    {
      System.out.println("Available berth="+available);
      if(available>=wanted)
      {
        String name = Thread.currentThread().getName();
        System.out.println(wanted+"Birth reserve for"+name);
        try
        {
          Thread.sleep(2000);
          available=available-wanted;
        }
        catch(InterruptedException ie)
        {
        }
      }
      else
      System.out.println("sorry, NO berth available");
    }
  }
}

class Safe
{
  public static void main(String...s)
  {
    Reserve obj=new Reserve(1);
    Thread t1=new Thread(obj);
    Thread t2=new Thread(obj);
           t1.setName("first person");
           t2.setName("second person");
           t1.start();
           t2.start();
  }
}