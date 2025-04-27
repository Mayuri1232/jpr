import java.util.*;
import java.net.*;

class URLConnEx 
{
public static void main(String args[]) throws Exception 
{
URL u = new URL("http://www.gmail.com/");
URLConnection con = u.openConnection();
long d = con.getDate();
if (d == 0) 
{
System.out.println("Date not available");
} 
else 
{
System.out.println("Date is : " + new Date(d));
}
d = con.getLastModified();
if (d == 0) 
{
System.out.println("Not available");
} 
else 
{
System.out.println("Modification date = " + new Date(d));
}
int l = con.getContentLength();
System.out.println("Content length : " + l);
String str = con.getContentType();
System.out.println("Content Type = " + str);

}
}
