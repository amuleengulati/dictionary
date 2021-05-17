
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class crossword6 extends Frame implements ActionListener,KeyListener,WindowListener{
TextField t[]=new TextField[46];
Label l[]=new Label[14];
Label ln[]=new Label[12];
Label s;
JButton b,b1,b2,b3;

ImagePanel p=new ImagePanel("help5.jpg");
//ImagePanel i=new ImagePanel("IMAGE copy.jpg");
ImageIcon i1=new ImageIcon("help3.jpg");
ImageIcon i2=new ImageIcon("help1.jpg");
ImageIcon i3=new ImageIcon("help2.jpg");
ImageIcon i4=new ImageIcon("help4.jpg");

Font f3=new Font(" ",12,44);
public crossword6(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b=new JButton();
b1=new JButton();
b2=new JButton();
b3= new JButton();
p.setBounds(0,0,4000,4000);
add(p);
for(int i=0;i<46;i++){
	
t[i]=new TextField();
t[i].addKeyListener(this);
p.add(t[i]);
}
l[0]=new Label("ACROSS");
l[0].setBounds(100,210,60,20);
p.add(l[0]);
l[1]=new Label("1.A good amount of money or material wealth _ _ _ _ _ _ _ _ _.");
l[1].setBounds(100,230,400,20);
p.add(l[1]);
l[2]=new Label("2.A path meant for cars and other vehicles to drive on _ _ _ _.");
l[2].setBounds(100,250,400,20);
p.add(l[2]);
l[3]=new Label("3.To laugh to loudly _ _ _.");
l[3].setBounds(100,270,200,20);
p.add(l[3]);
l[4]=new Label("4.To the front _ _ _ _ _.");
l[4].setBounds(100,290,200,20);
p.add(l[4]);
l[5]=new Label("5.A small sack filled with dirt that is often stacked to build a wall _ _ _ _ _.");
l[5].setBounds(100,310,400,20);
p.add(l[5]);
l[6]=new Label("6.A piece of furniture used for sleeping on _ _ _.");
l[6].setBounds(100,330,400,20);
p.add(l[6]);
l[7]=new Label("DOWN");
l[7].setBounds(100,360,60,20);
p.add(l[7]);
l[8]=new Label("7.Thick,smooth,rich and full of fat made from milk or butter _ _ _ _ _ _.");
l[8].setBounds(100,380,400,20);
p.add(l[8]);
l[9]=new Label("8.To confuse or muddle _ _ _ _ _.");
l[9].setBounds(100,400,350,20);
p.add(l[9]);
l[10]=new Label("9.Person who watches and studies something _ _ _ _ _ _ _.");
l[10].setBounds(100,420,400,20);
p.add(l[10]);
l[11]=new Label("10.An actor's line that immediately preceeds and serves as a reminder for some action or speech _ _ _.");
l[11].setBounds(100,440,580,20);
p.add(l[11]);
l[12]=new Label("11.An edges tool with a heavy blades head mounted across a handle _ _ _.");
l[12].setBounds(100,460,450,20);
p.add(l[12]);
l[13]=new Label("12.To touch with a soft or moist substances _ _ _.");
l[13].setBounds(100,480,300,20);
p.add(l[13]);

t[0].setBounds(810,220,30,30);
t[1].setBounds(900,220,30,30);
t[2].setBounds(780,250,30,30);
t[3].setBounds(810,250,30,30);
t[4].setBounds(840,250,30,30);
t[5].setBounds(870,250,30,30);
t[6].setBounds(900,250,30,30);
t[7].setBounds(930,250,30,30);
t[8].setBounds(960,250,30,30);
t[9].setBounds(810,280,30,30);
t[10].setBounds(900,280,30,30);
t[11].setBounds(750,320,30,30);
t[12].setBounds(840,320,30,30);
t[13].setBounds(870,320,30,30);
t[14].setBounds(900,320,30,30);
t[15].setBounds(930,320,30,30);
t[16].setBounds(960,340,30,30);
t[17].setBounds(750,340,30,30);
t[18].setBounds(780,340,30,30);
t[19].setBounds(810,340,30,30);
t[20].setBounds(840,340,30,30);
t[21].setBounds(900,340,30,30);
t[22].setBounds(990,340,30,30);
t[23].setBounds(750,370,30,30);
t[24].setBounds(840,370,30,30);
t[25].setBounds(900,370,30,30);
t[26].setBounds(990,370,30,30);
t[27].setBounds(750,400,30,30);
t[28].setBounds(780,400,30,30);
t[29].setBounds(810,400,30,30);
t[30].setBounds(840,400,30,30);
t[31].setBounds(870,400,30,30);
t[32].setBounds(900,400,30,30);
t[33].setBounds(930,400,30,30);
t[34].setBounds(960,400,30,30);
t[35].setBounds(990,400,30,30);
t[36].setBounds(750,430,30,30);
t[37].setBounds(840,430,30,30);
t[38].setBounds(930,430,30,30);
t[39].setBounds(960,430,30,30);
t[40].setBounds(750,460,30,30);
t[41].setBounds(780,460,30,30);
t[42].setBounds(810,460,30,30);
t[43].setBounds(930,460,30,30);
t[44].setBounds(960,460,30,30);
t[45].setBounds(990,460,30,30);
b.setBounds(1050,300,100,50);
b.setIcon(i3);
p.add(b);
b1.setBounds(1050,400,100,50);
b1.setIcon(i1);
p.add(b1);
b2.setBounds(1050,200,100,50);
b2.setIcon(i4);
p.add(b2);
b3.setBounds(1050,500,100,50);
b3.setIcon(i2);
p.add(b3);

b.addActionListener(this);
s=new Label("CROSSWORD 6");
s.setBounds(500, 100, 340, 50);
s.setFont(f3);
s.setForeground(Color.red);
p.add(s);
ln[0]=new Label("1");
ln[0].setBounds(740,400,10,10);

ln[1]=new Label("2");
ln[1].setBounds(740,340,10,10);
ln[2]=new Label("3");
ln[2].setBounds(740,460,10,10);
ln[3]=new Label("4");
ln[3].setBounds(830,310,10,10);
ln[4]=new Label("5");
ln[4].setBounds(770,250,10,10);
ln[5]=new Label("6");
ln[5].setBounds(920,460,10,10);
ln[6]=new Label("7");
ln[6].setBounds(740,310,10,10);
ln[7]=new Label("8");
ln[7].setBounds(840,300,10,10);
ln[8]=new Label("9");
ln[8].setBounds(900,210,10,10);
ln[9]=new Label("10");
ln[9].setBounds(960,390,20,10);
ln[10]=new Label("11");
ln[10].setBounds(990,330,20,10);
ln[11]=new Label("12");
ln[11].setBounds(810,210,20,10);

for(int i=0;i<12;i++)
p.add(ln[i]);


}
public static void main(String[] args) {
new crossword6();
}// TODO Auto-generated method stub

public void keyPressed(KeyEvent arg0) {
// TODO Auto-generated method stub
}
public void keyReleased(KeyEvent arg0) {
// TODO Auto-generated method stub
}
public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b){
String str[]=new String[46];
for(int i=0;i<46;i++)
str[i]=t[i].getText();
String strn[]=new String[12];
strn[0]=str[27]+str[28]+str[29]+str[30]+str[31]+str[32]+str[33]+str[34]+str[35];
strn[1]=str[17]+str[18]+str[19]+str[20];
strn[2]=str[40]+str[41]+str[42];
strn[3]=str[12]+str[13]+str[14]+str[15]+str[16];
strn[4]=str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8];
strn[5]=str[43]+str[44]+str[45];
strn[6]=str[11]+str[17]+str[23]+str[27]+str[36]+str[40];
strn[7]=str[12]+str[20]+str[24]+str[30]+str[37];
strn[8]=str[1]+str[6]+str[10]+str[14]+str[21]+str[25]+str[32]+str[38];
strn[9]=str[34]+str[39]+str[44];
strn[10]=str[22]+str[26]+str[35];
strn[11]=str[0]+str[3]+str[9];
if(strn[0].equals("affluence")&&strn[1].equals("road")&&strn[2].equals("yuk")&&strn[3].equals("ahead")&&strn[4].equals("sandbag")&&strn[5].equals("bed")&&strn[6].equals("creamy")
		&&strn[7].equals("addle")&&strn[8].equals("observer")&&strn[9].equals("cue")&&strn[10].equals("axe")&&strn[11].equals("dab")){
JOptionPane.showMessageDialog(this,"You win!");
}
else
JOptionPane.showMessageDialog(this,"Try again");
}
else if(e.getSource()==b1){
	new hcrs();
}
// TODO Auto-generated method stub
else if(e.getSource()==b3){
	new game();
}
else if(e.getSource()==b2){
	
	new front();
}
}
public void windowActivated(WindowEvent arg0) {
// TODO Auto-generated method stub
}
public void windowClosed(WindowEvent arg0) {
// TODO Auto-generated method stub
}
public void windowClosing(WindowEvent arg0) {
System.exit(0);// TODO Auto-generated method stub
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
