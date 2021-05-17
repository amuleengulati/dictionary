

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;


public class home extends Frame implements WindowListener, ActionListener,KeyListener, MouseListener, ItemListener{
ImagePanel p=new ImagePanel("i8.jpg");
ImageIcon ic=new ImageIcon("i21.gif");
ImageIcon ic1=new ImageIcon("i22.gif");
ImageIcon ic2=new ImageIcon("t7.jpg");
ImageIcon ic5=new ImageIcon("snd.jpeg");
JButton bhelp=new JButton(); 
JTextField tf=new  JTextField();
List l=new List(10);
JButton bfav=new JButton();
Connection con;
Statement sta,sta1;
ResultSet rs,rs1;
JButton b=new JButton(); 
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
Label z;
JButton snd;
public home(){
this.setVisible(true);
this.setLayout(null);
this.setSize(4000,4000);
this.addWindowListener(this);
p.setBounds(50,50,4000,4000);
add(p);
tf.setBounds(250, 150, 500, 30);
p.add(tf);
tf.setForeground(Color.blue);
tf.setFont(new java.awt.Font("Comic Sans MS", Font.ITALIC, 16));
tf.setText("Type word here");
tf.setEnabled(false);
tf.addMouseListener(this);
tf.addKeyListener(this);
snd=new JButton();
snd.setBounds(755,150,40,30);
snd.setBorder(null);
snd.setIcon(ic5);
p.add(snd);
snd.addActionListener(this);
l.setBounds(250, 200, 500, 400);
l.setFont(new java.awt.Font("Comic Sans MS", Font.ITALIC, 18));
l.setForeground(Color.white);
l.setBackground(Color.gray);
p.add(l);
l.addItemListener(this);
b.setIcon(ic);
b.setBounds(1150,610, 130, 100);
p.add(b);
b.addActionListener(this);
b.setBorderPainted(false);
bfav.setIcon(ic2);
bfav.setBounds(1150,350, 110, 110);
p.add(bfav);
bfav.addActionListener(this);
bfav.setBorderPainted(false);

bhelp.setIcon(ic1);
bhelp.setBounds(1150,480, 100, 100);
p.add(bhelp);
bhelp.addActionListener(this);
bhelp.setBorderPainted(false);
b0=new Button("A");
b1=new Button("B");
b2=new Button("C");
b3=new Button("D");
b4=new Button("E");
b5=new Button("F");
b6=new Button("G");
b7=new Button("H");
b8=new Button("I");
b9=new Button("J");
b10=new Button("K");
b11=new Button("L");
b12=new Button("M");
b13=new Button("N");
b14=new Button("O");
b15=new Button("P");
b16=new Button("Q");
b17=new Button("R");
b18=new Button("S");
b19=new Button("T");
b20=new Button("U");
b21=new Button("V");
b22=new Button("W");
b23=new Button("X");
b24=new Button("Y");
b25=new Button("Z");
b0.setBounds(835, 90, 30, 20);
b0.setForeground(Color.white);
b0.setBackground(Color.red);
p.add(b0);
b0.addActionListener(this);
b1.setBounds(835, 110, 30, 20);
b1.setForeground(Color.white);
b1.setBackground(Color.red);
p.add(b1);
b1.addActionListener(this);

b2.setBounds(835, 130, 30, 20);
b2.setForeground(Color.white);
b2.setBackground(Color.red);
p.add(b2);
b2.addActionListener(this);

b3.setBounds(835, 150, 30, 20);
b3.setForeground(Color.white);
b3.setBackground(Color.red);
p.add(b3);
b3.addActionListener(this);

b4.setBounds(835, 170, 30, 20);
b4.setForeground(Color.white);
b4.setBackground(Color.red);
p.add(b4);
b4.addActionListener(this);

b5.setBounds(835, 190, 30, 20);
b5.setForeground(Color.white);
b5.setBackground(Color.blue);
p.add(b5);
b5.addActionListener(this);

b6.setBounds(835, 210, 30, 20);
b6.setForeground(Color.white);
b6.setBackground(Color.blue);

p.add(b6);
b6.addActionListener(this);

b7.setBounds(835, 230, 30, 20);
b7.setForeground(Color.white);
b7.setBackground(Color.blue);

p.add(b7);
b7.addActionListener(this);

b8.setBounds(835, 250, 30, 20);
b8.setForeground(Color.white);
b8.setBackground(Color.blue);

p.add(b8);
b8.addActionListener(this);

b9.setBounds(835, 270, 30, 20);
b9.setForeground(Color.white);
b9.setBackground(Color.blue);

p.add(b9);
b9.addActionListener(this);

b10.setBounds(835, 290, 30, 20);
b10.setForeground(Color.black);
b10.setBackground(Color.green);
p.add(b10);
b10.addActionListener(this);

b11.setBounds(835, 310, 30, 20);
b11.setForeground(Color.black);
b11.setBackground(Color.green);

p.add(b11);
b11.addActionListener(this);

b12.setBounds(835, 330, 30, 20);
b12.setForeground(Color.black);
b12.setBackground(Color.green);

p.add(b12);
b12.addActionListener(this);

b13.setBounds(835, 350, 30, 20);
b13.setForeground(Color.black);
b13.setBackground(Color.green);

p.add(b13);
b13.addActionListener(this);

b14.setBounds(835, 370, 30, 20);
b14.setForeground(Color.black);
b14.setBackground(Color.yellow);
p.add(b14);
b14.addActionListener(this);

b15.setBounds(835, 390, 30, 20);
b15.setForeground(Color.black);
b15.setBackground(Color.yellow);

p.add(b15);
b15.addActionListener(this);

b16.setBounds(835, 410, 30, 20);
b16.setForeground(Color.black);
b16.setBackground(Color.yellow);

p.add(b16);
b16.addActionListener(this);

b17.setBounds(835, 430, 30, 20);
b17.setForeground(Color.black);
b17.setBackground(Color.yellow);

p.add(b17);
b17.addActionListener(this);

b18.setBounds(835, 450, 30, 20);
b18.setForeground(Color.white);
b18.setBackground(Color.magenta);
p.add(b18);
b18.addActionListener(this);

b19.setBounds(835, 470, 30, 20);
b19.setForeground(Color.white);
b19.setBackground(Color.magenta);

p.add(b19);
b19.addActionListener(this);

b20.setBounds(835, 490, 30, 20);
b20.setForeground(Color.white);
b20.setBackground(Color.magenta);

p.add(b20);
b20.addActionListener(this);

b21.setBounds(835, 510, 30, 20);
b21.setForeground(Color.white);
b21.setBackground(Color.magenta);

p.add(b21);
b21.addActionListener(this);

b22.setBounds(835, 530, 30, 20);
b22.setForeground(Color.black);
b22.setBackground(Color.cyan);

p.add(b22);
b22.addActionListener(this);

b23.setBounds(835, 550, 30, 20);
b23.setForeground(Color.black);
b23.setBackground(Color.cyan);

p.add(b23);
b23.addActionListener(this);

b24.setBounds(835, 570, 30, 20);
b24.setForeground(Color.black);
b24.setBackground(Color.cyan);

p.add(b24);
b24.addActionListener(this);

b25.setBounds(835, 590, 30, 20);
b25.setForeground(Color.black);
b25.setBackground(Color.cyan);

p.add(b25);
b25.addActionListener(this);
try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
	sta=con.createStatement();

}
catch(Exception ex){
	JOptionPane.showMessageDialog(null, "ERROR"+ex.getMessage());
}
}
public static void main(String[] args){
new home();
}
@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
	if(arg0.getSource()==b){
		new front();
	}
	else if(arg0.getSource()==bhelp){
		new usrguide();
	}
	else if(arg0.getSource()==bfav){
		try {
			sta=con.createStatement();
			String s=tf.getText();
			rs1=sta.executeQuery("select * from favourites where word like '"+s+"'");
			if(rs1.next()){
				
			}
			else{
			
			sta.executeUpdate("insert into favourites values('"+s+"')");}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
			
	
	else if(arg0.getSource()==b0){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'a%'");
			while(rs.next()){
				tf.setText("");
			   l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b1){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'b%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b2){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'c%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b3){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'd%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b4){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'e%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b5){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'f%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b6){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'g%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b7){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'h%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b8){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'i%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b9){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'j%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b10){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'k%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b11){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'l%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b12){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'm%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b13){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'n%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b14){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'o%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b15){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'p%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b16){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'q%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b17){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'r%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b18){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 's%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b19){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 't%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b20){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'u%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b21){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'v%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b22){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'w%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b23){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'x%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b24){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'y%'");
			while(rs.next()){
				tf.setText("");
			l.add(rs.getString(1));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else if(arg0.getSource()==b25){
		try {
			sta=con.createStatement();
			l.removeAll();
			rs=sta.executeQuery("select * from stock where word like 'z%'");
			while(rs.next()){
				tf.setText("");
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
		if(sn.equals(null))
		{
			JOptionPane.showMessageDialog(this, "No sound available!");
		}
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
	        clip.start();
	        }
	     } catch (UnsupportedAudioFileException e) {
	    JOptionPane.showMessageDialog(this, "Sound not available!");
	        //e.printStackTrace();
	     } catch (IOException e) { JOptionPane.showMessageDialog(this, e.getMessage());
	        e.printStackTrace();
	     } catch (LineUnavailableException e) { JOptionPane.showMessageDialog(this, e.getMessage());
	        e.printStackTrace();
	     } 
	    
	 	}
	 
		


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
		String str=tf.getText();
		int n=str.length();
		String s[]=new String[n];
		
		for(int i=0;i<n;i++){
	      s[i]=str.substring(i,i+1);
		}
		
			String st=tf.getText();
			//sta=con.createStatement();
			rs1=sta.executeQuery("select * from history where word like '"+st+"'");
			if(rs1.next()){
				
			}
			else{
			sta.executeUpdate("insert into history values ('"+st+"')");
			}
			rs=sta.executeQuery("select * from stock where word like '"+st+"';");
l.removeAll();
	if(rs.next()){
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
		l.add(rs.getString(6));
		}
	else
	{ l.removeAll();
		for(int j=0;j<n;j++)
		{
			if(s[j].equals("a") || s[j].equals("A") || s[j].equals("b") || s[j].equals("B") || s[j].equals("c") || s[j].equals("C") || s[j].equals("d") || s[j].equals("D") || s[j].equals("e") || s[j].equals("E") || s[j].equals("f") ||
					s[j].equals("F") || s[j].equals("i") || s[j].equals("I") || s[j].equals("j") || s[j].equals("J") || s[j].equals("k") || s[j].equals("K") || s[j].equals("l") || s[j].equals("L") || s[j].equals("m") || s[j].equals("M") ||
					s[j].equals("n")|| s[j].equals("N") || s[j].equals("o") || s[j].equals("O") || s[j].equals("p") || s[j].equals("P") || s[j].equals("q") || s[j].equals("Q") || s[j].equals("r") || s[j].equals("R") || s[j].equals("s") ||
					s[j].equals("S") || s[j].equals("t") || s[j].equals("T") || s[j].equals("u") || s[j].equals("U") || s[j].equals("v") || s[j].equals("V") || s[j].equals("w") || s[j].equals("W") || s[j].equals("x") || s[j].equals("X") ||
					s[j].equals("Y") || s[j].equals("y") || s[j].equals("z") || s[j].equals("Z") || s[j].equals("G") || s[j].equals("g") || s[j].equals("h") || s[j].equals("H"))
			{
				l.removeAll();
				l.add("No results Found!");

		    }
		
			else
			{
				l.removeAll();
		l.add("Invalid Input");
		break;
			}
			//JOptionPane.showMessageDialog(this,st);
	}
	
	}	
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	tf.setEnabled(true);
	tf.setText("");
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	String s=l.getSelectedItem();
	tf.setEnabled(true);
	tf.setText(s);
	try {
		sta.executeUpdate("insert into history values('"+s+"')");

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
}