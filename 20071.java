import java.io.*;
class MyFileReader
{
  public static void main(String arg[])throws IOException
  {
    FileInputStream fr=new FileInputStream("abc.txt");
    int i=0;
     while((i=fr.read())!=-1)
     //System.out.print(i);
System.out.print((char)i);
    
    fr.close();
     }
}