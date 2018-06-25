import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class sec extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	public void actionPerformed(ActionEvent ee)
	{
		if(ee.getSource()==b1)
		{
			Random rand=new Random();
			int n=rand.nextInt(100000)+1001;
			t5.setVisible(true);
			String s=""+n;
			t5.setText(s);
			b2.setVisible(true);
		}
		else if(ee.getSource()==b2)
		{
		
			String s;
			int red=Integer.parseInt(t5.getText());
			int red1=Integer.parseInt(t2.getText());
			int red2=Integer.parseInt(t4.getText());
			if(red%red1==0&& red%red2!=0)
			{
				s=t1.getText()+" \nWON";
				l5.setText(s);
				l5.setVisible(true);
				
			}
			else if(red%red2==0&& red%red1!=0)
			{
				s=t3.getText()+" \nWON";
				//l5=new JLabel(s);l5.setForeground(Color.magenta);l5.setBounds(200,500,200,30);add(l5);
				l5.setText(s);
				l5.setVisible(true);
			}
			else if(red%red1!=0&&red%red2!=0)
			{
				if(red%red1>red%red2)
				{
					s=t3.getText()+" \nWON";
				l5.setText(s);
				l5.setVisible(true);
				}
				else
				{
					s=t1.getText()+" \nWON";
				l5.setText(s);
				l5.setVisible(true);
				}
			}
			else if(red%red1==0&&red%red2==0)
			{
				if(red2>red1)
				{
					s=t3.getText()+" \nWON";
				l5.setText(s);
				l5.setVisible(true);
				}
				else
				{
					s=t1.getText()+" \nWON";
				l5.setText(s);
				l5.setVisible(true);
				}
			}
			b3.setVisible(true);	
		}
		else if(ee.getSource()==b3)
		{
			//System.out.println("hu");
			new end();
			setVisible(false);
		}
	}
	sec()
	{
		l1=new JLabel("NOTE-: Select any number between above 10");l1.setForeground(Color.magenta);l1.setBounds(10,10,300,40);add(l1);
		l2=new JLabel("Enter Player1 Name and THEN Any Number");l1.setForeground(Color.blue);l2.setBounds(50,100,300,30);add(l2);
		l3=new JLabel("Enter Player2 Name and THEN Any Number");l1.setForeground(Color.blue);l3.setBounds(50,200,300,30);add(l3);
		t1=new JTextField();t1.setBounds(300,100,150,30);add(t1);
		t2=new JTextField();t2.setBounds(460,100,50,30);add(t2);
		t3=new JTextField();t3.setBounds(300,200,150,30);add(t3);
		t4=new JTextField();t4.setBounds(460,200,50,30);add(t4);
		t5=new JTextField();t5.setBounds(300,350,100,30);t5.setEditable(false);t5.setVisible(false);add(t5);
		b1=new JButton("Random Number Generation");b1.setBounds(250,300,200,30);add(b1);
		b1.addActionListener(this);
		l5=new JLabel();l5.setForeground(Color.magenta);
			l5.setFont(new Font("Times New Roman",Font.BOLD,35));
		l5.setBounds(280,450,400,30);l5.setVisible(false);
		add(l5);
		b2=new JButton("Result");b2.setBounds(300,400,80,30);b2.setVisible(false);add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("Next");b3.setBounds(300,520,80,30);b3.setVisible(false);add(b3);
		b3.addActionListener(this);
		l6=new JLabel();l5.setForeground(Color.magenta);
		l6.setBounds(200,700,200,30);l5.setVisible(false);
		add(l6);
		setSize(800,750);
		 setTitle(" Page");
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
	   sec f=new sec();
	   f.getContentPane().setBackground(Color.CYAN);
	}
}