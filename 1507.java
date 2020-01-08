class mythread extends Thread
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println(i);
      try
      {
         Thread.sleep(1000);   
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
             m1.start();
  }
}
