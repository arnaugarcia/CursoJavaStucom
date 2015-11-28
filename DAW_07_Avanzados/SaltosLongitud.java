package DAW_07_Avanzados;
import java.io.*;
import java.util.Arrays;
public class SaltosLongitud {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int bucleParticipantes = 10, numeroParticipantes=0, menu=8;
			int[] dorsalParticipantes = new int[50];
			String[] nombreParticipantes = new String[50];
			Double[] marcas2013 = new Double[50];
			Double[] marcas2014 = new Double[50];
			Double[] marcas2015 = new Double[50];
			while(menu!=4){
				System.out.println("Elige una opcion: (1-4)");
				System.out.println("1. Inscribir un participante");
				System.out.println("2. Mostrar listado de datos");
				System.out.println("3. Mostrar listado por marcas");
				System.out.println("4. Finalizar el programa");
				menu = Integer.parseInt(buffer.readLine());
				switch(menu){
				case 1:
					bucleParticipantes=1;
					while(bucleParticipantes!=0){
							System.out.println("Inscribe participante " + numeroParticipantes + ":");
							System.out.println("Introduce número del dorsal:");
							dorsalParticipantes[numeroParticipantes]=Integer.parseInt(buffer.readLine());
							System.out.println("Introduce nombre del particiapnte:");
							nombreParticipantes[numeroParticipantes]=buffer.readLine();
							System.out.println("Mejor marca 2013: ");
							marcas2013[numeroParticipantes]=Double.parseDouble(buffer.readLine());
							System.out.println("Mejor marca 2014: ");
							marcas2014[numeroParticipantes]=Double.parseDouble(buffer.readLine());
							System.out.println("Mejor marca 2015: ");
							marcas2015[numeroParticipantes]=Double.parseDouble(buffer.readLine());
							System.out.println("Quiere seguir introduciendo más particiapntes? (1 para si 0 para no)");
							if(Integer.parseInt(buffer.readLine())!=0){
								
							}else{
								bucleParticipantes=0;
							}
							numeroParticipantes++;
					}
				break;
				
				case 2:
					System.out.println("Mostrando listado de datos:");
					for(int i=0; i<numeroParticipantes; i++){
						System.out.println(nombreParticipantes[i] + " con el dorsal " + dorsalParticipantes[i] + ", su mejor marca en 2013 fué: " + marcas2013[i] +
								", su mejor marca el año 2014 fué: " + marcas2014[i] + " la marca de este año ha sido: " + marcas2015[i]);
					}
				break;
				
				case 3:
					System.out.println("Mejores marcas: ");
					for(int i=0; i<numeroParticipantes; i++){
						Arrays.sort(marcas2013);
						System.out.println("Las mejores marcas en el año 2013:");
						System.out.println(marcas2013[i]);
						Arrays.sort(marcas2014);
						System.out.println("Las mejores marcas en el año 2014:");
						System.out.println(marcas2014[i]);
						Arrays.sort(marcas2015);
						System.out.println("Las mejores marcas en el año 2015:");
						System.out.println(marcas2015[i]);
					}
				break;
				case 4:
					System.out.println("Finalizando...");
					break;
				default:
					System.out.println("Número introducido no válido");
				break;
				}	
			}
		} catch (Exception e) {
			System.out.println("Error" + e);
		}

	}

}
