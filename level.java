import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class level extends Frame implements WindowListener,ActionListener{

	
	
	JButton be,bm,bd;
	ImagePanel p=new ImagePanel("ls.jpg");
ImageIcon ic=new ImageIcon("t8 .jpg");
ImageIcon ic1=new ImageIcon("t10.jpg");
ImageIcon ic2=new ImageIcon("t9.jpg");

	public level(){
	
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(400, 250);
		this.setLocation(450,200);
		this.setTitle("SELECT_LEVEL");
		this.addWindowListener(this);
		p.setBounds(0, 25, 400, 250);
		add(p);
		be=new JButton();
		be.setIcon(ic);
		be.setBounds(40, 100,70, 70);
		p.add(be);
		be.setBorderPainted(false);
		bm=new JButton();
		bm.setIcon(ic1);
		bm.setBounds(160, 100,70, 70);
		p.add(bm);
		bm.setBorderPainted(false);
		bd=new JButton();
		bd.setIcon(ic2);
		bd.setBounds(280, 100,70, 70);
		p.add(bd);
		bd.setBorderPainted(false);


p.add(be);
p.add(bm);
p.add(bd);
be.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);






	}
	public static void main(String[] args){
		new level();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
			if(arg0.getSource()==be){
				new crossword1();
			}
			else if(arg0.getSource()==bm){
				new crossword3();
			}
			else if(arg0.getSource()==bd){
				new crossword5();
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

}
