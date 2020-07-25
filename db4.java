import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class db4 extends Frame implements ActionListener,ItemListener
{
Choice tf1=new Choice();
TextField tf2=new TextField(20);
TextField tf3=new TextField(20);
TextField tf4=new TextField(20);
Button b=new Button("SAVE");
Button b1=new Button("UPDATE");
db4()
{
super("Database Handling");
setLayout(null);
tf1.setBounds(100,50,100,25);
tf2.setBounds(100,150,100,25);
tf3.setBounds(100,200,100,25);
tf4.setBounds(100,250,100,25);
b.setBounds(100,300,100,25);
b1.setBounds(250,300,100,25);

add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(b);
add(b1);

setSize(400,400);
setVisible(true);
Connection con;
Statement smt;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
smt=con.createStatement();
rs=smt.executeQuery("select roll from studata");
while(rs.next())
{
tf1.addItem(String.valueOf(rs.getInt(1)));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
tf1.addItemListener(this);
b.addActionListener(this);
b1.addActionListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==tf1)
{
Connection con;
Statement smt;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
smt=con.createStatement();
rs=smt.executeQuery("select * from studata where roll ="+tf1.getSelectedItem());
while(rs.next())
{
tf2.setText(rs.getString(2));
tf3.setText(rs.getString(3));
tf4.setText(rs.getString(4));

}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
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
smt.executeUpdate("");
System.out.println("Data Added");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}

if(ae.getSource()==b1)
{
Connection con;
Statement smt;
ResultSet rs;
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
con=DriverManager.getConnection("jdbc:ucanaccess://data.accdb");
smt=con.createStatement();
smt.executeUpdate("update studata set sname='"+tf2.getText()+"', fname='"+tf3.getText()+"', city='"+tf4.getText()+"' where roll="+tf1.getSelectedItem());
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
db4 obj=new db4();
}
}