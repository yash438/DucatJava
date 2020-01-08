package p2;
import p1.*;
public class second
{
  void disp()
  {
    System.out.println("out side class");
  }
   
  public static void main(String...s)
  { 
    second s1=new second();
           s1.disp();

    first f1=new first();
          f1.show();
  }
}