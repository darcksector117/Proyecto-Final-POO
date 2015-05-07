
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Naipe {
    
    public static final String[] valores={"As","2","3","4","5","6","7","8","9","10","Joker","Reina","Rey"};
    public static final String[] figuras={"Corazones","Diamantes","Picas","Treboles"};
    public static final Image[] naipesImg=new Image[52];
            
    public ImageIcon imagen =new ImageIcon();
    private Random rnd = new Random();
    public int valor;
    public int figura;
    Image carta;

    public int getValor(){
        if (this.valor == 0){
            return 11;
        }else{
            return this.valor + 1;
        }
    }
    
    public Naipe(){
		for(int i=0; i<=12; i++){
			naipesImg[i]=new ImageIcon("Cartas/Corazones/"+(i+1)+".png").getImage();
		}
		for(int i=0; i<=12; i++){
			naipesImg[i]=new ImageIcon("Cartas/Diamante/"+(i+1)+".png").getImage();
		}
		for(int i=0; i<=12; i++){
			naipesImg[i]=new ImageIcon("Cartas/Picas/"+(i+1)+".png").getImage();
		}
		for(int i=0; i<=12; i++){
			naipesImg[i]=new ImageIcon("Cartas/Trebol/"+(i+1)+".png").getImage();
		}
	}
    
    public Image getCarta(){
    	valor=(int)(rnd.nextDouble()*13+0);
        figura=(int)(rnd.nextDouble()*4+0);
        
        System.out.println(valor);
        System.out.println(figura);
        
    	if(figura==1){
    		return carta=naipesImg[valor];
    	}
    	else if(figura==2){
    		return carta=naipesImg[valor*2];
    	}
    	else if(figura==3){
    		return carta=naipesImg[valor*3];
    	}
    	else if(figura==4){
    		return carta=naipesImg[valor*4];
    	}
    	else{
    		return null;
    	}
    }

    public String toString(){
        return valores[valor]+" de "+figuras[figura];
    }

    public ImageIcon getImage(){
            return imagen;
    }


}