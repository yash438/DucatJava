import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Login extends JFrame implements ActionListener 
  {
   public static String  s4;
    JLabel t,t3,t4,us,p,t5,img;
    JTextField t1,t2;
    JComboBox box1;
    JButton b1,b2,b3;
    Login()
    { 
      setSize(650,500);
      setVisible(true);
       
      Container c=getContentPane();
                c.setLayout(null);
                c.setBackground(Color.white);
          
      Font f=new Font("SanSerif",Font.BOLD,20);
      Font f1=new Font("Serif",Font.BOLD,40);
    
      t=new JLabel("McDonald's");
      t3=new JLabel("Welcomes you");
      t4=new JLabel("Login here");

      us=new JLabel("Username");
       p=new JLabel("Password");
      t5=new JLabel("Select Login Type");

      t1=new JTextField();
      t2=new JTextField();

      box1=new JComboBox();
      box1.setBounds(750,280,200,30);
      box1.addItem("User");
      box1.addItem("Admin");
      c.add(box1);
     
      b1=new JButton("LogIn");
      b2=new JButton("Change Password");
      b3=new JButton("Sign up");
  
      t.setFont(f1);
      t3.setFont(f1);
      t4.setFont(f1); 
      us.setFont(f);
       p.setFont(f);
      t5.setFont(f);
  
      b1.setFont(f);
      b2.setFont(f);
      b3.setFont(f);

       t.setBounds(525,50,400,55);
       t3.setBounds(505,100,400,45);
       t4.setBounds(350,155,400,50);
 
      us.setBounds(350,200,300,30);
       p.setBounds(350,240,300,30);
      t5.setBounds(350,280,500,30);
  
      t1.setBounds(750,200,200,30);
      t2.setBounds(750,240,200,30);
    
      b1.setBounds(500,330,250,30);
      b2.setBounds(350,380,250,30);
      b3.setBounds(700,380,200,30);
    
      t.setForeground(Color.red);
      t3.setForeground(Color.yellow);
      t4.setForeground(Color.blue);
     
     us.setForeground(Color.black);
      p.setForeground(Color.black);
     t5.setForeground(Color.black);  
   
    c.add(t);
    c.add(t3);
    c.add(t4);

    c.add(us);
    c.add(p);
    c.add(t5);
  
    c.add(t1);
    c.add(t2);
   
    c.add(b1);
    c.add(b2);
    c.add(b3);

ImageIcon ii=new ImageIcon("F:/JAVA/Java Project/mcd.jpg");
img=new JLabel(ii);
img.setBounds(0,0,1350,750);
c.add(img);

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
       String str=e.getActionCommand();
       String text1,text2;
if(e.getSource()==b3)
{
setVisible(false);
 new signup();
}
else if(e.getSource() == b1)
{
    s4=t1.getText();
String text3=(String)box1.getSelectedItem();
if(text3.equals("User"))
{
setVisible(false);
 new OrderList();
}
else if(text3.equals("Admin"))
{
setVisible(false);
new Admin();
}
}
else if(e.getSource() == b2)
{
setVisible(false);
new Password();
    }    
  }

      public static void main(String...s)
      {
         new Login();
      }
 }
 
  
   