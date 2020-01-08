import java.io.*;
class MyFileWriter
{
  public static void main(String arg[])throws IOException
  {
    FileOutputStream fw=new FileOutputStream("abc.txt");
  //  File("F:/abc.txt");
    String s="India is a good country";
    byte ch[]=s.getBytes();
    
    for(int i=0;i<ch.length;i++)
    {
      fw.write(ch[i]);
    }
    
    fw.close();
    System.out.println("File Created Successfully");
  }
}