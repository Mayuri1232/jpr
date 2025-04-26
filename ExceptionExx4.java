 import java.util.*;
class NoMatchException extends Exception
{
NoMatchException(String msg)
{
super(msg);
}
}
class ExceptionExx4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.next();
try
{
if(str.equals("India"))
{
System.out.println("Entered String is Equal");
}
else
{
throw new NoMatchException("No Match Found");
}
}
catch(NoMatchException e)
{
System.out.println(e.getMessage());
}
}
}
