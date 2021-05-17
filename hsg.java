
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class hsg extends Frame implements WindowListener{
	ImagePanel p=new ImagePanel("hsg.jpg");
	Label l[]=new Label[7];
	Font f1=new Font("",3,20);
	
	public hsg()
	{
		this.setSize(4000,4000);
		this.setTitle("help");
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(this);
		p.setBounds(10,0,1350,780);
		add(p);
		
		
		 l[0]=new Label("1.There is one hint in the game.");
		 l[0].setForeground(Color.red);
		 l[0].setBackground(Color.white);
		
		 l[0].setFont(f1);
		 p.add(l[0]);
		 
		 l[1]=new Label("2.Judge that hint.");
		 l[1].setForeground(Color.red);
		 l[1].setBackground(Color.white);
		
		 l[1].setFont(f1);
		 p.add(l[1]);
		 
		 l[2]=new Label("3.Fill the box according to the hint.");
		 l[2].setForeground(Color.red);
		 l[2].setBackground(Color.white);
		
		 l[2].setFont(f1);
		 p.add(l[2]);
	
		 l[3]=new Label("4.If u fill up the correct blank then smiley will start begin.");
		 l[3].setForeground(Color.red);
		 l[3].setBackground(Color.white);
		 
		 l[3].setFont(f1);
		 p.add(l[3]);
		 
		 
		 l[4]=new Label("5.If u pressed the wrong hint it will not be taken.");
		 l[4].setForeground(Color.red);
		 l[4].setBackground(Color.white);
		 
		 l[4].setFont(f1);
		 p.add(l[4]);
		 
		 
		 l[5]=new Label("6.Fill all boxes with correct answer");
		 l[5].setForeground(Color.red);
		 l[5].setBackground(Color.white);
		
		 l[5].setFont(f1);
		 p.add(l[5]);
		 
		 l[6]=new Label("7.If your answer is correct you will got a smiley face.");
		 l[6].setForeground(Color.red);
		 l[6].setBackground(Color.white);
		 
		 l[6].setFont(f1);
		 p.add(l[6]);
		 
		 
		  
			int j;
					for(j=0;j<=750;j++)
					{
				
						l[0].setBounds(j,30, 500, 50);
				 
					try
					{
					 Thread.sleep(-10);
					}
					catch(Exception ex){}
					//System.out.print(l[0]);
					}
					

					
					for(j=0;j<=750;j++)
					{		
		 l[1].setBounds(j,80, 600, 50);
		 
			try
			{
			 Thread.sleep(-9);
			}
			catch(Exception ex){}
			//System.out.print(l[1]);
			}
					
		 for(j=0;j<=750;j++)
		 {
		 l[2].setBounds(j,130, 600, 50);
		 
			try
			{
			 Thread.sleep(-8);
			}
			catch(Exception ex){}
			//System.out.print(l[2]);
			}
		 
		 for(j=0;j<=750;j++)
			{
		 l[3].setBounds(j,180, 600, 50);
		 
			try
			{
			 Thread.sleep(-7);
			}
			catch(Exception ex){}
			//System.out.print(l[3]);
			}
		 
		 for(j=0;j<=750;j++)
			{
		l[4].setBounds(j,230,700, 50);
		 
			try
			{
			 Thread.sleep(-6);
			}
			catch(Exception ex){}
			//System.out.print(l[4]);
			}
		 
		 for(j=0;j<=750;j++)
			{
		l[5].setBounds(j,280, 600, 50);
		 
			try
			{
			 Thread.sleep(-5);
			}
			catch(Exception ex){}
			//System.out.print(l[5]);
		 }
		 
		 
		 for(j=0;j<=750;j++)
			{
		l[6].setBounds(j,330, 600, 50);
		 
			try
			{
			 Thread.sleep(-4);
			}
			catch(Exception ex){}
			//System.out.print(l[6]);
		 
		 }
		 }
			
		 
		 
		 
	 
	public static void main(String[] args)
	{
		 new hsg();
		
	}
	
		  
	



	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		
	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
