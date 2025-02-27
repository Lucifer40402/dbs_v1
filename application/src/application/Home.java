package application;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
public class Home {

	ImageIcon logo = new ImageIcon(getClass().getResource("logo.png"));
	ImageIcon bkgrd = new ImageIcon(getClass().getResource("home_bg.jpg"));
	ImageIcon medc = new ImageIcon(getClass().getResource("medicines.png"));
	ImageIcon lgt1 = new ImageIcon(getClass().getResource("logout.png"));
	ImageIcon cmplogo = new ImageIcon(getClass().getResource("cmp_logo.png"));
	ImageIcon cstlogo = new ImageIcon(getClass().getResource("cst_logo.png"));
	ImageIcon trnslogo = new ImageIcon(getClass().getResource("trns_logo.jpg"));
	ImageIcon editlogo = new ImageIcon(getClass().getResource("edit_logo.jpg"));
	ImageIcon white_bg = new ImageIcon(getClass().getResource("white_bg.jpg"));
	
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String NAME = "root";
	static final String PASSWORD = "Sharvani17#";
	static final String URL = "jdbc:mysql://localhost:3306/dbs_v1";
	static Connection connection;
	static String query;
	static Statement statement;
	static ResultSet result;
	static String strg;
	static String pswrd;
	
	
	public void home_display(String str) throws ClassNotFoundException, SQLException
	{
		strg = str;
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL,NAME,PASSWORD);
		statement = connection.createStatement();
		query="select * from employee where ID="+str+";";
		result = statement.executeQuery(query);
		if(result.next())
		{
			str=result.getString("Name");
			pswrd=result.getString("Password");
		}
		Home b = new Home();
		Border blackline = BorderFactory.createLineBorder(new Color(53,0,102));
		JFrame f = new JFrame("Home");
		f.setBounds(-10,-5,1920,1080);
		JLabel bg = new JLabel("",bkgrd,JLabel.CENTER);
		bg.setBounds(-50,-50,1920,1080);
		f.add(bg);
		JPanel p0 = new JPanel();
		p0.setBorder(blackline);
		p0.setBounds(0,0,1920,151);
		p0.setBackground(new Color(0,0,0,0));
		p0.setLayout(null);
		p0.setVisible(true);
		bg.add(p0);
		JPanel p1 = new JPanel();
		p1.setBorder(blackline);
		p1.setBounds(0,150,450,1080);
		p1.setBackground(new Color(0,0,0,0));
		p1.setLayout(null);
		p1.setVisible(true);
		bg.add(p1);
		JPanel p2 = new JPanel();
		p2.setBorder(blackline);
		p2.setBounds(60,445,375,200);
		p2.setBackground(new Color(0,0,0,0));
		p2.setLayout(null);
		p2.setVisible(true);
		p1.add(p2);
		JPanel p3 = new JPanel();
		p3.setBounds(500,240,1040,620);
		p3.setBackground(new Color(0,0,0,0));
		p3.setLayout(null);
		p3.setVisible(true);
		bg.add(p3);
		JLabel l0 = new JLabel();
		l0.setText("Welcome,");
		l0.setFont(new Font("Times New Roman",Font.BOLD,25));
		l0.setForeground(new Color(53,0,102));
		l0.setBounds(75,65,1000,40);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l0.setFont(font.deriveFont(Font.BOLD, 25f));
        }
        catch(Exception e){}
		p0.add(l0);
		JLabel l1 = new JLabel();
		l1.setText(str);
		l1.setFont(new Font("Times New Roman",Font.BOLD,25));
		l1.setForeground(new Color(53,0,102));
		l1.setBounds(75,100,1000,40);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l1.setFont(font.deriveFont(Font.BOLD, 25f));
        }
        catch(Exception e){}
		p0.add(l1);
		JLabel l2 = new JLabel();
		l2.setText("Home");
		l2.setFont(new Font("Times New Roman",Font.ITALIC,25));
		l2.setForeground(new Color(53,0,102));
		l2.setBounds(1470,75,1000,40);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l2.setFont(font.deriveFont(Font.ITALIC, 25f));
        }
        catch(Exception e){}
		p0.add(l2);
		JLabel l3 = new JLabel("Login History");
		l3.setFont(new Font("Times New Roman",Font.BOLD,25));
		l3.setForeground(new Color(53,0,102));
		l3.setBounds(490,175,1000,40);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l3.setFont(font.deriveFont(Font.BOLD, 25f));
        }
        catch(Exception e){}
		bg.add(l3);
		JButton med = new JButton(medc);
		med.setBounds(70,10,160,160);
		p1.add(med);
		JLabel medl = new JLabel("Medicines");
		medl.setBounds(105,170,100,25);
		medl.setFont(new Font("",Font.PLAIN,20));
		medl.setForeground(new Color(53,0,102));
		p1.add(medl);
		JButton cmp = new JButton(cmplogo);
		cmp.setBounds(245,10,160,160);
		p1.add(cmp);
		JLabel cmpl = new JLabel("Company");
		cmpl.setBounds(283,170,100,25);
		cmpl.setFont(new Font("",Font.PLAIN,20));
		cmpl.setForeground(new Color(53,0,102));
		p1.add(cmpl);
		JButton cst = new JButton(cstlogo);
		cst.setBounds(70,210,160,160);
		p1.add(cst);
		JLabel cstl1 = new JLabel("Customer");
		cstl1.setBounds(100,370,100,25);
		cstl1.setFont(new Font("",Font.PLAIN,20));
		cstl1.setForeground(new Color(53,0,102));
		p1.add(cstl1);
		JLabel cstl2 = new JLabel("History");
		cstl2.setBounds(110,390,100,25);
		cstl2.setFont(new Font("",Font.PLAIN,20));
		cstl2.setForeground(new Color(53,0,102));
		p1.add(cstl2);
		JButton trns = new JButton(trnslogo);
		trns.setBounds(245,210,160,160);
		p1.add(trns);
		JLabel trnsl = new JLabel("Transactions");
		trnsl.setBounds(265,370,150,25);
		trnsl.setFont(new Font("",Font.PLAIN,20));
		trnsl.setForeground(new Color(53,0,102));
		p1.add(trnsl);
		JLabel l4 = new JLabel("Profile");
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l4.setFont(font.deriveFont(Font.BOLD, 24f));
        }
        catch(Exception e){}
		l4.setBounds(15,5,150,40);
		l4.setForeground(new Color(53,0,102));
		p2.add(l4);
		JLabel l5 = new JLabel("Name: "+str);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l5.setFont(font.deriveFont(Font.BOLD, 20f));
        }
        catch(Exception e){}
		l5.setBounds(15,60,345,40);
		l5.setForeground(new Color(53,0,102));
		p2.add(l5);
		JLabel l6 = new JLabel("ID: "+result.getString("ID"));
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l6.setFont(font.deriveFont(Font.BOLD, 20f));
        }
        catch(Exception e){}
		l6.setBounds(15,90,345,40);
		l6.setForeground(new Color(53,0,102));
		p2.add(l6);
		JLabel l7 = new JLabel("Date of Joining: "+result.getString("Date_of_Joining"));
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l7.setFont(font.deriveFont(Font.BOLD, 20f));
        }
        catch(Exception e){}
		l7.setBounds(15,120,345,40);
		l7.setForeground(new Color(53,0,102));
		p2.add(l7);
		JLabel l8 = new JLabel("Salary: "+result.getString("Salary"));
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("Rene Bieder  Milliard Light.otf"));
            l8.setFont(font.deriveFont(Font.BOLD, 20f));
        }
        catch(Exception e){}
		l8.setBounds(15,150,345,40);
		l8.setForeground(new Color(53,0,102));
		p2.add(l8);
		JButton edit = new JButton("Edit Profile");
		edit.setBounds(75, 665, 150, 50);
		edit.setFont(new Font("",Font.BOLD,16));
		p1.add(edit);
		JButton ret = new JButton("Logout");
		ret.setFont(new Font("",Font.BOLD,16));
		ret.setBounds(300, 665, 100, 50);
		p1.add(ret);
		ret.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame lgt = new JFrame("Logout");
				lgt.setBounds(640,380,250,120);
				lgt.setIconImage(lgt1.getImage());
				JLabel msg = new JLabel("Are you sure you want to logout?");
				msg.setBounds(25,10,200,20);
				lgt.add(msg);
				JButton yes = new JButton("Yes");
				yes.setBounds(25, 40, 75, 30);
				lgt.add(yes);
				JButton no = new JButton("No");
				no.setBounds(135, 40, 75, 30);
				lgt.add(no);
				no.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lgt.hide();
					}
				});
				yes.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lgt.hide();
						f.hide();
						try {
							new Main().main(null);
						} catch (InstantiationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IllegalAccessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				lgt.setLayout(null);
				lgt.setVisible(true);
				lgt.setResizable(false);
			}
		});
		edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame ep = new JFrame("Edit Profile");
				ep.setBounds(600,250,500,350);
				ep.setIconImage(editlogo.getImage());
				JLabel bg1 = new JLabel("",white_bg,JLabel.CENTER);
				bg1.setBounds(0, 0, 500, 350);
				ep.add(bg1);
				JLabel err = new JLabel("*Password must be within 6 and 14 characters");
				err.setForeground(Color.red);
				err.setFont(new Font("Times New Roman",Font.PLAIN,16));
				err.setBounds(120, 220, 300, 20);
				err.setVisible(false);
				bg1.add(err);
				JLabel nn = new JLabel("New Name:");
				nn.setBounds(50,30,300,30);
				nn.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(nn);
				JLabel ns = new JLabel("New Salary:");
				ns.setBounds(50,60,100,30);
				ns.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(ns);
				JLabel ndb = new JLabel("New DOB:");
				ndb.setBounds(50,90,300,30);
				ndb.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(ndb);
				JLabel ndj = new JLabel("New Date of Joining:");
				ndj.setBounds(50,120,300,30);
				ndj.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(ndj);
				JLabel np = new JLabel("New Password:");
				np.setBounds(50,150,300,30);
				np.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(np);
				JLabel na = new JLabel("New Address:");
				na.setBounds(50,180,300,30);
				na.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(na);
				JTextField eda = new JTextField();
				try {
					eda.setText(result.getString("Name"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				eda.setBounds(250,30,200,30);
				eda.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(eda);
				JTextField edb = new JTextField();
				edb.setBounds(250,60,200,30);
				try {
					edb.setText(result.getString("Salary"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				edb.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(edb);
				JTextField edc = new JTextField();
				edc.setBounds(250,90,200,30);
				try {
					edc.setText(result.getString("D_O_B"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				edc.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(edc);
				JTextField edd = new JTextField();
				edd.setBounds(250,120,200,30);
				try {
					edd.setText(result.getString("Date_of_Joining"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				edd.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(edd);
				JTextField ede = new JTextField();
				ede.setBounds(250,150,200,30);
				try {
					ede.setText(result.getString("Password"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				ede.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(ede);
				JTextField edf = new JTextField();
				edf.setBounds(250,180,200,30);
				try {
					edf.setText(result.getString("Address"));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				edf.setFont(new Font("Times New Roman",Font.PLAIN,16));
				bg1.add(edf);
				JButton save = new JButton("Save Changes");
				save.setFont(new Font("",Font.BOLD,13));
				save.setBounds(220, 250, 125, 35);
				bg1.add(save);
				JButton cancel = new JButton("Cancel");
				cancel.setFont(new Font("",Font.BOLD,13));
				cancel.setBounds(360, 250, 105, 35);
				bg1.add(cancel);
				cancel.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ep.hide();
					}
				});
				save.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if((ede.getText().toString().length()<6||ede.getText().toString().length()>14)&&!eda.getText().toString().equals("admin"))
						err.setVisible(true);
						else {
						try {
							String a;
							a=eda.getText().toString();
							if(a.equals(""))
							a=" ";
							query = "update employee set Name = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							a=edb.getText().toString();
							if(a.equals(""))
							a="0";
							query = "update employee set Salary = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							a=ede.getText().toString();
							if(a.equals(""))
							a=" ";
							query = "update employee set Password = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							a=edf.getText().toString();
							if(a.equals(""))
							a=" ";
							query = "update employee set Address = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							a=edc.getText().toString();
							if(a.equals(""))
							a="0000-00-00";
							query = "update employee set D_O_B = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							a=edd.getText().toString();
							if(a.equals(""))
							a="0000-00-00";
							query = "update employee set Date_of_Joining = '"+a+"' where ID = '"+strg+"';";
							statement.execute(query);
							f.hide();
							Home asp = new Home();
							try {
								asp.home_display(strg);
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						ep.hide();}
					}
				});
				ep.setResizable(false);
				ep.setLayout(null);
				ep.setVisible(true);
			}
		});
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setIconImage(logo.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Home b = new Home();
		b.home_display("0");
	}
}
