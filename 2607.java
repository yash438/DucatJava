import java.io.*;
class MyFileWriter
{
  public static void main(String arg[])throws IOException
  {
    FileOutputStream fw=new FileOutputstream("abc.txt");//new
    File("F:\abc.txt")
    String s="India is good country";
    byte ch[]=s.getBytes();
    for(int i=0;i<ch.lengtg;i++)
    {
      fw.write(ch[i]);
    }
    fw.close();
    System.out.println("File created Successfully");
  }
}
 