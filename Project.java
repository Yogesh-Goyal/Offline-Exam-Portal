import pjdb.Jdb;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Dialog
{
Dialog()
{
JFrame f=new JFrame();
JDialog d1=new JDialog(f,"Confirmation",true);
JButton b67=new JButton("Yes");
JButton b68=new JButton("No");
d1.setLayout(new FlowLayout());
b67.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Result okj=new Result();
}
});
b68.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
d1.setVisible(false);
}
});
d1.add(new Label("Are You Sure..?"));
d1.add(b67);
d1.add(b68);
d1.setSize(300,300);
d1.setVisible(true);
}
}
class Result extends JFrame
{
Label l12=new Label("Corrent Answer");
Label l13=new Label("Marked Answer");
Label l14=new Label("QuesNo.");
Font ff2=new Font("Arial",Font.BOLD,18);
Font ff3=new Font("Arial",Font.BOLD,13);
List li=new List();
List li1=new List();
List li2=new List();
TextField tf1=new TextField(20);
Jdb obj2=new Jdb();
ResultSet rs1;
Result()
{
super("Evalution Result");
try{rs1=obj2.readData("select sum(Marks) from studata");
while(rs1.next())
{tf1.setText("Evaluted Marks are:"+String.valueOf(rs1.getInt(1)));}}
catch(Exception e){System.out.println(e);}
try{rs1=obj2.readData("select Ans from studata");
while(rs1.next()){li.add(rs1.getString(1));}}
catch(Exception e){System.out.println(e);}
try{rs1=obj2.readData("select UAns from studata");
while(rs1.next()){li1.add(rs1.getString(1));}}
catch(Exception e){System.out.println(e);}
try{rs1=obj2.readData("select SN from studata");
while(rs1.next())
{li2.add(String.valueOf(rs1.getInt(1)));}}
catch(Exception e){System.out.println(e);}
tf1.setBounds(100,400,250,30);
li.setBounds(150,50,100,310);
li1.setBounds(300,50,100,310);
l12.setBounds(150,15,100,25);
l13.setBounds(300,15,100,25);
li2.setBounds(50,50,60,310);
l14.setBounds(50,15,60,25);
tf1.setFont(ff2);
l12.setFont(ff3);
l13.setFont(ff3);
l14.setFont(ff3);
add(l14);
add(tf1);
add(li);
add(li1);
add(li2);
add(l12);
add(l13);
setLocation(270,150);
setLayout(null);
setVisible(true);
setSize(550,540);
}
}
class Project extends JFrame implements ItemListener,ActionListener
{
ImageIcon ico=new ImageIcon("back.jpg");
String j,h,h1,h2;
int t;
Jdb obj1=new Jdb();
Font ff=new Font("Arial",Font.BOLD,18);
Font ff1=new Font("Times New Roman",Font.BOLD,30);
Label l2=new Label();
Label l3=new Label();
JLabel l1=new JLabel(ico);
Panel p=new Panel();
Checkbox chk1=new Checkbox("BookMark");
JRadioButton r1=new JRadioButton();
JRadioButton r2=new JRadioButton();
JRadioButton r3=new JRadioButton();
JRadioButton r4=new JRadioButton();
JRadioButton r5=new JRadioButton("Not Attempt...");
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("10");
JButton b11=new JButton("11");
JButton b12=new JButton("12");
JButton b13=new JButton("13");
JButton b14=new JButton("14");
JButton b15=new JButton("15");
JButton b16=new JButton("16");
JButton b17=new JButton("17");
JButton b18=new JButton("18");
JButton b19=new JButton("19");
JButton b20=new JButton("20");
JButton b21=new JButton("Next");
JButton b22=new JButton("Previous");
JButton b23=new JButton("First");
JButton b24=new JButton("Last");
JButton b25=new JButton("End");
GridLayout gb=new GridLayout(5,4);
ButtonGroup gb1=new ButtonGroup();
Color c=new Color(182,45,210);
Color c1=new Color(0,255,0);
Project()
{
super("C Language Questions");
gb1.add(r1);
gb1.add(r2);
gb1.add(r3);
gb1.add(r4);
gb1.add(r5);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
p.add(b17);
p.add(b18);
p.add(b19);
p.add(b20);
l2.setFont(ff1);
l3.setFont(ff);
r1.setFont(ff);
r2.setFont(ff);
r3.setFont(ff);
r4.setFont(ff);
r5.setFont(ff);
b1.setBackground(Color.red);
b2.setBackground(Color.red);
b3.setBackground(Color.red);
b4.setBackground(Color.red);
b5.setBackground(Color.red);
b6.setBackground(Color.red);
b7.setBackground(Color.red);
b8.setBackground(Color.red);
b9.setBackground(Color.red);
b10.setBackground(Color.red);
b11.setBackground(Color.red);
b12.setBackground(Color.red);
b13.setBackground(Color.red);
b14.setBackground(Color.red);
b15.setBackground(Color.red);
b16.setBackground(Color.red);
b17.setBackground(Color.red);
b18.setBackground(Color.red);
b19.setBackground(Color.red);
b20.setBackground(Color.red);
r5.setForeground(Color.red);
chk1.setForeground(Color.red);
l2.setForeground(Color.red);
p.setLayout(gb);
b21.setBounds(200,550,100,30);
b22.setBounds(330,550,100,30);
b23.setBounds(450,550,100,30);
b24.setBounds(570,550,100,30);
b25.setBounds(690,550,100,30);
p.setBounds(1000,80,230,300);
chk1.setBounds(700,610,100,30);
l1.setBounds(0,0,1350,700);
l2.setBounds(130,100,40,35);
l3.setBounds(200,100,650,35);
r1.setBounds(230,200,550,30);
r2.setBounds(230,250,550,30);
r3.setBounds(230,300,550,30);
r4.setBounds(230,350,550,30);
r5.setBounds(230,480,550,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);
b25.addActionListener(this);
add(r1);
add(r2);
add(r3);
add(r4);
add(r5);
add(chk1);
add(b21);
add(b22);
add(b23);
add(b24);
add(b25);
add(p);
add(l2);
add(l3);
add(l1);
	ResultSet rs;
	try{
	Jdb obj=new Jdb();
	rs=obj.readData("Select SN,QUESTION,OPTION1,OPTION2,OPTION3,OPTION4 from studata where SN=1");
	while(rs.next())
	{
	l2.setText(String.valueOf(rs.getInt(1)));
	l3.setText(rs.getString(2)+" ...");
	r1.setLabel(rs.getString(3));
	r2.setLabel(rs.getString(4));
	r3.setLabel(rs.getString(5));
	r4.setLabel(rs.getString(6));
	}
	}
	catch(Exception e){System.out.println(e);}
	setdata(Integer.valueOf(l2.getText()));
	
setLayout(null);
setVisible(true);
setSize(1650,700);
}
public void colourpink(int a)
{
switch(a)
{
	case 1:
	b1.setBackground(c);
	break;
	case 2:
	b2.setBackground(c);
	break;	
	case 3:
	b3.setBackground(c);
	break;
	case 4:
	b4.setBackground(c);
	break;
	case 5:
	b5.setBackground(c);
	break;	
	case 6:
	b6.setBackground(c);
	break;
	case 7:
	b7.setBackground(c);
	break;
	case 8:
	b8.setBackground(c);
	break;
	case 9:
	b9.setBackground(c);
	break;
	case 10:
	b10.setBackground(c);
	break;
	case 11:
	b11.setBackground(c);
	break;
	case 12:
	b12.setBackground(c);
	break;
	case 13:
	b13.setBackground(c);
	break;
	case 14:
	b14.setBackground(c);
	break;
	case 15:
	b15.setBackground(c);
	break;
	case 16:
	b16.setBackground(c);
	break;
	case 17:
	b17.setBackground(c);
	break;
	case 18:
	b18.setBackground(c);
	break;
	case 19:
	b19.setBackground(c);
	break;
	case 20:
	b20.setBackground(c);
	break;
	default:
	System.out.println("Error");
}
}

public void colourgreen(int a)
{
switch(a)
{
	case 1:
	b1.setBackground(c1);
	break;
	case 2:
	b2.setBackground(c1);
	break;	
	case 3:
	b3.setBackground(c1);
	break;
	case 4:
	b4.setBackground(c1);
	break;
	case 5:
	b5.setBackground(c1);
	break;	
	case 6:
	b6.setBackground(c1);
	break;
	case 7:
	b7.setBackground(c1);
	break;
	case 8:
	b8.setBackground(c1);
	break;
	case 9:
	b9.setBackground(c1);
	break;
	case 10:
	b10.setBackground(c1);
	break;
	case 11:
	b11.setBackground(c1);
	break;
	case 12:
	b12.setBackground(c1);
	break;
	case 13:
	b13.setBackground(c1);
	break;
	case 14:
	b14.setBackground(c1);
	break;
	case 15:
	b15.setBackground(c1);
	break;
	case 16:
	b16.setBackground(c1);
	break;
	case 17:
	b17.setBackground(c1);
	break;
	case 18:
	b18.setBackground(c1);
	break;
	case 19:
	b19.setBackground(c1);
	break;
	case 20:
	b20.setBackground(c1);
	break;
	default:
	System.out.println("Error");
}
}
public void readdata(int a)
{
	ResultSet rs;
	try{
	Jdb obj=new Jdb();
	rs=obj.readData("Select SN,QUESTION,OPTION1,OPTION2,OPTION3,OPTION4 from studata where SN="+String.valueOf(a));
	while(rs.next())
	{
	l2.setText(String.valueOf(rs.getInt(1)));
	l3.setText(rs.getString(2)+" ...");
	r1.setLabel(rs.getString(3));
	r2.setLabel(rs.getString(4));
	r3.setLabel(rs.getString(5));
	r4.setLabel(rs.getString(6));
	}
	}
	catch(Exception e){System.out.println(e);}

}
public String ans(int a)
{	ResultSet rs;
	try{
	Jdb obj=new Jdb();
	rs=obj.readData("Select Ans from studata where SN="+String.valueOf(a));
	while(rs.next())
	{
	h1=rs.getString(1);
	}
	}
	catch(Exception e){System.out.println(e);}
	return h1;
}
public int writedata(int a)
{

	if(r1.isSelected()==true)
	{
	j="A";
	obj1.writeData("update studata set UAns='"+j+"' where SN="+a);
	h2=ans(a);
	if(h2.equals("A"))
	{
	obj1.writeData("update studata set Marks=1 where SN="+a);
	}
	else
	{
	obj1.writeData("update studata set Marks=-.25 where SN="+a);
	}
	return 1;
	}
	else if(r2.isSelected()==true)
	{
	j="B";
	obj1.writeData("update studata set UAns='"+j+"' where SN="+a);
	h2=ans(a);
	if(h2.equals("B"))
	{
	obj1.writeData("update studata set Marks=1 where SN="+a);
	}
	else
	{
	obj1.writeData("update studata set Marks=-.25 where SN="+a);
	}
	return 1;
	}
	else if(r3.isSelected()==true)
	{
	j="C";
	obj1.writeData("update studata set UAns='"+j+"' where SN="+a);
	h2=ans(a);
	if(h2.equals("C"))
	{
	obj1.writeData("update studata set Marks=1 where SN="+a);
	}
	else
	{
	obj1.writeData("update studata set Marks=-.25 where SN="+a);
	}
	return 1;
	}
	else if(r4.isSelected()==true)
	{
	j="D";
	obj1.writeData("update studata set UAns='"+j+"' where SN="+a);
	h2=ans(a);
	if(h2.equals("D"))
	{
	obj1.writeData("update studata set Marks=1 where SN="+a);
	}
	else
	{
	obj1.writeData("update studata set Marks=-.25 where SN="+a);
	}
	return 1;
	}
	else
	{
	j="NA";
	return 0;
	}
	
}
public void setdata(int a)
{
	ResultSet rs;
	try{
	Jdb obj=new Jdb();
	rs=obj.readData("Select UAns from studata where SN="+String.valueOf(a));
	while(rs.next())
	{h=rs.getString(1);}}
	catch(Exception e){System.out.println(e);}
	if(h.equals("A"))
	{r1.setSelected(true);}
	else if(h.equals("B"))
	{r2.setSelected(true);}
	else if(h.equals("C"))
	{r3.setSelected(true);}
	else if(h.equals("D"))
	{r4.setSelected(true);}
	else 
	{r5.setSelected(true);}
}
public void itemStateChanged(ItemEvent ie)
{
}
public void checkboxread(int a)
{
	ResultSet rs3;
	try{
	Jdb obj=new Jdb();
	rs3=obj.readData("Select Checkbox from studata where SN="+String.valueOf(a));
	while(rs3.next())
	{
	if(rs3.getString(1).equals("Y"))
	{
	chk1.setState(true);
	}
	else if(rs3.getString(1).equals("NA"))
	{
	chk1.setState(false);}
	}
	}
	catch(Exception e){System.out.println(e);}
}
public void checkboxwrite(int a)
{
	obj1.writeData("update studata set Checkbox='Y' where 	SN="+String.valueOf(a));
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b21)                                                                                   /*Next Button*/
{
	t=writedata(Integer.valueOf(l2.getText()));
	if(chk1.getState()==true)	
	{
	colourpink(Integer.valueOf(l2.getText()));
	checkboxwrite(Integer.valueOf(l2.getText()));
	}
	else if(t==1)
	{
	colourgreen(Integer.valueOf(l2.getText()));
	}
	else
	{}
	readdata(Integer.valueOf(l2.getText())+1);
	setdata(Integer.valueOf(l2.getText()));
	checkboxread(Integer.valueOf(l2.getText()));
}
if(ae.getSource()==b22)                                                                                  /*Previous Button*/
{
	t=writedata(Integer.valueOf(l2.getText()));
	if(chk1.getState()==true)
	{
	colourpink(Integer.valueOf(l2.getText()));
	checkboxwrite(Integer.valueOf(l2.getText()));
	}
	else if(t==1)
	{
	colourgreen(Integer.valueOf(l2.getText()));
	}
	else{}
	readdata(Integer.valueOf(l2.getText())-1);
	setdata(Integer.valueOf(l2.getText()));
	checkboxread(Integer.valueOf(l2.getText()));
}
if(ae.getSource()==b23)
{readdata(1);
setdata(1);
checkboxread(1);}
if(ae.getSource()==b24)
{readdata(20);
setdata(20);
checkboxread(20);}
if(ae.getSource()==b1)
{readdata(1);
setdata(1);
checkboxread(1);}
if(ae.getSource()==b2)
{readdata(2);
setdata(2);
checkboxread(2);}
if(ae.getSource()==b3)
{readdata(3);
setdata(3);
checkboxread(3);}
if(ae.getSource()==b4)
{readdata(4);
setdata(4);
checkboxread(4);}
if(ae.getSource()==b5)
{readdata(5);
setdata(5);
checkboxread(5);}
if(ae.getSource()==b6)
{readdata(6);
setdata(6);
checkboxread(6);}
if(ae.getSource()==b7)
{readdata(7);
setdata(7);
checkboxread(7);}
if(ae.getSource()==b8)
{readdata(8);
setdata(8);
checkboxread(8);}
if(ae.getSource()==b9)
{readdata(9);
setdata(9);
checkboxread(9);}
if(ae.getSource()==b10)
{readdata(10);
setdata(10);
checkboxread(10);}
if(ae.getSource()==b11)
{readdata(11);
setdata(11);
checkboxread(11);}
if(ae.getSource()==b12)
{readdata(12);
setdata(12);
checkboxread(12);}
if(ae.getSource()==b13)
{readdata(13);
setdata(13);
checkboxread(13);}
if(ae.getSource()==b14)
{readdata(14);
setdata(14);
checkboxread(14);}
if(ae.getSource()==b15)
{readdata(15);
setdata(15);
checkboxread(15);}
if(ae.getSource()==b16)
{readdata(16);
setdata(16);
checkboxread(16);}
if(ae.getSource()==b17)
{readdata(17);
setdata(17);
checkboxread(17);}
if(ae.getSource()==b18)
{readdata(18);
setdata(18);
checkboxread(18);}
if(ae.getSource()==b19)
{readdata(19);
setdata(19);
checkboxread(19);}
if(ae.getSource()==b20)
{readdata(20);
setdata(20);
checkboxread(20);}
if(ae.getSource()==b25)
{
Dialog okk=new Dialog();
}
}
public static void main(String arg[])
{
Project oo=new Project();
}
}