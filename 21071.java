import java.io.*;
 
class MyBufferedWriter
{
  public static void main(String arg[])throws IOException
  {
    InputStreamReader in=new InputStreamReader(System.in);
    
    BufferedReader br= new BufferedReader(in);
    FileWriter fw=new FileWriter("abc.txt");

    BufferedWriter bw= new BufferedWriter(fw);
    PrintWriter pw=new PrintWriter(fw);

    String s=" ";
    while(!s.equals("stop"))
    { 
      s=br.readLine();

      pw.println(s);
      pw.flush();
    }
  }
}

    