import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class db2
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
smt.executeUpdate("insert into studata values(109,'puneet','vaneet','Barnala');");

System.out.println("Data Added");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}