import javax.swing.*;
import java.awt.*;
public class end extends JFrame {
	JLabel l1,l2;
	end()
	{
		ImageIcon k=new ImageIcon("abhi.png");
		l1=new JLabel("PRODUCED BY - ABHISHEK GOEL");l1.setFont(new Font("Times New Roman",Font.ITALIC,40));
		l1.setForeground(Color.blue);
		l1.setBounds(5,30,800,60);
		add(l1);
		l2=new JLabel(k);
		add(l2);
		
		setSize(800,720);
		 setTitle("Opening Page");
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new end();
	}
}