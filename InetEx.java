import java.net.*;

class InetEx
{
public static void main(String args[]) throws UnknownHostException
{
InetAddress ip=InetAddress.getLocalHost();
  System.out.println(ip);
 ip=InetAddress.getByName("www.google.com");
  System.out.println(ip);
System.out.println("Host NAme :"+ip.getHostName());
System.out.println("IP Address :"+ip.getHostAddress());
  ip=InetAddress.getByAddress(142.250.207.164);
  System.out.println(ip);
  
}
}
