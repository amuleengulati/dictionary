
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class crossword2 extends Frame implements ActionListener,KeyListener,WindowListener{
/**
* @param args
*/
TextField t[]=new TextField[43];
Label l[]=new Label[11];
Label s;
JButton b1,b2,b3,b4;
ImagePanel p=new ImagePanel("help5.jpg");
//ImagePanel i=new ImagePanel("help5.jpg");
ImageIcon i1=new ImageIcon("help3.jpg");
ImageIcon i2=new ImageIcon("help1.jpg");
ImageIcon i3=new ImageIcon("help2.jpg");
ImageIcon i4=new ImageIcon("help4.jpg");
Label ln[]=new Label[11];
Font f3=new Font(" ",12,44);
public crossword2(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b1=new JButton();
for(int i=0;i<43;i++){
t[i]=new TextField();
t[i].addKeyListener(this);
p.add(t[i]);
}
b2=new JButton();
b3=new JButton();
b4=new JButton();
p.setBounds(0, 0, 4000, 4000);
add(p);
for(int i=0;i<11;i++)
{l[i]=new Label();
}
l[0]=new Label("ACROSS");
l[0].setBounds(100,220,60,20);
p.add(l[0]);
l[1]=new Label("1.John's friends brought beautiful _ _ _ _ _ for him.");
l[1].setBounds(100,240,300,20);
p.add(l[1]);
l[2]=new Label("3.John cut the _ _ _ _ at 6 AM.");
l[2].setBounds(100,260,300,20);
p.add(l[2]);
l[3]=new Label("5.John was wearing _ _ _ dress.");
l[3].setBounds(100,280,300,20);
p.add(l[3]);
l[4]=new Label("6.John was very _ _ _ _ _.");
l[4].setBounds(100,300,300,20);
p.add(l[4]);
l[5]=new Label("7.John _ _ _ _ _ _ _ _ _ _ his birthday today. ");
l[5].setBounds(100,320,300,20);
p.add(l[5]);
l[6]=new Label("DOWN");
l[6].setBounds(100,370,60,20);
p.add(l[6]);
l[7]=new Label("1.John had arranged many _ _ _ _ _ for his friends.");
l[7].setBounds(100,390,300,20);
p.add(l[7]);
l[8]=new Label("2.John's mother had _ _ _ _ _ _ _ _ _ his room with balloons.");
l[8].setBounds(100,410,340,20);
p.add(l[8]);
l[9]=new Label("4.He had _ _ _ _ _ _ _ his friend on birthday party.");
l[9].setBounds(100,430,300,20);
p.add(l[9]);
l[10]=new Label("8.The knife was decorated with _ _ _ ribbon.");
l[10].setBounds(100,450,300,20);
p.add(l[10]);
ln[0]=new Label("1");
ln[0].setBounds(748,200,10,10);
t[0].setBounds(820,200,30,30);
t[1].setBounds(850,200,30,30);
t[2].setBounds(880,200,30,30);
t[3].setBounds(760,200,30,30);
t[4].setBounds(790,200,30,30);
ln[1]=new Label("2");
ln[1].setBounds(658,230,10,10);
t[5].setBounds(670,230,30,30);
t[6].setBounds(760,230,30,30);
t[7].setBounds(670,260,30,30);
t[8].setBounds(760,260,30,30);
ln[2]=new Label("3");
ln[2].setBounds(658,290,10,10);
t[9].setBounds(670,290,30,30);
t[10].setBounds(700,290,30,30);
t[11].setBounds(730,290,30,30);
t[12].setBounds(760,290,30,30);
t[13].setBounds(670,320,30,30);
t[14].setBounds(760,320,30,30);
t[15].setBounds(670,350,30,30);
ln[5]=new Label("6");
ln[5].setBounds(628,380,10,10);
t[16].setBounds(640,380,30,30);
t[17].setBounds(670,380,30,30);
t[18].setBounds(700,380,30,30);
t[19].setBounds(730,380,30,30);
t[20].setBounds(760,380,30,30);
t[21].setBounds(670,410,30,30);
ln[6]=new Label("7");
ln[6].setBounds(628,440,10,10);
t[22].setBounds(640,440,30,30);
t[23].setBounds(670,440,30,30);
t[24].setBounds(700,440,30,30);
t[25].setBounds(670,470,30,30);
t[26].setBounds(730,440,30,30);
t[27].setBounds(760,440,30,30);
ln[7]=new Label("8");
ln[7].setBounds(790,428,10,10);
t[28].setBounds(790,440,30,30);
t[29].setBounds(820,440,30,30);
t[30].setBounds(850,440,30,30);
t[31].setBounds(880,440,30,30);
t[32].setBounds(910,440,30,30);
t[33].setBounds(850,470,30,30);
t[34].setBounds(850,500,30,30);
t[35].setBounds(790,470,30,30);
t[36].setBounds(790,500,30,30);
t[37].setBounds(850,410,30,30);
t[38].setBounds(850,380,30,30);
ln[4]=new Label("5");
ln[4].setBounds(838,350,10,10);
t[39].setBounds(850,350,30,30);
ln[3]=new Label("4");
ln[3].setBounds(838,320,10,10);
t[40].setBounds(850,320,30,30);
t[41].setBounds(880,350,30,30);
t[42].setBounds(910,350,30,30);
b1.setBounds(1050,300,108,46);
b1.setIcon(i3);
b1.setBorder(null);
p.add(b1);
b2.setBounds(1050,400,90,45);
b2.setIcon(i1);
b2.setBorder(null);
p.add(b2);
b3.setBounds(1050,500,100,50);
b3.setIcon(i2);
b3.setBorder(null);
p.add(b3);
b4.setBounds(1050,220,100,30);
b4.setIcon(i4);
b4.setBorder(null);
p.add(b4);
for(int i=0;i<8;i++)
p.add(ln[i]);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
s=new Label("CROSSWORD 2");
s.setBounds(400, 70, 350, 50);
s.setFont(f3);
s.setForeground(Color.red);
p.add(s);
}
public static void main(String[] args) {
new crossword2();// TODO Auto-generated method stub
}
public void keyPressed(KeyEvent arg0) {
//TODO Auto-generated method stub
}
public void keyReleased(KeyEvent arg0) {
//TODO Auto-generated method stub
}
public void keyTyped(KeyEvent e) {
//TODO Auto-generated method stub
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b2)
{
new hcrs();
}
if(e.getSource()==b1){
String str[]=new String[43];
for(int i=0;i<43;i++)
str[i]=t[i].getText();
String strn[]=new String[9];
strn[0]=str[3]+str[4]+str[0]+str[1]+str[2];
strn[1]=str[3]+str[6]+str[8]+str[12]+str[14];
strn[2]=str[9]+str[10]+str[11]+str[12];
strn[3]=str[5]+str[7]+str[9]+str[13]+str[15]+str[17]+str[21]+str[23]+str[25];
strn[4]=str[16]+str[17]+str[18]+str[19]+str[20];
strn[5]=str[22]+str[23]+str[24]+str[26]+str[27]+str[28]+str[29]+str[30]+str[33]+str[34];
strn[6]=str[28]+str[35]+str[36];
strn[7]=str[40]+str[39]+str[38]+str[37]+str[30]+str[33]+str[34];
strn[8]=str[39]+str[41]+str[42];
if((strn[0].equals("gifts")||strn[0].equals("GIFTS"))&& (strn[1].equals("games")||strn[1].equals("GAMES"))&& (strn[2].equals("cake")||strn[2].equals("CAKE"))&& (strn[3].equals("decorated")||strn[3].equals("DECORATED"))
&& (strn[4].equals("happy")||strn[4].equals("HAPPY"))&& (strn[5].equals("celebrated")||strn[5].equals("CELEBRATED")) && (strn[6].equals("red")||strn[6].equals("RED")) && (strn[7].equals("invited")||strn[7].equals("INVITED"))
&& (strn[8].equals("new")||strn[8].equals("NEW")))
{
JOptionPane.showMessageDialog(this,"You win!");
}
else
JOptionPane.showMessageDialog(this,"Try again");
}
//TODO Auto-generated method stub
else if(e.getSource()==b2){
	new hcrs();
}
else if(e.getSource()==b3){
	new game();
}else if(e.getSource()==b4){
	new front();
}
}
public void windowActivated(WindowEvent arg0) {
//TODO Auto-generated method stub
}
public void windowClosed(WindowEvent arg0) {
//TODO Auto-generated method stub
}
public void windowClosing(WindowEvent arg0) {
System.exit(0);// TODO Auto-generated method stub
}
public void windowDeactivated(WindowEvent arg0) {
//TODO Auto-generated method stub
}
public void windowDeiconified(WindowEvent arg0) {
//TODO Auto-generated method stub
}
public void windowIconified(WindowEvent arg0) {
//TODO Auto-generated method stub
}
public void windowOpened(WindowEvent arg0) {
//TODO Auto-generated method stub
}
}