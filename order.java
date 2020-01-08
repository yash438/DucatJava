import java.awt.*;
import javax.swing.*;  
import java.awt.event.*;  
 class OrderList extends JFrame implements ActionListener
{  
    JLabel l1,l2,l3,img,l6;  
    JCheckBox cb1,cb2,cb3;
    JTextField t1,t2,t3; 
    JButton b,b1;  
    OrderList()
{   /* nme=new JLabel(abc);  
        nmesetBounds(100,25,300,40); 
        Font fz=new Font("SanSerif",Font.BOLD,20);
        l1.setFont(fz);
  add(nme);*/
         
        l1=new JLabel("Food Ordering System :-");  
        l1.setBounds(450,10,500,60); 
        Font f=new Font("SanSerif",Font.BOLD,40);
        l1.setFont(f);
        l2=new JLabel("Item List");  
        l2.setBounds(475,100,400,60); 
        Font f1=new Font("Serif",Font.BOLD,30);
        l2.setFont(f1);
        l3=new JLabel("Quantities");
        l3.setBounds(675,100,400,60);
        l3.setFont(f1);
        Font f2=new Font("Serif",Font.BOLD,20);  
        cb1=new JCheckBox("Pizza @ 120");  
        cb1.setBounds(475,150,150,40); 
        cb1.setFont(f2); 
        cb2=new JCheckBox("Burger @ 50");  
        cb2.setBounds(475,200,150,40);
        cb2.setFont(f2);  
        cb3=new JCheckBox("Coffee @ 40");  
        cb3.setBounds(475,250,150,40);
        cb3.setFont(f2);
        l6=new JLabel(Login.s4);
        l6.setBounds(600,60,400,60);
        l6.setFont(f1);
        b=new JButton("Order");  
        b.setBounds(575,325,120,40);
        b.setFont(f2);  
        b.addActionListener(this);
        b1=new JButton("SignOut");  
        b1.setBounds(1270,0,110,30);
        b1.setFont(f2);  
        b1.addActionListener(this);
        

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        t1.setBounds(705,155,80,30);
        t2.setBounds(705,205,80,30);
        t3.setBounds(705,255,80,30);

        add(l1);
        add(l2);
        add(l3);
        add(l6);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        add(b1);
        add(t1);
        add(t2);
        add(t3);

ImageIcon ii=new ImageIcon("F:/JAVA/Java Project/md.jpg");
img=new JLabel(ii);
img.setBounds(0,0,1450,810);
add(img);
//String s2=Login.s4;
    //t1.setText(s2);
        setSize(600,600);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

     }
  
    public void actionPerformed(ActionEvent e)
{    
        String str=e.getActionCommand();
       if(str.equals("SignOut"))
        {
          setVisible(false);
           new Login();
         }
else if(str.equals("Order"))
{ 
       
        float amount=0;  
        String msg="";  
        if(cb1.isSelected())
{  
       String text1= t1.getText();
        int x = Integer.parseInt(text1);
    
        amount= amount+x*120;  
            msg="Pizza: 120\n"; 
             
        }  
        if(cb2.isSelected())
{  
       String text2= t2.getText();
        int y = Integer.parseInt(text2);  
           amount=amount+y*50;  
            msg+="Burger: 50\n";  
        }  
        if(cb3.isSelected())
{  
          String text3= t3.getText();
        int z = Integer.parseInt(text3);

            amount=amount+z*20;  
            msg+="Coffee: 20\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Amount: "+amount+"\n Tax   :"+((amount*15)/100)+"\n...................."+"\n Total  : "+((amount)+((amount*15)/100)));
        
}    
}  
    public static void main(String...s) 
{  
        new OrderList();  
    }  
}  