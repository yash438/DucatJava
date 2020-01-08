class mythread implements Runnable
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println(i);
      try
      {
        Thread.sleep(2000);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
}

class mainthread
{
  public static void main(String...s)
  {
    mythread m1=new mythread();
    Thread t1=new Thread(m1);
    Thread t2=new Thread(m1);
    t1.start();
    t2.start();
  }
}   
  