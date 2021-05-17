
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class www1 extends Frame implements WindowListener, ActionListener, KeyListener{

	Label l,l1,l2;
   TextField t;
   Connection con;
  Statement sta;
   ResultSet rs;
    List ch;
    ImagePanel p=new ImagePanel("gk copy.jpg");
    ImagePanel p2=new ImagePanel("i26.jpg");
    ImageIcon ic1=new ImageIcon("i28.jpg");
    ImageIcon ic2=new ImageIcon("i12.gif");
    ImageIcon ic3=new ImageIcon("ib.jpg");
JButton bs=new JButton();
JButton bb=new JButton();
    JLabel la=new JLabel();
    JLabel la1=new JLabel();
	Font f=new Font("",1,33);
	Font f1=new Font(" Italic",1,23);
	Button b;
	
	
	public www1()
	{
		this.setVisible(true);
		this.setSize(4000,4000);
		this.setTitle("MY APPLICATION");
		this.addWindowListener(this);
		setLayout(null);
		l1=new Label("WORDS WITHIN WORDS");
		l2=new Label("Enter word here:");
		l2.setBounds(500, 220, 100, 30);
		add(l2);
		l1.setBackground(Color.red);
		l1.setForeground(Color.green);
		l1.setFont(f);
		bs.setIcon(ic2);
		bs.setBounds(500,630,150,70);
		p.add(bs);
		bs.setBorderPainted(false);
		bs.addActionListener(this);
		
		bb.setIcon(ic3);
		bb.setBounds(300,630,108,70);
		p.add(bb);
		bb.setBorderPainted(false);
		bb.addActionListener(this);
		
		add(l1);
				la.setIcon(ic1);
		la.setBounds(400, 0, 800, 200);
		add(la);
		
		b=new Button("HELP");
	    b.setBounds(1000,350 ,100, 80);
	    b.setFont(f);
		b.setBackground(Color.pink);
	add(b);
		b.addActionListener(this);
		 l=new Label();
		l.setBounds(170, 250, 300, 35);
	   l.setBackground(Color.cyan);
	   l.setFont(f1);
		add(l);
		t=new TextField();
		t.setBounds(500, 250, 300, 35);
		t.setFont(f1);
		add(t);
		t.addKeyListener(this);
		ch=new List();
		ch.setBounds(300, 352, 400, 150);
		ch.setFont(f1);
		add(ch);
		p.setBounds(22, 2, 1500, 700);
		add(p);
		p2.setBounds(935, 310, 240, 400);
		p.add(p2);
		
        int j;
		//for(j=0;j<=500;j++)
		//{
			l1.setBounds(500, 80, 400, 32);
			
		//try{
			//Thread.sleep(0);	
			//}
		//catch(Exception ex){}}*/
		try{
			//set word in label lb
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","teddylove.");
			sta=con.createStatement();
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this,"Error:"+ex.getMessage());
		}		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new www1();
              
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
		if(arg0.getSource()==bs){
			try{
				//sta=con.createStatement();
				ch.removeAll();
				rs=sta.executeQuery("select word from stock ORDER BY RAND() LIMIT 1");
				while(rs.next()){
					
				l.setText(rs.getString(1));
			
			}
				}
				//else{
					//JOptionPane.showMessageDialog(this,"else");}
				
			catch(Exception ex){
				JOptionPane.showMessageDialog(this, "ERROR:"+ex.getMessage());
			}
		}
		else if(arg0.getSource()==b){
			new hwww();
		}
		else if(arg0.getSource()==bb){
		new front();
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
			String str=t.getText();
			String wrd=l.getText();
			int n=str.length();
			String s[]=new String[n];
		
				for(int i=0;i<n;i++){
			      s[i]=str.substring(i,i+1);		
			      //JOptionPane.showMessageDialog(this, "working");
				}
			 int count=0;
			for(int i=0;i<n;i++){
				if(wrd.contains(s[i])){
					count++;
			     // JOptionPane.showMessageDialog(this, "done");
			      }

				else{
					JOptionPane.showMessageDialog(this,"Invalid word");break;
				}
			
			}
			if(count==n){
				//Database
				try{
				rs=sta.executeQuery("select * from stock where word like '"+str+"'");
				if(rs.next()){
					ch.add(str);
					t.setText("");
				}
				else{
					JOptionPane.showMessageDialog(this,"Invalid word");
				}
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(this,"Error:"+ex.getMessage());
				}
			}
					}
	}

}