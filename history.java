import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.awt.image.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.event.*;
import java.awt.event.*;

import javax.swing.*;
public class history extends JFrame implements WindowListener, ActionListener, ItemListener, KeyListener, MouseListener{
	//ImagePanel p=new ImagePanel("i18.gif");
	ImageIcon ic=new ImageIcon("i19.gif");
	ImageIcon ic2;

	ImageIcon ic1=new ImageIcon("i20.gif");
	ImageIcon ic3=new ImageIcon("t6.jpg");
	ImageIcon ic5=new ImageIcon("snd.jpeg");
	JButton b=new JButton();
	JButton b1=new JButton();
	JButton b2=new JButton();
	JLabel z=new JLabel();
	List l=new List(15);
	JTextField tf=new JTextField();
	Connection con;
	Statement sta;
	ResultSet rs,rs1;
	Timer t;
	int x=0;
	JButton snd;
	public history(){
		
		//p.setBounds(50,70,4000,4000);
		//add(p);
		
		z.setBounds(130,0, 1000,800);
		add(z);

		animate();
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
l.addItemListener(this);
tf.addKeyListener(this);
tf.addMouseListener(this);
try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
	sta=con.createStatement();

}
catch(Exception ex){
	JOptionPane.showMessageDialog(null, "ERROR"+ex.getMessage());
}

	}
	public void animate(){
		ic2=new ImageIcon("i18.gif");


		z.setIcon(ic2);

		z.setVisible(false);
		add(z);

		l.setBounds(600, 90, 220, 350);
		l.setForeground(Color.red);
		l.setFont(new java.awt.Font("Comic Sans MS", Font.ITALIC,18));
		z.add(l);
		tf.setBounds(600, 50, 220, 30);
		tf.setText("Type word here");
		z.add(tf);
		snd=new JButton();
		snd.setBounds(825,50,40,30);
		snd.setIcon(ic5);
		snd.setBorder(null);
		z.add(snd);
	   snd.addActionListener(this);
		tf.setEnabled(false);
		tf.setFont(new java.awt.Font("Comic Sans MS", Font.ITALIC,18));
	
				t=new Timer(1, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(x==0){
					z.setVisible(true);}
					z.setLocation(x++-z.getWidth()/2,getHeight()/2-z.getHeight()/2);
if(x==getWidth()/3)
	t.stop();

next();
			
			}
		});
		t.setInitialDelay(100);
		t.start();
		this.setVisible(true);
		this.setLayout(new GridBagLayout());
		this.setSize(4000,4000);
		this.addWindowListener(this);
		this.setTitle("History..");
		
		
	}
	public void next(){
		b.setIcon(ic);

		b.setBounds(950,600, 120, 70);
		add(b);
		b.setBorderPainted(false);
		b1.setIcon(ic1);
		b1.setBounds(1100,600, 130, 100);
		add(b1);
		b1.setBorderPainted(false);
		b2.setIcon(ic3);
		b2.setBounds(1050, 500, 70, 70);
		add(b2);
		b2.setBorderPainted(false);
		}
			
	public static void main(String[] args){
		new history();
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==b){
			new front();
		}
		else if(arg0.getSource()==b1){
			new usrguide2();
		}
		else if(arg0.getSource()==b2){
			try {
				//sta=con.createStatement();
				l.removeAll();
				rs=sta.executeQuery("select word from history");
				while(rs.next()){
					
				   l.add(rs.getString(1));
				
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else 	if(arg0.getSource()==snd){
			   
			 String s=tf.getText();
			 String sn="";
			try
	   	 {
	   		rs=sta.executeQuery("select audio from stock where word LIKE '"+s+"';");
	   	 while(rs.next()){
			sn=rs.getString(1);
		}
	   	 }
	   	catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
		    	  	
		    	
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
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
		String s=l.getSelectedItem();
		tf.setEnabled(true);
		tf.setText(s);
		try {


			rs=sta.executeQuery("select * from stock where word like '"+s+"';");
		l.removeAll();
		while(rs.next()){
			l.add("MEANING:");
				l.add(rs.getString(2));
				l.add("PHONETICS:");
				l.add(rs.getString(3));
				l.add("NOUN/ADJECTIVE:");
				l.add(rs.getString(4));
				l.add("SYNONYMS:");
				l.add(rs.getString(5));
				l.add("EXAMPLE:");
				l.add(rs.getString(6));

				
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(String.valueOf(arg0.getKeyChar()).equals("\n")){
			try {
			
				String st=tf.getText();
				//sta=con.createStatement();
			
                rs1=sta.executeQuery("select * from history where word like '"+st+"'");
                if(rs1.next()){
				rs=sta.executeQuery("select * from stock where word like '"+st+"'");
	l.removeAll();
		while(rs.next()){
			l.add("Word:");
			l.add(rs.getString(1));
			l.add("MEANING:");
			l.add(rs.getString(2));
			l.add("PHONETICS:");
			l.add(rs.getString(3));
			l.add("NOUN/ADJECTIVE:");
			l.add(rs.getString(4));
			l.add("SYNONYMS:");
			l.add(rs.getString(5));
			l.add("EXAMPLE:");
			l.add(rs.getString(6));	}
                }
                else{
                	l.removeAll();
                	l.add("No result found");
}	//JOptionPane.showMessageDialog(this,st);
                }
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		tf.setEnabled(true);
		tf.setText("");
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
