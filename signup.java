import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class signup extends JFrame implements ActionListener, ItemListener
{ 
    JLabel t,l,fn,ln,ea,np,cp,db,img;
    JTextField t1,t2,t3,t4,t5;
    JComboBox box1,box2,box3;
    JRadioButton rb1,rb2;
    JButton b1,b2;
    signup()
    { 
      setSize(650,500);
      setVisible(true);
        
      Container c=getContentPane();
                c.setLayout(null);
            
      box1=new JComboBox();
      box2=new JComboBox();
      box3=new JComboBox();
      
      rb1=new JRadioButton("Male");
      rb2=new JRadioButton("Female");

      ButtonGroup bg=new ButtonGroup();
                  bg.add(rb1);
                  bg.add(rb2);
      
      c.setBackground(Color.white);
            
      Font  f=new Font("SanSerif",Font.BOLD,20);
      Font f1=new Font("SanSerif",Font.BOLD,32);
    

      t=new JLabel("Create a new account");
      
      l=new JLabel("McDonald's Always Welcomes You.");

      fn =new JLabel("First name");
      ln =new JLabel("Last name");
      ea =new JLabel("Email address");
      np =new JLabel("New Password");
      cp =new JLabel("Confirm Password");      
      db=new JLabel("Date of Birth");

      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();

      b1 =new JButton("Create Account");

      t.setFont(f1);
        
      l.setFont(f);

      fn.setFont(f);
      ln.setFont(f);
      ea.setFont(f);
      np.setFont(f);
      cp.setFont(f);
      db.setFont(f);

      rb1.setFont(f);
      rb2.setFont(f);

      b1.setFont(f);

      t.setBounds(480,85,600,50);

      l.setBounds(480,135,600,30);

      fn.setBounds(350,200,300,30);
      ln.setBounds(350,240,300,30);
      ea.setBounds(350,280,300,30);
      np.setBounds(350,320,300,30);
      cp.setBounds(350,360,300,30);
      db.setBounds(350,400,300,30);

      t1.setBounds(750,200,210,25);
      t2.setBounds(750,240,210,25);
      t3.setBounds(750,280,210,25);
      t4.setBounds(750,320,210,25);
      t5.setBounds(750,360,210,25);

      box1.setBounds(750,400,50,25);
      box2.setBounds(820,400,60,25);
      box3.setBounds(900,400,60,25);
   
      rb1.setBounds(460,450,200,25);
      rb2.setBounds(735,450,200,25);

      b1.setBounds(550,510,200,30);
   
      t.setForeground(Color.black);

      l.setForeground(Color.black);

      fn.setForeground(Color.black);
      ln.setForeground(Color.black);  
      ea.setForeground(Color.black);
      np.setForeground(Color.black);  
      cp.setForeground(Color.black);
      db.setForeground(Color.black);

      rb1.setForeground(Color.black);
      rb2.setForeground(Color.black);

      //add dates to box1
 
box1.addItem("01");
box1.addItem("02");
box1.addItem("03");
box1.addItem("04");
box1.addItem("05");
box1.addItem("06");
box1.addItem("07");
box1.addItem("08");
box1.addItem("09");
box1.addItem("10");
box1.addItem("11");
box1.addItem("12");
box1.addItem("13");
box1.addItem("14");
box1.addItem("15");
box1.addItem("16");
box1.addItem("17");
box1.addItem("18");
box1.addItem("19");
box1.addItem("20");
box1.addItem("21");
box1.addItem("22");
box1.addItem("23");
box1.addItem("24");
box1.addItem("25");
box1.addItem("26");
box1.addItem("27");
box1.addItem("28");
box1.addItem("29");
box1.addItem("30");
box1.addItem("31");
    
//add months to box2

box2.addItem("Jan");
box2.addItem("Feb");
box2.addItem("Mar");
box2.addItem("Apr");
box2.addItem("May");
box2.addItem("Jun");
box2.addItem("Jul");
box2.addItem("Aug");
box2.addItem("Sep");
box2.addItem("Oct");
box2.addItem("Nov");
box2.addItem("Dec");

//add years to box3

box3.addItem("2017");
box3.addItem("2016");
box3.addItem("2015");
box3.addItem("2014");
box3.addItem("2013");
box3.addItem("2012");
box3.addItem("2011");
box3.addItem("2010");
box3.addItem("2009");
box3.addItem("2008");
box3.addItem("2007");
box3.addItem("2006");
box3.addItem("2005");
box3.addItem("2004");
box3.addItem("2003");
box3.addItem("2002");
box3.addItem("2001");
box3.addItem("2000");
box3.addItem("1999");
box3.addItem("1998");
box3.addItem("1997");
box3.addItem("1996");
box3.addItem("1995");
box3.addItem("1994");
box3.addItem("1993");
box3.addItem("1992");
box3.addItem("1991");
box3.addItem("1990");
box3.addItem("1989");
box3.addItem("1988");
box3.addItem("1987");
box3.addItem("1986");
box3.addItem("1985");
box3.addItem("1984");
box3.addItem("1983");
box3.addItem("1982");
box3.addItem("1981");
box3.addItem("1980");
box3.addItem("1979");
box3.addItem("1978");
box3.addItem("1977");
box3.addItem("1976");
box3.addItem("1975");
box3.addItem("1974");
box3.addItem("1973");
box3.addItem("1972");
box3.addItem("1971");
box3.addItem("1970");
box3.addItem("1969");
box3.addItem("1968");
box3.addItem("1967");
box3.addItem("1966");
box3.addItem("1965");
box3.addItem("1964");
box3.addItem("1963");
box3.addItem("1962");
box3.addItem("1961");
box3.addItem("1960"); 
box3.addItem("1959");
box3.addItem("1958");
box3.addItem("1957");
box3.addItem("1956");
box3.addItem("1955");
box3.addItem("1954");
box3.addItem("1953");
box3.addItem("1952");
box3.addItem("1951");
box3.addItem("1950");

        b2=new JButton("SignIn");  
        b2.setBounds(1270,0,110,30);
        b2.setFont(f);
        c.add(b2);
        b2.addActionListener(this);


      
      c.add(t);
       
      c.add(l);
 
      c.add(fn);
      c.add(ln);
      c.add(ea);
      c.add(np);
      c.add(cp);
      c.add(db);

      c.add(t1);
      c.add(t2);
      c.add(t3);
      c.add(t4);
      c.add(t5);

      c.add(box1);
      c.add(box2);
      c.add(box3);

      c.add(rb1);
      c.add(rb2);

      c.add(b1);

ImageIcon ii=new ImageIcon("F:/JAVA/Java Project/md.jpg");
img=new JLabel(ii);
img.setBounds(0,0,1350,910);
c.add(img);

   
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      box1.addItemListener(this);
      box2.addItemListener(this);
      box3.addItemListener(this);

      b1.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
      //know which item is selected
     
      String str1=(String)box1.getSelectedItem();    //typecasting
      String str2=(String)box2.getSelectedItem();
      String str3=(String)box3.getSelectedItem();
  
    }

    public void actionPerformed(ActionEvent e)
    {
       String str=e.getActionCommand();
       String text1,text2,text3,text4,text5;
      if(str.equals("Create Account"))
       {
           text1=t1.getText();
           text2=t2.getText();
           text3=t3.getText();
           text4=t4.getText();
           text5=t5.getText();

           JOptionPane.showMessageDialog(this,"WELCOME!  "+text1 + "\nYour Account is Created" +"\n Signin Now");

           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
           t5.setText(""); 
}
else  if(str.equals("SignIn"))
        {
          setVisible(false);
           new Login();
         }
    
}
    public static void main(String...s)
    {
       new signup();
    }
 }
 
  
   