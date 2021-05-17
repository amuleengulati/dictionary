

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;
import javax.swing.*;
public class smilyman extends Frame implements ActionListener,WindowListener{
	
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	Panel p6=new Panel();
	Panel p7=new Panel();
	Panel p8=new Panel();
	Panel p9=new Panel();
	Panel p10=new Panel();
	TextField t[]=new TextField[36];
	Button b[]=new Button[242];
	JButton b1,b2,b3;
	Label l[]=new Label[22];
	Font f=new Font("",1,33);
	Font f1=new Font("",1,50);
	Font f2=new Font("",1,20);
	
	ImagePanel p=new ImagePanel("s2.jpg");

	
	Graphics g,g1,g2,g3,g4,g5,g6,g7,g8;
	
	 
	public smilyman()
	{
		
		
		this.setVisible(true);
		this.setSize(4000,4000);
		this.setTitle("MY APPLICATION");
		this.addWindowListener(this);
		setLayout(null);
		p.setBounds(1140,30,400,120);
		add(p);
		ImageIcon ic=new ImageIcon("s1.jpg");
		JButton b1=new JButton();
		b1.setIcon(ic);
		b1.setBounds(1150,180,200,200);
		add(b1);
		b1.addActionListener(this);
		
		ImageIcon ic1=new ImageIcon("bac.jpg");
		JButton b2=new JButton();
		b2.setIcon(ic1);
		b2.setBounds(1150,400,200,200);
		add(b2);
		b2.addActionListener(this);
		
		
	   p1.setBounds(120,20,1000,1000);
	  p1.setBackground(Color.black);
	 
	    p1.setLayout(null);
	    
	    
	    
	    add(p1);
		
		
		 l[0]=new Label("SMILYMAN");
		 l[0].setForeground(Color.cyan);
		 l[0].setBounds(550, 50, 400, 50);
		 l[0].setFont(f1);
		 p1.add(l[0]);
		 l[1]=new Label("Hint: a bearded beast");
		 l[1].setForeground(Color.cyan);
		 l[1].setBounds(550, 600, 600, 50);
		 l[1].setFont(f);
		 p1.add(l[1]);
		 l[2]=new Label("RULE:enter the words in sequence in the boxes");
		 l[2].setForeground(Color.cyan);
		 l[2].setBounds(12, 50, 600, 50);
		 l[2].setFont(f2);
		 p1.add(l[2]);
		
		 b[0]=new Button("A");
		 b[0].setBounds(550, 250, 50, 50);
		 b[0].addActionListener(this);
		p1.add(b[0]);
		 b[1]=new Button("B");
		 b[1].setBounds(600, 250, 50, 50);
		 b[1].addActionListener(this);
		p1.add(b[1]);
        b[2]=new Button("C");
		 b[2].setBounds(650, 250, 50, 50);
		 b[2].addActionListener(this);
		p1.add(b[2]);
		 b[3]=new Button("D");
		 b[3].setBounds(700, 250, 50, 50);
		 b[3].addActionListener(this);
		p1.add(b[3]);
          b[4]=new Button("E");
		 b[4].setBounds(750, 250, 50, 50);
		 b[4].addActionListener(this);
		p1.add(b[4]);
		b[5]=new Button("F");
		 b[5].setBounds(550, 300, 50, 50);
		 b[5].addActionListener(this);
		p1.add(b[5]);
		 b[6]=new Button("G");
		 b[6].setBounds(600, 300, 50, 50);
		 b[6].addActionListener(this);
		p1.add(b[6]);
       b[7]=new Button("H");
		 b[7].setBounds(650, 300, 50, 50);
		 b[7].addActionListener(this);
		p1.add(b[7]);
		 b[8]=new Button("I");
		 b[8].setBounds(700, 300, 50, 50);
		 b[8].addActionListener(this);
		p1.add(b[8]);
         b[9]=new Button("J");
		 b[9].setBounds(750, 300, 50, 50);
		 b[9].addActionListener(this);
		p1.add(b[9]);
		b[10]=new Button("K");
		 b[10].setBounds(550, 350, 50, 50);
		 b[10].addActionListener(this);
		p1.add(b[10]);
		b[11]=new Button("L");
		 b[11].setBounds(600, 350, 50, 50);
		p1.add(b[11]);
      b[12]=new Button("M");
		 b[12].setBounds(650, 350, 50, 50);
		p1.add(b[12]);
		 b[13]=new Button("N");
		 b[13].setBounds(700, 350, 50, 50);
		 b[13].addActionListener(this);
		p1.add(b[13]);
        b[14]=new Button("0");
		 b[14].setBounds(750, 350, 50, 50);
		 b[14].addActionListener(this);
		p1.add(b[14]);
		b[15]=new Button("P");
		 b[15].setBounds(550, 400, 50, 50);
		 b[15].addActionListener(this);
		p1.add(b[15]);
		b[16]=new Button("Q");
		 b[16].setBounds(600, 400, 50, 50);
		 b[16].addActionListener(this);
		p1.add(b[16]);
     b[17]=new Button("R");
		 b[17].setBounds(650, 400, 50, 50);
		 b[17].addActionListener(this);
		p1.add(b[17]);
		 b[18]=new Button("S");
		 b[18].setBounds(700, 400, 50, 50);
		 b[18].addActionListener(this);
		p1.add(b[18]);
       b[19]=new Button("T");
		 b[19].setBounds(750, 400, 50, 50);
		 b[19].addActionListener(this);
		p1.add(b[19]);
	
		b[20]=new Button("U");
		 b[20].setBounds(550, 450, 50, 50);
		 b[20].addActionListener(this);
		p1.add(b[20]);
     b[21]=new Button("V");
		 b[21].setBounds(600, 450, 50, 50);
		 b[21].addActionListener(this);
		p1.add(b[21]);
		 b[22]=new Button("W");
		 b[22].setBounds(650, 450, 50, 50);
		 b[22].addActionListener(this);
		p1.add(b[22]);
       b[23]=new Button("X");
		 b[23].setBounds(700, 450, 50, 50);
		 b[23].addActionListener(this);
		p1.add(b[23]);
		b[24]=new Button("Y");
		 b[24].setBounds(750, 450, 50, 50);
		 b[24].addActionListener(this);
		p1.add(b[24]);
		b[25]=new Button("Z");
		 b[25].setBounds(650, 500, 50, 50);
		 b[25].addActionListener(this);
		p1.add(b[25]);
		b[26]=new Button("TRY NEXT");
		b[26].setBounds(650, 650, 70, 50);
		
		b[26].addActionListener(this);
		p1.add(b[26]);
		
		
		 t[0]=new TextField();
		 t[0].setEnabled(false);
         t[0].setBounds(550, 130, 60, 60);
         t[0].setFont(f);
         p1.add(t[0]);
         t[1]=new TextField();
         t[1].setEnabled(false);
         
         t[1].setBounds(610, 130, 60, 60);
         t[1].setFont(f);
         p1.add(t[1]);
         t[2]=new TextField();
         t[2].setEnabled(false);
         
         t[2].setBounds(670, 130, 60, 60);
         t[2].setFont(f);
         p1.add(t[2]);
         t[3]=new TextField();
         t[3].setEnabled(false);
         
         t[3].setBounds(730, 130, 60, 60);
        t[3].setFont(f);
         p1.add(t[3]);
         t[4]=new TextField();
         t[4].setEnabled(false);
         
         t[4].setBounds(790, 130, 60, 60);
        t[4].setFont(f);
         p1.add(t[4]);
         g=p1.getGraphics();
         
        p2.setBounds(120,20,1000,10000);
        p2.setBackground(Color.black);
 	    p2.setLayout(null);
 	    add(p2);
 	   l[0]=new Label("SMILYMAN");
		 l[0].setForeground(Color.cyan);
		 l[0].setBounds(550, 50, 400, 50);
		 l[0].setFont(f1);
		 p2.add(l[0]);
         l[3]=new Label("Hint:to strive for superiority");
		 l[3].setForeground(Color.cyan);
		 l[3].setBounds(550, 600, 600, 50);
		 l[3].setFont(f);
		 p2.add(l[3]);
		 l[4]=new Label("RULE:enter the words in sequence in the boxes");
		 l[4].setForeground(Color.cyan);
		 l[4].setBounds(12, 50, 600, 50);
		 l[4].setFont(f2);
		 p2.add(l[4]);
		 b[27]=new Button("A");
		 b[27].setBounds(550, 250, 50, 50);
		 b[27].addActionListener(this);
		p2.add(b[27]);
		 b[28]=new Button("B");
		 b[28].setBounds(600, 250, 50, 50);
		 b[28].addActionListener(this);
		p2.add(b[28]);
        b[29]=new Button("C");
		 b[29].setBounds(650, 250, 50, 50);
		 b[29].addActionListener(this);
		p2.add(b[29]);
		 b[30]=new Button("D");
		 b[30].setBounds(700, 250, 50, 50);
		 b[30].addActionListener(this);
		p2.add(b[30]);
          b[31]=new Button("E");
		 b[31].setBounds(750, 250, 50, 50);
		 b[31].addActionListener(this);
		p2.add(b[31]);
		b[32]=new Button("F");
		 b[32].setBounds(550, 300, 50, 50);
		 b[32].addActionListener(this);
		p2.add(b[32]);
		 b[33]=new Button("G");
		 b[33].setBounds(600, 300, 50, 50);
		 b[33].addActionListener(this);
		p2.add(b[33]);
       b[34]=new Button("H");
		 b[34].setBounds(650, 300, 50, 50);
		 b[34].addActionListener(this);
		p2.add(b[34]);
		 b[35]=new Button("I");
		 b[35].setBounds(700, 300, 50, 50);
		 b[35].addActionListener(this);
		p2.add(b[35]);
         b[36]=new Button("J");
		 b[36].setBounds(750, 300, 50, 50);
		 b[36].addActionListener(this);
		p2.add(b[36]);
		b[37]=new Button("K");
		 b[37].setBounds(550, 350, 50, 50);
		 b[37].addActionListener(this);
		p2.add(b[37]);
		b[38]=new Button("L");
		 b[38].setBounds(600, 350, 50, 50);
		p2.add(b[38]);
      b[39]=new Button("M");
		 b[39].setBounds(650, 350, 50, 50);
		p2.add(b[39]);
		 b[40]=new Button("N");
		 b[40].setBounds(700, 350, 50, 50);
		 b[40].addActionListener(this);
		p2.add(b[40]);
        b[41]=new Button("0");
		 b[41].setBounds(750, 350, 50, 50);
		 b[41].addActionListener(this);
		p2.add(b[41]);
		b[42]=new Button("P");
		 b[42].setBounds(550, 400, 50, 50);
		 b[42].addActionListener(this);
		p2.add(b[42]);
		b[43]=new Button("Q");
		 b[43].setBounds(600, 400, 50, 50);
		 b[43].addActionListener(this);
		p2.add(b[43]);
     b[44]=new Button("R");
		 b[44].setBounds(650, 400, 50, 50);
		 b[44].addActionListener(this);
		p2.add(b[44]);
		 b[45]=new Button("S");
		 b[45].setBounds(700, 400, 50, 50);
		 b[45].addActionListener(this);
		p2.add(b[45]);
       b[46]=new Button("T");
		 b[46].setBounds(750, 400, 50, 50);
		 b[46].addActionListener(this);
		p2.add(b[46]);
	
		b[47]=new Button("U");
		 b[47].setBounds(550, 450, 50, 50);
		 b[47].addActionListener(this);
		p2.add(b[47]);
     b[48]=new Button("V");
		 b[48].setBounds(600, 450, 50, 50);
		 b[48].addActionListener(this);
		p2.add(b[48]);
		 b[49]=new Button("W");
		 b[49].setBounds(650, 450, 50, 50);
		 b[49].addActionListener(this);
		p2.add(b[49]);
       b[50]=new Button("X");
		 b[50].setBounds(700, 450, 50, 50);
		 b[50].addActionListener(this);
		p2.add(b[50]);
		b[51]=new Button("Y");
		 b[51].setBounds(750, 450, 50, 50);
		 b[51].addActionListener(this);
		p2.add(b[51]);
		b[52]=new Button("Z");
		 b[52].setBounds(650, 500, 50, 50);
		 b[52].addActionListener(this);
		p2.add(b[52]);
		b[53]=new Button("TRY NEXT");
		b[53].setBounds(650, 650, 70, 50);
		b[53].addActionListener(this);
		p2.add(b[53]);
		
		
	
		 t[5]=new TextField();
		 t[5].setEnabled(false);
         
         t[5].setBounds(550, 130, 60, 60);
         t[5].setFont(f);
         p2.add(t[5]);
         t[6]=new TextField();
         t[6].setEnabled(false);
         
         t[6].setBounds(610, 130, 60, 60);
         t[6].setFont(f);
         p2.add(t[6]);
         t[7]=new TextField();
         t[7].setEnabled(false);
         
         t[7].setBounds(670, 130, 60, 60);
         t[7].setFont(f);
         p2.add(t[7]);
        
         g1=p2.getGraphics();
         
         
         p3.setBounds(120,20,1000,1000);
         p3.setBackground(Color.black);
  	    p3.setLayout(null);
  	    add(p3);
  	   l[0]=new Label("SMILYMAN");
 		 l[0].setForeground(Color.cyan);
 		 l[0].setBounds(550, 50, 400, 50);
 		 l[0].setFont(f1);
 		 p3.add(l[0]);
          l[5]=new Label("Hint:To eject from a position");
 		 l[5].setForeground(Color.cyan);
 		 l[5].setBounds(550, 600, 600, 50);
 		 l[5].setFont(f);
 		 p3.add(l[5]);
 		 l[6]=new Label("RULE:enter the words in sequence in the boxes");
 		 l[6].setForeground(Color.cyan);
 		 l[6].setBounds(12, 50, 600, 50);
 		 l[6].setFont(f2);
 		 p3.add(l[6]);
 		 b[54]=new Button("A");
 		 b[54].setBounds(550, 250, 50, 50);
 		 b[54].addActionListener(this);
 		p3.add(b[54]);
 		 b[55]=new Button("B");
 		 b[55].setBounds(600, 250, 50, 50);
 		 b[55].addActionListener(this);
 		p3.add(b[55]);
         b[56]=new Button("C");
 		 b[56].setBounds(650, 250, 50, 50);
 		 b[56].addActionListener(this);
 		p3.add(b[56]);
 		 b[57]=new Button("D");
 		 b[57].setBounds(700, 250, 50, 50);
 		 b[57].addActionListener(this);
 		p3.add(b[57]);
           b[58]=new Button("E");
 		 b[58].setBounds(750, 250, 50, 50);
 		 b[58].addActionListener(this);
 		p3.add(b[58]);
 		b[59]=new Button("F");
 		 b[59].setBounds(550, 300, 50, 50);
 		 b[59].addActionListener(this);
 		p3.add(b[59]);
 		 b[60]=new Button("G");
 		 b[60].setBounds(600, 300, 50, 50);
 		 b[60].addActionListener(this);
 		p3.add(b[60]);
        b[61]=new Button("H");
 		 b[61].setBounds(650, 300, 50, 50);
 		 b[61].addActionListener(this);
 		p3.add(b[61]);
 		 b[62]=new Button("I");
 		 b[62].setBounds(700, 300, 50, 50);
 		 b[62].addActionListener(this);
 		p3.add(b[62]);
          b[63]=new Button("J");
 		 b[63].setBounds(750, 300, 50, 50);
 		 b[63].addActionListener(this);
 		p3.add(b[63]);
 		b[64]=new Button("K");
 		 b[64].setBounds(550, 350, 50, 50);
 		 b[64].addActionListener(this);
 		p3.add(b[64]);
 		b[65]=new Button("L");
 		 b[65].setBounds(600, 350, 50, 50);
 		p3.add(b[65]);
       b[66]=new Button("M");
 		 b[66].setBounds(650, 350, 50, 50);
 		p3.add(b[66]);
 		 b[67]=new Button("N");
 		 b[67].setBounds(700, 350, 50, 50);
 		 b[67].addActionListener(this);
 		p3.add(b[67]);
         b[68]=new Button("0");
 		 b[68].setBounds(750, 350, 50, 50);
 		 b[68].addActionListener(this);
 		p3.add(b[68]);
 		b[69]=new Button("P");
 		 b[69].setBounds(550, 400, 50, 50);
 		 b[69].addActionListener(this);
 		p3.add(b[69]);
 		b[70]=new Button("Q");
 		 b[70].setBounds(600, 400, 50, 50);
 		 b[70].addActionListener(this);
 		p3.add(b[70]);
      b[71]=new Button("R");
 		 b[71].setBounds(650, 400, 50, 50);
 		 b[71].addActionListener(this);
 		p3.add(b[71]);
 		 b[72]=new Button("S");
 		 b[72].setBounds(700, 400, 50, 50);
 		 b[72].addActionListener(this);
 		p3.add(b[72]);
        b[73]=new Button("T");
 		 b[73].setBounds(750, 400, 50, 50);
 		 b[73].addActionListener(this);
 		p3.add(b[73]);
 	
 		b[74]=new Button("U");
 		 b[74].setBounds(550, 450, 50, 50);
 		 b[74].addActionListener(this);
 		p3.add(b[74]);
      b[75]=new Button("V");
 		 b[75].setBounds(600, 450, 50, 50);
 		 b[75].addActionListener(this);
 		p3.add(b[75]);
 		 b[76]=new Button("W");
 		 b[76].setBounds(650, 450, 50, 50);
 		 b[76].addActionListener(this);
 		p3.add(b[76]);
        b[77]=new Button("X");
 		 b[77].setBounds(700, 450, 50, 50);
 		 b[77].addActionListener(this);
 		p3.add(b[77]);
 		b[78]=new Button("Y");
 		 b[78].setBounds(750, 450, 50, 50);
 		 b[78].addActionListener(this);
 		p3.add(b[78]);
 		b[79]=new Button("Z");
 		 b[79].setBounds(650, 500, 50, 50);
 		 b[79].addActionListener(this);
 		p3.add(b[79]);
 		b[80]=new Button("TRY NEXT");
 		b[80].setBounds(650, 650, 70, 50);
 		b[80].addActionListener(this);
 		p3.add(b[80]);
 		
 		
 	
 		 t[8]=new TextField();
 		t[8].setEnabled(false);
        
          t[8].setBounds(550, 130, 60, 60);
          t[8].setFont(f);
          p3.add(t[8]);
          t[9]=new TextField();
          t[9].setEnabled(false);
          
          t[9].setBounds(610, 130, 60, 60);
          t[9].setFont(f);
          p3.add(t[9]);
          t[10]=new TextField();
          t[10].setEnabled(false);
          
          t[10].setBounds(670, 130, 60, 60);
          t[10].setFont(f);
          p3.add(t[10]);
          t[11]=new TextField();
          t[11].setEnabled(false);
          
          t[11].setBounds(730, 130, 60, 60);
         t[11].setFont(f);
          p3.add(t[11]);
          g2=p3.getGraphics();
     
          
          p4.setBounds(120,20,1000,1000);
          p4.setBackground(Color.black);
    	    p4.setLayout(null);
    	    add(p4);
    	   l[0]=new Label("SMILYMAN");
   		 l[0].setForeground(Color.cyan);
   		 l[0].setBounds(550, 50, 400, 50);
   		 l[0].setFont(f1);
   		 p4.add(l[0]);
            l[7]=new Label("Hint:to make a liquid muddy");
   		 l[7].setForeground(Color.cyan);
   		 l[7].setBounds(550, 600, 600, 50);
   		 l[7].setFont(f);
   		 p4.add(l[7]);
   		 l[8]=new Label("RULE:enter the words in sequence in the boxes");
   		 l[8].setForeground(Color.cyan);
   		 l[8].setBounds(12, 50, 600, 50);
   		 l[8].setFont(f2);
   		 p4.add(l[8]);
   		 b[81]=new Button("A");
   		 b[81].setBounds(550, 250, 50, 50);
   		 b[81].addActionListener(this);
   		p4.add(b[81]);
   		 b[82]=new Button("B");
   		 b[82].setBounds(600, 250, 50, 50);
   		 b[82].addActionListener(this);
   		p4.add(b[82]);
           b[83]=new Button("C");
   		 b[83].setBounds(650, 250, 50, 50);
   		 b[83].addActionListener(this);
   		p4.add(b[83]);
   		 b[84]=new Button("D");
   		 b[84].setBounds(700, 250, 50, 50);
   		 b[84].addActionListener(this);
   		p4.add(b[84]);
           b[85]=new Button("E");
   		 b[85].setBounds(750, 250, 50, 50);
   		 b[85].addActionListener(this);
   		p4.add(b[85]);
   		b[86]=new Button("F");
   		 b[86].setBounds(550, 300, 50, 50);
   		 b[86].addActionListener(this);
   		p4.add(b[86]);
   		 b[87]=new Button("G");
   		 b[87].setBounds(600, 300, 50, 50);
   		 b[87].addActionListener(this);
   		p4.add(b[87]);
          b[88]=new Button("H");
   		 b[88].setBounds(650, 300, 50, 50);
   		 b[88].addActionListener(this);
   		p4.add(b[88]);
   		 b[89]=new Button("I");
   		 b[89].setBounds(700, 300, 50, 50);
   		 b[89].addActionListener(this);
   		p4.add(b[89]);
            b[90]=new Button("J");
   		 b[90].setBounds(750, 300, 50, 50);
   		 b[90].addActionListener(this);
   		p4.add(b[90]);
   		b[91]=new Button("K");
   		 b[91].setBounds(550, 350, 50, 50);
   		 b[91].addActionListener(this);
   		p4.add(b[91]);
   		b[92]=new Button("L");
   	 b[92].addActionListener(this);
   		 b[92].setBounds(600, 350, 50, 50);
   		p4.add(b[92]);
         b[93]=new Button("M");
   		 b[93].setBounds(650, 350, 50, 50);
   		p4.add(b[93]);
   		 b[94]=new Button("N");
   		 b[94].setBounds(700, 350, 50, 50);
   		 b[94].addActionListener(this);
   		p4.add(b[94]);
           b[95]=new Button("0");
   		 b[95].setBounds(750, 350, 50, 50);
   		 b[95].addActionListener(this);
   		p4.add(b[95]);
   		b[96]=new Button("P");
   		 b[96].setBounds(550, 400, 50, 50);
   		 b[96].addActionListener(this);
   		p4.add(b[96]);
   		b[97]=new Button("Q");
   		 b[97].setBounds(600, 400, 50, 50);
   		 b[97].addActionListener(this);
   		p4.add(b[97]);
        b[98]=new Button("R");
   		 b[98].setBounds(650, 400, 50, 50);
   		 b[98].addActionListener(this);
   		p4.add(b[98]);
   		 b[99]=new Button("S");
   		 b[99].setBounds(700, 400, 50, 50);
   		 b[99].addActionListener(this);
   		p4.add(b[99]);
          b[100]=new Button("T");
   		 b[100].setBounds(750, 400, 50, 50);
   		 b[100].addActionListener(this);
   		p4.add(b[100]);
   	   b[101]=new Button("U");
   		 b[101].setBounds(550, 450, 50, 50);
   		 b[101].addActionListener(this);
   		p4.add(b[101]);
        b[102]=new Button("V");
   		 b[102].setBounds(600, 450, 50, 50);
   		 b[102].addActionListener(this);
   		p4.add(b[102]);
   		 b[103]=new Button("W");
   		 b[103].setBounds(650, 450, 50, 50);
   		 b[103].addActionListener(this);
   		p4.add(b[103]);
          b[104]=new Button("X");
   		 b[104].setBounds(700, 450, 50, 50);
   		 b[104].addActionListener(this);
   		p4.add(b[104]);
   		b[105]=new Button("Y");
   		 b[105].setBounds(750, 450, 50, 50);
   		 b[105].addActionListener(this);
   		p4.add(b[105]);
   		b[106]=new Button("Z");
   		 b[106].setBounds(650, 500, 50, 50);
   		 b[106].addActionListener(this);
   		p4.add(b[106]);
   		b[107]=new Button("TRY NEXT");
   		b[107].setBounds(650, 650, 70, 50);
   		b[107].addActionListener(this);
   		p4.add(b[107]);
   		
   		
   	
   		 t[12]=new TextField();
   		t[12].setEnabled(false);
        
            t[12].setBounds(550, 130, 60, 60);
            t[12].setFont(f);
            p4.add(t[12]);
            t[13]=new TextField();
            t[13].setEnabled(false);
            
            t[13].setBounds(610, 130, 60, 60);
            t[13].setFont(f);
            p4.add(t[13]);
            t[14]=new TextField();
            t[14].setEnabled(false);
            
            t[14].setBounds(670, 130, 60, 60);
            t[14].setFont(f);
            p4.add(t[14]);
            t[15]=new TextField();
            t[15].setEnabled(false);
            
            t[15].setBounds(730, 130, 60, 60);
           t[15].setFont(f);
            p4.add(t[15]);
           
            g3=p4.getGraphics();
       

            p5.setBounds(120,20,1000,1000);
            p5.setBackground(Color.black);
    	   p5.setLayout(null);
    	   add(p5);
    	   l[0]=new Label("SMILYMAN");
   		 l[0].setForeground(Color.cyan);
   		 l[0].setBounds(550, 50, 400, 50);
   		 l[0].setFont(f1);
   		 p5.add(l[0]);
            l[9]=new Label("Hint:to turn aside from a course");
   		 l[9].setForeground(Color.cyan);
   		 l[9].setBounds(500, 600, 600, 50);
   		 l[9].setFont(f);
   		 p5.add(l[9]);
   		 l[10]=new Label("RULE:enter the words in sequence in the boxes");
   		 l[10].setForeground(Color.cyan);
   		 l[10].setBounds(12, 50, 600, 50);
   		 l[10].setFont(f2);
   		 p5.add(l[10]);
   		 b[108]=new Button("A");
   		 b[108].setBounds(550, 250, 50, 50);
   		 b[108].addActionListener(this);
   		p5.add(b[108]);
   		 b[109]=new Button("B");
   		 b[109].setBounds(600, 250, 50, 50);
   		 b[109].addActionListener(this);
   		p5.add(b[109]);
           b[110]=new Button("C");
   		 b[110].setBounds(650, 250, 50, 50);
   		 b[110].addActionListener(this);
   		p5.add(b[110]);
   		 b[111]=new Button("D");
   		 b[111].setBounds(700, 250, 50, 50);
   		 b[111].addActionListener(this);
   		p5.add(b[111]);
           b[112]=new Button("E");
   		 b[112].setBounds(750, 250, 50, 50);
   		 b[112].addActionListener(this);
   		p5.add(b[112]);
   		b[113]=new Button("F");
   		 b[113].setBounds(550, 300, 50, 50);
   		 b[113].addActionListener(this);
   		p5.add(b[113]);
   		 b[114]=new Button("G");
   		 b[114].setBounds(600, 300, 50, 50);
   		 b[114].addActionListener(this);
   		p5.add(b[114]);
          b[115]=new Button("H");
   		 b[115].setBounds(650, 300, 50, 50);
   		 b[115].addActionListener(this);
   		p5.add(b[115]);
   		 b[116]=new Button("I");
   		 b[116].setBounds(700, 300, 50, 50);
   		 b[116].addActionListener(this);
   		p5.add(b[116]);
            b[117]=new Button("J");
   		 b[117].setBounds(750, 300, 50, 50);
   		 b[117].addActionListener(this);
   		p5.add(b[117]);
   		b[118]=new Button("K");
   		 b[118].setBounds(550, 350, 50, 50);
   		 b[118].addActionListener(this);
   		p5.add(b[118]);
   		b[119]=new Button("L");
   		 b[119].setBounds(600, 350, 50, 50);
   		p5.add(b[119]);
         b[120]=new Button("M");
   		 b[120].setBounds(650, 350, 50, 50);
   		p5.add(b[120]);
   		 b[121]=new Button("N");
   		 b[121].setBounds(700, 350, 50, 50);
   		 b[121].addActionListener(this);
   		p5.add(b[121]);
           b[122]=new Button("0");
   		 b[122].setBounds(750, 350, 50, 50);
   		 b[122].addActionListener(this);
   		p5.add(b[122]);
   		b[123]=new Button("P");
   		 b[123].setBounds(550, 400, 50, 50);
   		 b[123].addActionListener(this);
   		p5.add(b[123]);
   		b[124]=new Button("Q");
   		 b[124].setBounds(600, 400, 50, 50);
   		 b[124].addActionListener(this);
   		p5.add(b[124]);
        b[125]=new Button("R");
   		 b[125].setBounds(650, 400, 50, 50);
   		 b[125].addActionListener(this);
   		p5.add(b[125]);
   		 b[126]=new Button("S");
   		 b[126].setBounds(700, 400, 50, 50);
   		 b[126].addActionListener(this);
   		p5.add(b[126]);
          b[127]=new Button("T");
   		 b[127].setBounds(750, 400, 50, 50);
   		 b[127].addActionListener(this);
   		p5.add(b[127]);
   	   b[128]=new Button("U");
   		 b[128].setBounds(550, 450, 50, 50);
   		 b[128].addActionListener(this);
   		p5.add(b[128]);
        b[129]=new Button("V");
   		 b[129].setBounds(600, 450, 50, 50);
   		 b[129].addActionListener(this);
   		p5.add(b[129]);
   		 b[130]=new Button("W");
   		 b[130].setBounds(650, 450, 50, 50);
   		 b[130].addActionListener(this);
   		p5.add(b[130]);
          b[131]=new Button("X");
   		 b[131].setBounds(700, 450, 50, 50);
   		 b[131].addActionListener(this);
   		p5.add(b[131]);
   		b[132]=new Button("Y");
   		 b[132].setBounds(750, 450, 50, 50);
   		 b[132].addActionListener(this);
   		p5.add(b[132]);
   		b[133]=new Button("Z");
   		 b[133].setBounds(650, 500, 50, 50);
   		 b[133].addActionListener(this);
   		p5.add(b[133]);
   		b[134]=new Button("TRY NEXT");
   		b[134].setBounds(650, 650, 70, 50);
   		b[134].addActionListener(this);
   		p5.add(b[134]);
   		
   		
   	
   		 t[16]=new TextField();
   		t[16].setEnabled(false);
        
            t[16].setBounds(550, 130, 60, 60);
            t[16].setFont(f);
            p5.add(t[16]);
            t[17]=new TextField();
            t[17].setEnabled(false);
            
            t[17].setBounds(610, 130, 60, 60);
            t[17].setFont(f);
            p5.add(t[17]);
            t[18]=new TextField();
            t[18].setEnabled(false);
            
            t[18].setBounds(670, 130, 60, 60);
            t[18].setFont(f);
            p5.add(t[18]);
            t[19]=new TextField();
            t[19].setEnabled(false);
            
            t[19].setBounds(730, 130, 60, 60);
           t[19].setFont(f);
            p5.add(t[19]);
            
            g4=p5.getGraphics();
       
            p6.setBounds(120,20,1000,1000);
            p6.setBackground(Color.black);
     	   p6.setLayout(null);
     	   add(p6);
     	   l[0]=new Label("SMILYMAN");
    		 l[0].setForeground(Color.cyan);
    		 l[0].setBounds(550, 50, 400, 50);
    		 l[0].setFont(f1);
    		 p6.add(l[0]);
             l[11]=new Label("Hint:to free from impurities");
    		 l[11].setForeground(Color.cyan);
    		 l[11].setBounds(550, 600, 600, 50);
    		 l[11].setFont(f);
    		 p6.add(l[11]);
    		 l[12]=new Label("RULE:enter the words in sequence in the boxes");
    		 l[12].setForeground(Color.cyan);
    		 l[12].setBounds(12, 50, 600, 50);
    		 l[12].setFont(f2);
    		 p6.add(l[12]);
    		 b[135]=new Button("A");
    		 b[135].setBounds(550, 250, 50, 50);
    		 b[135].addActionListener(this);
    		p6.add(b[135]);
    		 b[136]=new Button("B");
    		 b[136].setBounds(600, 250, 50, 50);
    		 b[136].addActionListener(this);
    		p6.add(b[136]);
            b[137]=new Button("C");
    		 b[137].setBounds(650, 250, 50, 50);
    		 b[137].addActionListener(this);
    		p6.add(b[137]);
    		 b[138]=new Button("D");
    		 b[138].setBounds(700, 250, 50, 50);
    		 b[138].addActionListener(this);
    		p6.add(b[138]);
            b[139]=new Button("E");
    		 b[139].setBounds(750, 250, 50, 50);
    		 b[139].addActionListener(this);
    		p6.add(b[139]);
    		b[140]=new Button("F");
    		 b[140].setBounds(550, 300, 50, 50);
    		 b[140].addActionListener(this);
    		p6.add(b[140]);
    		 b[141]=new Button("G");
    		 b[141].setBounds(600, 300, 50, 50);
    		 b[141].addActionListener(this);
    		p6.add(b[141]);
           b[142]=new Button("H");
    		 b[142].setBounds(650, 300, 50, 50);
    		 b[142].addActionListener(this);
    		p6.add(b[142]);
    		 b[143]=new Button("I");
    		 b[143].setBounds(700, 300, 50, 50);
    		 b[143].addActionListener(this);
    		p6.add(b[143]);
             b[144]=new Button("J");
    		 b[144].setBounds(750, 300, 50, 50);
    		 b[144].addActionListener(this);
    		p6.add(b[144]);
    		b[145]=new Button("K");
    		 b[145].setBounds(550, 350, 50, 50);
    		 b[145].addActionListener(this);
    		p6.add(b[145]);
    		b[146]=new Button("L");
    		 b[146].setBounds(600, 350, 50, 50);
    		p6.add(b[146]);
          b[147]=new Button("M");
    		 b[147].setBounds(650, 350, 50, 50);
    		p6.add(b[147]);
    		 b[148]=new Button("N");
    		 b[148].setBounds(700, 350, 50, 50);
    		 b[148].addActionListener(this);
    		p6.add(b[148]);
            b[149]=new Button("0");
    		 b[149].setBounds(750, 350, 50, 50);
    		 b[149].addActionListener(this);
    		p6.add(b[149]);
    		b[150]=new Button("P");
    		 b[150].setBounds(550, 400, 50, 50);
    		 b[150].addActionListener(this);
    		p6.add(b[150]);
    		b[151]=new Button("Q");
    		 b[151].setBounds(600, 400, 50, 50);
    		 b[151].addActionListener(this);
    		p6.add(b[151]);
         b[152]=new Button("R");
    		 b[152].setBounds(650, 400, 50, 50);
    		 b[152].addActionListener(this);
    		p6.add(b[152]);
    		 b[153]=new Button("S");
    		 b[153].setBounds(700, 400, 50, 50);
    		 b[153].addActionListener(this);
    		p6.add(b[153]);
           b[154]=new Button("T");
    		 b[154].setBounds(750, 400, 50, 50);
    		 b[154].addActionListener(this);
    		p6.add(b[154]);
    	   b[155]=new Button("U");
    		 b[155].setBounds(550, 450, 50, 50);
    		 b[155].addActionListener(this);
    		p6.add(b[155]);
         b[156]=new Button("V");
    		 b[156].setBounds(600, 450, 50, 50);
    		 b[156].addActionListener(this);
    		p6.add(b[156]);
    		 b[157]=new Button("W");
    		 b[157].setBounds(650, 450, 50, 50);
    		 b[157].addActionListener(this);
    		p6.add(b[157]);
           b[158]=new Button("X");
    		 b[158].setBounds(700, 450, 50, 50);
    		 b[158].addActionListener(this);
    		p6.add(b[158]);
    		b[159]=new Button("Y");
    		 b[159].setBounds(750, 450, 50, 50);
    		 b[159].addActionListener(this);
    		p6.add(b[159]);
    		b[160]=new Button("Z");
    		 b[160].setBounds(650, 500, 50, 50);
    		 b[160].addActionListener(this);
    		p6.add(b[160]);
    		b[161]=new Button("TRY NEXT");
    		b[161].setBounds(650, 650, 70, 50);
    		b[161].addActionListener(this);
    		p6.add(b[161]);
    		
    		
    	
    		 t[20]=new TextField();
    		 t[20].setEnabled(false);
             
             t[20].setBounds(550, 130, 60, 60);
             t[20].setFont(f);
             p6.add(t[20]);
             t[21]=new TextField();
             t[21].setEnabled(false);
             
             t[21].setBounds(610, 130, 60, 60);
             t[21].setFont(f);
             p6.add(t[21]);
             t[22]=new TextField();
             t[22].setEnabled(false);
             
             t[22].setBounds(670, 130, 60, 60);
             t[22].setFont(f);
             p6.add(t[22]);
             t[23]=new TextField();
             t[23].setEnabled(false);
             
             t[23].setBounds(730, 130, 60, 60);
            t[23].setFont(f);
             p6.add(t[23]);
             t[24]=new TextField();
             t[24].setEnabled(false);
             
             t[24].setBounds(790, 130, 60, 60);
            t[24].setFont(f);
             p6.add(t[24]);
             g5=p6.getGraphics();
             
             
             p7.setBounds(120,20,1000,1000);
             p7.setBackground(Color.black);
       	   p7.setLayout(null);
       	   add(p7);
       	   l[0]=new Label("SMILYMAN");
      		 l[0].setForeground(Color.cyan);
      		 l[0].setBounds(550, 50, 400, 50);
      		 l[0].setFont(f1);
      		 p7.add(l[0]);
               l[13]=new Label("Hint:to make taunting");
      		 l[13].setForeground(Color.cyan);
      		 l[13].setBounds(550, 600, 600, 50);
      		 l[13].setFont(f);
      		 p7.add(l[13]);
      		 l[14]=new Label("RULE:enter the words in sequence in the boxes");
      		 l[14].setForeground(Color.cyan);
      		 l[14].setBounds(12, 50, 600, 50);
      		 l[14].setFont(f2);
      		 p7.add(l[14]);
      		 b[162]=new Button("A");
      		 b[162].setBounds(550, 250, 50, 50);
      		 b[162].addActionListener(this);
      		p7.add(b[162]);
      		 b[163]=new Button("B");
      		 b[163].setBounds(600, 250, 50, 50);
      		 b[163].addActionListener(this);
      		p7.add(b[163]);
              b[164]=new Button("C");
      		 b[164].setBounds(650, 250, 50, 50);
      		 b[164].addActionListener(this);
      		p7.add(b[164]);
      		 b[165]=new Button("D");
      		 b[165].setBounds(700, 250, 50, 50);
      		 b[165].addActionListener(this);
      		p7.add(b[165]);
              b[166]=new Button("E");
      		 b[166].setBounds(750, 250, 50, 50);
      		 b[166].addActionListener(this);
      		p7.add(b[166]);
      		b[167]=new Button("F");
      		 b[167].setBounds(550, 300, 50, 50);
      		 b[167].addActionListener(this);
      		p7.add(b[167]);
      		 b[168]=new Button("G");
      		 b[168].setBounds(600, 300, 50, 50);
      		 b[168].addActionListener(this);
      		p7.add(b[168]);
             b[169]=new Button("H");
      		 b[169].setBounds(650, 300, 50, 50);
      		 b[169].addActionListener(this);
      		p7.add(b[169]);
      		 b[170]=new Button("I");
      		 b[170].setBounds(700, 300, 50, 50);
      		 b[170].addActionListener(this);
      		p7.add(b[170]);
               b[171]=new Button("J");
      		 b[171].setBounds(750, 300, 50, 50);
      		 b[171].addActionListener(this);
      		p7.add(b[171]);
      		b[172]=new Button("K");
      		 b[172].setBounds(550, 350, 50, 50);
      		 b[172].addActionListener(this);
      		p7.add(b[172]);
      		b[173]=new Button("L");
      		 b[173].setBounds(600, 350, 50, 50);
      		p7.add(b[173]);
            b[174]=new Button("M");
      		 b[174].setBounds(650, 350, 50, 50);
      		p7.add(b[174]);
      		 b[175]=new Button("N");
      		 b[175].setBounds(700, 350, 50, 50);
      		 b[175].addActionListener(this);
      		p7.add(b[175]);
              b[176]=new Button("0");
      		 b[176].setBounds(750, 350, 50, 50);
      		 b[176].addActionListener(this);
      		p7.add(b[176]);
      		b[177]=new Button("P");
      		 b[177].setBounds(550, 400, 50, 50);
      		 b[177].addActionListener(this);
      		p7.add(b[177]);
      		b[178]=new Button("Q");
      		 b[178].setBounds(600, 400, 50, 50);
      		 b[178].addActionListener(this);
      		p7.add(b[178]);
           b[179]=new Button("R");
      		 b[179].setBounds(650, 400, 50, 50);
      		 b[179].addActionListener(this);
      		p7.add(b[179]);
      		 b[180]=new Button("S");
      		 b[180].setBounds(700, 400, 50, 50);
      		 b[180].addActionListener(this);
      		p7.add(b[180]);
             b[181]=new Button("T");
      		 b[181].setBounds(750, 400, 50, 50);
      		 b[181].addActionListener(this);
      		p7.add(b[181]);
      	   b[182]=new Button("U");
      		 b[182].setBounds(550, 450, 50, 50);
      		 b[182].addActionListener(this);
      		p7.add(b[182]);
           b[183]=new Button("V");
      		 b[183].setBounds(600, 450, 50, 50);
      		 b[183].addActionListener(this);
      		p7.add(b[183]);
      		 b[184]=new Button("W");
      		 b[184].setBounds(650, 450, 50, 50);
      		 b[184].addActionListener(this);
      		p7.add(b[184]);
             b[184]=new Button("X");
      		 b[184].setBounds(700, 450, 50, 50);
      		 b[184].addActionListener(this);
      		p7.add(b[184]);
      		b[185]=new Button("Y");
      		 b[185].setBounds(750, 450, 50, 50);
      		 b[185].addActionListener(this);
      		p7.add(b[185]);
      		b[186]=new Button("Z");
      		 b[186].setBounds(650, 500, 50, 50);
      		 b[186].addActionListener(this);
      		p7.add(b[186]);
      		b[187]=new Button("TRY NEXT");
      		b[187].setBounds(650, 650, 70, 50);
      		b[187].addActionListener(this);
      		p7.add(b[187]);
      		
      		
      	
      		 t[25]=new TextField();
      		t[25].setEnabled(false);
            
               t[25].setBounds(550, 130, 60, 60);
               t[25].setFont(f);
               p7.add(t[25]);
               t[26]=new TextField();
               t[26].setEnabled(false);
               
               t[26].setBounds(610, 130, 60, 60);
               t[26].setFont(f);
               p7.add(t[26]);
               t[27]=new TextField();
               t[27].setEnabled(false);
               
               t[27].setBounds(670, 130, 60, 60);
               t[27].setFont(f);
               p7.add(t[27]);
               t[28]=new TextField();
               t[28].setEnabled(false);
               
               t[28].setBounds(730, 130, 60, 60);
              t[28].setFont(f);
               p7.add(t[28]);
               
               g6=p7.getGraphics();
          
               
               p8.setBounds(120,20,1000,1000);
               p8.setBackground(Color.black);
         	   p8.setLayout(null);
         	   add(p8);
         	   l[0]=new Label("SMILYMAN");
        		 l[0].setForeground(Color.cyan);
        		 l[0].setBounds(550, 50, 400, 50);
        		 l[0].setFont(f1);
        		 p8.add(l[0]);
                 l[15]=new Label("Hint:to get with great effort");
        		 l[15].setForeground(Color.cyan);
        		 l[15].setBounds(550, 600, 600, 50);
        		 l[15].setFont(f);
        		 p8.add(l[15]);
        		 l[16]=new Label("RULE:enter the words in sequence in the boxes");
        		 l[16].setForeground(Color.cyan);
        		 l[16].setBounds(12, 50, 600, 50);
        		 l[16].setFont(f2);
        		 p8.add(l[16]);
        		 b[188]=new Button("A");
        		 b[188].setBounds(550, 250, 50, 50);
        		 b[188].addActionListener(this);
        		p8.add(b[188]);
        		 b[189]=new Button("B");
        		 b[189].setBounds(600, 250, 50, 50);
        		 b[189].addActionListener(this);
        		p8.add(b[189]);
                b[190]=new Button("C");
        		 b[190].setBounds(650, 250, 50, 50);
        		 b[190].addActionListener(this);
        		p8.add(b[190]);
        		 b[191]=new Button("D");
        		 b[191].setBounds(700, 250, 50, 50);
        		 b[191].addActionListener(this);
        		p8.add(b[191]);
                b[192]=new Button("E");
        		 b[192].setBounds(750, 250, 50, 50);
        		 b[192].addActionListener(this);
        		p8.add(b[192]);
        		b[193]=new Button("F");
        		 b[193].setBounds(550, 300, 50, 50);
        		 b[193].addActionListener(this);
        		p8.add(b[193]);
        		 b[194]=new Button("G");
        		 b[194].setBounds(600, 300, 50, 50);
        		 b[194].addActionListener(this);
        		p8.add(b[194]);
               b[195]=new Button("H");
        		 b[195].setBounds(650, 300, 50, 50);
        		 b[195].addActionListener(this);
        		p8.add(b[195]);
        		 b[196]=new Button("I");
        		 b[196].setBounds(700, 300, 50, 50);
        		 b[196].addActionListener(this);
        		p8.add(b[196]);
                 b[197]=new Button("J");
        		 b[197].setBounds(750, 300, 50, 50);
        		 b[197].addActionListener(this);
        		p8.add(b[197]);
        		b[198]=new Button("K");
        		 b[198].setBounds(550, 350, 50, 50);
        		 b[198].addActionListener(this);
        		p8.add(b[198]);
        		b[199]=new Button("L");
        		 b[199].setBounds(600, 350, 50, 50);
        		 b[199].addActionListener(this);
        		p8.add(b[199]);
              b[200]=new Button("M");
        		 b[200].setBounds(650, 350, 50, 50);
        		 b[200].addActionListener(this);
        		p8.add(b[200]);
        		 b[201]=new Button("N");
        		 b[201].setBounds(700, 350, 50, 50);
        		 b[201].addActionListener(this);
        		p8.add(b[201]);
                b[202]=new Button("0");
        		 b[202].setBounds(750, 350, 50, 50);
        		 b[202].addActionListener(this);
        		p8.add(b[202]);
        		b[203]=new Button("P");
        		 b[203].setBounds(550, 400, 50, 50);
        		 b[203].addActionListener(this);
        		p8.add(b[203]);
        		b[204]=new Button("Q");
        		 b[204].setBounds(600, 400, 50, 50);
        		 b[204].addActionListener(this);
        		p8.add(b[204]);
             b[205]=new Button("R");
        		 b[205].setBounds(650, 400, 50, 50);
        		 b[205].addActionListener(this);
        		p8.add(b[205]);
        		 b[206]=new Button("S");
        		 b[206].setBounds(700, 400, 50, 50);
        		 b[206].addActionListener(this);
        		p8.add(b[206]);
               b[207]=new Button("T");
        		 b[207].setBounds(750, 400, 50, 50);
        		 b[207].addActionListener(this);
        		p8.add(b[207]);
        	   b[208]=new Button("U");
        		 b[208].setBounds(550, 450, 50, 50);
        		 b[208].addActionListener(this);
        		p8.add(b[208]);
             b[209]=new Button("V");
        		 b[209].setBounds(600, 450, 50, 50);
        		 b[209].addActionListener(this);
        		p8.add(b[209]);
        		 b[210]=new Button("W");
        		 b[210].setBounds(650, 450, 50, 50);
        		 b[210].addActionListener(this);
        		p8.add(b[210]);
               b[211]=new Button("X");
        		 b[211].setBounds(700, 450, 50, 50);
        		 b[211].addActionListener(this);
        		p8.add(b[211]);
        		b[212]=new Button("Y");
        		 b[212].setBounds(750, 450, 50, 50);
        		 b[212].addActionListener(this);
        		p8.add(b[212]);
        		b[213]=new Button("Z");
        		 b[213].setBounds(650, 500, 50, 50);
        		 b[213].addActionListener(this);
        		p8.add(b[213]);
        		b[240]=new Button("TRY NEXT");
        		b[240].setBounds(650, 650, 70, 50);
        		b[240].addActionListener(this);
        		p8.add(b[240]);
        		
        		
        	
        		 t[29]=new TextField();
        		 t[29].setEnabled(false);
                 
                 t[29].setBounds(550, 130, 60, 60);
                 t[29].setFont(f);
                 p8.add(t[29]);
                 t[30]=new TextField();
                 t[30].setEnabled(false);
                 
                 t[30].setBounds(610, 130, 60, 60);
                 t[30].setFont(f);
                 p8.add(t[30]);
                 t[31]=new TextField();
                 t[31].setEnabled(false);
                 
                 t[31].setBounds(670, 130, 60, 60);
                 t[31].setFont(f);
                 p8.add(t[31]);
           
                 g7=p8.getGraphics();
            
                 p9.setBounds(120,20,1000,1000);
                 p9.setBackground(Color.black);
           	   p9.setLayout(null);
           	   add(p9);
           	   l[0]=new Label("SMILYMAN");
          		 l[0].setForeground(Color.cyan);
          		 l[0].setBounds(550, 50, 270, 50);
          		 l[0].setFont(f1);
          		 p9.add(l[0]);
                   l[17]=new Label("Hint: an easily deceived person");
          		 l[17].setForeground(Color.cyan);
          		 l[17].setBounds(500, 600, 600, 50);
          		 l[17].setFont(f);
          		 p9.add(l[17]);
          		 l[18]=new Label("RULE:enter the words in sequence in the boxes");
          		 l[18].setForeground(Color.cyan);
          		 l[18].setBounds(12, 50, 600, 50);
          		 l[18].setFont(f2);
          		 p9.add(l[18]);
          		 b[214]=new Button("A");
          		 b[214].setBounds(550, 250, 50, 50);
          		 b[214].addActionListener(this);
          		p9.add(b[214]);
          		 b[215]=new Button("B");
          		 b[215].setBounds(600, 250, 50, 50);
          		 b[215].addActionListener(this);
          		p9.add(b[215]);
                  b[216]=new Button("C");
          		 b[216].setBounds(650, 250, 50, 50);
          		 b[216].addActionListener(this);
          		p9.add(b[216]);
          		 b[217]=new Button("D");
          		 b[217].setBounds(700, 250, 50, 50);
          		 b[217].addActionListener(this);
          		p9.add(b[217]);
                  b[218]=new Button("E");
          		 b[218].setBounds(750, 250, 50, 50);
          		 b[218].addActionListener(this);
          		p9.add(b[218]);
          		b[219]=new Button("F");
          		 b[219].setBounds(550, 300, 50, 50);
          		 b[219].addActionListener(this);
          		p9.add(b[219]);
          		 b[220]=new Button("G");
          		 b[220].setBounds(600, 300, 50, 50);
          		 b[220].addActionListener(this);
          		p9.add(b[220]);
                 b[221]=new Button("H");
          		 b[221].setBounds(650, 300, 50, 50);
          		 b[221].addActionListener(this);
          		p9.add(b[221]);
          		 b[222]=new Button("I");
          		 b[222].setBounds(700, 300, 50, 50);
          		 b[222].addActionListener(this);
          		p9.add(b[222]);
                   b[223]=new Button("J");
          		 b[223].setBounds(750, 300, 50, 50);
          		 b[223].addActionListener(this);
          		p9.add(b[223]);
          		b[224]=new Button("K");
          		 b[224].setBounds(550, 350, 50, 50);
          		 b[224].addActionListener(this);
          		p9.add(b[224]);
          		b[225]=new Button("L");
          		 b[225].setBounds(600, 350, 50, 50);
          		p9.add(b[225]);
                b[226]=new Button("M");
          		 b[226].setBounds(650, 350, 50, 50);
          		p9.add(b[226]);
          		 b[227]=new Button("N");
          		 b[227].setBounds(700, 350, 50, 50);
          		 b[227].addActionListener(this);
          		p9.add(b[227]);
                  b[228]=new Button("0");
          		 b[228].setBounds(750, 350, 50, 50);
          		 b[228].addActionListener(this);
          		p9.add(b[228]);
          		b[229]=new Button("P");
          		 b[229].setBounds(550, 400, 50, 50);
          		 b[229].addActionListener(this);
          		p9.add(b[229]);
          		b[230]=new Button("Q");
          		 b[230].setBounds(600, 400, 50, 50);
          		 b[230].addActionListener(this);
          		p9.add(b[230]);
               b[231]=new Button("R");
          		 b[231].setBounds(650, 400, 50, 50);
          		 b[231].addActionListener(this);
          		p9.add(b[231]);
          		 b[232]=new Button("S");
          		 b[232].setBounds(700, 400, 50, 50);
          		 b[232].addActionListener(this);
          		p9.add(b[232]);
                 b[233]=new Button("T");
          		 b[233].setBounds(750, 400, 50, 50);
          		 b[233].addActionListener(this);
          		p9.add(b[233]);
          	   b[234]=new Button("U");
          		 b[234].setBounds(550, 450, 50, 50);
          		 b[234].addActionListener(this);
          		p9.add(b[234]);
               b[235]=new Button("V");
          		 b[235].setBounds(600, 450, 50, 50);
          		 b[235].addActionListener(this);
          		p9.add(b[235]);
          		 b[236]=new Button("W");
          		 b[236].setBounds(650, 450, 50, 50);
          		 b[236].addActionListener(this);
          		p9.add(b[236]);
                 b[237]=new Button("X");
          		 b[237].setBounds(700, 450, 50, 50);
          		 b[237].addActionListener(this);
          		p9.add(b[237]);
          		b[238]=new Button("Y");
          		 b[238].setBounds(750, 450, 50, 50);
          		 b[238].addActionListener(this);
          		p9.add(b[238]);
          		b[239]=new Button("Z");
          		 b[239].setBounds(650, 500, 50, 50);
          		 b[239].addActionListener(this);
          		p9.add(b[239]);
          		
          		ImageIcon ic3=new ImageIcon("ist.jpg");
          		JButton b3=new JButton();
          		b3.setIcon(ic3);
          		b3.setBounds(840, 18, 80, 80);
          		p9.add(b3);
          		b3.addActionListener(this);
          		
          		
          	
          		 t[32]=new TextField();
          		t[32].setEnabled(false);
                
                   t[32].setBounds(550, 130, 60, 60);
                   t[32].setFont(f);
                   p9.add(t[32]);
                   t[33]=new TextField();
                   t[33].setEnabled(false);
                   
                   t[33].setBounds(610, 130, 60, 60);
                   t[33].setFont(f);
                   p9.add(t[33]);
                   t[34]=new TextField();
                   t[34].setEnabled(false);
                   
                   t[34].setBounds(670, 130, 60, 60);
                   t[34].setFont(f);
                   p9.add(t[34]);
                   t[35]=new TextField();
                   t[35].setBounds(730, 130, 60, 60);
                  t[35].setFont(f);
                   p9.add(t[35]);
                   
                   g8=p9.getGraphics();
              




        



}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new smilyman();
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b[0]||e.getSource()==b[1]||e.getSource()==b[2]||e.getSource()==b[3]
				||e.getSource()==b[5]||e.getSource()==b[6]||e.getSource()==b[8]
			||e.getSource()==b[9]||e.getSource()==b[10]||e.getSource()==b[11]
			||e.getSource()==b[12]||e.getSource()==b[13]||e.getSource()==b[14]
		||e.getSource()==b[16]||e.getSource()==b[17]||e.getSource()==b[19]||e.getSource()==b[20]
				||e.getSource()==b[21]||e.getSource()==b[22]||e.getSource()==b[23]||e.getSource()==b[24]
		||e.getSource()==b[25])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[18])
		{
			
			t[0].setText(b[18].getLabel());
			
			
			g.drawOval(50, 250, 300, 300);
			g.setColor(Color.CYAN);
		g.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[7])
		{
			t[1].setText(b[7].getLabel());
			g.drawOval(70, 350, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[4])
		{
			t[2].setText(b[4].getLabel());	 
			t[3].setText(b[4].getLabel());
			g.drawOval(310, 350, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(310, 350, 10, 10);
		}
		
		else if(e.getSource()==b[15])
		{
			t[4].setText(b[15].getLabel());	 
			g.drawArc(120, 400, 150, 100, 180, 180);
			
		}
		
		
		if(e.getSource()==b[27]||e.getSource()==b[28]||e.getSource()==b[29]||e.getSource()==b[30]
				||e.getSource()==b[32]||e.getSource()==b[33]||e.getSource()==b[34]
			||e.getSource()==b[36]||e.getSource()==b[37]||e.getSource()==b[38]
			||e.getSource()==b[39]||e.getSource()==b[40]||e.getSource()==b[41]
		||e.getSource()==b[42]||e.getSource()==b[43]||e.getSource()==b[44]||e.getSource()==b[45]
				||e.getSource()==b[46]||e.getSource()==b[47]||e.getSource()==b[49]||e.getSource()==b[50]
		||e.getSource()==b[51]||e.getSource()==b[52])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[48])
		{
			
			t[5].setText(b[48].getLabel());
			
			
			g1.drawOval(50, 250, 300, 300);
			g1.setColor(Color.CYAN);
		g1.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[35])
		{
			t[6].setText(b[35].getLabel());
			
			g1.drawOval(70, 350, 10, 10);
			g1.setColor(Color.BLACK);
			g1.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[31])
		{
			t[7].setText(b[31].getLabel());	 
			
			g1.drawOval(310, 350, 10, 10);
			g1.setColor(Color.BLACK);
			g1.fillOval(310, 350, 10, 10);
			g1.drawArc(120, 400, 150, 100, 180, 180);
		}
		if(e.getSource()==b[54]||e.getSource()==b[55]||e.getSource()==b[56]||e.getSource()==b[57]
				||e.getSource()==b[58]||e.getSource()==b[59]||e.getSource()==b[61]
			||e.getSource()==b[62]||e.getSource()==b[63]||e.getSource()==b[64]
			||e.getSource()==b[65]||e.getSource()==b[66]||e.getSource()==b[67]
		||e.getSource()==b[60]||e.getSource()==b[69]||e.getSource()==b[70]||e.getSource()==b[71]
				||e.getSource()==b[75]||e.getSource()==b[76]||e.getSource()==b[77]||e.getSource()==b[78]
		||e.getSource()==b[79])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[68])
		{
			
			t[8].setText(b[68].getLabel());
			
			
			g2.drawOval(50, 250, 300, 300);
			g2.setColor(Color.CYAN);
		g2.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[74])
		{
			t[9].setText(b[74].getLabel());
			g2.drawOval(70, 350, 10, 10);
			g2.setColor(Color.BLACK);
			g2.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[72])
		{
			t[10].setText(b[72].getLabel());	 
			
			g2.drawOval(310, 350, 10, 10);
			g2.setColor(Color.BLACK);
			g2.fillOval(310, 350, 10, 10);
		}
		
		else if(e.getSource()==b[73])
		{
			t[11].setText(b[73].getLabel());	 
			g2.drawArc(120, 400, 150, 100, 180, 180);
		}
		if(e.getSource()==b[81]||e.getSource()==b[82]||e.getSource()==b[83]||e.getSource()==b[84]
				||e.getSource()==b[85]||e.getSource()==b[86]||e.getSource()==b[87]
			||e.getSource()==b[88]||e.getSource()==b[90]||e.getSource()==b[91]
			||e.getSource()==b[93]||e.getSource()==b[94]||e.getSource()==b[96]
		||e.getSource()==b[97]||e.getSource()==b[99]||e.getSource()==b[100]||e.getSource()==b[101]
				||e.getSource()==b[102]||e.getSource()==b[103]||e.getSource()==b[104]||e.getSource()==b[105]||e.getSource()==b[106])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[98])
		{
			
			t[12].setText(b[98].getLabel());
			
			
			g3.drawOval(50, 250, 300, 300);
			g3.setColor(Color.CYAN);
		g3.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[95])
		{
			t[13].setText(b[95].getLabel());
			g3.drawOval(70, 350, 10, 10);
			g3.setColor(Color.BLACK);
			g3.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[89])
		{
			t[14].setText(b[89].getLabel());	 
			
			g3.drawOval(310, 350, 10, 10);
			g3.setColor(Color.BLACK);
			g3.fillOval(310, 350, 10, 10);
		}
		
		else if(e.getSource()==b[92])
		{
			t[15].setText(b[92].getLabel());	 
			g3.drawArc(120, 400, 150, 100, 180, 180);
		}
		
		
		if(e.getSource()==b[108]||e.getSource()==b[109]||e.getSource()==b[110]||e.getSource()==b[111]
				||e.getSource()==b[113]||e.getSource()==b[114]||e.getSource()==b[115]
			||e.getSource()==b[116]||e.getSource()==b[117]||e.getSource()==b[118]
			||e.getSource()==b[119]||e.getSource()==b[120]||e.getSource()==b[121]
		||e.getSource()==b[122]||e.getSource()==b[123]||e.getSource()==b[124]||e.getSource()==b[126]
				||e.getSource()==b[127]||e.getSource()==b[128]||e.getSource()==b[130]||e.getSource()==b[131]
		||e.getSource()==b[132]||e.getSource()==b[133])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[129])
		{
			
			t[16].setText(b[129].getLabel());
			
			
			g4.drawOval(50, 250, 300, 300);
			g4.setColor(Color.CYAN);
		g4.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[112])
		{
			t[17].setText(b[112].getLabel());
			t[18].setText(b[112].getLabel());
			g4.drawOval(70, 350, 10, 10);
			g4.setColor(Color.BLACK);
			g4.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[125])
		{
			t[19].setText(b[125].getLabel());	 
			
			g4.drawOval(310, 350, 10, 10);
			g4.setColor(Color.BLACK);
			g4.fillOval(310, 350, 10, 10);
			g4.drawArc(120, 400, 150, 100, 180, 180);
		}
		if(e.getSource()==b[135]||e.getSource()==b[136]||e.getSource()==b[137]||e.getSource()==b[138]
				||e.getSource()==b[140]||e.getSource()==b[142]||e.getSource()==b[143]
			||e.getSource()==b[144]||e.getSource()==b[145]||e.getSource()==b[146]
			||e.getSource()==b[147]||e.getSource()==b[148]||e.getSource()==b[149]
		||e.getSource()==b[151]||e.getSource()==b[153]||e.getSource()==b[154]||e.getSource()==b[156]
				||e.getSource()==b[157]||e.getSource()==b[158]||e.getSource()==b[159]||e.getSource()==b[160])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[150])
		{
			
			t[20].setText(b[150].getLabel());
			
			
			g5.drawOval(50, 250, 300, 300);
			g5.setColor(Color.CYAN);
		g5.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[155])
		{
			t[21].setText(b[155].getLabel());
			
			g5.drawOval(70, 350, 10, 10);
			g5.setColor(Color.BLACK);
			g5.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[152])
		{
			t[22].setText(b[152].getLabel());	 
			
			g5.drawOval(310, 350, 10, 10);
			g5.setColor(Color.BLACK);
			
		}
			
		else if(e.getSource()==b[141])
		{
			t[23].setText(b[141].getLabel());	 
			
			g5.drawOval(310, 350, 10, 10);
			g5.setColor(Color.BLACK);
			g5.fillOval(310, 350, 10, 10);
		}
		
		else if(e.getSource()==b[139])
		{
			t[24].setText(b[139].getLabel());	 
			g5.drawArc(120, 400, 150, 100, 180, 180);
		}
		if(e.getSource()==b[162]||e.getSource()==b[164]||e.getSource()==b[165]||e.getSource()==b[167]
				||e.getSource()==b[169]||e.getSource()==b[171]||e.getSource()==b[172]
			||e.getSource()==b[173]||e.getSource()==b[174]||e.getSource()==b[175]
			||e.getSource()==b[176]||e.getSource()==b[177]||e.getSource()==b[178]
		||e.getSource()==b[179]||e.getSource()==b[180]||e.getSource()==b[181]||e.getSource()==b[182]
				||e.getSource()==b[183]||e.getSource()==b[184]||e.getSource()==b[185]||e.getSource()==b[186])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[168])
		{
			
			t[25].setText(b[168].getLabel());
			
			
			g6.drawOval(50, 250, 300, 300);
			g6.setColor(Color.CYAN);
		g6.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[170])
		{
			t[26].setText(b[170].getLabel());
			
			g6.drawOval(70, 350, 10, 10);
			g6.setColor(Color.BLACK);
			g6.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[163])
		{
			t[27].setText(b[163].getLabel());	 
			
			g6.drawOval(310, 350, 10, 10);
			g6.setColor(Color.BLACK);
			g6.fillOval(310, 350, 10, 10);
			
		}
		else if(e.getSource()==b[166])
		{
			t[28].setText(b[166].getLabel());	 
			
			
			g6.drawArc(120, 400, 150, 100, 180, 180);
		}
		
		
		
		
		
		if(e.getSource()==b[188]||e.getSource()==b[189]||e.getSource()==b[190]||e.getSource()==b[191]
				||e.getSource()==b[193]||e.getSource()==b[194]||e.getSource()==b[195]
			||e.getSource()==b[196]||e.getSource()==b[197]||e.getSource()==b[199]
			||e.getSource()==b[200]||e.getSource()==b[201]||e.getSource()==b[202]
		||e.getSource()==b[203]||e.getSource()==b[204]||e.getSource()==b[205]||e.getSource()==b[206]
				||e.getSource()==b[207]||e.getSource()==b[208]||e.getSource()==b[209]||e.getSource()==b[210]
		||e.getSource()==b[211]||e.getSource()==b[212]||e.getSource()==b[213])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[192])
		{
			
			t[29].setText(b[192].getLabel());
			t[31].setText(b[192].getLabel());	 
			
			
			g7.drawOval(50, 250, 300, 300);
			g7.setColor(Color.CYAN);
			g7.fillOval(50, 250, 300, 300);
			g7.drawOval(70, 350, 10, 10);
			g7.setColor(Color.BLACK);
			g7.fillOval(70, 350, 10, 10);
         g7.drawOval(310, 350, 10, 10);
			g7.setColor(Color.BLACK);
			g7.fillOval(310, 350, 10, 10);
			
			 
		}
		else if(e.getSource()==b[198])
		{
			t[30].setText(b[198].getLabel());
			
			g7.drawArc(120, 400, 150, 100, 180, 180);
		}
		
		if(e.getSource()==b[214]||e.getSource()==b[215]||e.getSource()==b[216]||e.getSource()==b[219]
				||e.getSource()==b[220]||e.getSource()==b[221]||e.getSource()==b[222]
			||e.getSource()==b[223]||e.getSource()==b[224]||e.getSource()==b[225]
			||e.getSource()==b[226]||e.getSource()==b[227]||e.getSource()==b[228]
		||e.getSource()==b[230]||e.getSource()==b[231]||e.getSource()==b[232]||e.getSource()==b[233]
			||e.getSource()==b[235]||e.getSource()==b[236]||e.getSource()==b[237]
		||e.getSource()==b[238]||e.getSource()==b[239])
			{
			JOptionPane.showMessageDialog(this, "WRONG KEY");
			}
		else if(e.getSource()==b[217])
		{
			
			t[32].setText(b[217].getLabel());
			
			
			g8.drawOval(50, 250, 300, 300);
			g8.setColor(Color.CYAN);
		g8.fillOval(50, 250, 300, 300);
			 
		}
		else if(e.getSource()==b[234])
		{
			t[33].setText(b[234].getLabel());
			g8.drawOval(70, 350, 10, 10);
			g8.setColor(Color.BLACK);
			g8.fillOval(70, 350, 10, 10);
		}
		else if(e.getSource()==b[229])
		{
			t[34].setText(b[229].getLabel());	 
			
			g8.drawOval(310, 350, 10, 10);
			g8.setColor(Color.BLACK);
			g8.fillOval(310, 350, 10, 10);
		}
		
		else if(e.getSource()==b[218])
		{
			t[35].setText(b[166].getLabel());	 
			g8.drawArc(120, 400, 150, 100, 180, 180);
		}
		
		
		else	if(e.getSource() ==b[26])
		{
			p1.setVisible(false);
			p2.setVisible(true);
		}
		else if(e.getSource() ==b[53])
		{
			p2.setVisible(false);
			p3.setVisible(true);
		}
		else	if(e.getSource() ==b[80])
		{
			p3.setVisible(false);
			p4.setVisible(true);
		}
		else if(e.getSource() ==b[107])
		{
			p4.setVisible(false);
			p5.setVisible(true);
		}
		else if(e.getSource() ==b[134])
		{
			p5.setVisible(false);
			p6.setVisible(true);
		}
		else if(e.getSource() ==b[161])
		{
			p6.setVisible(false);
			p7.setVisible(true);
		}
		else if(e.getSource() ==b[187])
		{
			p7.setVisible(false);
			p8.setVisible(true);
		}
		else if(e.getSource()==b[240])
		{
			p8.setVisible(false);
			p9.setVisible(true);
		}
		else if(e.getSource() ==b3)
		{
			p1.setVisible(true);
		}
		else if(e.getSource()==b1)
		{
			new hsg();
		}
		else if(e.getSource()==b2)
		{
			new game();
		}
		
		
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

}