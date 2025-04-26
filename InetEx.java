import java.net.*;
import java.util.*;
class InetEx
{
public static void main(String args[])throws UnknownHostException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Host Name :");
String Hostnm=sc.nextLine();
InetAddress ip=InetAddress.getByName(Hostnm);
System.out.println("Host NAme :"+Hostnm);
System.out.println("IP Address :"+ip.getHostAddress());
}
}