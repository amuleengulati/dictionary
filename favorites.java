
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URL;
import java.sql.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class favorites extends JFrame implements WindowListener,ActionListener,KeyListener,MouseListener, ItemListener {
	ImagePanel p=new ImagePanel("f1.jpg");
	ImageIcon ic=new ImageIcon("ih.jpg");
	ImageIcon ic1=new ImageIcon("ib.jpg");
	ImageIcon ic2=new ImageIcon("id.jpg");
	ImageIcon ic3=new ImageIcon("f.jpg");
	ImageIcon ic4=new ImageIcon("is.jpg");
	ImageIcon ic5=new ImageIcon("snd.jpeg");
	List l;
	JLabel lf=new JLabel();
	Font f=new Font("",2,20);
	JTextField t;
	Button b1;
	Connection con,con1,con2,con3,con4;
	Statement sta,sta1,sta2,sta3,sta4;
	ResultSet rs,rs1,rs2,rs3,rs4,rs5;
	JButton bb,bd,bh,bs;
	JButton snd;
	
	public favorites()
	{
		this.setSize(2000,2000);
		this.setTitle("FAVORITES");
		this.setLayout(null);
		this.setVisible(true);
		
		this.addWindowListener(this);
		p.setBounds(0,0,2000,2000);
		
		p.setLayout(null);
		add(p);
		 bb=new JButton();
		 bd=new JButton();
		 bh=new JButton();
		 bs=new JButton();
		 bd.setIcon(ic2);
		bs.setIcon(ic4);	
		 bs.setBorder(null);
			bs.setBounds(1155,230,86,96);
			add(bs);
			
		 bh.setIcon(ic);
	 bh.setBorder(null);
		
	 bh.setBounds(1150,475, 100,100);
		add(bh);
		
		bd.setIcon(ic2);
		bd.setBorder(null);
		bd.setBounds(1150,350, 115,114);
		add(bd);
		
		bb.setIcon(ic1);
        bb.setBorder(null);
		bb.setBounds(1150,600, 110,80);
		add(bb);
		snd=new JButton();
		snd.setBounds(490,280,40,30);
		snd.setIcon(ic5);
		snd.setBorder(null);
		p.add(snd);
	   snd.addActionListener(this);
		lf.setIcon(ic3);
	lf.setBorder(null);
    lf.setBounds(510,140,275,50);
	p.add(lf);
	l=new List();
		l.setBounds(540,320,300,300);
		l.addItemListener(this);
		p.add(l);
		t=new JTextField();
		t.setBounds(540,280,300,30);
		t.setBackground(Color.white);
		t.setFont(new java.awt.Font("Comic Sans MS", Font.ITALIC, 16));
		t.setText("Type word here");
		t.setEnabled(false);
		t.addMouseListener(this);
	   t.addKeyListener(this);
		p.add(t);
	    bh.addActionListener(this);
	    bb.addActionListener(this);
	    bd.addActionListener(this);
	    bs.addActionListener(this);
	    int j;
		for(j=0;j<=180;j++)
		{
	
			p.setBounds(j,0,1600,1000);
	 
		try
		{
		 Thread.sleep(1);
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this,"Error:"+ex.getMessage());
			
		}
	
       /*int k;
		for(k=0;k<=140;k++)
		{
	
			lf.setBounds(510,k,275,50);
	 
		try
		{
		 Thread.sleep(1);
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this,"Error:"+ex.getMessage());
			
		}
		}*/

		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} 
		
		
}
	public static void main(String[] args)
	{
		 new favorites();
		
	}

	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
		
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
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==bd){
			String item= t.getText();
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
				sta=con.createStatement();
				sta.executeUpdate("delete from favourites where word LIKE '"+item+"'" );
				rs=sta.executeQuery("select * from favourites;");
				l.removeAll();
				while(rs.next()){
					
					l.add(rs.getString(1));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			
		}// TODO Auto-generated method stub
	else if(arg0.getSource()==bh){
	new usrguide3();
	}	
	else if(arg0.getSource()==bb){
		this.setVisible(false);
		new front();
	}
	else if(arg0.getSource()==bs){
		try{
		con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
		sta1=con1.createStatement();
		rs1=sta1.executeQuery("select * from favourites;");
		l.removeAll();
		
		while(rs1.next()){
			l.add(rs1.getString(1));
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else 	if(arg0.getSource()==snd){
	   String s=t.getText();
		
		 String sn="";
		
		 
		try {
	    	  	
			try
		   	 {
					con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
					sta2=con2.createStatement();
		   		rs2=sta2.executeQuery("select audio from stock where word LIKE '"+s+"';");
		   	 while(rs2.next()){
				sn=rs2.getString(1);
			}
		   	
		   	 }
		   	catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	// String snd=s+".wav";
	        // Open an audio input stream.
	        URL url = this.getClass().getClassLoader().getResource(sn);
	        //
	        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	          for(int i=0; i<10; i++){   Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();}
	          } catch (UnsupportedAudioFileException e) {
	    JOptionPane.showMessageDialog(this, e.getMessage());
	        e.printStackTrace();
	     } catch (IOException e) { JOptionPane.showMessageDialog(this, e.getMessage());
	        e.printStackTrace();
	     } catch (LineUnavailableException e) { JOptionPane.showMessageDialog(this, e.getMessage());
	        e.printStackTrace();
	     } 
	    
	 	}
	 
		
		

	}
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent arg0) {
		if(String.valueOf(arg0.getKeyChar()).equals("\n")){
			try {

			String st=t.getText();
			con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
			sta3=con3.createStatement();

			rs3=sta3.executeQuery("select * from favourites where word like '"+st+"'");
			if(rs3.next()){
			rs4=sta3.executeQuery("select * from stock where word like '"+st+"'");
			l.removeAll();
			while(rs4.next()){
			l.add("Word:");
			l.add(rs4.getString(1));
			l.add("MEANING:");
			l.add(rs4.getString(2));
			l.add("PHONETICS:");
			l.add(rs4.getString(3));
			l.add("NOUN/ADJECTIVE:");
			l.add(rs4.getString(4));
			l.add("SYNONYMS:");
			l.add(rs4.getString(5));
			l.add("EXAMPLE:");
			l.add(rs4.getString(6)); }
			}
			else{
			l.removeAll();
			l.add("No result found");
			} //JOptionPane.showMessageDialog(this,st);
			}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

			}

	}
	public void mouseClicked(MouseEvent arg0) {
		t.setEnabled(true);
		t.setText("");// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void itemStateChanged(ItemEvent arg0) {
		String s=l.getSelectedItem();

		t.setText(s);
		t.setEnabled(true);
		try {
			con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
			sta4=con4.createStatement();
	
			rs5=sta4.executeQuery("select * from stock where word like '"+s+"';");
		l.removeAll();
		while(rs5.next()){
		l.add("MEANING:");
		l.add(rs5.getString(2));
		l.add("PHONETICS:");
		l.add(rs5.getString(3));
		l.add("NOUN/ADJECTIVE:");
		l.add(rs5.getString(4));
		l.add("SYNONYMS:");
		l.add(rs5.getString(5));
		l.add("EXAMPLE:");
		l.add(rs5.getString(6));
 

		}} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
// TODO Auto-generated method stub
		
	}
	}
