import java.net.*;
class URLEx
{
public static void main(String args[])
{
try
{
URL u=new URL("http://www.msbte.org.in");
System.out.println("Port No:"+ u.getPort());
System.out.println("Protocol:"+u.getProtocol());
System.out.println("Host Name:"+u.getHost());
System.out.println("File:"+u.getFile());
System.out.println("Path:"+u.getPath());
}
catch(Exception e)
{
System.out.println(e);
}
}
}
