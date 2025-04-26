import java.sql.*;
public class Insert
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
s1.executeUpdate("create table Stud312(roll_no number(2),name varchar(20))");
Statement s2=con.createStatement();
s2.executeUpdate("insert into Stud312 values(1,'ABC')");
System.out.println("Record Inserted");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
