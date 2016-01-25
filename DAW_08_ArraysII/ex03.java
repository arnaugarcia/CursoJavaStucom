package DAW_08_ArraysII;
import java.io.*;
public class ex03 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] numeros = new int[15];
			int[] suma = new int[15];
			for(int i=0; i<numeros.length; i++){
				System.out.println("Introduce número " + i + ":");
				numeros[i]=Integer.parseInt(buffer.readLine());
			}
			for(int i=0; i<numeros.length; i++){
				suma[i]=(numeros[i]+numeros[i]);
			}
			for(int i=0; i<numeros.length; i++){
				System.out.println("La suma de " + numeros[i] + " + " + numeros[i] + " = " + suma[i]);
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
