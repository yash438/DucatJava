import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JComboBoxDemo extends JFrame implements
ItemListener
{
  //vars

  JComboBox box;
  JLabel lbl;

  JComboBoxDemo()
  {
    Container c=getContentPane();
    c.setLayout(null);
    box=new JComboBox();

    //add items to it
 
    box.addItem("India");

    box.addItem("America");

    box.addItem("Germany");

    box.addItem("Japan");

    box.addItem("France");

    //set location of combo box 
  
    box.setBounds(100,50,100,40);

    //add combo box to the combo box
 
    c.add(box);

    lbl=new JLabel();
    lbl.setBounds(100,200,200,40);

    c.add(lbl);
 
    //attach item listener to combo box
   
    box.addItemListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void itemStateChanged(ItemEvent ie)
  {
    //know which item is selected
   
    String str=(String)box.getSelectedItem();
  
    //disp the selected item in label
  
    lbl.setText("you selected:"+str);
  }

  public static void main(String...s)  
  {
    JComboBoxDemo demo=new JComboBoxDemo();
    demo.setTitle("My combobox");
    demo.setSize(500,400);
    demo.setVisible(true);
  }
}