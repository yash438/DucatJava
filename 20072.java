import java.io.*;
class MyByteWriter 
{
  public static void main(String arg[])throws IOException
  {
    ByteArrayOutputStream fw=new ByteArrayOutputStream();
    String s="India is good Country";
    byte ch[]=s.getBytes();

    for(int i=0;i<ch.length;i++)
    fw.write(ch[i]);

    fw.writeTo(new FileOutputStream("rabri.txt"));

    System.out.print(fw.toString());
    byte z[]=fw.toByteArray();

    ByteArrayInputStream fr=new ByteArrayInputStream(z);

    int i=0;
    while((i=fr.read())!=-1)
    
    System.out.print((char)i);
    //System.out.println(i);    
  }
}