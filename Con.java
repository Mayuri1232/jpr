import java.sql.*;
class Conn
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.OracleDriver");
System.out.println("Driver Loaded.....");
String url="jdbc:oracle:thin:@localhost:1521:XE";
String user="system";
String pass="system";
Connection con=DriverManager(url,user,pass);
Statement s1=con.createSatement();
String sql="select empno,ename,sal from Emp";
ResultSet re=s1.executeQuery(sql);
rs=s1.getResultSet();
while(rs.next())
{
System.out.println("Emp id :"+rs.getInt());
System.out.println("Emp Name : "+rs.getString());
system.out.println("Salary :"+rs.getInt());
}
s1.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
