package DAW_03_IF_ELSE;

import java.io.*;

public class ex18 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce un número del 1-7: ");
			String var1 = buffer.readLine();
			int num1 = Integer.parseInt(var1);
			switch (num1) {
			case 1: 
				System.out.println("Es lunes");;
				break;
			case 2: 
				System.out.println("Es martes");
				break;
			case 3:
				System.out.println("Es miércoles");
				break;
			case 4:
				System.out.println("Es jueves");
				break;
			case 5:
				System.out.println("Es viernes");
				break;
			case 6:
				System.out.println("Es sábado");
				break;
			case 7:
				System.out.println("Es domingo");
				break;
			default:
			System.out.println("Error");

			}
		}catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
		

	}

}
