import javax.swing.*;
import  java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class PanelDibujo extends JPanel{



	ImageIcon imagen;
	public PanelDibujo(){
		super();
		setSize(400,400);
		
		imagen=new ImageIcon("mesa.jpg");
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.white);
		g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),null);
	}
}
		
	

