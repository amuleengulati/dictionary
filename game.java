

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
public class game extends Frame implements WindowListener, ActionListener
{
	JButton b1,b2,b3,b4;
	Label l;
	Font f=new Font("monotype corsiva ",12,44);
	Font f1=new Font("monotype corsiva",12,33);
	Font f2=new Font("monotype corsiva",12,24);
	ImagePanel p=new ImagePanel("i11.gif");
	JButton z=new JButton();
	JButton z1=new JButton();
	JButton z2=new JButton();
	JLabel z3=new JLabel();
ImageIcon i3=new ImageIcon("i15.gif");
	ImageIcon ic1=new ImageIcon("i13.gif");
	ImageIcon ic=new ImageIcon("i12.gif");
	ImageIcon ic2=new ImageIcon("i14.gif");

	public game()
	
	{
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(4000,4000);
		this.setTitle("Game Select");
		this.addWindowListener(this);
		z3.setIcon(i3);
		z3.setBounds(20,0,300,200);
		p.add(z3);
		p.setBounds(50,100,4000,4000);
		add(p);
		b1=new JButton("CROSSWORD");
		b2=new JButton("WORDS WITHIN WORDS");
		b3=new JButton("SENTENCE COMPLETION");
		b4=new JButton("SMILYMAN");
		b1.setBounds(250,220,200,50);
		b1.setFont(f2);


		b2.setBounds(190,360,300,50);
		b2.setFont(f2);

		b3.setBounds(190,290,300,50);
		b3.setFont(f2);
		b4.setBounds(250, 430,200, 50);
		b4.setFont(f2);

		b4.addActionListener(this);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setForeground(Color.magenta);
		b2.setBackground(Color.black);
		b2.setForeground(Color.yellow);
		b4.setBackground(Color.black);
		b4.setForeground(Color.cyan);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		/*z.setIcon(ic);
		z.setBounds(690, 250, 200, 100);
		z.setBorderPainted(false);
		z.setBackground(Color.white);
		p.add(z);
		z.addActionListener(this);*/
		z1.setIcon(ic1);
		z1.setBounds(890, 550, 300, 100);
		z1.setBorderPainted(false);
		z1.setBackground(Color.white);
		p.add(z1);
		z1.addActionListener(this);
		z2.setIcon(ic2);
		z2.setBounds(1150, 0, 100, 100);
		z2.setBorderPainted(false);
		z2.setBackground(Color.white);
		p.add(z2);
		z2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			new level();
		}
		else if(e.getSource()==b2)
		{
			new www1();
		}
		else if(e.getSource()==b3){
			new sentencegame();
		}
		else if(e.getSource()==b4){
			new smilyman();
		}
		else if(e.getSource()==z1){
			new front();
		}
		else if(e.getSource()==z2){
			new usrguide1();
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
		System.exit(0);// TODO Auto-generated method stub
		
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
	public static void main(String[] args)
	{
		new game();
	}
}
