import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class db3 extends Frame implements ActionListener
{
TextField tf1=new TextField(20);
TextField tf2=new TextField(20);
TextField tf3=new TextField(20);
TextField tf4=new TextField(20);
Button b=new Button("SAVE");
db3()
{
super("Database Handling");
setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(b);
setSize(400,400);
setVisible(true);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{
Connection con;
Statement smt;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
smt=con.createStatement();
smt.executeUpdate("insert into studata values("+tf1.getText()+",'"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"');");

System.out.println("Data Added");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String arg[])
{
db3 obj=new db3();
}
}