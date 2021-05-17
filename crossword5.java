
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class crossword5 extends Frame implements ActionListener,KeyListener,WindowListener{
/**
* @param args
*/
ImagePanel p=new ImagePanel("help5.jpg");
//ImagePanel i=new ImagePanel("IMAGE copy.jpg");
ImageIcon i1=new ImageIcon("help3.jpg");
ImageIcon i2=new ImageIcon("help1.jpg");
ImageIcon i3=new ImageIcon("help2.jpg");
ImageIcon i4=new ImageIcon("help4.jpg");

TextField t[]=new TextField[58];
Label l[]=new Label[11];
Label s;
JButton b1,b2,b3,b4;
Label ln[]=new Label[11];
Font f3=new Font(" ",12,44);
public crossword5(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b1=new JButton("Check");
for(int i=0;i<58;i++){
t[i]=new TextField();
t[i].addKeyListener(this);
p.add(t[i]);
}
b2=new JButton("Help");
b3=new JButton("Home");
b4=new JButton("Back");
p.setBounds(0,0,4000,4000);
add(p);
for(int i=0;i<11;i++)
{
l[i]=new Label();
p.add(l[i]);
}
l[0]=new Label("ACROSS");
l[0].setBounds(100,150,60,20);
p.add(l[0]);
l[1]=new Label("2.Different animals eat _ _ _ _ _ _ _ _ _ kinds of food.");
l[1].setBounds(100,170,300,20);
p.add(l[1]);
l[2]=new Label("3.Leeches suck _ _ _ _ _.");
l[2].setBounds(100,190,300,20);
p.add(l[2]);
l[3]=new Label("5.Plants prepare their own food through _ _ _ _ _ _ _ _ _ _ _.");
l[3].setBounds(100,210,300,20);
p.add(l[3]);
l[4]=new Label("7.Pulses are rich in _ _ _ _ _ _ _ _.");
l[4].setBounds(100,230,300,20);
p.add(l[4]);
l[5]=new Label("8.Fruits and vegetables give us minerals and _ _ _ _ _ _ _ _. ");
l[5].setBounds(100,250,355,20);
p.add(l[5]);
l[6]=new Label("DOWN");
l[6].setBounds(100,300,60,20);
p.add(l[6]);
l[7]=new Label("1.Wheat and rice are rich in _ _ _ _ _ _ _ _ _ _ _ _ _.");
l[7].setBounds(100,320,300,20);
p.add(l[7]);
l[8]=new Label("3.I want to read a good _ _ _ _.");
l[8].setBounds(100,340,340,20);
p.add(l[8]);
l[9]=new Label("4.We get our food from _ _ _ _ _ _ and animals.");
l[9].setBounds(100,360,380,20);
p.add(l[9]);
l[10]=new Label("6.Lions _ _ _ _ other animals and eat them.");
l[10].setBounds(100,380,300,20);
p.add(l[10]);
ln[0]=new Label("1");
ln[0].setBounds(778,200,10,10);
t[0].setBounds(790,200,30,30);
t[1].setBounds(790,230,30,30);
t[2].setBounds(790,260,30,30);
t[3].setBounds(790,290,30,30);
t[4].setBounds(790,320,30,30);
t[5].setBounds(790,350,30,30);
t[6].setBounds(790,380,30,30);
t[7].setBounds(790,410,30,30);
t[8].setBounds(790,440,30,30);
t[9].setBounds(790,470,30,30);
t[10].setBounds(790,500,30,30);
t[11].setBounds(790,530,30,30);
t[12].setBounds(790,560,30,30);
ln[1]=new Label("2");
ln[1].setBounds(628,260,10,10);
t[13].setBounds(640,260,30,30);
t[14].setBounds(670,260,30,30);
t[15].setBounds(700,260,30,30);
t[16].setBounds(730,260,30,30);
t[17].setBounds(760,260,30,30);
t[18].setBounds(820,260,30,30);
t[19].setBounds(850,260,30,30);
t[20].setBounds(880,260,30,30);
ln[2]=new Label("3");
ln[2].setBounds(688,320,10,10);
t[21].setBounds(700,320,30,30);
t[22].setBounds(730,320,30,30);
t[23].setBounds(760,320,30,30);
t[24].setBounds(820,320,30,30);
t[25].setBounds(700,350,30,30);
t[26].setBounds(700,380,30,30);
t[27].setBounds(700,410,30,30);
ln[3]=new Label("4");
ln[3].setBounds(598,350,10,10);
t[28].setBounds(610,350,30,30);
t[29].setBounds(610,380,30,30);
t[30].setBounds(610,410,30,30);
t[31].setBounds(610,440,30,30);
t[32].setBounds(610,470,30,30);
t[33].setBounds(610,500,30,30);
ln[4]=new Label("5");
ln[4].setBounds(538,380,10,10);
t[34].setBounds(550,380,30,30);
t[35].setBounds(580,380,30,30);
t[36].setBounds(640,380,30,30);
t[37].setBounds(670,380,30,30);
t[38].setBounds(730,380,30,30);
t[39].setBounds(760,380,30,30);
t[40].setBounds(820,380,30,30);
t[41].setBounds(850,380,30,30);
ln[5]=new Label("6");
ln[5].setBounds(868,440,10,10);
t[42].setBounds(880,440,30,30);
t[43].setBounds(880,470,30,30);
t[44].setBounds(880,500,30,30);
t[45].setBounds(880,530,30,30);
ln[6]=new Label("7");
ln[6].setBounds(688,500,10,10);
t[46].setBounds(700,500,30,30);
t[47].setBounds(730,500,30,30);
t[48].setBounds(760,500,30,30);
t[49].setBounds(820,500,30,30);
t[50].setBounds(850,500,30,30);
ln[7]=new Label("8");
ln[7].setBounds(568,560,10,10);
t[51].setBounds(580,560,30,30);
t[52].setBounds(610,560,30,30);
t[53].setBounds(640,560,30,30);
t[54].setBounds(670,560,30,30);
t[55].setBounds(700,560,30,30);
t[56].setBounds(730,560,30,30);
t[57].setBounds(760,560,30,30);
for(int i=0;i<8;i++)
p.add(ln[i]);

b1.setBounds(1050,300,100,50);
b1.setIcon(i3);
p.add(b1);
b1.addActionListener(this);
b2.setBounds(1050,400,100,50);
b2.setIcon(i1);
p.add(b2);
b2.addActionListener(this);
b3.setBounds(1050,200,100,50);
b3.setIcon(i4);
p.add(b3);
b3.addActionListener(this);
b4.setBounds(1050,500,100,50);
b4.setIcon(i2);
p.add(b4);
b4.addActionListener(this);
s=new Label("CROSSWORD 5");
s.setBounds(400, 80, 350, 50);
s.setFont(f3);
s.setForeground(Color.red);
p.add(s);
}
public static void main(String[] args) {
new crossword5();// TODO Auto-generated method stub
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
if(e.getSource()==b2)
{
new hcrs();
}
else if(e.getSource()==b1){

String str[]=new String[58];
for(int i=0;i<58;i++)
str[i]=t[i].getText();
String strn[]=new String[9];
strn[0]=str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9]+str[10]+str[11]+str[12];
strn[1]=str[13]+str[14]+str[15]+str[16]+str[17]+str[2]+str[18]+str[19]+str[20];
strn[2]=str[21]+str[22]+str[23]+str[4]+str[24];
strn[3]=str[21]+str[25]+str[26]+str[27];
strn[4]=str[28]+str[29]+str[30]+str[31]+str[32]+str[33];
strn[5]=str[34]+str[35]+str[29]+str[36]+str[37]+str[26]+str[38]+str[39]+str[6]+str[40]+str[41];
strn[6]=str[42]+str[43]+str[44]+str[45];
strn[7]=str[46]+str[47]+str[48]+str[10]+str[49]+str[50]+str[44];
strn[8]=str[51]+str[52]+str[53]+str[54]+str[55]+str[56]+str[57]+str[12];
if(strn[0].equals("carbohydrates")&& strn[1].equals("different")&& strn[2].equals("blood")&& strn[3].equals("book")
&& strn[4].equals("plants")&& strn[5].equals("chlorophyll") && strn[6].equals("hunt") && strn[7].equals("protein")
&& strn[8].equals("vitamins"))
{int option=1;
JOptionPane.showConfirmDialog(this,"You win!\n Do you want to try another puzzle??");
if(option==JOptionPane.YES_OPTION){
	new crossword6();
}
else if(option==JOptionPane.NO_OPTION || option==JOptionPane.CANCEL_OPTION){
System.exit(0);
}
}
else
JOptionPane.showMessageDialog(this,"Try again");
}
// TODO Auto-generated method stub
else if(e.getSource()==b2){
	new hcrs();
}
else if(e.getSource()==b3){
	new front();
	
}else if(e.getSource()==b4){
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
}}