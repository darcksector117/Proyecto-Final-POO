import javax.swing.*;

import  java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class PanelDibujo extends JPanel{

	private int cartaX = 390-45;
	private int cartaY = 375;

	ImageIcon fondo;
	
	Naipe naipe=new Naipe();
	
	public PanelDibujo(){
		super();
		setSize(400,400);
		
		fondo=new ImageIcon("mesa.jpg");
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.white);
		g.drawImage(fondo.getImage(),0,0,getWidth(),getHeight(),null);
		
		g.setColor(Color.WHITE);
		//Espacio Jugadores
		g.drawRect(390-45, 375, 91, 114);
		g.drawRect(675-45, 400, 91, 114);
		g.drawRect(975-45, 375, 91, 114);
		g.drawRect(1230-45, 310, 91, 114);
		//Baraja
		g.drawRect(675-45, 170, 91, 114);
		
		//Jugador 1
		//Carta 1
		g.drawImage(naipe.getCarta(),cartaX,cartaY,this);
		//Carta 2
		g.drawImage(naipe.getCarta(),cartaX+20,cartaY-20,this);
		
		//Jugador 2
		//Carta 1
		g.drawImage(naipe.getCarta(),675-45,400,this);
		//Carta 2
		g.drawImage(naipe.getCarta(),675-45+20,400-20,this);
		
		//Jugador 3
		//Carta 1
		g.drawImage(naipe.getCarta(),975-45,375,this);
		//Carta 2
		g.drawImage(naipe.getCarta(),975-45+20,375-20,this);
				
		//Jugador 4
		//Carta 1
		g.drawImage(naipe.getCarta(), 1230-45, 310, this);
		//Carta 2
		g.drawImage(naipe.getCarta(),1230-45+20,310-20,this);
		
		//Baraja
		//Carta 1
		g.drawImage(naipe.getCarta(), 675-45, 170, this);
		//Carta 2
		g.drawImage(naipe.getCarta(),675-45+20,170-20,this);
	}
}
		
	

