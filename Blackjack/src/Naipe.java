import java.util.Random;
import java.io.BufferedReader;
import javax.swing.ImageIcon;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Naipe {

	public static final String[] valores={"As","2","3","4","5","6","7","8","9","10","Joker","Reina","Rey"};
	public static final String[] figuras={"Corazones","Diamantes","Picas","Treboles"};
	public static final ImageIcon[] naipesImg=new ImageIcon[52];

	private Random rnd = new Random();
    public String BARAJA_FILE = "baraja.txt";

    private int figura=(int)(rnd.nextDouble()*4+0);
	private int valor=(int)(rnd.nextDouble()*13+0);

	private int pos_naipe;
	private String path;

    public Naipe(){

        pos_naipe = valor + (figura * 13);
        //  If file does not exist create it
        File f = new File(BARAJA_FILE);
        if(f.exists()== false){
            gen_naipe_file();
        }

		// Load the file into the naipeImg array
        read_baraja();

		// Delete the card you chose
        delete_card();

    }

    private void delete_card(){

		try {

			String path="Blackjack/Cartas/" + figuras[figura] + "/" + (valor + 1) + ".png";

        	File file = new File(BARAJA_FILE);

			File tempFile = new File("myTempFile.txt");

			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

			String currentLine;

			while((currentLine = reader.readLine()) != null) {
				if(currentLine.contains(path)){
				 	continue;
				}
				else{
					writer.write(currentLine + "\n");
				}
			}
			writer.close();
			reader.close();
			boolean success = tempFile.renameTo(file);

		} catch (IOException e) {
            e.printStackTrace();
   		}
    }
    private void read_baraja(){

		BufferedReader br;
        String curline;
        String[] line_split;
        String path;
        int pos;

        try {
            br = new BufferedReader(new FileReader(BARAJA_FILE));
            while ((curline = br.readLine()) != null) {
               line_split = curline.split(",");
               pos = Integer.parseInt(line_split[0]);
               path = line_split[1];
               naipesImg[pos]= new ImageIcon(path);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public int getValor(){
		if ( valor == 0 ){
            return 11;
        }
        else{
            return valor;
        }
	}

	public String toString(){
		return valores[valor]+" de "+figuras[figura];
	}

    public void gen_naipe_file(){

        String path = null;
        int pos = 0;
		try {
            PrintWriter writer = new PrintWriter(BARAJA_FILE, "UTF-8");
		    for (int valor = 0; valor< valores.length; valor++){
		        for (int figura = 0; figura < figuras.length;figura++){
		            path="Blackjack/Cartas/" + figuras[figura] + "/" + (valor + 1) + ".png";
		            pos = valor + (figura * 13);
 		            writer.println(pos + "," + path);
		        }
		    }

		    writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

    }
	public ImageIcon getImage(){
		System.out.println(pos_naipe);
		if (naipesImg[pos_naipe] != null){
			return naipesImg[pos_naipe];
		}
		else{
			System.out.println("Esta carta ya habia pasado");
			return null;
		}
	}

	public static void main(String[] args) {

        Naipe prueba = new Naipe();
		System.out.println(prueba.toString());
        System.out.println(prueba.getImage());

	}
}
