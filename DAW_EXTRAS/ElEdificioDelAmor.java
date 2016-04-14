package DAW_EXTRAS;
import java.io.*;
public class ElEdificioDelAmor {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una cadena con H y M:");
			String cadena = buffer.readLine();
			int pareja=0;
			String[] habitaciones = new String[cadena.length()];
			for(int i=0; i<habitaciones.length; i++){
				habitaciones[i] = String.valueOf(cadena.charAt(i));
			}
			for(int i=0; i<habitaciones.length; i++){
				if(habitaciones[i].equals("H")){
					for(int j=i; j<cadena.length(); j++){
						if(habitaciones[j].equals("M") || habitaciones[j].equals("@")){
							if(habitaciones[j].equals("@")){
								j=cadena.length();
							}else{
								pareja++;
								habitaciones[j]="X";
								habitaciones[i]="X";
								j=cadena.length();
							}
						}
					}
				}
				if(habitaciones[i].equals("h")){
					for(int j=i; j<cadena.length(); j++){
						if(habitaciones[j].equals("m") || habitaciones[j].equals("@")){
							if(habitaciones[j].equals("@")){
								j=cadena.length();
							}else{
								pareja++;
								habitaciones[j]="X";
								habitaciones[i]="X";
								j=cadena.length();
							}
						}
					}
				}
			}
			System.out.println("Número de parejas " + pareja);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}