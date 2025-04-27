import java.sql.*;
public class Update
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.OracleDriver");
System.out.println("Driver Loaded........");
String url="jdbc:oracle:thin:@localhost:1521:XE";
String user="system";
String pass="system";
Connection con=DriverManager.getConnection(url,user,pass);
System.out.println("Connection esablished.........");
Statement s1=con.createStatement();
s1.executeUpdate("update Stud312 set name='abc' where roll_no='1' ");
System.out.println("Record Updated");
Statement s2=con.createStatement();
s2.executeUpdate("delete from Stud312 where roll_no='1' "); 
con.close();  
}
catch(Exception e)
{
System.out.println(e);
}
}
}
