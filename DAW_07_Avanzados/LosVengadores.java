package DAW_07_Avanzados;
import java.io.*;
import java.util.ArrayList;
public class LosVengadores {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcion = 0;
			ArrayList[][] table = new ArrayList[10][10];
			table[0][0] = new ArrayList();
			table[0][0].add("0"); // add object to that ArrayList
			System.out.println(table[0][0]);
			while(opcion!=6){
				System.out.println("Elige una opcion:");
				System.out.println("1. Yo quiero ser un vengador");
				System.out.println("2. Numero de vengadores");
				System.out.println("3. Ordenar vengadores");
				System.out.println("4. El más mejor amigo");
				System.out.println("5. Mejorar nivel de superhéroe");
				System.out.println("6. Salir");
				opcion=Integer.parseInt(buffer.readLine());
				switch(opcion){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					System.out.println("El número introducido no és válido, vuelve a intentarlo!");
				break;
				}	
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
