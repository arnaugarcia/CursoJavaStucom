package DAW_EXTRAS;
import java.io.*;
public class NocheVieja {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			for(int j=0; j<4; j++){
				int minutos=0, horas=0, minutosTotales=0;
				System.out.print("Introduce horas y minutos (XX:XX): ");
				String cadena = buffer.readLine();
				if(cadena.length()!=5 || cadena.charAt(2)!=':'){
					System.out.println("Hora mal introducida");
				}else{
					horas=Integer.parseInt(String.valueOf(cadena.charAt(0))+String.valueOf(cadena.charAt(1)));
					minutos=Integer.parseInt(String.valueOf(cadena.charAt(3))+String.valueOf(cadena.charAt(4)));
					if(minutos!=00 || horas!=00){
						if(horas==23){
							for(int i=0; i<60-minutos; i++){
								minutosTotales++;
							}
						}else{
							for(int i=0; i<23-horas; i++){
								minutosTotales=minutosTotales+60;
							}
							for(int i=0; i<60-minutos; i++){
								minutosTotales++;
							}
						}
						System.out.println("Quedan " + minutosTotales + " minutos.");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
