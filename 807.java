import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame
{
  public static void main(String...s)
  {
    MyFrame3 f=new MyFrame3();
    f.setTitle("MY AWT FRAME");
    f.setSize(200,250);
    f.setVisible(true);
    f.add windowListener(new MyClass1());
  }
}

class MyClass1 extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
}