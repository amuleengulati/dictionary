
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class usrguide extends Frame implements WindowListener,ActionListener {

ImagePanel p=new ImagePanel("55.jpg");
ImagePanel pa=new ImagePanel("home.jpg");

	
	Label l=new Label();		
	Font f=new Font("",1,43);
	Font f1=new Font("",1,17);
	JLabel la=new JLabel();	
	JButton b1,b2,b3;
	 ImageIcon ic=new ImageIcon("bck.jpg");
	 ImageIcon ic1=new ImageIcon("next_page.jpg");
	 ImageIcon ic2=new ImageIcon("exit.jpg");
	Label l1,l2,l3;

	
	
	
	public usrguide()
	{
		
		
		this.setSize(4000,4000);
		this.setVisible(true);
		setLayout(null);
		this.addWindowListener(this);
		p.setBounds(13, 0, 1600, 750);
		p.setLayout(null);
		add(p);
          pa.setBounds(610, 50, 700, 520);
		  p.add(pa);
		  b1=new JButton();
		  
		  b1.setIcon(ic);
		  b1.setBorder(null);
		  b1.setBounds(830, 580, 179, 90);
		  p.add(b1);
		  b1.addActionListener(this);
		
		  b2=new JButton();
		
		  b2.setIcon(ic1);
		  b2.setBorder(null);
		  b2.setBounds(650, 580, 147, 98);
		  p.add(b2);
		  b2.addActionListener(this);
		  b3=new JButton();
		  b3.setIcon(ic2);
		  b3.setBorder(null);
		  b3.setBounds(1060, 580, 100, 98);
		  p.add(b3);
		  b3.addActionListener(this);
		  
		 
	
		
l=new Label("USER GUIDE");
		
		l.setFont(f);
		p.add(l);
		for(int j=0;j<=220;j++)
		{
			l.setBounds(j, 152, 270, 50);
		try
		{
			Thread.sleep(3);
		}
		catch(Exception ex)
		{}
	}
l1=new Label("1.Click on the alphabetic symbol " +
		"for the words to be displayed.");
		
		l1.setFont(f1);
		l1.setForeground(Color.green);
		l1.setBackground(Color.black);
		p.add(l1);
	
	for(int j=0;j<=100;j++)
	{
		l1.setBounds(j, 270, 500, 50);
	try
	{
		Thread.sleep(5);
	}
	catch(Exception ex)
	{}
}	
	l2=new Label("2.You can use this tool for search any word from the dictionary.");
	l2.setForeground(Color.green);
	l2.setBackground(Color.black);
			l2.setFont(f1);
			p.add(l2);
		
		for(int j=0;j<=100;j++)
		{
			l2.setBounds(j, 370, 501, 50);
		try
		{
			Thread.sleep(7);
		}
		catch(Exception ex)
		{}
	}	
		l3=new Label("3.It displays the words and description of word.");
		l3.setForeground(Color.green);
		l3.setBackground(Color.black);
		l3.setFont(f1);
		p.add(l3);
	
	for(int j=0;j<=100;j++)
	{
		l3.setBounds(j, 470, 500, 50);
	try
	{
		Thread.sleep(9);
	}
	catch(Exception ex)
	{}
}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new usrguide();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			new front();
		}
		else if(e.getSource()==b2)
		{
			new usrguide1();
		}
		else if(e.getSource()==b3)
		{
			this.setVisible(false);
		}		
	}

}









