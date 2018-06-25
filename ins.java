import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class ins extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1;
    ins()
    {
    	l1=new JLabel("INSTRUCTION");
    	l1.setFont(new Font("Times New Roman",Font.BOLD,35));
		l1.setForeground(Color.RED);
		l1.setBounds(300,50,400,50);
		add(l1);
		l2=new JLabel("1.Select any number above 10 by both Players");
		l2.setForeground(Color.BLUE);
		l2.setBounds(80,120,400,50);
		add(l2);
		l3=new JLabel("2.A random number generated for both Players");
		l3.setForeground(Color.BLUE);
		l3.setBounds(80,170,400,50);
		add(l3);
		l4=new JLabel("3.Number choose by player which completely divides that Random number will **WIN**");
		l4.setForeground(Color.BLUE);
		l4.setBounds(80,220,800,50);
		add(l4);
		l5=new JLabel("4.If both player selected number does not divide number that random number");
		l5.setForeground(Color.BLUE);
		l5.setBounds(80,270,800,50);
		add(l5);
		l6=new JLabel("then which number produce less remainder will **WIN**");
		l6.setForeground(Color.BLUE);
		l6.setBounds(80,290,400,50);
		add(l6);
		l7=new JLabel("5.If both produce same remainder than greatest number choosen by player will **WIN**");
		l7.setForeground(Color.BLUE);
		l7.setBounds(80,340,700,50);
		add(l7);
		b1=new JButton("BACK");
		b1.setBounds(350,420,70,30);
		add(b1);
		b1.addActionListener(this);
		l8=new JLabel("");
		l8.setForeground(Color.BLUE);
		l8.setBounds(80,600,700,50);
		add(l8);
		setSize(800,700);
		 setTitle("INSTRUCTION Page");
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ee)
    {
    	fir d=new fir();
    	d.getContentPane().setBackground(Color.LIGHT_GRAY);
    	setVisible(false);
    }
    public static void main(String arg[])
	{
		ins f=new ins();
		f.getContentPane().setBackground(Color.yellow);
	}
    
}