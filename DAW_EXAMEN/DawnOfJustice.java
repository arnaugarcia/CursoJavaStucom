package DAW_EXAMEN;
import java.io.*;
import java.util.Arrays;
public class DawnOfJustice {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int menu=0, opcion=0, puntosSuperman=0, puntosBatman=0, numeroBatalla=1;
			int numeroAleatorio1 = (int) Math.floor(Math.random()*(0-1000+1)+1000);
			int numeroAleatorio2 = (int) Math.floor(Math.random()*(0-1000+1)+1000);
			while(menu!=6){
				System.out.println("Elige una opción:");
				System.out.println("1. Registrar nueva batalla:");
				System.out.println("2. Intentar reconciliación:");
				System.out.println("3. Entrenar inteligencia:");
				System.out.println("4. Retar inteligéncia:");
				System.out.println("5. Ver superhéroe campeón: ");
				System.out.println("6. Salir");
				menu = Integer.parseInt(buffer.readLine());
				switch(menu){
				case 1:
					System.out.println("¿Cuantas batallas quieres registrar?:");
					int batalla=Integer.parseInt(buffer.readLine());
					int golpesSuperman =0;
					int golpesBatman = 0;
					for(int i=0,j=0; i<batalla; i++){
						System.out.println("Resultado contricante " + j + " batalla " + batalla);
						golpesSuperman = golpesSuperman + Integer.parseInt(buffer.readLine());
						j++;
						System.out.println("Resultado contricante " + j + " batalla " + batalla);
						golpesBatman = golpesBatman + Integer.parseInt(buffer.readLine());
					}
					if(golpesSuperman<golpesBatman){
						System.out.println("Gana batman");
						puntosBatman++;
					}else{
						System.out.println("Gana Superman");
						puntosSuperman++;
					}
					break;
				case 2:
					int[] numero1 = new int[3];
					int[] numero2 = new int[3];
					boolean coinciden = false;
					for(int i=0; i<3; i++){
						System.out.println("Introduce número (batman)" + i);
						numero1[i] = Integer.parseInt(buffer.readLine());
					}
					for(int i=0; i<3; i++){
						System.out.println("Introduce número (Superman)" + i);
						numero2[i] = Integer.parseInt(buffer.readLine());
					}
					for(int i=0; i<3; i++){
						if(numero1[i]==numero2[i]){
							coinciden=true;
						}else{
							coinciden=false;
						}
					}
					if(coinciden){
						System.out.println("Paz mundial");
					}else{
						System.out.println("Guerra mundial");
					}
					break;
				case 3:
					System.out.println("Introduce el nombre del superheroe: ");
					String nombre = buffer.readLine();
					if(nombre.equals("batman") || nombre.equals("superman") ){
						System.out.println("Los números son " + numeroAleatorio1 + " , " + numeroAleatorio2 + ", mezclalos!:");
						String cadenaNumero1= Integer.toString(numeroAleatorio1);
						char[] cadena1 = new char[cadenaNumero1.length()];
						String cadenaNumero2= Integer.toString(numeroAleatorio2);
						char[] cadena2 = new char[cadenaNumero2.length()];
						for(int i=0; i<cadenaNumero1.length()-1; i++){
							cadena1[i]=cadenaNumero1.charAt(i);
						}
						for(int i=0; i<cadenaNumero2.length()-1; i++){
							cadena2[i]=cadenaNumero2.charAt(i);
						}
						for(int i=0; i<cadenaNumero2.length()+cadenaNumero1.length(); i++){
							
						}
					}else{
						System.out.println("Introduce el nombre del superheroe: ");
						nombre = buffer.readLine();
					}
					break;
				case 4: 
					break;
				case 5:
					break;
				case 6:
					System.out.println("Batman y superman dejaron el examen...");
					break;
				default:
					System.out.println("Número incorrecto");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
