import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Admin extends JFrame implements ActionListener 
  {
    JLabel t,t1,h,h1,h2,h3,h4,h5,h6,h7,a,b,d,img;
    JTextField t3,t4,t5,t6,t7,t8,t9,a1,a2;
    JButton b1;
    Admin()
    { 
      setSize(650,600);
      setVisible(true);
       
      Container c=getContentPane();
                c.setLayout(null);
                c.setBackground(Color.white);
      
      Font f2=new Font("SanSerif",Font.BOLD,40);   
      Font f1=new Font("Serif",Font.BOLD,20);
    
      h=new JLabel("Current Status of Caffee ");
      a=new JLabel("Online Sale  ");
      b=new JLabel("Offline Sale");
      d=new JLabel("Caffee Visit ");
      h1=new JLabel("Item Sold ");
      h2=new JLabel("Item Sold ");
      h3=new JLabel("Collection ");
      h4=new JLabel("Collection ");
      h6=new JLabel("Total Item Sold ");
      h7=new JLabel("Total Collection");
      h5=new JLabel("Daily Visit");
      t=new JLabel("Monthly Visit");
      t1=new JLabel("Overall Visit");

      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();
      t6=new JTextField();
      t7=new JTextField();
      t8=new JTextField();
      t9=new JTextField();
      a1=new JTextField();
      a2=new JTextField();

      b1=new JButton("SignOut");

      h.setFont(f2);
      a.setFont(f2);
      b.setFont(f2);
      d.setFont(f2);
      h1.setFont(f1);
      h2.setFont(f1);
      h3.setFont(f1);
      h4.setFont(f1);
      h6.setFont(f1);
      h7.setFont(f1);
      h5.setFont(f1);
      t.setFont(f1);
      t1.setFont(f1);
      b1.setFont(f1);

     h.setBounds(10,20,500,50);
     a.setBounds(10,70,500,50);
     b.setBounds(500,70,500,50);
     d.setBounds(1000,70,500,50);
     h1.setBounds(10,120,300,50);
     h2.setBounds(500,120,300,50);
     h3.setBounds(10,170,300,50);
     h4.setBounds(500,170,300,50);
     h6.setBounds(280,270,300,50);
     h7.setBounds(280,320,300,50);
     h5.setBounds(1000,120,300,50);
     t.setBounds(1000,170,300,50);
     t1.setBounds(1000,220,300,40);
     t3.setBounds(110,135,100,25);
     t4.setBounds(600,135,100,25);
     t5.setBounds(110,185,100,25);
     t6.setBounds(600,185,100,25);
     t7.setBounds(1130,130,100,25);
     t8.setBounds(1130,180,100,25);
     t9.setBounds(1130,230,100,25);
     a1.setBounds(445,285,100,25);
     a2.setBounds(445,335,100,25);
     b1.setBounds(1270,0,110,30);      

     h.setForeground(Color.black);
     a.setForeground(Color.blue);
     b.setForeground(Color.blue);
     d.setForeground(Color.blue);
     h1.setForeground(Color.black);
     h2.setForeground(Color.black);
     h3.setForeground(Color.black);
     h4.setForeground(Color.black);
     h6.setForeground(Color.black);
     h7.setForeground(Color.black);
     h5.setForeground(Color.black);
     t.setForeground(Color.black);
     t1.setForeground(Color.black);

        t3.setText("5");
        t4.setText("150");
        t5.setText("10");
        t6.setText("1500");
        t7.setText("10");
        t8.setText("10");
        t9.setText("10");
        a1.setText("75");
        a2.setText("1650");

    c.add(h);
    c.add(a);
    c.add(b);
    c.add(d);
    c.add(h1);
    c.add(h2);
    c.add(h3);
    c.add(h4);
    c.add(h6);
    c.add(h7);
    c.add(h5); 
    c.add(t);
    c.add(t1);
    c.add(t3);
    c.add(t4);
    c.add(t5);
    c.add(t6);
    c.add(t7);
    c.add(t8);
    c.add(t9);
    c.add(a1);
    c.add(a2);
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
   if(str.equals("SignOut"))
     {
      setVisible(false);
       new Login();
     }
  }

      public static void main(String...s)
      {
         new Admin();
      }
 }
 

      