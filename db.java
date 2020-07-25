import java.sql.*;
class db
{
public static void main(String arg[])
{
Connection con;
Statement smt;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
smt=con.createStatement();
rs=smt.executeQuery("select * from studata");
while(rs.next())
{
System.out.print(rs.getInt(1)+"  ");
System.out.print(rs.getString(2)+"  ");
System.out.print(rs.getString(3)+"  ");
System.out.println(rs.getString(4)+"  ");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}