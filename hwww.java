
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hwww extends Frame implements WindowListener,ActionListener {
ImagePanel p=new ImagePanel("hw.jpg");
ImageIcon i=new ImageIcon("hww.jpg");
JLabel lb=new JLabel();
Font f1=new Font("Monotype Corsiva",Font.BOLD,13);
Label l[]=new Label[10];
Button b=new Button("PLAY GAME!");
public hwww(){
this.setVisible(true);
setLayout(null);
setSize(570,580);
setResizable(false);
setLocation(350,100);
this.addWindowListener(this);
p.setBounds(0,0,570,580);
add(p);
for(int j=0;j<10;j++)
l[j]=new Label();
lb.setIcon(i);
lb.setBounds(220,20,170,90);
p.add(lb);
b.setBounds(230,500,100,30);
p.add(b);
b.addActionListener(this);
b.setFont(f1);
b.setForeground(Color.red);
l[0].setText("Words within Word presents you with a word and you will have five");
l[1].setText("minutes to find all the words that can be formed by using the letters of ");
l[2].setText("the given word. Here are the rules for playing this game:");
l[3].setText("RULES:");
l[4].setText("• Proper nouns do not count.");
l[5].setText("• Duplicates do not count.");
l[6].setText("• Any character that is not A through Z is discarded.");
l[7].setText("• Words may be entered in upper, lower or mixed case.");
l[8].setText("• Invalid words do not count.");
l[9].setText("• One point is given for each valid word.");
l[0].setBounds(60,175,430,20);
l[1].setBounds(60,200,450,20);
l[2].setBounds(60,225,362,20);
l[3].setBounds(60,250,50,20);
l[4].setBounds(70,275,194,20);
l[5].setBounds(70,300,176,20);
l[6].setBounds(70,325,334,20);
l[7].setBounds(70,350,364,20);
l[8].setBounds(70,375,192,20);
l[9].setBounds(70,400,268,20);
for(int j=0;j<10;j++){
l[j].setForeground(Color.red);
l[j].setFont(f1);
p.add(l[j]);
}

}
public void windowActivated(WindowEvent arg0) {
// TODO Auto-generated method stub
}
public void windowClosed(WindowEvent arg0) {
// TODO Auto-generated method stub
}
public void windowClosing(WindowEvent arg0) {
this.setVisible(false);
// TODO Auto-generated method stub
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
public static void main(String[] args){
new hwww();
}
public void actionPerformed(ActionEvent arg0) {
if(arg0.getSource()==b){
this.setVisible(false);
//new www();
}// TODO Auto-generated method stub
}
}
