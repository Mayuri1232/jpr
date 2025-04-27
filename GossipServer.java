import java.io.*;
import java.net.*;
class GossipServer
{
public static void main(String args[]) throws Exception
{
ServerSocket ss=new ServerSocket(3000);
System.out.println("Server ready");
Socket s=ss.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
OutputStream os=s.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
InputStream is=s.getInputStream();
BufferedReader rRead=new BufferedReader(new InputStreamReader(is));
System.out.println("start chitchat");
String rm,sm;
while(true)
{
if((rm=rRead.readLine())!=null)
{
System.out.println("from client:"+rm);
}
sm=br.readLine();
pw.println(sm);
pw.flush();
}
}
}

//CLient code
import java.io.*;
import java.net.*;
public class GossipClient
{
public static void main(String args[]) throws IOException
{
Socket s=new Socket("192.168.159.139",3000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
OutputStream os=s.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
InputStream is=s.getInputStream();
BufferedReader rRead=new BufferedReader(new InputStreamReader(is));
System.out.println("Start chitchat");
String rm,sm;
while(true)
{
sm=br.readLine();
pw.println(sm);
pw.flush();
if((rm=rRead.readLine())!=null)
{
System.out.println("From server:"+rm);
}
}
}
}
