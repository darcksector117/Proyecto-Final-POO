import java.awt.Image;
import java.util.Random;

public class Naipe {
	
	public static final String[] valores={"As","2","3","4","5","6","7","8","9","10","Joker","Reina","Rey"};
	public static final String[] figuras={"Picas","Tréboles","Corazones","Diamantes"};
	public static final Image[] naipesImg=new Image[52];
	private int figura;
	private int valor;
	
	private Random  rnd = new Random();
	
	public int getValor(){
		return valor=(int)(rnd.nextDouble()*12+0);
	}
	public int getFigura(){
		return figura=(int)(rnd.nextDouble()*4+0);
	}
	
	public static void main(String[] args) {
		Naipe prueba=new Naipe();
		System.out.println(prueba.toString());
	}
	public String toString(){
		return valores[getValor()]+" de "+figuras[getFigura()];
	}
	/*public Image getImage(){
	
	}*/
}