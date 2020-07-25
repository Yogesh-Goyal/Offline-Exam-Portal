import java.sql.*;
class db1
{
public static void main(String arg[])
{
Connection con;
PreparedStatement ps;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
ps=con.prepareStatement("insert into studata values(?,?,?,?);");
ps.setInt(1,107);
ps.setString(2,"Nishu");
ps.setString(3,"Vishu");
ps.setString(4,"Delhi");
ps.executeUpdate();
System.out.println("Data Added");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}