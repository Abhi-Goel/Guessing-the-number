import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
public class fir extends JFrame implements ActionListener{
	JLabel l1,l2;
	JButton b1,b2;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			ins d=new ins();
			d.getContentPane().setBackground(Color.orange);
			setVisible(false);
		}
		else if(e.getSource()==b1)
		{
			sec f=new sec();
			f.getContentPane().setBackground(Color.green);
			setVisible(false);
		}
		
	}
	fir()
	{
		l1 = new JLabel("WELCOME TO AABRA KA DABBRA");
		l1.setFont(new Font("Times New Roman",Font.BOLD,35));
		l1.setForeground(Color.RED);
		l1.setBounds(100,70,600,100);
		add(l1);
		b1=new JButton("START");
			//b1.setFont(new Font("Times New Roman",Font.BOLD,10));
		b1.setBounds(270,340,80,30);
		add(b1);
		b2=new JButton("INSTRUCTION");
			//b1.setFont(new Font("Times New Roman",Font.BOLD,10));
		b2.setBounds(400,340,115,30);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		ImageIcon img = new ImageIcon("v.png");
		 l2=new JLabel(img);
		 add(l2);
		 setSize(800,500);
		 setTitle("Opening Page");
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String arg[])
	{
		fir f=new fir();
		f.getContentPane().setBackground(Color.yellow);
	}

}