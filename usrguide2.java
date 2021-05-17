
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class usrguide2 extends Frame implements WindowListener,ActionListener {

ImagePanel p=new ImagePanel("55.jpg");
ImagePanel pa=new ImagePanel("history.jpg");

	
	Label l=new Label();		
	Font f=new Font("",1,43);
	Font f1=new Font("",1,17);
	JLabel la=new JLabel();	
	JButton b1,b2,b3;
	 ImageIcon ic=new ImageIcon("bck.jpg");
	 ImageIcon ic1=new ImageIcon("next_page.jpg");
	 ImageIcon ic2=new ImageIcon("exit.jpg");
	Label l1,l2,l3;

	
	
	
	public usrguide2()
	{
		
		
		this.setSize(4000,4000);
		this.setVisible(true);
		setLayout(null);
		this.addWindowListener(this);
		p.setBounds(13, 0, 1600, 750);
		p.setLayout(null);
		add(p);
          pa.setBounds(620, 50, 690, 520);
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
		l1=new Label("This page is designed for viewing recently viewed words.");
		
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
	l2=new Label("1.Type the word here to search it from history.");
	l2.setForeground(Color.green);
	l2.setBackground(Color.black);
			l2.setFont(f1);
			p.add(l2);
		
		for(int j=0;j<=100;j++)
		{
			l2.setBounds(j, 370, 500, 50);
		try
		{
			Thread.sleep(7);
		}
		catch(Exception ex)
		{}
	}	
		l3=new Label("2.This tool displays the words in history and their description.");
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
new usrguide2();
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
		     new usrguide1();
		}
		else if(e.getSource()==b2)
		{
		     new usrguide3();
		}
		else if(e.getSource()==b3)
		{
			this.setVisible(false);
		}		
	}

}

