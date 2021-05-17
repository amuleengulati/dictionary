
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hsc extends Frame implements WindowListener,ActionListener {
ImagePanel p=new ImagePanel("i29.jpg");
ImageIcon i=new ImageIcon("");
JLabel lb=new JLabel();
Font f1=new Font("Monotype Corsiva",Font.BOLD,13);
Label l[]=new Label[12];
Button b=new Button("PLAY GAME!");
public hsc(){
this.setVisible(true);
setLayout(null);
setSize(800,800);
setResizable(false);
setLocation(300,00);
this.addWindowListener(this);
p.setBounds(0,70,800,800);
add(p);
for(int j=0;j<12;j++)
l[j]=new Label();
lb.setIcon(i);
lb.setBounds(220,20,170,90);
p.add(lb);
b.setBounds(230,500,100,30);
p.add(b);
b.addActionListener(this);
b.setFont(f1);
b.setForeground(Color.red);
l[0].setText("1.Sentence game is very simple and an interesting game.");
l[1].setText("2.A question will appear on the screen having blank.");
l[2].setText("3.Blank will be filled by selecting the appropriate"); 
l[3].setText("option.");
l[4].setText("RULES:");
l[5].setText("• Four options will be given for every question.");
l[6].setText("• Appropriate answer will be selected by clicking"); 
l[7].setText("on option."); 
l[8].setText("• Every correct answer will be rewarded with a"); 
l[9].setText("point."); 
l[10].setText("• There is time limit of 60 seconds for every");
l[11].setText("question.");
l[0].setBounds(110,180,370,20);
l[1].setBounds(110,200,340,20);
l[2].setBounds(110,220,320,20);
l[3].setBounds(110,240,50,20);
l[4].setBounds(110,260,50,20);
l[5].setBounds(110,280,310,20);
l[6].setBounds(110,300,320,20);
l[7].setBounds(110,320,70,20);
l[8].setBounds(110,340,360,20);
l[9].setBounds(110,360,40,20);
l[10].setBounds(110,380,290,20);
l[11].setBounds(110,400,60,20);

for(int j=0;j<12;j++){
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
new hsc();
}
public void actionPerformed(ActionEvent arg0) {
if(arg0.getSource()==b){
this.setVisible(false);
//new ();
}// TODO Auto-generated method stub
}
}