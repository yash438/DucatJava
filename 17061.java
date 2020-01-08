class Student
{ int sid;
  String sname;
  static String cname="IIT";
   
  void setinfo(int s, String sn)
  {  
     sid=s;
     sname=sn;
  }

  void getinfo()
  {
     System.out.println(sid);
     System.out.println(sname);
     System.out.println(new Student().cname);
  }
   
  static void cchange(String cn)
  {  
     cname=cn;
  }
  public static void main( String...s)
  {
     cchange("NIT");
     Student s1=new Student();
             s1.setinfo(1,"abc");
             s1.getinfo();
          
     System.out.println(s1.sid);
     
     Student s2=new Student();
             s2.setinfo(2,"xyz");
             s2.getinfo();
  }
}