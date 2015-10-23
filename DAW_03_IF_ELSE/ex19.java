package DAW_03_IF_ELSE;

import java.io.*;

public class ex19 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce un número del 1-12: ");
			String var1 = buffer.readLine();
			int num1 = Integer.parseInt(var1);
			switch (num1) {
			case 1: 
				System.out.println("Gener");;
			break;
			case 2: 
				System.out.println("Febrer");
			break;
			case 3:
				System.out.println("Març");
			break;
			case 4:
				System.out.println("Abril");
			break;
			case 5:
				System.out.println("Maig");
				break;
			case 6:
				System.out.println("Juny");
				break;
			case 7:
				System.out.println("Juliol");
				break;
			case 8:
				System.out.println("Agost");
				break;
			case 9:
				System.out.println("Setembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Novembre");
				break;
			case 12:
				System.out.println("Decembre");
				break;
			default:
			System.out.println("Error");

			}
		}catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
		

	}

}

