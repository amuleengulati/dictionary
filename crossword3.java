
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class crossword3 extends Frame implements ActionListener,KeyListener,WindowListener{
/**
* @param args
*/
TextField t[]=new TextField[43];
Label l[]=new Label[17];
Label s;
Label ln[]=new Label[13];
JButton b,b1,b2,b3;
ImagePanel p=new ImagePanel("help5.jpg");
//ImagePanel i=new ImagePanel("IMAGE copy.jpg");
ImageIcon i1=new ImageIcon("help3.jpg");
ImageIcon i2=new ImageIcon("help1.jpg");
ImageIcon i3=new ImageIcon("help2.jpg");
ImageIcon i4=new ImageIcon("help4.jpg");
Font f3=new Font(" ",12,44);
public crossword3(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b=new JButton();
b1=new JButton();
b2=new JButton();
b3=new JButton();
p.setBounds(0,0,4000,4000);
add(p);
for(int i=0;i<43;i++){
t[i]=new TextField();
t[i].addKeyListener(this);
p.add(t[i]);
}
for(int i=0;i<17;i++)
{l[i]=new Label();
p.add(l[i]);
}
l[0]=new Label("ACROSS");
l[0].setBounds(100,200,60,20);
p.add(l[0]);
l[1]=new Label("1._ _ _ _ _ of a feather flock together .");
l[1].setBounds(100,220,310,20);
p.add(l[1]);
l[2]=new Label("4.In our group there are five girls and only one _ _ _. ");
l[2].setBounds(100,240,310,20);
p.add(l[2]);
l[3]=new Label("5.Simar likes to read. _ _ goes to the library every day.");
l[3].setBounds(100,260,310,20);
p.add(l[3]);
l[4]=new Label("6.Tini and Nishi wear blue _ _ _ _ _.(rhymes with beans)");
l[4].setBounds(100,280,310,20);
p.add(l[4]);
l[5]=new Label("8.Who has won the _ _ _ ? (rhymes with set)");
l[5].setBounds(100,300,310,20);
p.add(l[5]);
l[6]=new Label("10.I take dinner _ _ 9 P.M. ");
l[6].setBounds(100,320,310,20);
p.add(l[6]);
l[7]=new Label("13. _ _ _ _ _ are four beds in the room");
l[7].setBounds(100,340,310,20);
p.add(l[7]);
l[8]=new Label("DOWN");
l[8].setBounds(100,390,60,20);
p.add(l[8]);
l[9]=new Label("1.My favourite colour is _ _ _ _ .(rhymes with glue)");
l[9].setBounds(100,410,360,20);
p.add(l[9]);
l[10]=new Label("2.She used a red _ _ _ _ _ _ to tie up her hair.");
l[10].setBounds(100,430,360,20);
p.add(l[10]);
l[11]=new Label("3.On a clear day , the _ _ _ looks blue. (rhymes with buy)");
l[11].setBounds(100,450,360,20);
p.add(l[11]);
l[12]=new Label("6.After completing studies this is my first _ _ _. (rhymes with mob)");
l[12].setBounds(100,470,360,20);
p.add(l[12]);
l[13]=new Label("7.Another name for ocean is _ _ _. ");
l[13].setBounds(100,490,360,20);
p.add(l[13]);
l[14]=new Label("9.Cows _ _ _ grass.");
l[14].setBounds(100,510,360,20);
p.add(l[14]);
l[15]=new Label("11. _ _ _ the laces of your shoes.");
l[15].setBounds(100,530,360,20);
p.add(l[15]);
l[16]=new Label("12.I and Sukhman are going to the park. _ _ will play there.");
l[16].setBounds(100,550,360,20);
p.add(l[16]);
ln[0]=new Label("1");
ln[0].setBounds(670,218,10,10);
t[0].setBounds(670,230,30,30);
t[1].setBounds(700,230,30,30);
ln[1]=new Label("2");
ln[1].setBounds(730,218,10,10);
t[2].setBounds(730,230,30,30);
t[3].setBounds(760,230,30,30);
ln[2]=new Label("3");
ln[2].setBounds(790,218,10,10);
t[4].setBounds(790,230,30,30);
t[5].setBounds(670,260,30,30);
t[6].setBounds(730,260,30,30);
//t[7].setBounds(730,230,30,30);
t[8].setBounds(790,260,30,30);
t[9].setBounds(670,290,30,30);
ln[3]=new Label("4");
ln[3].setBounds(718,290,10,10);
t[10].setBounds(730,290,30,30);
t[11].setBounds(760,290,30,30);
t[12].setBounds(790,290,30,30);
ln[4]=new Label("5");
ln[4].setBounds(628,320,10,10);
t[13].setBounds(640,320,30,30);
t[14].setBounds(670,320,30,30);
t[15].setBounds(730,320,30,30);
t[16].setBounds(730,350,30,30);
ln[5]=new Label("6");
ln[5].setBounds(628,380,10,10);
t[17].setBounds(640,380,30,30);
t[18].setBounds(670,380,30,30);
t[19].setBounds(700,380,30,30);
t[20].setBounds(730,380,30,30);
ln[6]=new Label("7");
ln[6].setBounds(760,368,10,10);
t[21].setBounds(760,380,30,30);
t[22].setBounds(640,410,30,30);
//t[23].setBounds(640,380,30,30);
//t[24].setBounds(670,380,30,30);
//t[25].setBounds(700,380,30,30);
t[26].setBounds(760,410,30,30);
ln[7]=new Label("8");
ln[7].setBounds(628,440,10,10);
t[27].setBounds(640,440,30,30);
ln[8]=new Label("9");
ln[8].setBounds(670,428,10,10);
t[28].setBounds(670,440,30,30);
t[29].setBounds(700,440,30,30);
//t[30].setBounds(700,410,30,30);
ln[9]=new Label("10");
ln[9].setBounds(738,440,20,15);
t[31].setBounds(760,440,30,30);
ln[10]=new Label("11");
ln[10].setBounds(790,428,20,10);
t[32].setBounds(790,440,30,30);
t[33].setBounds(670,470,30,30);
//t[34].setBounds(670,440,30,30);
ln[11]=new Label("12");
ln[11].setBounds(730,458,20,10);
t[35].setBounds(730,470,30,30);
//t[36].setBounds(730,440,30,30);
t[37].setBounds(790,470,30,30);
ln[12]=new Label("13");
ln[12].setBounds(648,500,20,15);
t[38].setBounds(670,500,30,30);
t[39].setBounds(700,500,30,30);
t[40].setBounds(730,500,30,30);
t[41].setBounds(760,500,30,30);
t[42].setBounds(790,500,30,30);
for(int i=0;i<43;i++)
{
p.add(t[i]);
}
for(int i=0;i<13;i++)
p.add(ln[i]);
b.setBounds(1050,300,100,50);
b.setIcon(i3);
p.add(b);
b1.setBounds(1050,400,100,50);
b1.setIcon(i1);
p.add(b1);
b2.setBounds(1050,500,100,50);
b2.setIcon(i2);
p.add(b2);
b3.setBounds(1050,200,100,50);
b3.setIcon(i4);
p.add(b3);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
s=new Label("CROSSWORD 3");
s.setBounds(400, 80, 350, 50);
s.setFont(f3);
s.setForeground(Color.red);
p.add(s);
}
public static void main(String[] args) {
new crossword3();// TODO Auto-generated method stub
}
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
if(e.getSource()==b1)
{
new hcrs();
}
if(e.getSource()==b){
String str[]=new String[43];
for(int i=0;i<43;i++)
str[i]=t[i].getText();
//for(int i=0;i<28;i++)
//System.out.println(str[i]);
String strn[]=new String[15];
strn[0]=str[0]+str[1]+str[2]+str[3]+str[4]; //birds
strn[1]=str[0]+str[5]+str[9]+str[14]; //blue
strn[2]=str[2]+str[6]+str[10]+str[15]+str[16]+str[20]; //ribbon
strn[3]=str[4]+str[8]+str[12]; //sky
strn[4]=str[13]+str[14]; //he
strn[5]=str[10]+str[11]+str[12]; //boy
strn[6]=str[17]+str[18]+str[19]+str[20]+str[21]; //jeans
strn[7]=str[17]+str[22]+str[27]; //job
strn[8]=str[21]+str[26]+str[31]; //sea
strn[9]=str[27]+str[28]+str[29]; //bet
strn[10]=str[31]+str[32]; //at
strn[11]=str[28]+str[33]+str[38]; //eat
strn[12]=str[32]+str[37]+str[42]; //tie
strn[13]=str[38]+str[39]+str[40]+str[41]+str[42]; //there
strn[14]=str[35]+str[40]; //we
int option=1;
if(strn[0].equals("birds")&& strn[1].equals("blue")&& strn[2].equals("ribbon")&& strn[3].equals("sky")
&& strn[4].equals("he")&& strn[5].equals("boy") && strn[6].equals("jeans") && strn[7].equals("job")
&& strn[8].equals("sea") && strn[9].equals("bet") && strn[10].equals("at") && strn[11].equals("eat")
&& strn[12].equals("tie") && strn[13].equals("there") && strn[14].equals("we")){
JOptionPane.showConfirmDialog(this,"You win! \nDo you want to try another puzzle?");}
if(option==JOptionPane.YES_OPTION){
	new crossword4();
}
else if(option==JOptionPane.NO_OPTION || option==JOptionPane.CANCEL_OPTION){
System.exit(0);
}
else
JOptionPane.showMessageDialog(this,"Try again");
}
else if(e.getSource()==b1){
	new hcrs();
}
else if(e.getSource()==b2){
	new game();
	
}else if(e.getSource()==b3){
	new front();
}
}
// TODO Auto-generated method stub
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