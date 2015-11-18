package DAW_07_Arrays;
import java.io.*;
public class ex04 {

	public static void main(String[] args) {
		try {
			int i;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("¿Cuantas alturas quieres introducir?");
			int numeroAlturas[] = new int[Integer.parseInt(buffer.readLine())];
			int alturaSuperior=0,alturaInferior=Integer.MAX_VALUE,alturaSumas = 0;
			for(i=0; i<numeroAlturas.length; i++){
				System.out.println("Introduce altura:");
				numeroAlturas[i]= Integer.parseInt(buffer.readLine());
			}
			for(i=0; i<numeroAlturas.length; i++){
				alturaSumas=alturaSumas+numeroAlturas[i];
				if(alturaSuperior<numeroAlturas[i]){
					alturaSuperior=alturaSumas;
				}
				if(alturaInferior>numeroAlturas[i]){
					alturaInferior=alturaSumas;
				}
			}
			System.out.println("Suma media de las alturas " + alturaSumas/i);
			System.out.println("La altura superior es: " + alturaSuperior);
			System.out.println("La altura inferior es: " + alturaInferior);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
