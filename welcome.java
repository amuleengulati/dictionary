                 
import java.awt.*;

import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import javax.swing.plaf.LayerUI;
import com.sun.awt.*;

public class welcome
{
	JFrame f;
	JProgressBar pb=new JProgressBar();
	JPanel panel;
	JLabel l1, l2, l3, l4;
	Color color=Color.cyan;
	
	
	public welcome()
	{
		f = new JFrame ("Word Stock Dictionary");
		//f.setResizable(false);
                
                // It is best practice to set the window's shape in
                // the componentResized method.  Then, if the window
                // changes size, the shape will be correctly recalculated.
                f.addComponentListener(new ComponentAdapter() 
                {
                    // Give the window an elliptical shape.
                    // If the window is resized, the shape is recalculated here.
                    @Override
                    public void componentResized(ComponentEvent e) 
                    {
                        
                        f.setShape(new Ellipse2D.Double(0,0,f.getWidth(),f.getHeight()));
                  
                    }
                });
		
		LayerUI<JPanel> layerUI = new SpotlightLayerUI();
		panel = new JPanel();
                panel.setLayout(new GridLayout(5, 0, 10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		//if(color.equals(Color.cyan)){
		panel.setBackground(Color.yellow);
		//color=Color.magenta;
		//}
		//else color=Color.cyan;
	
		
		
		l1 = new JLabel("WELCOME TO WORD STOCK", JLabel.CENTER);
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		l1.setForeground(new Color(127, 40, 55));
                
		panel.add(l1);
                
                l2 = new JLabel("DICTIONARY", JLabel.CENTER);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		l2.setForeground(new Color(127, 40, 55));
                
		panel.add(l2);
                
                l3 = new JLabel(" Developed by: Amuleen,Jeevanjot,Babanpreet,Gursewak,Ajay");
		l3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		l3.setForeground(new Color(127, 40, 55));    
		
		
                
                l4 = new JLabel(new ImageIcon(welcome.class.getResource("")));
                l4.setSize(140,90);
		
		pb = new JProgressBar(0, 20);
		//pb.setValue(0);
		pb.setStringPainted(true);
		pb.setMaximum(100);                
		pb.setBounds(210,550,490,20);
		
                panel.add(l4);
                panel.add(pb);                               
                
                panel.add(l3);
                
            	
              
               
		JLayer<JPanel> jlayer = new JLayer<JPanel>(panel, layerUI);
		
		f.add (jlayer);
		f.setUndecorated(true);
		f.setSize(500, 300);
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	  	f.setLocationRelativeTo (null);               
	  	f.setVisible (true);
	  	//f.setIconImage(new ImageIcon(Login2.class.getResource("tid.jpg")).getImage());
	  	
	  	try
		{
			//System.out.print("jhg");
			
			Thread th = new Thread();
			th.start();
			for(int i=1;i<=100;i++)
			{	  	
			                                                                                                                                     	pb.setValue(i);
				th.sleep(50);
			}
			if(pb.getValue()==100)
			{
               th.stop();
               pb.setValue(0);
			
		f.dispose();
		new stat();
				//JOptionPane.showConfirmDialog(this,"Next Page Opens");
			}
		}
		catch(InterruptedException ex)
		{
			JOptionPane.showConfirmDialog(f,ex.getMessage());
		}
		
		pb.setVisible(true);
	  	
	}

  

	public static void main(String[] args) 
	{
	 new welcome();	
		
	}
}


class SpotlightLayerUI extends LayerUI<JPanel> 
{
	private boolean mActive;
	private int mX, mY;
	
	@Override
	public void installUI(JComponent c) 
	{
		super.installUI(c);
		JLayer jlayer = (JLayer)c;
		jlayer.setLayerEventMask(
				AWTEvent.MOUSE_EVENT_MASK |
				AWTEvent.MOUSE_MOTION_EVENT_MASK
				);
	}
	
	@Override
	public void uninstallUI(JComponent c) 
	{
		JLayer jlayer = (JLayer)c;
		jlayer.setLayerEventMask(0);
		super.uninstallUI(c);
	}
	
	@Override
	public void paint (Graphics g, JComponent c) 
	{
		Graphics2D g2 = (Graphics2D)g.create();
		
		// Paint the view.
		super.paint (g2, c);
		
		if (mActive) 
		{
			//Create a radial gradient, transparent in the middle.
			java.awt.geom.Point2D center = new java.awt.geom.Point2D.Float(mX, mY);
			float radius = 72;
			float[] dist = {0.0f, 1.0f};
			Color[] colors = {new Color(0.0f, 0.0f, 0.0f, 0.0f), Color.BLACK};
			RadialGradientPaint p =
					new RadialGradientPaint(center, radius, dist, colors);
			g2.setPaint(p);
			g2.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, .6f));
			g2.fillRect(0, 0, c.getWidth(), c.getHeight());
		}
		
		g2.dispose();
	}
	
	@Override
	protected void processMouseEvent(MouseEvent e, JLayer l) 
	{
		if (e.getID() == MouseEvent.MOUSE_ENTERED) mActive = true;
		if (e.getID() == MouseEvent.MOUSE_EXITED) mActive = false;
		l.repaint();
	}
	
	@Override
	protected void processMouseMotionEvent(MouseEvent e, JLayer l) 
	{
		Point p = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), l);
		mX = p.x;
		mY = p.y;
		l.repaint();
	}
}
