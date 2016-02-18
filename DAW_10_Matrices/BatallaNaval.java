package DAW_10_Matrices;
import java.io.*;
public class BatallaNaval {
	static char[][] tablero = new char[10][10];
	static int tamañoBarco = 0;
	static char posicion = ' ';
	static boolean posicionAcertada=false;
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			vaciarTablero();
			mostrarTablero();
			colocarBarco(2,'H');
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
				tablero[i][j]='*';
			}
		}
	}
	public static void colocarBarco(int $tamanoBarco, char $posicion){
		int numeroAleatorio1 = (int) (10*Math.random()+0);
		int numeroAleatorio2 = (int) (10*Math.random()+0);
		if (!($posicion=='H' || $posicion=='V')){
			System.out.println("Error");
		}else{
			switch($posicion){
			case 'H':
				System.out.println("jashdfjkasdjkjf");
				while(!posicionAcertada){
					for(int i=0; i<$tamanoBarco; i++){
						if(tablero[numeroAleatorio1][numeroAleatorio2+i]=='*'){
							tablero[numeroAleatorio1][numeroAleatorio2+i]='B';
						}else{
							posicionAcertada=false;
							for(int j=0; j<$tamanoBarco; j++){
								tablero[numeroAleatorio1][numeroAleatorio2+i]='B';
							}
						}
					}	
				}
				break;
			case 'V':
				break;
			}
		}
	}
}