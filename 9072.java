//Colouring a frame
import javax.swing.*;
import java.awt.*;

class Framecolor extends JFrame
{
  public static void main(String...s)
  {
    Framecolor obj= new Framecolor();
    //create content pane, it is container object c
    Container c = obj.getContentPane();
              c.setBackground(Color.blue);
    obj.setTitle("My Swing Frame Colour");
    obj.setSize(400,400);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}