package DAW_07_Arrays;
import java.io.*;
public class ex07 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			double notaMedia=0, notaSuperior=0;
			int numeroAlumnos=0, alumnoSuperior=0;
			System.out.println("¿Cuantos alumnos hay?");
			Double alumno[] = new Double[(int) Double.parseDouble(buffer.readLine())];
			for(int i=0; i<alumno.length; i++){
				System.out.println("Introduce nota del alumno "+i+":");
				alumno[i]=Double.parseDouble(buffer.readLine());
				notaMedia=alumno[i]+notaMedia;
				numeroAlumnos++;
				if(alumno[i]>notaSuperior){
					notaSuperior=alumno[i];
					alumnoSuperior=i;
				}
			}
			System.out.println("La nota media es de: " + notaMedia/numeroAlumnos + " entre " + numeroAlumnos + " alumnos.");
			System.out.println("La nota más alta es del alumno: " + alumnoSuperior + " y su nota ha sido " + notaSuperior + ".");
			
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
