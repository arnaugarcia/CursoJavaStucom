package DAW_07_Arrays;
import java.io.*;
public class ex10 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			Double[] alumnosNotas=new Double[10];
			for(int i=0; i<alumnosNotas.length; i++){
				System.out.println("Introduce nota alumno: " + i + ":");
				alumnosNotas[i]=Double.parseDouble(buffer.readLine());
			}
			for(int i=0; i<alumnosNotas.length; i++ ){
				System.out.println("La nota del alumno " + i + " es de " + alumnosNotas[i]);
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
