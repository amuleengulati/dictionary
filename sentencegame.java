import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sentencegame  extends JFrame implements ActionListener,WindowListener,ItemListener{
		Font f=new Font("",1,40);
		Font f1=new Font("",1,20);
		Font f2=new Font("monotype corsiva",1,18);
		ImageIcon ic=new ImageIcon("try.jpg");		
		ImageIcon ic1=new ImageIcon("home1.jpg");
		ImageIcon ic2=new ImageIcon("hsg1.jpg");
		ImageIcon ic3=new ImageIcon("bcksg.jpg");
	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
	ImagePanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30;
	JRadioButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76,c77,c78,c79,c80,c81,c82,c83,c84,c85,c86,c87,c88,c89,c90,c91,c92,c93,c94,c95,c96,c97,c98,c99,c100,c101,c102,c103,c104,c105,c106,c107,c108,c109,c110,c111,c112,c113,c114,c115,c116,c117,c118,c119,c120;
	ImagePanel p=new ImagePanel("sgbkgd2.jpg");
	Label l[]=new Label[30];
	Label lb[]=new Label[18];
	JButton bh,bhm,bb;
	CountTimer t;
	int i=0;
ImageIcon tb=new ImageIcon("trybttn.jpg");	 
	public  sentencegame ()
	{
		
		p.setBounds(180, 20, 1400, 1400);
		add(p);
		
		setLayout(null);
		this.setVisible(true);
		this.setSize(1400,1400);
		this.setTitle("MY GAME");
		this.addWindowListener(this);
		
		  p1=new ImagePanel("sgpanel.jpg");
          p1.setBounds(0,390, 1000, 1000);
          p.add(p1);
          p1.setLayout(null);
       lb[0]=new Label("S");
       lb[0].setFont(f);
       p.add(lb[0]);
       for(int i=0;i<=160;i++)
       {
    	   lb[0].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-17);
    	   }
    	   catch(Exception e){}
       }
       lb[1]=new Label("E");
       lb[1].setFont(f);
       p.add(lb[1]);
       for(int i=0;i<=190;i++)
       {
    	   lb[1].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-16);
    	   }
    	   catch(Exception e){}
       }
       lb[2]=new Label("N");
       lb[2].setFont(f);
       p.add(lb[2]);
       for(int i=0;i<=220;i++)
       {
    	   lb[2].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-15);
    	   }
    	   catch(Exception e){}
       }
       lb[3]=new Label("T");
       lb[3].setFont(f);
       p.add(lb[3]);
       for(int i=0;i<=250;i++)
       {
    	   lb[3].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-14);
    	   }
    	   catch(Exception e){}
       }
       lb[4]=new Label("E");
       lb[4].setFont(f);
       p.add(lb[4]);
       for(int i=0;i<=280;i++)
       {
    	   lb[4].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-13);
    	   }
    	   catch(Exception e){}
       }
       lb[5]=new Label("N");
       lb[5].setFont(f);
       p.add(lb[5]);
       for(int i=0;i<=310;i++)
       {
    	   lb[5].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-12);
    	   }
    	   catch(Exception e){}
       }
       lb[6]=new Label("C");
       lb[6].setFont(f);
       p.add(lb[6]);
       for(int i=0;i<=340;i++)
       {
    	   lb[6].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-11);
    	   }
    	   catch(Exception e){}
       }
       lb[7]=new Label("E");
       lb[7].setFont(f);
       p.add(lb[7]);
       for(int i=0;i<=370;i++)
       {
    	   lb[7].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-10);
    	   }
    	   catch(Exception e){}
       }
       lb[8]=new Label("C");
       lb[8].setFont(f);
       p.add(lb[8]);
       for(int i=0;i<=450;i++)
       {
    	   lb[8].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-9);
    	   }
    	   catch(Exception e){}
       }
       lb[9]=new Label("O");
       lb[9].setFont(f);
       p.add(lb[9]);
       for(int i=0;i<=480;i++)
       {
    	   lb[9].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-8);
    	   }
    	   catch(Exception e){}
       }
       lb[10]=new Label("M");
       lb[10].setFont(f);
       p.add(lb[10]);
       for(int i=0;i<=510;i++)
       {
    	   lb[10].setBounds(i,40,35,40);
    	   try{
    		   Thread.sleep(-7);
    	   }
    	   catch(Exception e){}
       }
       
       lb[11]=new Label("P");
       lb[11].setFont(f);
       p.add(lb[11]);
       for(int i=0;i<=545;i++)
       {
    	   lb[11].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-6);
    	   }
    	   catch(Exception e){}
       }
       
       lb[12]=new Label("L");
       lb[12].setFont(f);
       p.add(lb[12]);
       for(int i=0;i<=575;i++)
       {
    	   lb[12].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-5);
    	   }
    	   catch(Exception e){}
       }
       
       lb[13]=new Label("E");
       lb[13].setFont(f);
       p.add(lb[13]);
       for(int i=0;i<=605;i++)
       {
    	   lb[13].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-4);
    	   }
    	   catch(Exception e){}
       }
       lb[14]=new Label("T");
       lb[14].setFont(f);
       p.add(lb[14]);
       for(int i=0;i<=635;i++)
       {
    	   lb[14].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(-3);
    	   }
    	   catch(Exception e){}
       }
       lb[15]=new Label("I");
       lb[15].setFont(f);
       p.add(lb[15]);
       for(int i=0;i<=665;i++)
       {
    	   lb[15].setBounds(i,40,15,40);
    	   try{
    		   Thread.sleep(-2);
    	   }
    	   catch(Exception e){}
       }
       lb[16]=new Label("O");
       lb[16].setFont(f);
       p.add(lb[16]);
       for(int i=0;i<=680;i++)
       {
    	   lb[16].setBounds(i,40,35,40);
    	   try{
    		   Thread.sleep(-1);
    	   }
    	   catch(Exception e){}
       }
       lb[17]=new Label("N");
       lb[17].setFont(f);
       p.add(lb[17]);
       for(int i=0;i<=715;i++)
       {
    	   lb[17].setBounds(i,40,30,40);
    	   try{
    		   Thread.sleep(0);
    	   }
    	   catch(Exception e){}
       }
       
       
       
       
          b1=new JButton();
          b1.setIcon(tb);
          b1.setBorder(null);
          b1.setBounds(435,0,95,93);
         
          b1.setVisible(false);
             p1.add(b1);
             l2=new Label(" Question 1.  The ______ man paid for my ticket.");
             l2.setBounds(50,120,500,30);
             p1.add(l2);
             l2.setFont(f1);
             c1=new JRadioButton(" better");
             
             c1.setBounds(70,200,100,30);
            p1.add(c1);
             c1.setFont(f2);
             c1.addItemListener(this);
             c2=new JRadioButton(" angry");
             c2.setBounds(520,200,110,30);
             p1.add(c2);
             c2.setFont(f2);
             c2.addItemListener(this);
             c3=new JRadioButton(" kind");
             c3.setBounds(70,285,100,30);
             p1.add(c3);
             c3.setFont(f2);
             c3.addItemListener(this);
             c4=new JRadioButton(" funny");
             c4.setBounds(520,285,140,30);
             p1.add(c4);
             c4.setFont(f2);
             c4.addItemListener(this);
            
             
             p2=new ImagePanel("sgpanel.jpg");
             p2.setBounds(0,390,1000,1000);
            
            p.add(p2);
             p2.setLayout(null);
             p2.setVisible(false);
             b2=new JButton();
             b2.setIcon(tb);
             b2.setBorder(null);
             b2.setBounds(435,0,95,93);
             b2.setVisible(false);
             p2.add(b2);
             l3=new Label("Question 2. The baby bird was ___ by its mother.");
             p2.add(l3);
             l3.setBounds(50,120,500,30);
             l3.setFont(f1);
             c5=new JRadioButton(" abandoning");
           
             c5.setBounds(70,200,100,30);
              p2.add(c5);
             c5.setFont(f2);
             c5.addItemListener(this);
             c6=new JRadioButton(" abandoned");
             
             c6.setBounds(520,200,110,30);
             p2.add(c6);
             c6.setFont(f2);
             c6.addItemListener(this);
             c7=new JRadioButton(" abandons");
             
             c7.setBounds(70,285,100,30);
             p2.add(c7);
             c7.setFont(f2);
             c7.addItemListener(this);
             c8=new JRadioButton(" abandon");
             
             c8.setBounds(520,285,140,30);
             p2.add(c8);
             c8.setFont(f2);
             c8.addItemListener(this);
             
            
             
             p3=new ImagePanel("sgpanel.jpg");
             p3.setBounds(0,390,1000,1000);
             
             p.add(p3);
             p3.setLayout(null);
             p3.setVisible(false);
             b3=new JButton();
             b3.setIcon(tb);
             b3.setBorder(null);
             b3.setBounds(435,0,95,93);
             b3.setVisible(false);
             p3.add(b3);
             l4=new Label("Question 3. She said that you have ___ forgiven.");
             p3.add(l4);
             l4.setBounds(50,120,500,30);
             l4.setFont(f1);
             c9=new JRadioButton(" been");
             
             c9.setBounds(70,200,100,30);
             p3.add(c9);
             c9.setFont(f2);
             c9.addItemListener(this);
             c10=new JRadioButton(" being");
             
             c10.setBounds(520,200,110,30);
             p3.add(c10);
             c10.setFont(f2);
             c10.addItemListener(this);
             c11=new JRadioButton(" be");
            
             c11.setBounds(70,285,100,30);
             p3.add(c11);
             c11.setFont(f2);
             c11.addItemListener(this);
             c12=new JRadioButton(" were");
            
             c12.setBounds(520,285,140,30);
             p3.add(c12);
             c12.setFont(f2);
             c12.addItemListener(this);
            
            
            
             p4=new ImagePanel("sgpanel.jpg");
             p4.setBounds(0,390,1000,1000);
            
             p.add(p4);
             p4.setLayout(null);
             p4.setVisible(false);
             b4=new JButton();
             b4.setIcon(tb);
            b4.setBorder(null);
             b4.setBounds(435,0,95,93);
             b4.setVisible(false);
             p4.add(b4);
             l5=new Label("Question 4. All that I can say is that I tried my ___.");
             p4.add(l5);
             l5.setBounds(50,120,500,30);
             l5.setFont(f1);
             c13=new JRadioButton(" best");
             c13.setBounds(70,200,100,30);
             p4.add(c13);
             c13.setFont(f2);
             c13.addItemListener(this);
             c14=new JRadioButton(" good");
             
             c14.setBounds(520,200,110,30);
             p4.add(c14);
             c14.setFont(f2);
             c14.addItemListener(this);
             c15=new JRadioButton(" better");
             
             c15.setBounds(70,285,100,30);
             p4.add(c15);
             c15.setFont(f2);
             c15.addItemListener(this);
             c16=new JRadioButton(" more");
             
             c16.setBounds(520,285,140,30);
             p4.add(c16);
             c16.setFont(f2);
             c16.addItemListener(this);
             
             p5=new ImagePanel("sgpanel.jpg");
             p5.setBounds(0,390,1000,1000);
             
             p.add(p5);
             p5.setLayout(null);
             p5.setVisible(false);
             b5=new JButton();
             b5.setIcon(tb);
             b5.setBorder(null);
             b5.setBounds(435,0,95,93);
             b5.setVisible(false);
             p5.add(b5);
             l6=new Label("Question 5. ___ you been sitting there all day?");
             p5.add(l6);
             l6.setBounds(50,120,500,30);
             l6.setFont(f1);
             c17=new JRadioButton(" were");
            
             c17.setBounds(70,200,100,30);
             p5.add(c17);
             c17.setFont(f2);
             c17.addItemListener(this);
             c18=new JRadioButton(" has");
            
             c18.setBounds(520,200,110,30);
             p5.add(c18);
             c18.setFont(f2);
             c18.addItemListener(this);
             c19=new JRadioButton(" are");
            
             c19.setBounds(70,285,100,30);
             p5.add(c19);
             c19.setFont(f2);
             c19.addItemListener(this);
             c20=new JRadioButton(" have");
             
             c20.setBounds(520,285,140,30);
             p5.add(c20);
             c20.setFont(f2);
             c20.addItemListener(this);
             p6=new ImagePanel("sgpanel.jpg");
             p6.setBounds(0,390,1000,1000);
             
             p.add(p6);
             p6.setLayout(null);
             p6.setVisible(false);
             b6=new JButton();
             b6.setIcon(tb);
             b6.setBorder(null);
             b6.setBounds(435,0,95,93);
             b6.setVisible(false);
             p6.add(b6);
             l7=new Label("Question 6. Do you still ___ around here??");
             p6.add(l7);
             l7.setBounds(50,120,500,30);
             l7.setFont(f1);
             c21=new JRadioButton(" live");
             
             c21.setBounds(70,200,100,30);
             p6.add(c21);
             c21.setFont(f2);
             c21.addItemListener(this);
             c22=new JRadioButton(" living");
             
             c22.setBounds(520,200,110,30);
             p6.add(c22);
             c22.setFont(f2);
             c22.addItemListener(this);
             c23=new JRadioButton(" lives");
             
             c23.setBounds(70,285,100,30);
             p6.add(c23);
             c23.setFont(f2);
             c23.addItemListener(this);
             c24=new JRadioButton(" lived");
             
             c24.setBounds(520,285,140,30);
             p6.add(c24);
             c24.setFont(f2);
             c24.addItemListener(this);
            
             
             p7=new ImagePanel("sgpanel.jpg");
             p7.setBounds(0,390,1000,1000);
             
             p.add(p7);
             p7.setLayout(null);
             p7.setVisible(false);
             b7=new JButton();
             b7.setIcon(tb);
             b7.setBorder(null);
             b7.setBounds(435,0,95,93);
             b7.setVisible(false);
             p7.add(b7);
             l8=new Label("Question 7. There were too ___ people on the train.");
             p7.add(l8);
             l8.setBounds(50,120,500,30);
             l8.setFont(f1);
             c25=new JRadioButton(" much");
             
             c25.setBounds(70,200,100,30);
             p7.add(c25);
             c25.setFont(f2);
             c25.addItemListener(this);
             c26=new JRadioButton(" of");
             
             c26.setBounds(520,200,110,30);
             p7.add(c26);
             c26.setFont(f2);
             c26.addItemListener(this);
             c27=new JRadioButton(" many");
            
             c27.setBounds(70,285,100,30);
             p7.add(c27);
             c27.setFont(f2);
             c27.addItemListener(this);
             c28=new JRadioButton(" so");
             
             c28.setBounds(520,285,140,30);
             p7.add(c28);
             c28.setFont(f2);
             c28.addItemListener(this);
             
             
             
             p8=new ImagePanel("sgpanel.jpg");
             p8.setBounds(0,390,1000,1000);
            
             p.add(p8);
             p8.setLayout(null);
             p8.setVisible(false);
             b8=new JButton();
             b8.setIcon(tb);
             b8.setBorder(null);
             b8.setBounds(435,0,95,93);
             b8.setVisible(false);
             p8.add(b8);
             l9=new Label("Question 8. I'm going to the conference by ___.");
             p8.add(l9);
             l9.setBounds(50,120,500,30);
             l9.setFont(f1);
             c29=new JRadioButton(" my");
             
             c29.setBounds(70,200,100,30);
             p8.add(c29);
             c29.setFont(f2);
             c29.addItemListener(this);
             c30=new JRadioButton(" myself");
            
             c30.setBounds(520,200,110,30);
             p8.add(c30);
             c30.setFont(f2);
             c30.addItemListener(this);
             c31=new JRadioButton(" me");
             
             c31.setBounds(70,285,100,30);
             p8.add(c31);
             c31.setFont(f2);
             c31.addItemListener(this);
             c32=new JRadioButton(" alone");
           
             c32.setBounds(520,285,140,30);
             p8.add(c32);
             c32.setFont(f2);
             c32.addItemListener(this);
            
             
             
             p9=new ImagePanel("sgpanel.jpg");
             p9.setBounds(0,390,1000,1000);
            
             p.add(p9);
             p9.setLayout(null);
             p9.setVisible(false);
             b9=new JButton();
             b9.setIcon(tb);
             b9.setBorder(null);
             b9.setBounds(435,0,95,93);
             b9.setVisible(false);
             p9.add(b9);
             l10=new Label("Question 9. Thanks for making such an interesting ___.");
             p9.add(l10);
             l10.setBounds(50,120,500,30);
             l10.setFont(f1);
             c33=new JRadioButton(" speech");
             
             c33.setBounds(70,200,100,30);
             p9.add(c33);
             c33.setFont(f2);
             c33.addItemListener(this);
             c34=new JRadioButton(" speak");
             
             c34.setBounds(520,200,110,30);
             p9.add(c34);
             c34.setFont(f2);
             c34.addItemListener(this);
             c35=new JRadioButton(" spoke");
            
             c35.setBounds(70,285,100,30);
             p9.add(c35);
             c35.setFont(f2);
             c35.addItemListener(this);
             c36=new JRadioButton(" speaking");
             
             c36.setBounds(520,285,140,30);
             p9.add(c36);
             c36.setFont(f2);
             c36.addItemListener(this);
             
             
             
             p10=new ImagePanel("sgpanel.jpg");
             p10.setBounds(0,390,1000,1000);
            
             p.add(p10);
             p10.setLayout(null);
             p10.setVisible(false);
             b10=new JButton();
             b10.setIcon(tb);
             b10.setBorder(null);
             b10.setBounds(435,0,95,93);
             b10.setVisible(false);
             p10.add(b10);
             l11=new Label("Question 10. The mouse was ___ by the cat.");
             p10.add(l11);
             l11.setBounds(50,120,500,30);
             l11.setFont(f1);
             c37=new JRadioButton(" catch");
             
             c37.setBounds(70,200,100,30);
             p10.add(c37);
             c37.setFont(f2);
             c37.addItemListener(this);
             c38=new JRadioButton(" catching");
            
             c38.setBounds(520,200,110,30);
             p10.add(c38);
             c38.setFont(f2);
             c38.addItemListener(this);
             c39=new JRadioButton(" caught");
             
             c39.setBounds(70,285,100,30);
             p10.add(c39);
             c39.setFont(f2);
             c39.addItemListener(this);
             c40=new JRadioButton(" catches");
            
             c40.setBounds(520,285,140,30);
             p10.add(c40);
             c40.setFont(f2);
             c40.addItemListener(this);
             
             
             
             p11=new ImagePanel("sgpanel.jpg");
             p11.setBounds(0,390,1000,1000);
             p.add(p11);
             p11.setLayout(null);
             p11.setVisible(false);
             b11=new JButton();
             b11.setIcon(tb);
             b11.setBorder(null);
             b11.setBounds(435,0,95,93);
             b11.setVisible(false);
             p11.add(b11);
             l12=new Label("Question 11.Humans must____in order to___.");
             p11.add(l12);
             l12.setBounds(50,120,500,30);
             l12.setFont(f1);
             c41=new JRadioButton(" drive,travel");
             c41.setBounds(70,200,100,30);
             p11.add(c41);
             c41.setFont(f2);
             c41.addItemListener(this);
             c42=new JRadioButton(" shop,spend");
             
             c42.setBounds(520,200,110,30);
             p11.add(c42);
             c42.setFont(f2);
             c42.addItemListener(this);
             c43=new JRadioButton(" breathe,live");
             c43.setBounds(70,285,100,30);
             p11.add(c43);
             c43.setFont(f2);
             c43.addItemListener(this);
             c44=new JRadioButton(" flight,win");
             c44.setBounds(520,285,140,30);
             p11.add(c44);
             c44.setFont(f2);
             c44.addItemListener(this);
             
             
             p12=new ImagePanel("sgpanel.jpg");
             p12.setBounds(0,390,1000,1000);
             p.add(p12);
             p12.setLayout(null);
             p12.setVisible(false);
             b12=new JButton();
             b12.setIcon(tb);
             b12.setBorder(null);
             b12.setBounds(435,0,95,93);
             b12.setVisible(false);
             p12.add(b12);
             l13=new Label("Question 12.Elephants are ______.Ants are______.");
             p12.add(l13);
             l13.setBounds(50,120,500,30);
             l13.setFont(f1);
             c45=new JRadioButton(" big,large");
             c45.setBounds(70,200,100,30);
             p12.add(c45);
             c45.setFont(f2);
             c45.addItemListener(this);
             c46=new JRadioButton(" small,big");
             c46.setBounds(520,200,110,30);
             p12.add(c46);
             c46.setFont(f2);
             c46.addItemListener(this);
             c47=new JRadioButton(" tiny,small");
             c47.setBounds(70,285,100,30);
             p12.add(c47);
             c47.setFont(f2);
             c47.addItemListener(this);
             c48=new JRadioButton(" huge,tiny");
             c48.setBounds(520,285,140,30);
             p12.add(c48);
             c48.setFont(f2);
             c48.addItemListener(this);
             
             p13=new ImagePanel("sgpanel.jpg");
             p13.setBounds(0,390,1000,1000);
             p.add(p13);
             p13.setLayout(null);
             p13.setVisible(false);
             b13=new JButton();
             b13.setIcon(tb);
             b13.setBorder(null);
             b13.setBounds(435,0,95,93);
             b13.setVisible(false);
             p13.add(b13);
             l14=new Label("Question 13.___Is your brother?He is still sick.");
             p13.add(l14);
             l14.setBounds(50,120,500,30);
             l14.setFont(f1);
             c49=new JRadioButton(" why");
             c49.setBounds(70,200,100,30);
             p13.add(c49);
             c49.setFont(f2);
             c49.addItemListener(this);
             c50=new JRadioButton(" how");
             c50.setBounds(520,200,110,30);
             p13.add(c50);
             c50.setFont(f2);
             c50.addItemListener(this);
             c51=new JRadioButton(" where");
             c51.setBounds(70,285,100,30);
             p13.add(c51);
             c51.setFont(f2);
             c51.addItemListener(this);
             c52=new JRadioButton(" what");
             c52.setBounds(520,285,140,30);
             p13.add(c52);
             c52.setFont(f2);
             c52.addItemListener(this);
             p14=new ImagePanel("sgpanel.jpg");
             p14.setBounds(0,390,1000,1000);
             
             p.add(p14);
             p14.setLayout(null);
             p14.setVisible(false);
             b14=new JButton();
             b14.setIcon(tb);
             b14.setBorder(null);
             b14.setBounds(435,0,95,93);
             b14.setVisible(false);
             p14.add(b14);
             l15=new Label("Question 14.It's too long.Can you______it?");
             p14.add(l15);
             l15.setBounds(50,120,500,30);
             l15.setFont(f1);
             c53=new JRadioButton(" shorted");
             c53.setBounds(70,200,100,30);
             p14.add(c53);
             c53.setFont(f2);
             c53.addItemListener(this);
             c54=new JRadioButton(" shorts");
             c54.setBounds(520,200,110,30);
             p14.add(c54);
             c54.setFont(f2);
             c54.addItemListener(this);
             c55=new JRadioButton(" shorten");
             c55.setBounds(70,285,100,30);
             p14.add(c55);
             c55.setFont(f2);
             c55.addItemListener(this);
             c56=new JRadioButton(" shorting");
             
             c56.setBounds(520,285,140,30);
             p14.add(c56);
             c56.setFont(f2);
             c56.addItemListener(this);
             
             p15=new ImagePanel("sgpanel.jpg");
             p15.setBounds(0,390,1000,1000);
             p.add(p15);
             p15.setLayout(null);
             p15.setVisible(false);
             b15=new JButton();
             b15.setIcon(tb);
             b15.setBorder(null);
             b15.setBounds(435,0,95,93);
             b15.setVisible(false);
             p15.add(b15);
             l16=new Label("Question 15.______house is stressful.");
             p15.add(l16);
             l16.setBounds(50,120,500,30);
             l16.setFont(f1);
             c57=new JRadioButton(" move");
             c57.setBounds(70,200,100,30);
             p15.add(c57);
             c57.setFont(f2);
             c57.addItemListener(this);
             c58=new JRadioButton(" moving");
             c58.setBounds(520,200,110,30);
             p15.add(c58);
             c58.setFont(f2);
             c58.addItemListener(this);
             c59=new JRadioButton(" moves");
             c59.setBounds(70,285,100,30);
             p15.add(c59);
             c59.setFont(f2);
             c59.addItemListener(this);
             c60=new JRadioButton(" moved");
             c60.setBounds(520,285,140,30);
             p15.add(c60);
             c60.setFont(f2);
             c60.addItemListener(this);
             p16=new ImagePanel("sgpanel.jpg");
             p16.setBounds(0,390,1000,1000);
             p.add(p16);
             p16.setLayout(null);
             p16.setVisible(false);
             b16=new JButton();
             b16.setBounds(435,0,95,93);
             b16.setVisible(false);
             p16.add(b16);
             l17=new Label("Question 16.It's______today than yesterday");
             p16.add(l17);
             l17.setBounds(50,120,500,30);
             l17.setFont(f1);
             c61=new JRadioButton(" most sunny");
             c61.setBounds(70,200,100,30);
             p16.add(c61);
             c61.setFont(f2);
             c61.addItemListener(this);
             c62=new JRadioButton(" sunnier");
             c62.setBounds(520,200,110,30);
             p16.add(c62);
             c62.setFont(f2);
             c62.addItemListener(this);
             c63=new JRadioButton(" sunny");
             c63.setBounds(70,285,100,30);
             p16.add(c63);
             c63.setFont(f2);
             c63.addItemListener(this);
             c64=new JRadioButton(" more sunnier");
             c64.setBounds(520,285,140,30);
             p16.add(c64);
             c64.setFont(f2);
             c64.addItemListener(this);
             
             
             p17=new ImagePanel("sgpanel.jpg");
             p17.setBounds(0,390,1000,1000);
             p.add(p17);
             p17.setLayout(null);
             p17.setVisible(false);
             b17=new JButton();
             b17.setIcon(tb);
             b17.setBorder(null);
             b17.setBounds(435,0,95,93);
             b17.setVisible(false);
             p17.add(b17);
             l18=new Label("Question 17.Stop_____all the water");
             p17.add(l18);
             l18.setBounds(50,120,500,30);
             l18.setFont(f1);
             c65=new JRadioButton(" use");
             c65.setBounds(70,200,100,30);
             p17.add(c65);
             c65.setFont(f2);
             c65.addItemListener(this);
             c66=new JRadioButton(" uses");
             c66.setBounds(520,200,110,30);
             p17.add(c66);
             c66.setFont(f2);
             c66.addItemListener(this);
             c67=new JRadioButton(" using");
             c67.setBounds(70,285,100,30);
             p17.add(c67);
             c67.setFont(f2);
             c67.addItemListener(this);
             c68=new JRadioButton(" used");
             c68.setBounds(520,285,140,30);
             p17.add(c68);
             c68.setFont(f2);
             c68.addItemListener(this);
             
             
             
             p18=new ImagePanel("sgpanel.jpg");
             p18.setBounds(0,390,1000,1000);
             p.add(p18);
             p18.setLayout(null);
             p18.setVisible(false);
             b18=new JButton();
             b18.setBounds(435,0,95,93);
             b18.setVisible(false);
             p18.add(b18);
             l19=new Label("Question 18.All our schools___a diverse enviornment");
             p18.add(l19);
             l19.setBounds(50,120,500,30);
             l19.setFont(f1);
             c69=new JRadioButton(" promoting");
             c69.setBounds(70,200,100,30);
             p18.add(c69);
             c69.setFont(f2);
             c69.addItemListener(this);
             c70=new JRadioButton(" promote");
             c70.setBounds(520,200,110,30);
             p18.add(c70);
             c70.setFont(f2);
             c70.addItemListener(this);
             c71=new JRadioButton(" promotes");
             c71.setBounds(70,285,100,30);
             p18.add(c71);
             c71.setFont(f2);
             c71.addItemListener(this);
             c72=new JRadioButton(" promoted");
             c72.setBounds(520,285,140,30);
             p18.add(c72);
             c72.setFont(f2);
             c72.addItemListener(this);
             
             
             p19=new ImagePanel("sgpanel.jpg");
             p19.setBounds(0,390,1000,1000);
             p.add(p19);
             p19.setLayout(null);
             p19.setVisible(false);
             b19=new JButton();
             b19.setIcon(tb);
             b19.setBorder(null);
             b19.setBounds(435,0,95,93);
             b19.setVisible(false);
             p19.add(b19);
             l20=new Label("Question 19.Please write_____.");
             p19.add(l20);
             l20.setBounds(50,120,500,30);
             l20.setFont(f1);
             c73=new JRadioButton(" clear");
             c73.setBounds(70,200,100,30);
             p19.add(c73);
             c73.setFont(f2);
             c73.addItemListener(this);
             c74=new JRadioButton(" clearing");
             c74.setBounds(520,200,110,30);
             p19.add(c74);
             c74.setFont(f2);
             c74.addItemListener(this);
             c75=new JRadioButton(" cleared");
             
             c75.setBounds(70,285,100,30);
             p19.add(c75);
             c75.setFont(f2);
             c75.addItemListener(this);
             c76=new JRadioButton(" clearly");
             
             c76.setBounds(520,285,140,30);
             p19.add(c76);
             c76.setFont(f2);
             c76.addItemListener(this);
             
             
             p20=new ImagePanel("sgpanel.jpg");
             p20.setBounds(0,390,1000,1000);
             
             p.add(p20);
             p20.setLayout(null);
             p20.setVisible(false);
             b20=new JButton();
             b20.setIcon(tb);
             b20.setBorder(null);
             b20.setBounds(435,0,95,93);
             b20.setVisible(false);
             p20.add(b20);
             l21=new Label("Question 20.Let's_____fishing.");
             p20.add(l21);
             l21.setBounds(50,120,500,30);
             l21.setFont(f1);
             c77=new JRadioButton(" go");
             
             c77.setBounds(70,200,100,30);
             p20.add(c77);
             c77.setFont(f2);
             c77.addItemListener(this);
             c78=new JRadioButton(" get");
             
             c78.setBounds(520,200,110,30);
             p20.add(c78);
             c78.setFont(f2);
             c78.addItemListener(this);
             c79=new JRadioButton(" gone");
             
             c79.setBounds(70,285,100,30);
             p20.add(c79);
             c79.setFont(f2);
             c79.addItemListener(this);
             c80=new JRadioButton(" see");
             
             c80.setBounds(520,285,140,30);
             p20.add(c80);
             c80.setFont(f2);
             c80.addItemListener(this);
             
             p21=new ImagePanel("sgpanel.jpg");
             p21.setBounds(0,390,1000,1000);
             
             p.add(p21);
             p21.setLayout(null);
             p21.setVisible(false);
             b21=new JButton();
             b21.setIcon(tb);
             b21.setBorder(null);
             b21.setBounds(435,0,95,93);
             b21.setVisible(false);
             p21.add(b21);
             l22=new Label("Question 21.She__school last year");
             p21.add(l22);
             l22.setBounds(50,120,500,30);
             l22.setFont(f1);
             c81=new JRadioButton(" left");
             
             c81.setBounds(70,200,100,30);
             p21.add(c81);
             c81.setFont(f2);
             c81.addItemListener(this);
             c82=new JRadioButton(" leaves");
             
             c82.setBounds(520,200,110,30);
             p21.add(c82);
             c82.setFont(f2);
             c82.addItemListener(this);
             c83=new JRadioButton(" will leave");
             
             c83.setBounds(70,285,100,30);
             p21.add(c83);
             c83.setFont(f2);
             c83.addItemListener(this);
             c84=new JRadioButton(" lefts");
             
             c84.setBounds(520,285,140,30);
             p21.add(c84);
             c84.setFont(f2);
             c84.addItemListener(this);
             
             p22=new ImagePanel("sgpanel.jpg");
             p22.setBounds(0,390,1000,1000);
             
             p.add(p22);
             p22.setLayout(null);
             p22.setVisible(false);
             b22=new JButton();
             b22.setIcon(tb);
             b22.setBorder(null);
             b22.setBounds(435,0,95,93);
             b22.setVisible(false);
             p22.add(b22);
             l23=new Label("Question 22.He is interested __collecting model cars");
             p22.add(l23);
             l23.setBounds(50,120,500,30);
             l23.setFont(f1);
             c85=new JRadioButton(" in");
             
             c85.setBounds(70,200,100,30);
             p22.add(c85);
             c85.setFont(f2);
             c85.addItemListener(this);
             c86=new JRadioButton(" at");
             
             c86.setBounds(520,200,110,30);
             p22.add(c86);
             c86.setFont(f2);
             c86.addItemListener(this);
             c87=new JRadioButton(" of");
             
             c87.setBounds(70,285,100,30);
             p22.add(c87);
             c87.setFont(f2);
             c87.addItemListener(this);
             c88=new JRadioButton(" for");
             
             c88.setBounds(520,285,140,30);
             p22.add(c88);
             c88.setFont(f2);
             c88.addItemListener(this);
                          p23=new ImagePanel("sgpanel.jpg");
             p23.setBounds(0,390,1000,1000);
             
             p.add(p23);
             p23.setLayout(null);
             p23.setVisible(false);
             b23=new JButton();
             b23.setIcon(tb);
             b23.setBorder(null);
             b23.setBounds(435,0,95,93);
             b23.setVisible(false);
             p23.add(b23);
             l24=new Label("Question 23.Yesterday he went shopping __his family.");
             p23.add(l24);
             l24.setBounds(50,120,500,30);
             l24.setFont(f1);
             c89=new JRadioButton(" to");
             
             c89.setBounds(70,200,100,30);
             p23.add(c89);
             c89.setFont(f2);
             c89.addItemListener(this);
             c90=new JRadioButton(" with");
             
             c90.setBounds(520,200,110,30);
             p23.add(c90);
             c90.setFont(f2);
             c90.addItemListener(this);
             c91=new JRadioButton(" at");
             
             c91.setBounds(70,285,100,30);
             p23.add(c91);
             c91.setFont(f2);
             c91.addItemListener(this);
             c92=new JRadioButton(" for");
             
             c92.setBounds(520,285,140,30);
             p23.add(c92);
             c92.setFont(f2);
             c92.addItemListener(this);
             
             p24=new ImagePanel("sgpanel.jpg");
             p24.setBounds(0,390,1000,1000);
             
             p.add(p24);
             p24.setLayout(null);
             p24.setVisible(false);
             b24=new JButton();
             b24.setIcon(tb);
             b24.setBorder(null);
             b24.setBounds(435,0,95,93);
             b24.setVisible(false);
             p24.add(b24);
             l25=new Label("Question 24. By next July we__here for four years");
             p24.add(l25);
             l25.setBounds(50,120,500,30);
             l25.setFont(f1);
             c93=new JRadioButton(" shall live");
             
             c93.setBounds(70,200,100,30);
             p24.add(c93);
             c93.setFont(f2);
             c93.addItemListener(this);
             c94=new JRadioButton(" shall have lived");
             
             c94.setBounds(520,200,110,30);
             p24.add(c94);
             c94.setFont(f2);
             c94.addItemListener(this);
             c95=new JRadioButton(" shall be living");
             
             c95.setBounds(70,285,100,30);
             p24.add(c95);
             c95.setFont(f2);
             c95.addItemListener(this);
             c96=new JRadioButton(" shall have been living");
             
             c96.setBounds(520,285,140,30);
             p24.add(c96);
             c96.setFont(f2);
             c96.addItemListener(this);
             
             p25=new ImagePanel("sgpanel.jpg");
             p25.setBounds(0,390,1000,1000);
             
             p.add(p25);
             p25.setLayout(null);
             p25.setVisible(false);
             b25=new JButton();
             b25.setIcon(tb);
             b25.setBorder(null);
             b25.setBounds(435,0,95,93);
             b25.setVisible(false);
             p25.add(b25);
             l26=new Label("Question 25. _____ of cattle was grazing");
             p25.add(l26);
             l26.setBounds(50,120,500,30);
             l26.setFont(f1);
             c97=new JRadioButton(" team");
             
             c97.setBounds(70,200,100,30);
             p25.add(c97);
             c97.setFont(f2);
             c97.addItemListener(this);
             c98=new JRadioButton(" crowd");
             
             c98.setBounds(520,200,110,30);
             p25.add(c98);
             c98.setFont(f2);
             c98.addItemListener(this);
             c99=new JRadioButton(" heard");
             
             c99.setBounds(70,285,100,30);
             p25.add(c99);
             c99.setFont(f2);
             c99.addItemListener(this);
             c100=new JRadioButton(" packet");
             
             c100.setBounds(520,285,140,30);
             p25.add(c100);
             c100.setFont(f2);
             c100.addItemListener(this);
             
             p26=new ImagePanel("sgpanel.jpg" );
             p26.setBounds(0,390,1000,1000);
             
             p.add(p26);
             p26.setLayout(null);
             p26.setVisible(false);
             b26=new JButton();
             b26.setIcon(tb);
             b26.setBorder(null);
             b26.setBounds(435,0,95,93);
             b26.setVisible(false);
             p26.add(b26);
             l27=new Label("Question 26.I always keep_____ word.");
             p26.add(l27);
             l27.setBounds(50,120,500,30);
             l27.setFont(f1);
             c101=new JRadioButton(" her");
             
             c101.setBounds(70,200,100,30);
             p26.add(c101);
             c101.setFont(f2);
             c101.addItemListener(this);
             c102=new JRadioButton(" his");
             
             c102.setBounds(520,200,110,30);
             p26.add(c102);
             c102.setFont(f2);
             c102.addItemListener(this);
             c103=new JRadioButton(" their");
             
             c103.setBounds(70,285,100,30);
             p26.add(c103);
             c103.setFont(f2);
             c103.addItemListener(this);
             c104=new JRadioButton(" my");
             
             c104.setBounds(520,285,140,30);
             p26.add(c104);
             c104.setFont(f2);
             c104.addItemListener(this);
             
             
             p27=new ImagePanel("sgpanel.jpg");
             p27.setBounds(0,390,1000,1000);
             
             p.add(p27);
             p27.setLayout(null);
             p27.setVisible(false);
             b27=new JButton();
             b27.setIcon(tb);
             b27.setBorder(null);
             b27.setBounds(435,0,95,93);
             b27.setVisible(false);
             p27.add(b27);
             l28=new Label("Question 27.He was angry__he heard what happened.");
             p27.add(l28);
             l28.setBounds(130,121,640,50);
             l28.setFont(f1);
             c105=new JRadioButton(" when");
             
             c105.setBounds(70,200,100,30);
             p27.add(c105);
             c105.setFont(f2);
             c105.addItemListener(this);
             c106=new JRadioButton(" because");
             
             c106.setBounds(520,200,110,30);
             p27.add(c106);
             c106.setFont(f2);
             c106.addItemListener(this);
             c107=new JRadioButton(" at");
             
             c107.setBounds(70,285,100,30);
             p27.add(c107);
             c107.setFont(f2);
             c107.addItemListener(this);
             c108=new JRadioButton(" so");
             
             c108.setBounds(520,285,140,30);
             p27.add(c108);
             c108.setFont(f2);
             c108.addItemListener(this);
             
             
             p28=new ImagePanel("sgpanel.jpg");
             p28.setBounds(0,390,1000,1000);
             
             p.add(p28);
             p28.setLayout(null);
             p28.setVisible(false);
             b28=new JButton();
             b28.setIcon(tb);
             b28.setBorder(null);
             b28.setBounds(435,0,95,93);
             b28.setVisible(false);
             p28.add(b28);
             l29=new Label("Question 28. I shall wait till you__your lunch");
             p28.add(l29);
             l29.setBounds(130,121,640,50);
             l29.setFont(f1);
             c109=new JRadioButton(" finished");
             
             c109.setBounds(70,200,100,30);
             p28.add(c109);
             c109.setFont(f2);
             c109.addItemListener(this);
             c110=new JRadioButton(" finishes");
             
             c110.setBounds(520,200,110,30);
             p28.add(c110);
             c110.setFont(f2);
             c110.addItemListener(this);
             c111=new JRadioButton(" are finishing");
             
             c111.setBounds(70,285,100,30);
             p28.add(c111);
             c111.setFont(f2);
             c111.addItemListener(this);
             c112=new JRadioButton(" finish");
             
             c112.setBounds(520,285,140,30);
             p28.add(c112);
             c112.setFont(f2);
             c112.addItemListener(this);
             
             p29=new ImagePanel("sgpanel.jpg");
             p29.setBounds(0,390,1000,1000);
             
             p.add(p29);
             p29.setLayout(null);
             p29.setVisible(false);
             b29=new JButton();
             b29.setIcon(tb);
             b29.setBorder(null);
             b29.setBounds(435,0,95,93);
             b29.setVisible(false);
             p29.add(b29);
             l30=new Label(" Question 29. Please __quiet. I am trying to read");
             p29.add(l30);
             l30.setBounds(130,121,600,50);
             l30.setFont(f1);
             c113=new JRadioButton(" are");
             
             c113.setBounds(70,200,100,30);
             p29.add(c113);
             c113.setFont(f2);
             c113.addItemListener(this);
             c114=new JRadioButton(" been");
             
             c114.setBounds(520,200,110,30);
             p29.add(c114);
             c114.setFont(f2);
             c114.addItemListener(this);
             c115=new JRadioButton(" be");
             
             c115.setBounds(70,285,100,30);
             p29.add(c115);
             c115.setFont(f2);
             c115.addItemListener(this);
             c116=new JRadioButton(" being");
             
             c116.setBounds(520,285,140,30);
             p29.add(c116);
             c116.setFont(f2);
             c116.addItemListener(this);
             
             p30=new ImagePanel("sgpanel.jpg");
             p30.setBounds(0,390,1000,1000);
             
             p.add(p30);
             p30.setLayout(null);
             p30.setVisible(false);
            
             l31=new Label("Question 30. When I saw him he __chess");
             p30.add(l31);
             l31.setBounds(130,121,600,50);
             l31.setFont(f1);
             c117=new JRadioButton(" is playing");
             
             c117.setBounds(70,200,100,30);
             p30.add(c117);
             c117.setFont(f2);
             c117.addItemListener(this);
             c118=new JRadioButton(" played");
             
             c118.setBounds(520,200,110,30);
             p30.add(c118);
             c118.setFont(f2);
             c118.addItemListener(this);
             c119=new JRadioButton(" was playing");
             
             c119.setBounds(70,285,100,30);
             p30.add(c119);
             c119.setFont(f2);
             c119.addItemListener(this);
             c120=new JRadioButton(" plays");
             
             c120.setBounds(520,285,140,30);
             p30.add(c120); 
             c120.setFont(f2);
             c120.addItemListener(this);
             l[0]=new Label();
       		 l[0].setBounds(700, 63, 200, 30);
       		 p1.add(l[0]); 
             l[1]=new Label();
       		 l[1].setBounds(700, 63, 200, 30);
       		 p2.add(l[1]);
         	 l[2]=new Label();
   	         l[2].setBounds(700, 63, 200, 30);
   		     p3.add(l[2]);
   	    l[3]=new Label();
		l[3].setBounds(700, 63, 200, 30);
		p4.add(l[3]);   
		l[4]=new Label();
   		l[4].setBounds(700, 63, 200, 30);
   		p5.add(l[4]);     
    	l[5]=new Label();
		l[5].setBounds(700, 63, 200, 30);
		p6.add(l[5]);
		l[6]=new Label();
   		l[6].setBounds(700, 63, 200, 30);
   		p7.add(l[6]);
   	    l[7]=new Label();
		l[7].setBounds(700, 63, 200, 30);
		p8.add(l[7]);
		l[8]=new Label();
   		l[8].setBounds(700, 63, 200, 30);
   		p9.add(l[8]);   
   	    l[9]=new Label();
		l[9].setBounds(700, 63, 200, 30);
		p10.add(l[9]);   
		l[10]=new Label();
   		l[10].setBounds(700, 63, 200, 30);
   		p11.add(l[10]);  
   	    l[11]=new Label();
		l[11].setBounds(700, 63, 200, 30);
		p12.add(l[11]);
		l[12]=new Label();
   		l[12].setBounds(700, 63, 200, 30);
   		p13.add(l[12]);    
   	    l[13]=new Label();
		l[13].setBounds(700, 63, 200, 30);
		p14.add(l[13]);
		l[14]=new Label();
   		l[14].setBounds(700, 63, 200, 30);
   		p15.add(l[14]); 
   	    l[15]=new Label();
		l[15].setBounds(700, 63, 200, 30);
		p16.add(l[15]);
		l[16]=new Label();
   		l[16].setBounds(700, 63, 200, 30);
   		p17.add(l[16]);
   	    l[17]=new Label();
		l[17].setBounds(700, 63, 200, 30);
		p18.add(l[17]);
		l[18]=new Label();
   		l[18].setBounds(700, 63, 200, 30);
   		p19.add(l[18]);
   	    l[19]=new Label();
		l[19].setBounds(700, 63, 200, 30);
		p20.add(l[19]);
		l[20]=new Label();
   		l[20].setBounds(700, 63, 200, 30);
   		p21.add(l[20]);
   	    l[21]=new Label();
		l[21].setBounds(700, 63, 200, 30);
		p22.add(l[21]);
		l[22]=new Label();
   		l[22].setBounds(700, 63, 200, 30);
   		p23.add(l[22]);
   	    l[23]=new Label();
		l[23].setBounds(700, 63, 200, 30);
		p24.add(l[23]);
		l[24]=new Label();
   		l[24].setBounds(700, 63, 200, 30);
   		p25.add(l[24]);
   	    l[25]=new Label();
		l[25].setBounds(700, 63, 200, 30);
		p26.add(l[25]);
		l[26]=new Label();
   		l[26].setBounds(700, 63, 200, 30);
   		p27.add(l[26]);
   	    l[27]=new Label();
		l[27].setBounds(700, 63, 200, 30);
		p28.add(l[27]);
		l[28]=new Label();
   		l[28].setBounds(700, 63, 200, 30);
   		p29.add(l[28]);
   	    l[29]=new Label();
		l[29].setBounds(700, 63, 200, 30);
		p30.add(l[29]);
   		b=new JButton("TRY AGAIN");
        b.setBounds(1210, 300,100, 90);
        b.setBorder(null);
        b.setIcon(ic);
       add(b);
        b.setVisible(false);
       
        bhm=new JButton();
        bhm.setIcon(ic1);
        bhm.setBounds(1210, 440,100, 30);
        bhm.setBorder(null);
       add(bhm);
       bh=new JButton();
       bh.setIcon(ic2);
       bh.setBounds(1210, 520,90, 40);
       bh.setBorder(null);
      add(bh);
      bb=new JButton();
      bb.setIcon(ic3);
      bb.setBounds(1210, 600,100, 50);
      bb.setBorder(null);
     add(bb);
      
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
           b5.addActionListener(this);
           b6.addActionListener(this);
           b7.addActionListener(this);
           b8.addActionListener(this);
           b9.addActionListener(this);
           b10.addActionListener(this);
           b11.addActionListener(this);
           b12.addActionListener(this);
           b13.addActionListener(this);
           b14.addActionListener(this);
           b15.addActionListener(this);
           b16.addActionListener(this);
           b17.addActionListener(this);
           b18.addActionListener(this);
           b19.addActionListener(this);
           b20.addActionListener(this);
           b21.addActionListener(this);
           b22.addActionListener(this);
           b23.addActionListener(this);
           b24.addActionListener(this);
           b25.addActionListener(this);
           b26.addActionListener(this);
           b27.addActionListener(this);
           b28.addActionListener(this);
           b29.addActionListener(this);
           b.addActionListener(this);
           bh.addActionListener(this);
           bhm.addActionListener(this);
           bb.addActionListener(this);
           t=new CountTimer();
           t.start();
           
           }
	public static void main(String[] args)
	{
      new sentencegame();
	}
public void actionPerformed(ActionEvent e1) {
              		
			if(e1.getSource()==b1)
			{
				p1.setVisible(false);
				p2.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b2)
			{
				p2.setVisible(false);
				p3.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b3)
			{
				p3.setVisible(false);
				p4.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b4)
			{
				p4.setVisible(false);
				p5.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b5)
			{
				p5.setVisible(false);
				p6.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b6)
			{
				p6.setVisible(false);
				p7.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b7)
			{
				p7.setVisible(false);
				p8.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b8)
			{
				p8.setVisible(false);
				p9.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b9)
			{
				p9.setVisible(false);
				p10.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b10)
			{
				p10.setVisible(false);
				p11.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b11)
			{
				p11.setVisible(false);
				p12.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b12)
			{
				p12.setVisible(false);
				p13.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b13)
			{
				p13.setVisible(false);
				p14.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b14)
			{
				p14.setVisible(false);
				p15.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b15)
			{
				p15.setVisible(false);
				p16.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b16)
			{
				p16.setVisible(false);
				p17.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b17)
			{
				p17.setVisible(false);
				p18.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b18)
			{
				p18.setVisible(false);
				p19.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b19)
			{
				p19.setVisible(false);
				p20.setVisible(true);
				t.start();
				i++;
			}
			
			else if(e1.getSource()==b20)
			{
				p20.setVisible(false);
				p21.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b21)
			{
				p21.setVisible(false);
				p22.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b22)
			{
				p22.setVisible(false);
				p23.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b23)
			{
				p23.setVisible(false);
				p24.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b24)
			{
				p24.setVisible(false);
				p25.setVisible(true);
				t.start();
				i++;
			
			}
			else if(e1.getSource()==b25)
			{
				p25.setVisible(false);
				p26.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b26)
			{
				p26.setVisible(false);
				p27.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b27)
			{
				p27.setVisible(false);
				p28.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b28)
			{
				p28.setVisible(false);
				p29.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b29)
			{
				p29.setVisible(false);
				p30.setVisible(true);
				t.start();
				i++;
			}
			else if(e1.getSource()==b)
			{   
				p1.setVisible(true);
				t.start();
				c1.setEnabled(true);
                c2.setEnabled(true);
                c3.setEnabled(true);
                c4.setEnabled(true);
                c5.setEnabled(true);
                c6.setEnabled(true);
                c7.setEnabled(true);
                c8.setEnabled(true);
                c9.setEnabled(true);
                c10.setEnabled(true);
                c11.setEnabled(true);
                c12.setEnabled(true);
                c13.setEnabled(true);
                c14.setEnabled(true);
                c15.setEnabled(true);
                c16.setEnabled(true);
                c17.setEnabled(true);
                c18.setEnabled(true);
                c19.setEnabled(true);
                c20.setEnabled(true);
                c21.setEnabled(true);
                c22.setEnabled(true);
                c23.setEnabled(true);
                c24.setEnabled(true);
                c25.setEnabled(true);
                c26.setEnabled(true);
                c27.setEnabled(true);
                c28.setEnabled(true);
                c29.setEnabled(true);
                c30.setEnabled(true);
                c31.setEnabled(true);
                c32.setEnabled(true);
                c33.setEnabled(true);
                c34.setEnabled(true);
                c35.setEnabled(true);
                c36.setEnabled(true);
                c37.setEnabled(true);
                c38.setEnabled(true);
                c39.setEnabled(true);
                c40.setEnabled(true);
                c41.setEnabled(true);
                c42.setEnabled(true);
                c43.setEnabled(true);
                c44.setEnabled(true);
                c45.setEnabled(true);
                c46.setEnabled(true);
                c47.setEnabled(true);
                c48.setEnabled(true);
                c49.setEnabled(true);
                c50.setEnabled(true);
                c51.setEnabled(true);
                c52.setEnabled(true);
                c53.setEnabled(true);
                c54.setEnabled(true);
                c55.setEnabled(true);
                c56.setEnabled(true);
                c57.setEnabled(true);
                c58.setEnabled(true);
                c59.setEnabled(true);
                c60.setEnabled(true);
                c61.setEnabled(true);
                c62.setEnabled(true);
                c63.setEnabled(true);
                c64.setEnabled(true);
                c65.setEnabled(true);
                c66.setEnabled(true);
                c67.setEnabled(true);
                c68.setEnabled(true);
                c69.setEnabled(true);
                c70.setEnabled(true);
                c71.setEnabled(true);
                c72.setEnabled(true);
                c73.setEnabled(true);
                c74.setEnabled(true);
                c75.setEnabled(true);
                c76.setEnabled(true);
                c77.setEnabled(true);
                c78.setEnabled(true);
                c79.setEnabled(true);
                c80.setEnabled(true);
                c81.setEnabled(true);
                c82.setEnabled(true);
                c83.setEnabled(true);
                c84.setEnabled(true);
                c85.setEnabled(true);
                c86.setEnabled(true);
                c87.setEnabled(true);
                c88.setEnabled(true);
                c89.setEnabled(true);
                c90.setEnabled(true);
                c92.setEnabled(true);
                c93.setEnabled(true);
                c94.setEnabled(true);
                c95.setEnabled(true);
                c96.setEnabled(true);
                c97.setEnabled(true);
                c98.setEnabled(true);
                c99.setEnabled(true);
                c100.setEnabled(true);
                c101.setEnabled(true);
                c102.setEnabled(true);
                c103.setEnabled(true);
                c104.setEnabled(true);
                c105.setEnabled(true);
                c106.setEnabled(true);
                c107.setEnabled(true);
                c108.setEnabled(true);
                c109.setEnabled(true);
                c110.setEnabled(true);
                c111.setEnabled(true);
                c112.setEnabled(true);
                c113.setEnabled(true);
                c114.setEnabled(true);
                c115.setEnabled(true);
                c116.setEnabled(true);
                c117.setEnabled(true);
                c118.setEnabled(true);
                c119.setEnabled(true);
                c120.setEnabled(true);
               
				i=0;
			}
			else if(e1.getSource()==bhm)
			{   
				new front();
			}
			else if(e1.getSource()==bh)
			{   
				new hsc();
			}
			else if(e1.getSource()==bb)
			{   
				new game();
			}
}
public void itemStateChanged(ItemEvent e) {
			
if(e.getSource()==c1)
{
t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 0 TRY AGAIN");
b.setVisible(true);

b1.setEnabled(false);

}

else if(e.getSource()==c2)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 0 TRY AGAIN");
b.setVisible(true);
b1.setEnabled(false);

}
	
else if(e.getSource()==c3)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS YOU GOT 1 MARK ");
b.setVisible(false);
b1.setVisible(true);
b1.setEnabled(true);

}

else if(e.getSource()==c4)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 0 TRY AGAIN ");
b.setVisible(true);
b1.setEnabled(false);

}
 else if(e.getSource()==c5)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 1 TRY AGAIN ");
b.setVisible(true);
b2.setEnabled(false);


}
 else if(e.getSource()==c6)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :2 ");
b.setVisible(false);
b2.setVisible(true);
b2.setEnabled(true);


}

 else if(e.getSource()==c7)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 1 TRY AGAIN");
b.setVisible(true);
b2.setEnabled(false);


}
 else if(e.getSource()==c8)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 1 TRY AGAIN ");
b.setVisible(true);
b2.setEnabled(false);


}
else if(e.getSource()==c9)
{	t.stop();
JOptionPane.showMessageDialog(this," RIGHT ANS TOTAL MARKS CREDITED :3");
b.setVisible(false);
b3.setVisible(true);
b3.setEnabled(true);


}
else if(e.getSource()==c10)
	{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 2 TRY AGAIN");
b.setVisible(true);
b3.setEnabled(false);

}
else if(e.getSource()==c11)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 2 TRY AGAIN");
b.setVisible(true);
b3.setEnabled(false);

}
else if(e.getSource()==c12)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER , TOTAL MARKS 2 TRY AGAIN");
b.setVisible(true);
b3.setEnabled(false);

}
else if(e.getSource()==c13)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :4 ");
b.setVisible(false);
b4.setVisible(true);
b4.setEnabled(true);

}
else if(e.getSource()==c14)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 3 TRY AGAIN ");
b.setVisible(true);
b4.setEnabled(false);

}
else if(e.getSource()==c15)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 3 TRY AGAIN ");
b.setVisible(true);
b4.setEnabled(false);

}
else if(e.getSource()==c16)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 3 TRY AGAIN ");
b.setVisible(true);
b4.setEnabled(false);

}
else if(e.getSource()==c17)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 4 TRY AGAIN");
b.setVisible(true);
b5.setEnabled(false);

}
else if(e.getSource()==c18)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 4 TRY AGAIN");
b.setVisible(true);
b5.setEnabled(false);

}
else if(e.getSource()==c19)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 4 TRY AGAIN");
b.setVisible(true);
b5.setEnabled(false);
}
else if(e.getSource()==c20)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :5");
b.setVisible(false);
b5.setVisible(true);
b5.setEnabled(true);
}
else if(e.getSource()==c21)
{t.stop();
			
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :6");
b.setVisible(false);
b6.setVisible(true);
b6.setEnabled(true);


}
else if(e.getSource()==c22)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 5 TRY AGAIN");
b.setVisible(true);
b6.setEnabled(false);

						
}
else if(e.getSource()==c23)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 5 TRY AGAIN");
b.setVisible(true);
b6.setEnabled(false);

					

}
else if(e.getSource()==c24)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 5 TRY AGAIN");
b.setVisible(true);
b6.setEnabled(false);

					
}
 else if(e.getSource()==c25)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 6 TRY AGAIN");
b.setVisible(true);
b7.setEnabled(false);


}
 else if(e.getSource()==c26)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 6 TRY AGAIN");
b.setVisible(true);
b7.setEnabled(false);


}
 else if(e.getSource()==c27)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :7");
b.setVisible(false);
b7.setVisible(true);
b7.setEnabled(true);


}
 else if(e.getSource()==c28)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 6 TRY AGAIN");
b.setVisible(true);
b7.setEnabled(false);

c28.setEnabled(false);

}
else if(e.getSource()==c29)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 7 TRY AGAIN");
b.setVisible(true);
b8.setEnabled(false);


}
else if(e.getSource()==c30)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :8");
b.setVisible(false);
b8.setVisible(true);
b8.setEnabled(true);

}
else if(e.getSource()==c31)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 7 TRY AGAIN");
b.setVisible(true);
b8.setEnabled(false);


}
else if(e.getSource()==c32)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 7 TRY AGAIN");
b.setVisible(true);
b8.setEnabled(false);


}
else if(e.getSource()==c33)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :9");
b.setVisible(false);
b9.setVisible(true);
b9.setEnabled(true);


}
else if(e.getSource()==c34)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 8 TRY AGAIN");
b.setVisible(true);
b9.setEnabled(false);

}
else if(e.getSource()==c35)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 8 TRY AGAIN");
b.setVisible(true);
b9.setEnabled(false);


}
else if(e.getSource()==c36)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 8 TRY AGAIN");
b.setVisible(true);
b9.setEnabled(false);

}
else if(e.getSource()==c37)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 9 TRY AGAIN");
b.setVisible(true);
b10.setEnabled(false);

}
else if(e.getSource()==c38)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 9 TRY AGAIN");
b.setVisible(true);
b10.setEnabled(false);

}
else if(e.getSource()==c39)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :10");
b.setVisible(false);
b10.setVisible(true);
b10.setEnabled(true);

}
else if(e.getSource()==c40)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 9 TRY AGAIN");
b.setVisible(true);
b10.setEnabled(false);

}
else if(e.getSource()==c41)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 10 TRY AGAIN");
b.setVisible(true);
b11.setEnabled(false);

}
else if(e.getSource()==c42)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 10 TRY AGAIN");
b.setVisible(true);
b11.setEnabled(false);

						
}
else if(e.getSource()==c43)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :11");
b.setVisible(false);
b11.setVisible(true);
b11.setEnabled(true);


}
else if(e.getSource()==c44)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 10 TRY AGAIN");
b.setVisible(true);
b11.setEnabled(false);

}
else if(e.getSource()==c45)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 11 TRY AGAIN");
b.setVisible(true);
b12.setEnabled(false);

}
else if(e.getSource()==c46)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 11 TRY AGAIN");
b.setVisible(true);
b12.setEnabled(false);

							
}
else if(e.getSource()==c47)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 11 TRY AGAIN");
b.setVisible(true);
b12.setEnabled(false);

}
else if(e.getSource()==c48)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :12");
b.setVisible(false);
b12.setVisible(true);
b12.setEnabled(true);

}
else if(e.getSource()==c49)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 12 TRY AGAIN");
b.setVisible(true);
b13.setEnabled(false);

}
else if(e.getSource()==c50)
{t.stop();
							
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :13");
b.setVisible(false);
b13.setVisible(true);
b13.setEnabled(true);

								
}							
else if(e.getSource()==c51)
{	t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 12 TRY AGAIN");
b.setVisible(true);
b13.setEnabled(false);

}
else if(e.getSource()==c52)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 12 TRY AGAIN");
b.setVisible(true);
b13.setEnabled(false);

}
						  
else if(e.getSource()==c53)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 13 TRY AGAIN");
b.setVisible(true);
b14.setEnabled(false);

}
else if(e.getSource()==c54)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 13 TRY AGAIN");
b.setVisible(true);
b14.setEnabled(false);

									
}
else if(e.getSource()==c55)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :14");
b.setVisible(false);
b14.setVisible(true);
b14.setEnabled(true);

}
else if(e.getSource()==c56)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 13 TRY AGAIN");
b.setVisible(true);
b14.setEnabled(false);

}
 else if(e.getSource()==c57)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 14 TRY AGAIN");
b.setVisible(true);
b15.setEnabled(false);

}							
 else if(e.getSource()==c58)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :15");
b.setVisible(false);
b15.setVisible(true);
b15.setEnabled(true);

										
}
 else if(e.getSource()==c59)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 14 TRY AGAIN");
b.setVisible(true);
b15.setEnabled(false);

}
 else if(e.getSource()==c60)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 14 TRY AGAIN");
b.setVisible(true);
b15.setEnabled(false);

}
else if(e.getSource()==c61)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 15 TRY AGAIN");
b.setVisible(true);
b16.setEnabled(false);

}
else if(e.getSource()==c62)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :16");
b.setVisible(false);
b16.setVisible(true);
b16.setEnabled(true);

											
}
else if(e.getSource()==c63)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 15 TRY AGAIN");
b.setVisible(true);
b16.setEnabled(false);

}

else if(e.getSource()==c64)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 15 TRY AGAIN");
b.setVisible(true);
b16.setEnabled(false);

}
else if(e.getSource()==c65)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 16 TRY AGAIN");
b.setVisible(true);
b17.setEnabled(false);

}
else if(e.getSource()==c66)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 16 TRY AGAIN");
b.setVisible(true);
b17.setEnabled(false);

										
}
else if(e.getSource()==c67)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :17");
b.setVisible(false);
b17.setVisible(true);
b17.setEnabled(true);

}
else if(e.getSource()==c68)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 16 TRY AGAIN");
b.setVisible(true);
b17.setEnabled(false);

}
else if(e.getSource()==c69)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 17 TRY AGAIN");
b.setVisible(true);
b18.setEnabled(false);

}
else if(e.getSource()==c70)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 17 TRY AGAIN");
b.setVisible(true);
b18.setEnabled(false);

												
}
else if(e.getSource()==c71)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :18");
b.setVisible(false);
b18.setVisible(true);
b18.setEnabled(true);

}										
else if(e.getSource()==c72)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER , TOTAL MARKS 17 TRY AGAIN");
b.setVisible(true);
b18.setEnabled(false);

}
else if(e.getSource()==c73)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 18 TRY AGAIN");
b.setVisible(true);
b19.setEnabled(false);

}
else if(e.getSource()==c74)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 18 TRY AGAIN");
b.setVisible(true);
b19.setEnabled(false);

}
else if(e.getSource()==c75)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 18 TRY AGAIN");
b.setVisible(true);
b19.setEnabled(false);

}
else if(e.getSource()==c76)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :19");
b.setVisible(false);
b19.setVisible(true);
b19.setEnabled(true);

}
 else if(e.getSource()==c77)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :20");
b.setVisible(false);
b20.setVisible(true);
b20.setEnabled(true);

}
 else if(e.getSource()==c78)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 19 TRY AGAIN");
b.setVisible(true);
b20.setEnabled(false);

														
}
 else if(e.getSource()==c79)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 19 TRY AGAIN");
b.setVisible(true);
b20.setEnabled(false);

  }
 else if(e.getSource()==c80)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 19 TRY AGAIN");
b.setVisible(true);
b20.setEnabled(false);
}
else if(e.getSource()==c81)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :21");
b.setVisible(false);
b21.setVisible(true);
b21.setEnabled(true);

}
else if(e.getSource()==c82)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 20 TRY AGAIN");
b.setVisible(true);
b21.setEnabled(false);

															
}
else if(e.getSource()==c83)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 20 TRY AGAIN");
b.setVisible(true);
b21.setEnabled(false);

}
else if(e.getSource()==c84)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 20 TRY AGAIN");
b.setVisible(true);
b21.setEnabled(false);

}
else if(e.getSource()==c85)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :22");
b.setVisible(false);
b22.setVisible(true);
b22.setEnabled(true);

}														
else if(e.getSource()==c86)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 21 TRY AGAIN");
b.setVisible(true);
b22.setEnabled(false);

															
}
else if(e.getSource()==c87)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 21 TRY AGAIN");
b.setVisible(true);
b22.setEnabled(false);

}
else if(e.getSource()==c88)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 21 TRY AGAIN");
b.setVisible(true);
b22.setEnabled(false);

}
else if(e.getSource()==c89)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 22 TRY AGAIN");
b.setVisible(true);
b23.setEnabled(false);

}
else if(e.getSource()==c90)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :23");
b.setVisible(false);
b23.setVisible(true);
b23.setEnabled(true);

															
}														
else if(e.getSource()==c91)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 22 TRY AGAIN");
b.setVisible(true);
b23.setEnabled(false);

}
else if(e.getSource()==c92)
 {t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER , TOTAL MARKS 22 TRY AGAIN");
b.setVisible(true);
b23.setEnabled(false);

}
else if(e.getSource()==c93)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 23 TRY AGAIN");
b.setVisible(true);
b24.setEnabled(false);

}
else if(e.getSource()==c94)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :25");
b.setVisible(false);
b24.setVisible(true);
b24.setEnabled(true);

															
}
else if(e.getSource()==c95)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 23 TRY AGAIN");
b.setVisible(true);
b24.setEnabled(false);

}
else if(e.getSource()==c96)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 23 TRY AGAIN");
b.setVisible(true);
b24.setEnabled(false);

}
													 
else if(e.getSource()==c97)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 24 TRY AGAIN");
b.setVisible(true);
b25.setEnabled(false);

}
else if(e.getSource()==c98)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :25");
b.setVisible(false);
b25.setVisible(true);
b25.setEnabled(true);

															
}
else if(e.getSource()==c99)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 24 TRY AGAIN");
b.setVisible(true);
b25.setEnabled(false);

}
else if(e.getSource()==c100)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 24 TRY AGAIN");
b.setVisible(true);
b25.setEnabled(false);

}
else if(e.getSource()==c101)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 25 TRY AGAIN");
b.setVisible(true);
b26.setEnabled(false);

}
else if(e.getSource()==c102)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 25 TRY AGAIN");
b.setVisible(true);
b26.setEnabled(false);

										
}
else if(e.getSource()==c103)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 25 TRY AGAIN");
b.setVisible(true);
b26.setEnabled(false);

}
else if(e.getSource()==c104)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :26");
b.setVisible(false);
b26.setVisible(true);
b26.setEnabled(true);

}
 else if(e.getSource()==c105)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :27");
b.setVisible(false);
b27.setVisible(true);
b27.setEnabled(true);

}
 else if(e.getSource()==c106)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 26 TRY AGAIN");
b.setVisible(true);
b27.setEnabled(false);

}														
 else if(e.getSource()==c107)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 26 TRY AGAIN");
b.setVisible(true);
b27.setEnabled(false);

}
 else if(e.getSource()==c108)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 26 TRY AGAIN");
b.setVisible(true);
b27.setEnabled(false);

}
 else if(e.getSource()==c109)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 27 TRY AGAIN");
b.setVisible(true);
b28.setEnabled(false);

}
 else if(e.getSource()==c110)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 27 TRY AGAIN");
b.setVisible(true);
b28.setEnabled(false);

}
 else if(e.getSource()==c111)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 27 TRY AGAIN");
b.setVisible(true);
b28.setEnabled(false);

}
 else if(e.getSource()==c112)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :28");
b.setVisible(false);
b28.setVisible(true);
b28.setEnabled(true);

}
													 
else if(e.getSource()==c113)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 28 TRY AGAIN");
b.setVisible(true);
b29.setEnabled(false);

}
else if(e.getSource()==c114)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 28 TRY AGAIN");
b.setVisible(true);
b29.setEnabled(false);

														
	}
else if(e.getSource()==c115)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :29");
b.setVisible(false);
b29.setVisible(true);
b29.setEnabled(true);

}
else if(e.getSource()==c116)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 28 TRY AGAIN");
b.setVisible(true);
b29.setEnabled(false);
}
													 
else if(e.getSource()==c117)
	{t.stop();
	JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 29 TRY AGAIN");
	b.setVisible(true);
	
														
	}
else if(e.getSource()==c118)
{t.stop();
JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 29 TRY AGAIN");
b.setVisible(true);

}
else if(e.getSource()==c119)
{t.stop();
JOptionPane.showMessageDialog(this,"RIGHT ANS TOTAL MARKS CREDITED :30"); 
b.setVisible(false);
	b.setVisible(true);
	
			}
else if(e.getSource()==c120)																
	{t.stop();
	JOptionPane.showMessageDialog(this,"WRONG ANS,GAME OVER, TOTAL MARKS 29 TRY AGAIN");
	b.setVisible(true);

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
		private void setTimerText(String sTime) {
		    l[i].setText(sTime);
		}

		public class CountTimer implements ActionListener {

		     static final int ONE_SECOND = 1000;
		     int count = 0;
		     boolean isTimerActive = false;
		    Timer tmr = new Timer(ONE_SECOND, this);

		    public CountTimer() {
		        count=0;
		        setTimerText(TimeFormat(count));
		    }

		  
		    public void actionPerformed(ActionEvent e) {
		        if (isTimerActive) {
		            count++;
		            setTimerText(TimeFormat(count));
		        }
		    }

		    public void start() {
		        count = 0; 
		        isTimerActive = true;
		        tmr.start();
		    }

		    public void resume() {
		        isTimerActive = true;
		        tmr.restart();
		    }

		    public void stop() {
		        tmr.stop();
		    }

		    public void pause() {
		        isTimerActive = false;
		    }

		    public void reset() {
		        count = 0;
		        isTimerActive = true;
		        tmr.restart();

		    }

		}

		public String TimeFormat(int count) {

		    int hours = count / 3600;
		    int minutes = (count-hours*3600)/60;
		    int seconds = count-minutes*60;
              if(minutes==1)
              {
            	  JOptionPane.showMessageDialog(this,"TIME UP!");
                   t.stop();  
                   p.setEnabled(false);
                   b.setEnabled(true);
                   b.setVisible(true);
                   c1.setEnabled(false);
                   c2.setEnabled(false);
                   c3.setEnabled(false);
                   c4.setEnabled(false);
                   c5.setEnabled(false);
                   c6.setEnabled(false);
                   c7.setEnabled(false);
                   c8.setEnabled(false);
                   c9.setEnabled(false);
                   c10.setEnabled(false);
                   c11.setEnabled(false);
                   c12.setEnabled(false);
                   c13.setEnabled(false);
                   c14.setEnabled(false);
                   c15.setEnabled(false);
                   c16.setEnabled(false);
                   c17.setEnabled(false);
                   c18.setEnabled(false);
                   c19.setEnabled(false);
                   c20.setEnabled(false);
                   c21.setEnabled(false);
                   c22.setEnabled(false);
                   c23.setEnabled(false);
                   c24.setEnabled(false);
                   c25.setEnabled(false);
                   c26.setEnabled(false);
                   c27.setEnabled(false);
                   c28.setEnabled(false);
                   c29.setEnabled(false);
                   c30.setEnabled(false);
                   c31.setEnabled(false);
                   c32.setEnabled(false);
                   c33.setEnabled(false);
                   c34.setEnabled(false);
                   c35.setEnabled(false);
                   c36.setEnabled(false);
                   c37.setEnabled(false);
                   c38.setEnabled(false);
                   c39.setEnabled(false);
                   c40.setEnabled(false);
                   c41.setEnabled(false);
                   c42.setEnabled(false);
                   c43.setEnabled(false);
                   c44.setEnabled(false);
                   c45.setEnabled(false);
                   c46.setEnabled(false);
                   c47.setEnabled(false);
                   c48.setEnabled(false);
                   c49.setEnabled(false);
                   c50.setEnabled(false);
                   c51.setEnabled(false);
                   c52.setEnabled(false);
                   c53.setEnabled(false);
                   c54.setEnabled(false);
                   c55.setEnabled(false);
                   c56.setEnabled(false);
                   c57.setEnabled(false);
                   c58.setEnabled(false);
                   c59.setEnabled(false);
                   c60.setEnabled(false);
                   c61.setEnabled(false);
                   c62.setEnabled(false);
                   c63.setEnabled(false);
                   c64.setEnabled(false);
                   c65.setEnabled(false);
                   c66.setEnabled(false);
                   c67.setEnabled(false);
                   c68.setEnabled(false);
                   c69.setEnabled(false);
                   c70.setEnabled(false);
                   c71.setEnabled(false);
                   c72.setEnabled(false);
                   c73.setEnabled(false);
                   c74.setEnabled(false);
                   c75.setEnabled(false);
                   c76.setEnabled(false);
                   c77.setEnabled(false);
                   c78.setEnabled(false);
                   c79.setEnabled(false);
                   c80.setEnabled(false);
                   c81.setEnabled(false);
                   c82.setEnabled(false);
                   c83.setEnabled(false);
                   c84.setEnabled(false);
                   c85.setEnabled(false);
                   c86.setEnabled(false);
                   c87.setEnabled(false);
                   c88.setEnabled(false);
                   c89.setEnabled(false);
                   c90.setEnabled(false);
                   c92.setEnabled(false);
                   c93.setEnabled(false);
                   c94.setEnabled(false);
                   c95.setEnabled(false);
                   c96.setEnabled(false);
                   c97.setEnabled(false);
                   c98.setEnabled(false);
                   c99.setEnabled(false);
                   c100.setEnabled(false);
                   c101.setEnabled(false);
                   c102.setEnabled(false);
                   c103.setEnabled(false);
                   c104.setEnabled(false);
                   c105.setEnabled(false);
                   c106.setEnabled(false);
                   c107.setEnabled(false);
                   c108.setEnabled(false);
                   c109.setEnabled(false);
                   c110.setEnabled(false);
                   c111.setEnabled(false);
                   c112.setEnabled(false);
                   c113.setEnabled(false);
                   c114.setEnabled(false);
                   c115.setEnabled(false);
                   c116.setEnabled(false);
                   c117.setEnabled(false);
                   c118.setEnabled(false);
                   c119.setEnabled(false);
                   c120.setEnabled(false);
                  
              }
		    return String.format("%02d", hours) + " : " + String.format("%02d", minutes) + " : " + String.format("%02d", seconds);
		}
		
	}