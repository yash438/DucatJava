import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Password extends JFrame implements ActionListener 
  {
    JLabel t,t1,t2,img;
    JTextField t3,t4,t5;
    JButton b1,b2;
    Password()
    { 
      setSize(650,500);
      setVisible(true);
       
      Container c=getContentPane();
                c.setLayout(null);
                c.setBackground(Color.white);
          
      Font f=new Font("SanSerif",Font.BOLD,40);
      Font f1=new Font("Serif",Font.BOLD,20);
    
      t=new JLabel("Old Password");
      t1=new JLabel("New Password");
      t2=new JLabel("Re new Passwd");

      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();

      b1=new JButton("Back");
      b2=new JButton("Change Password");

      t.setFont(f);
      t1.setFont(f);
      t2.setFont(f);
      b1.setFont(f1);
      b2.setFont(f1);

     t.setBounds(310,150,325,50);
     t1.setBounds(310,250,325,40);
     t2.setBounds(310,350,325,30);
     t3.setBounds(690,150,300,40);
     t4.setBounds(690,250,300,40);
     t5.setBounds(690,350,300,40);
     b1.setBounds(0,0,100,30);
     b2.setBounds(500,450,250,35);      

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
    c.add(b2);

ImageIcon ii=new ImageIcon("F:/JAVA/Java Project/md.jpg");
img=new JLabel(ii);
img.setBounds(0,0,1450,810);
c.add(img);  

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b1.addActionListener(this);
    b2.addActionListener(this);
}
   public void actionPerformed(ActionEvent e)
  {
       String str=e.getActionCommand();
       String text1,text2,text3;
   if(str.equals("Back"))
     {
      setVisible(false);
       new Login();
     }
if(str.equals("Change Password"))
         {
           text1=t1.getText();
           text2=t2.getText();
           text3=t3.getText();
           
           JOptionPane.showMessageDialog(this,"Your password is change sucessfully");
           t3.setText("");
           t4.setText("");
           t5.setText("");
         }

  }

      public static void main(String...s)
      {
         new Password();
      }
 }
 

      