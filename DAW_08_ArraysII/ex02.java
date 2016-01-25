package DAW_08_ArraysII;
import java.io.*;
public class ex02 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			Double[] alumnosNotas=new Double[10];
			Double notaMedia=0.0, notaSuperior=0.0, notaInferior=0.0;
			int contadorMedia=0;
			for(int i=0; i<alumnosNotas.length; i++){
				System.out.println("Introduce nota alumno: " + i + ":");
				alumnosNotas[i]=Double.parseDouble(buffer.readLine());
			}
			for(int i=0; i<alumnosNotas.length; i++ ){
				System.out.println("La nota del alumno " + i + " es de " + alumnosNotas[i]);
				notaMedia=notaMedia+alumnosNotas[i];
				contadorMedia++;
				if(alumnosNotas[i]<notaInferior){
					notaInferior=alumnosNotas[i];
				}
				if(alumnosNotas[i]>notaSuperior){
					notaSuperior=alumnosNotas[i];
				}
			}
			System.out.println("La nota media es de: " + notaMedia/contadorMedia);
			System.out.println("La nota más alta es: " + notaSuperior);
			System.out.println("La nota inferior es: " + notaInferior);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
