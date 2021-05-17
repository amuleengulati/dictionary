
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class crossword4 extends Frame implements ActionListener,KeyListener,WindowListener{
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
Label l[]=new Label[26];
Label ln[]=new Label[21];
Label s;
JButton b,b1,b2,b3;
Font f3=new Font(" ",12,44);
public crossword4(){
this.setVisible(true);
this.addWindowListener(this);
setLayout(null);
setSize(4000,4000);
b=new JButton("Check");
b1=new JButton("home");
b2=new JButton("help");
b3=new JButton("back");
p.setBounds(0,0,4000,4000);
add(p);
for(int i=0;i<58;i++){
t[i]=new TextField();
t[i].addKeyListener(this);
add(t[i]);
p.add(t[i]);
}
for(int i=0;i<26;i++)
{l[i]=new Label();
p.add(l[i]);
add(l[i]);
}
l[0]=new Label("ACROSS");
l[0].setBounds(100,150,60,20);
add(l[0]);
p.add(l[0]);
l[1]=new Label("1.bearded beast");
l[1].setBounds(100,170,300,20);
add(l[1]);
p.add(l[1]);
l[2]=new Label("3.one-pot dinner");
l[2].setBounds(100,190,300,20);
add(l[2]);
p.add(l[2]);
l[3]=new Label("6.school subject");
l[3].setBounds(100,210,300,20);
add(l[3]);
p.add(l[3]);
l[4]=new Label("9.helper");
l[4].setBounds(100,230,300,20);
add(l[4]);
p.add(l[4]);
l[5]=new Label("11.computer key ");
l[5].setBounds(100,250,355,20);
add(l[5]);
p.add(l[5]);
l[6]=new Label("12.blood sucking insect ");
l[6].setBounds(100,270,300,20);
add(l[6]);
p.add(l[6]);
l[7]=new Label("13.in addition to ");
l[7].setBounds(100,290,300,20);
add(l[7]);
p.add(l[7]);
l[8]=new Label("14.tear ");
l[8].setBounds(100,310,300,20);
add(l[8]);
p.add(l[8]);
l[9]=new Label("15.hit hard ");
l[9].setBounds(100,330,300,20);
add(l[9]);
p.add(l[9]);
l[10]=new Label("17.shed item ");
l[10].setBounds(100,350,300,20);
add(l[10]);
p.add(l[10]);
l[11]=new Label("20.garden intruder ");
l[11].setBounds(100,370,300,20);
add(l[11]);
p.add(l[11]);
l[12]=new Label("21.sluggish ");
l[12].setBounds(100,390,300,20);
add(l[12]);
p.add(l[12]);
l[13]=new Label("DOWN");
l[13].setBounds(100,420,60,20);
add(l[13]);
p.add(l[13]);
l[14]=new Label("1.diamond or opal.");
l[14].setBounds(100,440,300,20);
add(l[14]);
p.add(l[14]);
l[15]=new Label("2.picnic pest");
l[15].setBounds(100,460,300,20);
add(l[15]);
p.add(l[15]);
l[16]=new Label("4.prefix meaning 3");
l[16].setBounds(100,480,300,20);
add(l[16]);
p.add(l[16]);
l[17]=new Label("5.anguish");
l[17].setBounds(100,500,300,20);
add(l[17]);
p.add(l[17]);
l[18]=new Label("7.let ");
l[18].setBounds(100,520,300,20);
add(l[18]);
p.add(l[18]);
l[19]=new Label("8.cardiologist's concern");
l[19].setBounds(100,540,300,20);
add(l[19]);
p.add(l[19]);
l[20]=new Label("9.alter to be suitable");
l[20].setBounds(100,560,300,20);
add(l[20]);
p.add(l[20]);
l[21]=new Label("10.bee gee's music");
l[21].setBounds(100,580,300,20);
add(l[21]);
p.add(l[21]);
l[22]=new Label("15.stitch with needle and thread");
l[22].setBounds(100,600,300,20);
add(l[22]);
p.add(l[22]);
l[23]=new Label("16.No. of years old");
l[23].setBounds(100,620,300,20);
add(l[23]);
p.add(l[23]);
l[24]=new Label("18.bird like hedwig");
l[24].setBounds(100,640,300,20);
add(l[24]);
p.add(l[24]);
l[25]=new Label("19.not high");
l[25].setBounds(100,660,300,20);
add(l[25]);
p.add(l[25]);
ln[0]=new Label("1");
ln[0].setBounds(620,188,10,10);
p.add(ln[0]);
t[0].setBounds(620,200,30,30);
p.add(t[0]);
t[1].setBounds(650,200,30,30);
p.add(t[1]);
ln[1]=new Label("2");
ln[1].setBounds(680,188,10,10);
p.add(ln[1]);
t[2].setBounds(680,200,30,30);
p.add(t[2]);
t[3].setBounds(710,200,30,30);
p.add(t[3]);
ln[2]=new Label("3");
ln[2].setBounds(770,188,10,10);
p.add(ln[2]);
t[4].setBounds(770,200,30,30);
p.add(t[4]);
ln[3]=new Label("4");
ln[3].setBounds(800,188,10,10);
p.add(ln[3]);
t[5].setBounds(800,200,30,30);
p.add(t[5]);
t[6].setBounds(830,200,30,30);
p.add(t[6]);
ln[4]=new Label("5");
ln[4].setBounds(860,188,10,10);
p.add(ln[4]);
t[7].setBounds(860,200,30,30);
p.add(t[7]);
t[8].setBounds(620,230,30,30);
p.add(t[8]);
t[9].setBounds(680,230,30,30);
p.add(t[9]);
t[10].setBounds(800,230,30,30);
p.add(t[10]);
t[11].setBounds(860,230,30,30);
p.add(t[11]);
ln[5]=new Label("6");
ln[5].setBounds(608,260,10,10);
p.add(ln[5]);
t[12].setBounds(620,260,30,30);
p.add(t[12]);
ln[6]=new Label("7");
ln[6].setBounds(650,248,10,10);
p.add(ln[6]);
t[13].setBounds(650,260,30,30);
p.add(t[13]);
t[14].setBounds(680,260,30,30);
p.add(t[14]);
ln[7]=new Label("8");
ln[7].setBounds(710,248,10,10);
p.add(ln[7]);
t[15].setBounds(710,260,30,30);
p.add(t[15]);
ln[8]=new Label("9");
ln[8].setBounds(770,248,10,10);
p.add(ln[8]);
t[16].setBounds(770,260,30,30);
p.add(t[16]);
t[17].setBounds(800,260,30,30);
p.add(t[17]);
ln[9]=new Label("10");
ln[9].setBounds(830,248,20,10);
p.add(ln[9]);
t[18].setBounds(830,260,30,30);
p.add(t[18]);
t[19].setBounds(860,260,30,30);
p.add(t[19]);
t[20].setBounds(650,290,30,30);
p.add(t[20]);
ln[10]=new Label("11");
ln[10].setBounds(688,290,20,10);
p.add(ln[10]);
t[21].setBounds(710,290,30,30);
p.add(t[21]);
t[22].setBounds(740,290,30,30);
p.add(t[22]);
t[23].setBounds(770,290,30,30);
p.add(t[23]);
t[24].setBounds(830,290,30,30);
p.add(t[24]);
ln[11]=new Label("12");
ln[11].setBounds(598,320,20,10);
p.add(ln[11]);
t[25].setBounds(620,320,30,30);
p.add(t[25]);
t[26].setBounds(650,320,30,30);
p.add(t[26]);
t[27].setBounds(680,320,30,30);
p.add(t[27]);
t[28].setBounds(710,320,30,30);
p.add(t[28]);
ln[12]=new Label("13");
ln[12].setBounds(748,320,20,10);
p.add(ln[12]);
t[29].setBounds(770,320,30,30);
p.add(t[29]);
t[30].setBounds(800,320,30,30);
p.add(t[30]);
t[31].setBounds(830,320,30,30);
p.add(t[31]);
t[32].setBounds(860,320,30,30);
p.add(t[32]);
t[33].setBounds(650,350,30,30);
p.add(t[33]);
ln[13]=new Label("14");
ln[13].setBounds(688,350,20,10);
p.add(ln[13]);
t[34].setBounds(710,350,30,30);
p.add(t[34]);
t[35].setBounds(740,350,30,30);
p.add(t[35]);
t[36].setBounds(770,350,30,30);
p.add(t[36]);
t[37].setBounds(830,350,30,30);
p.add(t[37]);
ln[14]=new Label("15");
ln[14].setBounds(598,380,20,10);
p.add(ln[14]);
t[38].setBounds(620,380,30,30);
p.add(t[38]);
t[39].setBounds(650,380,30,30);
p.add(t[39]);
ln[15]=new Label("16");
ln[15].setBounds(680,368,20,10);
p.add(ln[15]);
t[40].setBounds(680,380,30,30);
p.add(t[40]);
t[41].setBounds(710,380,30,30);
p.add(t[41]);
ln[16]=new Label("17");
ln[16].setBounds(748,380,20,10);
p.add(ln[16]);
t[42].setBounds(770,380,30,30);
p.add(t[42]);
ln[17]=new Label("18");
ln[17].setBounds(800,368,20,10);
p.add(ln[17]);
t[43].setBounds(800,380,30,30);
p.add(t[43]);
t[44].setBounds(830,380,30,30);
p.add(t[44]);
ln[18]=new Label("19");
ln[18].setBounds(860,368,20,10);
p.add(ln[18]);
t[45].setBounds(860,380,30,30);
p.add(t[45]);
t[46].setBounds(620,410,30,30);
p.add(t[46]);
t[47].setBounds(680,410,30,30);
p.add(t[47]);
t[48].setBounds(800,410,30,30);
p.add(t[48]);
t[49].setBounds(860,410,30,30);
p.add(t[49]);
ln[19]=new Label("20");
ln[19].setBounds(598,440,20,10);
p.add(ln[19]);
t[50].setBounds(620,440,30,30);
p.add(t[50]);
t[51].setBounds(650,440,30,30);
p.add(t[51]);
t[52].setBounds(680,440,30,30);
p.add(t[52]);
t[53].setBounds(710,440,30,30);
p.add(t[53]);
ln[20]=new Label("21");
ln[20].setBounds(748,440,20,10);
p.add(ln[20]);
t[54].setBounds(770,440,30,30);
p.add(t[54]);
t[55].setBounds(800,440,30,30);
p.add(t[55]);
t[56].setBounds(830,440,30,30);
p.add(t[56]);
t[57].setBounds(860,440,30,30);
p.add(t[57]);
for(int i=0;i<21;i++)
p.add(ln[i]);
b.setBounds(1050,300,90,50);
add(b);
b.setIcon(i3);
p.add(b);
b1.setBounds(1050,200,90,50);
add(b1);
b1.setIcon(i4);
p.add(b1);
b2.setBounds(1050,400,90,50);
add(b2);
b2.setIcon(i1);
p.add(b2);
b3.setBounds(1050,500,90,50);
add(b3);
b3.setIcon(i2);
p.add(b3);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
s=new Label("CROSSWORD 4");
s.setBounds(500, 100, 350, 50);
s.setFont(f3);
s.setForeground(Color.red);
add(s);
p.add(s);
}
public static void main(String[] args) {
new crossword4();// TODO Auto-generated method stub
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
if(e.getSource()==b){
String str[]=new String[58];
for(int i=0;i<58;i++)
str[i]=t[i].getText();
//for(int i=0;i<28;i++)
//System.out.println(str[i]);
String strn[]=new String[26];
strn[0]=str[0]+str[1]+str[2]+str[3];
strn[1]=str[0]+str[8]+str[12];
strn[2]=str[4]+str[5]+str[6]+str[7];
strn[3]=str[2]+str[9]+str[14];
strn[4]=str[12]+str[13]+str[14]+str[15];
strn[5]=str[5]+str[10]+str[17];
strn[6]=str[16]+str[17]+str[18]+str[19];
strn[7]=str[7]+str[11]+str[19];
strn[8]=str[21]+str[22]+str[23];
strn[9]=str[13]+str[20]+str[26]+str[33]+str[39];
strn[10]=str[25]+str[26]+str[27]+str[28];
strn[11]=str[15]+str[21]+str[28]+str[34]+str[41];
strn[12]=str[29]+str[30]+str[31]+str[32];
strn[13]=str[16]+str[23]+str[29]+str[36]+str[42];
strn[14]=str[34]+str[35]+str[36];
strn[15]=str[18]+str[24]+str[31]+str[37]+str[44];
strn[16]=str[38]+str[39]+str[40]+str[41];
strn[17]=str[38]+str[46]+str[50];
strn[18]=str[42]+str[43]+str[44]+str[45];
strn[19]=str[40]+str[47]+str[52];
strn[20]=str[50]+str[51]+str[52]+str[53];
strn[21]=str[43]+str[48]+str[55];
strn[22]=str[54]+str[55]+str[56]+str[57];
strn[23]=str[45]+str[49]+str[57];
if(strn[0].equals("goat")&& strn[1].equals("gem")&& strn[2].equals("stew")&& strn[3].equals("ant") 
&& strn[4].equals("math")&& strn[5].equals("tri") && strn[6].equals("aide") && strn[7].equals("woe")
&& strn[8].equals("end") && strn[9].equals("allow") && strn[10].equals("flea") && strn[11].equals("heart") && strn[12].equals("also")
&& strn[13].equals("adapt")&& strn[14].equals("rip")&& strn[15].equals("disco")&& strn[16].equals("swat")&& strn[17].equals("sew")
&& strn[18].equals("tool")&& strn[19].equals("age")&& strn[20].equals("weed")&& strn[21].equals("owl")&& strn[22].equals("slow")
&& strn[23].equals("low")) 
{int option=1;
option=JOptionPane.showConfirmDialog(this,"You win! \nDo you want to try another puzzle?");
{
if(option==JOptionPane.YES_OPTION){
new crossword4();
}
else if(option==JOptionPane.NO_OPTION || option==JOptionPane.CANCEL_OPTION){
System.exit(0);
}
}
}
else 
JOptionPane.showMessageDialog(this,"Try again");
}
// TODO Auto-generated method stub
else if(e.getSource()==b1){
	new front();
}
else if(e.getSource()==b3){
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
}
}