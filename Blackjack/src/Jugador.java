
public class Jugador{

    private int saldo;
    private String nombre;
    private boolean perdio;

    public Naipe juego[] = new Naipe[2];

    public Jugador(){

        this.saldo=0;
        this.nombre="Sutanito";
        this.perdio = false;
    }

    public int get_saldo(){
        return this.saldo;
    }

    public String get_nombre(){
        return this.nombre;
    }

    public boolean get_perdio(){
        return this.perdio;
    }

    public void set_saldo(int saldo){
        this.saldo = saldo;
    }

    public void set_nombre(String nombre){
        this.nombre = nombre;
    }

    public void set_perdio(boolean perdio){
        this.perdio = perdio;
    }

    public int getTotal(){
        int suma = 0;
        for(int cont=0; cont < juego.length; cont ++){
            suma += juego[cont].getValor();
        }
        return suma;
    }


	public static void main(String[] args) {
/*
        Jugador[] players = new Jugador[2];
        System.out.println(Integer.toString(players.length));
        for ( int cont = 0 ; cont < players.length ; cont ++){
            players[cont] = new Jugador();
            System.out.println(players[cont].get_nombre());
        }
*/
    }
    
}
