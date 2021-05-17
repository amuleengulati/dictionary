
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hcrs extends Frame implements WindowListener,ActionListener {
ImagePanel p=new ImagePanel("crs.jpg");
ImageIcon i=new ImageIcon("IMAGE copy.jpg");
JLabel lb=new JLabel();
Font f1=new Font("Monotype Corsiva",Font.BOLD,13);
Label l[]=new Label[10];
Button b=new Button("PLAY GAME!");
public hcrs(){
this.setVisible(true);
setLayout(null);
setSize(560,530);
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
b.setBounds(230,450,100,30);
p.add(b);
b.addActionListener(this);
b.setFont(f1);
b.setForeground(Color.red);
l[0].setText("Crossword is simply a Word Puzzel.");
l[1].setText("There is no time limit to solve it.");
l[2].setText("The main goal is to fill the white squares with the letters forming words.");
l[3].setText("RULES:");
l[4].setText("• Capitialization of letters is conventionally ignored.");
l[5].setText("• Every answer must be longer than two characters.");
l[6].setText("• Doesn't include any points.");
l[7].setText("• Any character that is not through (a to z) is discarded.");
l[0].setBounds(60,175,230,20);
l[1].setBounds(60,200,210,20);
l[2].setBounds(60,225,460,20);
l[3].setBounds(60,250,50,20);
l[4].setBounds(70,275,340,20);
l[5].setBounds(70,300,340,20);
l[6].setBounds(70,325,190,20);
l[7].setBounds(70,350,360,20);

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
new hcrs();
}
public void actionPerformed(ActionEvent arg0) {
if(arg0.getSource()==b){
this.setVisible(false);
//new ();
}// TODO Auto-generated method stub
}
}
