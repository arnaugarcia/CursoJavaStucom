package DAW_10_Matrices;
import java.io.*;
public class BatallaNaval {
	static String[][] tablero = new String[10][10];
	static int tamañoBarco = 0;
	String posicion = "";
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			vaciarTablero();
			mostrarTablero();		
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
	}
	private static void mostrarTablero(){
		for (int i=0; i<tablero.length; i++){
			for (int j=0; j<tablero[i].length; j++){
				System.out.print(tablero[i][j]);
				if(j==tablero[i].length-1){
					System.out.println("");
				}
			}
		}
	}
	public static void vaciarTablero(){
		for (int i=0; i<tablero.length; i++){
			for (int j=0; j<tablero[i].length; j++){
				tablero[i][j]="*";
			}
		}
	}
	public static void colocarBarco(int $tamanoBarco, String $posicion){
		int numeroAleatorio1 = (int) Math.floor(Math.random()*(0-10+1)+10);
		int numeroAleatorio2 = (int) Math.floor(Math.random()*(0-10+1)+10);
		if (!($posicion.equals("H") && $posicion.equals("V"))){
			
		}
	}
}
