import java.awt.*;
class myframe1 extends Frame
{ 
  myframe1(String s)
  {
    super(s);
  }

  public static void main(String...g)
  {
    myframe1 f1=new myframe1("myframe");
             f1.setSize(400,300);
             f1.setVisible(true);
  }
}