import java.util.Random;
import javax.swing.ImageIcon;

public class Naipe {
	
	public static final String[] valores={"As","2","3","4","5","6","7","8","9","10","Joker","Reina","Rey"};
	public static final String[] figuras={"Picas","Tréboles","Corazones","Diamantes"};
	public static final ImageIcon[] naipesImg=new ImageIcon[52];
	
	private Random  rnd = new Random();
	
	private int figura=(int)(rnd.nextDouble()*4+0);
	private int valor=(int)(rnd.nextDouble()*13+0);
	
	public int getValor(){
		return valor=(int)(rnd.nextDouble()*11+2);
	}
	public String toString(){
		return valores[valor]+" de "+figuras[figura];
	}
	public ImageIcon getImage(){
		String path;
		for(int i=1; i<13; i++){
			path="Blackjack/Cartas/Corazones/"+i+".png";
			naipesImg[i]= new ImageIcon(path);
		}
		for(int i=13; i<26; i++){
			path="Blackjack/Cartas/Diamante/"+i+".png";
		}
		for(int i=26; i<39; i++){
			path="Blackjack/Cartas/Picas/"+i+".png";
			naipesImg[i]= new ImageIcon(path);
		}
		for(int i=39; i<52; i++){
			path="Blackjack/Cartas/Trebol/"+i+".png";
			naipesImg[i]= new ImageIcon(path);
		}
		return naipesImg[getValor()];
	}
	
	public static void main(String[] args) {
		Naipe prueba=new Naipe();
		System.out.println(prueba.toString());
		prueba.getImage();
	}
}