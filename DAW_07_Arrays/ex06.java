package DAW_07_Arrays;
import java.io.*;
public class ex06 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int numeros[]=new int[10];
			int media=0, mediaNumerosPares=0;
			for(int i=0; i<numeros.length; i++){
				System.out.println("Introduce numero " + i + ":");
				numeros[i]=Integer.parseInt(buffer.readLine());
				if((i%2)==0){
					System.out.println("PENE");
					media=media+numeros[i];
					mediaNumerosPares++;
				}
			}
			System.out.println("La media de los números pares es: " + media/mediaNumerosPares);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
