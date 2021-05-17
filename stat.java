
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class stat extends Frame implements WindowListener, ActionListener{
	JLabel l=new JLabel();
	JTextArea ta=new JTextArea();
	Font f=new Font("monotype corsiva",1,66);
	Font f1=new Font(" ",1,33);
	Font f2=new Font("monotype corsiva",1,24);
	Font f3=new Font("",1,14);
	JLabel l1=new JLabel();
	JProgressBar pb=new JProgressBar();
	int i;
	ImagePanel p=new ImagePanel("i8.gif");
	ImagePanel p1=new ImagePanel("i8.gif");
	ImagePanel p2=new ImagePanel("i8.gif");
	ImagePanel p3=new ImagePanel("i8.gif");
ImagePanel p4=new ImagePanel("i9.gif");
	JButton b=new JButton("START");
	JLabel l2,l3,l4,l5,l21,l31,l41,l51;
	public stat(){
		this.setVisible(true);
		this.setSize(4000, 4000);
		this.addWindowListener(this);
		this.setLayout(null);
		p4.setBounds(1030, 250, 400, 350);
		add(p4);
		b.setBounds(90,125,100,25);
		b.setForeground(Color.red);
		b.setFont(f3);
		p4.add(b);
		b.addActionListener(this);
		p.setBounds(100,200,400,300);
		add(p);
p1.setBounds(350,450 , 400, 300);
add(p1);
p2.setBounds(600, 200, 400, 300);
add(p2);
p3.setBounds(850, 450,400, 300);
add(p3);
		l.setText("WORD STOCK");
		l.setBounds(440, -10, 700, 150);
		add(l);
		l.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 66));
		l.setForeground(Color.blue);
		l1.setText("DICTIONARY");
		l1.setBounds(450,50, 700, 150);
		add(l1);
		l1.setFont(f);
		l1.setForeground(Color.red);
		l2=new JLabel();
		l2.setText("A Complete tool for");
		l2.setBounds(30, 100, 250, 30);
		l21=new JLabel("vocabulary enhancement.");
		l21.setBounds(10, 130, 250, 50);
		l21.setFont(f2);
		p.add(l2);
		p.add(l21);
		l2.setFont(f2);
		l3=new JLabel();
		l3.setText("Interesting games to");
		l3.setBounds(30, 110, 250, 30);
		p1.add(l3);
		l3.setFont(f2);
		l31=new JLabel("improve grammar.");
		l31.setBounds(50, 140, 250, 30);
		p1.add(l31);
		l31.setFont(f2);
		l5=new JLabel();
		l5.setText("Great kit for");
		l5.setBounds(50, 110, 250, 30);
		p2.add(l5);
		l51=new JLabel("inquisitive learners.");
		l51.setBounds(30, 140,250, 30);
		p2.add(l51);
		l51.setFont(f2);
		l5.setFont(f2);
		l4=new JLabel();
		l4.setText("User guide included");
		l4.setBounds(30, 110, 250, 30);
		p3.add(l4);
		l4.setFont(f2);
		l41=new JLabel("for easy usage.");
		l41.setBounds(50, 140, 250,30);
		p3.add(l41);
		l41.setFont(f2);
l2.setVisible(false);
l21.setVisible(false);
l3.setVisible(false);
l31.setVisible(false);

p1.setVisible(false);
p2.setVisible(false);
p3.setVisible(false);
l4.setVisible(false);
l41.setVisible(false);
p4.setVisible(false);
l5.setVisible(false);
l51.setVisible(false);
b.setVisible(false);

try{
	pb.setMaximum(500);
	Thread.sleep(2000);
	for(int i=0;i<=100;i++){
		pb.setValue(i);
		if(pb.getValue()>99){
			p.setVisible(true);
			l2.setVisible(true);
			l21.setVisible(true);
		next2();
		}


	}
	
}
catch(Exception ex){
	
}

	}
	public void next2(){
		try{
			pb.setMaximum(500);
			Thread.sleep(2000);
			for(int i=100;i<=200;i++){
				pb.setValue(i);
				if(pb.getValue()>199){
					p1.setVisible(true);
					l3.setVisible(true);
					l31.setVisible(true);

				next();
				}


			}
			
		}
		catch(Exception ex){
			
		}

	}
public void next()
{
	try{
		pb.setMaximum(500);
		Thread.sleep(2000);
	

	for(i=200;i<=300;i++){
		pb.setValue(i);
		if(pb.getValue()>299){
			p2.setVisible(true);
			l5.setVisible(true);
			l51.setVisible(true);

			next1();
		}
	}
}
	catch(Exception ex){}
}

public void next1(){
	try{
		pb.setMaximum(500);
		Thread.sleep(2000);
	

	for(i=300;i<=400;i++){
		pb.setValue(i);
		if(pb.getValue()>399){
			p3.setVisible(true);
			l4.setVisible(true);
			l41.setVisible(true);
			next3();		}
	}
}
	catch(Exception ex){}

}
		public void next3(){
			try{
				pb.setMaximum(500);
				Thread.sleep(2000);
			

			for(i=400;i<=500;i++){
				pb.setValue(i);
				if(pb.getValue()>499){
p4.setVisible(true);
b.setVisible(true);
				
			}
			}
			}
				catch(Exception ex){
					
				}
		}
			
	public static void main(String[] args){
		new stat();
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
	}
}