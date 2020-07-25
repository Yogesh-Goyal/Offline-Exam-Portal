package pjdb;
import java.sql.*;
public class Jdb
{
Connection con;
ResultSet rs;
Statement smt;
public Jdb()
{
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
}
catch(Exception e)
{
System.out.println(e);
}
}
public void writeData(String q)
{
try
{
smt=con.createStatement();
smt.executeUpdate(q);
}
catch(Exception e){System.out.println(e);}
}
public ResultSet readData(String q)
{
System.out.println(q);
try
{
smt=con.createStatement();
rs=smt.executeQuery(q);
}
catch(Exception e){System.out.println(e);}
return rs;
}
}
