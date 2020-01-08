import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CurrentStatus extends JFrame implements ActionListener 
  {
    JLabel t,t1,t2,img;
    JTextField t3,t4,t5;
    JButton b1;
    CurrentStatus()
    { 
      setSize(650,500);
      setVisible(true);
       
      Container c=getContentPane();
                c.setLayout(null);
                c.setBackground(Color.white);
          
      Font f=new Font("SanSerif",Font.BOLD,40);
      Font f1=new Font("Serif",Font.BOLD,20);
    
      t=new JLabel("Total Item Sold");
      t1=new JLabel("Total Collection");
      t2=new JLabel("Daily View");

      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();

      b1=new JButton("Back");

      t.setFont(f);
      t1.setFont(f);
      t2.setFont(f);
      b1.setFont(f1);

     t.setBounds(300,150,300,50);
     t1.setBounds(300,250,300,40);
     t2.setBounds(300,350,300,30);
     t3.setBounds(700,150,300,40);
     t4.setBounds(700,250,300,40);
     t5.setBounds(700,350,300,40);
     b1.setBounds(0,0,100,30);      

     t.setForeground(Color.black);
     t1.setForeground(Color.black);
     t2.setForeground(Color.black);

    c.add(t);
    c.add(t1);
    c.add(t2);
    c.add(t3);
    c.add(t4);
    c.add(t5);
    c.add(b1);

ImageIcon ii=new ImageIcon("F:/JAVA/Java Project/md.jpg");
img=new JLabel(ii);
img.setBounds(0,0,1450,810);
c.add(img);  

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b1.addActionListener(this);
}
   public void actionPerformed(ActionEvent e)
  {
       String str=e.getActionCommand();
       String text1,text2;
   if(str.equals("Back"))
     {
      setVisible(false);
       new Login();
     }
  }

      public static void main(String...s)
      {
         new CurrentStatus();
      }
 }
 

      