
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class crossword1 extends Frame implements ActionListener,KeyListener,WindowListener{
TextField t[]=new TextField[52];
Label l[]=new Label[15];
Label s;
Label ln[]=new Label[11];
JButton b,b1,b2,b3;
ImagePanel p=new ImagePanel("help5.jpg");
//ImagePanel i=new ImagePanel(".jpg");
ImageIcon i1=new ImageIcon("help3.jpg");
ImageIcon i2=new ImageIcon("help1.jpg");
ImageIcon i3=new ImageIcon("help2.jpg");
ImageIcon i4=new ImageIcon("help4.jpg");
Font f3=new Font(" ",12,44);
public crossword1(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b=new JButton();
for(int i=0;i<52;i++){
t[i]=new TextField();
t[i].addKeyListener(this);
p.add(t[i]);
}
b1=new JButton();
b2=new JButton();
b3=new JButton();
p.setBounds(0,0,4000,4000);
add(p);
for(int i=0;i<15;i++)
{l[i]=new Label();
p.add(l[i]);
}
l[0]=new Label("ACROSS");
l[0].setBounds(300,150,60,20);
p.add(l[0]);
l[1]=new Label("1.The color of banana is _ _ _ _ _ _.");
l[1].setBounds(200,170,300,20);
p.add(l[1]);
l[2]=new Label("4.I normally get _ _ at 6 AM.");
l[2].setBounds(200,190,300,20);
p.add(l[2]);
l[3]=new Label("6.It is a vegetable _ _ _ _ _ _. \n(rhymes with parrot)");
l[3].setBounds(200,210,300,20);
p.add(l[3]);
l[4]=new Label("7.Lions eat _ _ _ _\n (rhymes with beat)");
l[4].setBounds(200,230,300,20);
p.add(l[4]);
l[5]=new Label("10.The kids should not swim in _ _ _ _ water.\n(rhymes with keep) ");
l[5].setBounds(200,250,355,20);
p.add(l[5]);
l[6]=new Label("11.A baby cat is _ _ _ _ _ _. ");
l[6].setBounds(200,270,300,20);
p.add(l[6]);
l[7]=new Label("DOWN");
l[7].setBounds(300,300,60,20);
p.add(l[7]);
l[8]=new Label("1.Thank _ _ _ for the gift.");
l[8].setBounds(200,320,300,20);
p.add(l[8]);
l[9]=new Label("2.We had _ _ _ of fun in the picnic.(rhymes with cot)");
l[9].setBounds(200,340,300,20);
p.add(l[9]);
l[10]=new Label("3.This is a whole _ _ _ _ _ bread.(rhymes with meat)");
l[10].setBounds(200,360,300,20);
p.add(l[10]);
l[11]=new Label("5.My sandwich has two slices of _ _ _ _ _.");
l[11].setBounds(200,380,300,20);
p.add(l[11]);
l[12]=new Label("7.We get _ _ _ _ from cows. ");
l[12].setBounds(200,400,300,20);
p.add(l[12]);
l[13]=new Label("8.In NCC camp, we lived in a _ _ _ _.");
l[13].setBounds(200,420,300,20);
p.add(l[13]);
l[14]=new Label("9.Can you _ _ _ _ a top?(rhymes with win)");
l[14].setBounds(200,440,300,20);
p.add(l[14]);
t[0].setBounds(640,200,30,30);
ln[0]=new Label("1");
ln[0].setBounds(640,188,10,10);
t[1].setBounds(670,200,30,30);
t[2].setBounds(700,200,30,30);
t[3].setBounds(730,200,30,30);
ln[1]=new Label("2");
ln[1].setBounds(730,188,10,10);
t[4].setBounds(760,200,30,30);
t[5].setBounds(790,200,30,30);
ln[2]=new Label("3");
ln[2].setBounds(790,188,10,10);
t[6].setBounds(640,230,30,30);
//t[7].setBounds(670,230,30,30);
//t[8].setBounds(700,230,30,30);
t[9].setBounds(730,230,30,30);
//t[10].setBounds(760,230,30,30);
t[11].setBounds(790,230,30,30);
t[12].setBounds(640,260,30,30);
ln[3]=new Label("4");
ln[3].setBounds(628,260,10,10);
t[13].setBounds(670,260,30,30);
//t[14].setBounds(700,260,30,30);
t[15].setBounds(730,260,30,30);
//t[16].setBounds(760,260,30,30);
t[17].setBounds(790,260,30,30);
ln[4]=new Label("5");
ln[4].setBounds(688,290,10,10);
t[18].setBounds(700,290,30,30);
//t[19].setBounds(730,290,30,30);
//t[20].setBounds(760,290,30,30);
t[21].setBounds(790,290,30,30);
ln[5]=new Label("6");
ln[5].setBounds(628,320,10,10);
t[22].setBounds(640,320,30,30);
t[23].setBounds(670,320,30,30);
t[24].setBounds(700,320,30,30);
t[25].setBounds(730,320,30,30);
t[26].setBounds(760,320,30,30);
t[27].setBounds(790,320,30,30);
t[28].setBounds(700,350,30,30);
ln[6]=new Label("7");
ln[6].setBounds(628,380,10,10);
t[29].setBounds(640,380,30,30);
t[30].setBounds(670,380,30,30);
t[31].setBounds(700,380,30,30);
ln[7]=new Label("8");
ln[7].setBounds(730,368,10,10);
t[32].setBounds(730,380,30,30);
ln[8]=new Label("9");
ln[8].setBounds(790,368,10,10);

t[33].setBounds(790,380,30,30);
t[34].setBounds(640,410,30,30);
//t[35].setBounds(670,410,30,30);
ln[9]=new Label("10");
ln[9].setBounds(678,410,20,10);

t[36].setBounds(700,410,30,30);
t[37].setBounds(730,410,30,30);
t[38].setBounds(760,410,30,30);
t[39].setBounds(790,410,30,30);
t[40].setBounds(640,440,30,30);
// t[41].setBounds(670,440,30,30);
//t[42].setBounds(700,440,30,30);
t[43].setBounds(730,440,30,30);
//t[44].setBounds(760,440,30,30);
t[45].setBounds(790,440,30,30);
ln[10]=new Label("11");
ln[10].setBounds(618,470,20,10);

t[46].setBounds(640,470,30,30);
t[47].setBounds(670,470,30,30);
t[48].setBounds(700,470,30,30);
t[49].setBounds(730,470,30,30);
t[50].setBounds(760,470,30,30);
t[51].setBounds(790,470,30,30);
for(int i=0;i<11;i++){
p.add(ln[i]);
}
/* t[7].setEnabled(false);
			t[8].setEnabled(false);
			t[10].setEnabled(false);
			t[14].setEnabled(false);
			t[16].setEnabled(false);
			t[19].setEnabled(false);
			t[20].setEnabled(false);
			t[35].setEnabled(false);
			t[41].setEnabled(false);
			t[42].setEnabled(false);
			t[44].setEnabled(false);
*/
			
			/*t[7].setBackground(Color.BLACK);
			t[8].setBackground(Color.BLACK);
			t[14].setBackground(Color.BLACK);
					t[19].setBackground(Color.BLACK);
					t[20].setBackground(Color.BLACK);
					t[10].setBackground(Color.BLACK);
					t[16].setBackground(Color.BLACK);*/
			
b.setBounds(700,550,60,30);
p.add(b);
b.addActionListener(this);
			/*for(int i=0;i<30;i++){
for(int j=200;j<=380;j+=30){
for(int k=200;k<=350;k+=30)
{
	t[i].setBounds(j,k,30,30);
	System.out.print(j+" "+k);
	}
}		}
*/
b.setBounds(1050,300,108,46);
b.setIcon(i3);
p.add(b);
b1.setBounds(1050,400,100,50);
b1.setIcon(i1);
p.add(b1);
b2.setBounds(1050,220,100,30);
b2.setIcon(i4);
p.add(b2);
b3.setBounds(1050,500,110,40);
b3.setIcon(i2);
p.add(b3);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
/*for(int i=0;i<30;i++){
for(int j=200;j<=380;j+=30){
for(int k=200;k<=350;k+=30)
{
t[i].setBounds(j,k,30,30);
System.out.print(j+" "+k);
}
} }
*/
s=new Label("CROSSWORD 1");
s.setBounds(450, 80, 350, 50);
s.setFont(f3);
s.setForeground(Color.red);
p.add(s);
}
public static void main(String[] args) {
new crossword1();// TODO Auto-generated method stub
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
if(e.getSource()==b1)
{
new hcrs();
}
if(e.getSource()==b){
String str[]=new String[52];
for(int i=0;i<52;i++)
str[i]=t[i].getText();
//for(int i=0;i<28;i++)
//System.out.println(str[i]);
String strn[]=new String[13];
strn[0]=str[0]+str[1]+str[2]+str[3]+str[4]+str[5];
strn[1]=str[0]+str[6]+str[12];
strn[2]=str[12]+str[13];
strn[3]=str[3]+str[9]+str[15];
strn[4]=str[5]+str[11]+str[17]+str[21]+str[27];
strn[5]=str[22]+str[23]+str[24]+str[25]+str[26]+str[27];
strn[6]=str[18]+str[24]+str[28]+str[31]+str[36];
strn[7]=str[29]+str[30]+str[31]+str[32];
strn[8]=str[29]+str[34]+str[40]+str[46];
strn[9]=str[36]+str[37]+str[38]+str[39];
strn[10]=str[46]+str[47]+str[48]+str[49]+str[50]+str[51];
strn[11]=str[32]+str[37]+str[43]+str[49];
strn[12]=str[33]+str[39]+str[45]+str[51];
if((strn[0].equals("yellow")||strn[0].equals("YELLOW"))&& (strn[1].equals("you")||strn[1].equals("YOU"))&&(strn[2].equals("up")||strn[2].equals("UP"))&& (strn[3].equals("lot")||strn[3].equals("LOT"))
&& (strn[4].equals("wheat")||strn[4].equals("WHEAT"))&& (strn[5].equals("carrot")||strn[5].equals("CARROT")) && (strn[6].equals("bread")||strn[6].equals("BREAD")) && (strn[7].equals("meat")||strn[7].equals("MEAT"))
&& (strn[8].equals("milk")||strn[8].equals("MILK")) && (strn[9].equals("deep")||strn[9].equals("DEEP")) && (strn[10].equals("kitten")||strn[10].equals("KITTEN")) && (strn[11].equals("tent")||strn[11].equals("TENT")) && (strn[12].equals("spin")||strn[12].equals("SPIN")))
{int option=1;
option=JOptionPane.showConfirmDialog(this,"You win! \nDo you want to try another puzzle?");
{
if(option==JOptionPane.YES_OPTION){
new crossword2();
}
else if(option==JOptionPane.NO_OPTION || option==JOptionPane.CANCEL_OPTION){
this.setVisible(false);
new game();
}
}
}
else
JOptionPane.showMessageDialog(this,"Try again");
}
//TODO Auto-generated method stub
else if(e.getSource()==b1){
	new hcrs();
}
else if(e.getSource()==b2){
	new front();
	
}else if(e.getSource()==b3){
	new game();
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