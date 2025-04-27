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
  ip=InetAddress.getByAddress(new byte[] {(byte)142, (byte)250, (byte)207, (byte)164});
  System.out.println(ip);
  
}
}
