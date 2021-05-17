
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class front extends Frame implements WindowListener ,ActionListener {
	ImagePanel p=new ImagePanel("i0.jpg");
	JButton b=new JButton("HOME");
	JButton b1=new JButton("BRAIN TEASERS");
	JButton b2=new JButton("HISTORY");
	JButton b3=new JButton("FAVORITES");
	JButton b4=new JButton("USER GUIDE");
	Label b5=new Label("WORD STOCK");
	Font f=new Font("Comic Sans MS",1,24);
	public front()
	{
		this.setSize(4000,4000);
		this.setTitle("my app");
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(this);
		p.setBounds(350,100,4000,4000);
		add(p);
		b.setBounds(65,130,200,30);
		b.setBackground(Color.orange);
		b.setForeground(Color.RED);
		p.add(b);
		b1.setBounds(15,177,250,30);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.magenta);
		p.add(b1);
		b2.setBounds(65,224,200,30);
		b2.setBackground(Color.magenta);
		b2.setForeground(Color.yellow);
		p.add(b2);
		b.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);


		b3.setBounds(65,271,200,30);
		b3.setBackground(Color.CYAN);
		b3.setForeground(Color.black);
		p.add(b3);
		b4.setBounds(65,318,200,30);
		b4.setBackground(Color.RED);
		b4.setForeground(Color.GREEN);
		p.add(b4);
		b5.setBounds(310,90,200,30);
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
	
		p.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b.addActionListener(this);

	}
public static void main(String[]args)
{
	new front();
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
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==b){
		new home();
	}
	else if(arg0.getSource()==b1){
		new game();
	}
else if(arg0.getSource()==b2){
		new history();
	}
else if(arg0.getSource()==b3){
	new favorites();
}
else if(arg0.getSource()==b4){
	new usrguide();
}

}
}
