package DAW_05_Strings;
import java.io.*;
import java.util.Collections;
import java.util.Vector;
public class ex13 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Datos del alumno: ");
			System.out.println("Introduce nombre del alumno: ");
			String nombreAlumno = buffer.readLine();
			System.out.println("Introduce apellidos del alumno: ");
			String apellidosAlumno = buffer.readLine();
			System.out.println("Introduce año de nacimiento del aumno: ");
			String año = buffer.readLine();
			int añoNacAlumno = Integer.parseInt(año);
			System.out.println("Nota media del ciclo: ");
			String notaAlumno = buffer.readLine();
			double nota = Double.parseDouble(notaAlumno);
			int opcion = 0;
			while(opcion!=7){
				System.out.println("");
				System.out.println("");
				System.out.println("Menu de opciones: (Introduce un número para continuar) ");
				System.out.println("1. Nombre y apellidos completos");
				System.out.println("2. Edad, es mayor de Edad?");
				System.out.println("3. Informar cualificación del ciclo");
				System.out.println("4. Nota media con dos alumnos");
				System.out.println("5. Número de carácteres que tiene nombre, incial del nombre, y inicial del apellido.");
				System.out.println("6. Ordenar nombre y apellidos de Alumnos (Introducimos 2 nombres más)");
				System.out.println("7. Salir");
				String var10 = buffer.readLine();
				opcion = Integer.parseInt(var10);
				switch(opcion){
				case 1:;
					System.out.println("El nombre del Alumno es: " + nombreAlumno + " " + apellidosAlumno);
					break;
				case 2:
					int edadAlumno = 2015-añoNacAlumno;
					System.out.println("La edad del Alumno tiene: " + edadAlumno );
					if(edadAlumno >= 18){
						System.out.println("Es mayor de edad");
					}else{
						System.out.println("No es mayor de edad");
					}
					break;
				case 3:
					if(nota<4.99){
						System.out.println("Suspens");
					}else{
						if(nota<6.99){
							System.out.println("Aprovat");
						}else{
							if(nota<8.99){
								System.out.println("Notable");
							}else{
								if(nota<9.99){
									System.out.println("Excel·lent");
								}else{
									if(nota>=10.0){
										System.out.println("Matrícula de honor");
									}
								}
							}
						}
					}
					break;
				case 4:
					System.out.println("Nota de un Alumno: ");
					String var1 = buffer.readLine();
					double notaAlumno1 = Double.parseDouble(var1);
					System.out.println("Nota Alumno 2: ");
					String var2 = buffer.readLine();
					double notaAlumno2 = Double.parseDouble(var2);
					double notaMediaAlumnos = (nota+notaAlumno1+notaAlumno2)/3;
					System.out.println("La nota media es: " + notaMediaAlumnos);
					if(nota>notaAlumno1 ){
						System.out.println("La nota de: " + nombreAlumno + " es superior.");
					}else{
						if(notaAlumno1>notaAlumno2){
							System.out.println("La nota del Alumno1 es superior.");
						}else{
							System.out.println("La nota del Alumno2 es superior.");
						}
					}
					break;
				case 5:
					String nombreCompletoAlumno = nombreAlumno + " " + apellidosAlumno; 
					System.out.println("El número de carácteres que tiene el nombre es: " + nombreCompletoAlumno.length());
					System.out.println("Sus inciales son: " + nombreCompletoAlumno.charAt(0) + apellidosAlumno.charAt(0));
					break;
				case 6:
					System.out.println("Nombre Alumno 1: ");
					String nombreAlumno1 = buffer.readLine();
					System.out.println("Apellido Alumno 1: ");
					String ApellidoAlumno1 = buffer.readLine();
					System.out.println("Nombre Alumno 2: ");
					String nombreAlumno2 = buffer.readLine();
					System.out.println("Apellido Alumno 2: ");
					String ApellidoAlumno2 = buffer.readLine();
					if(nombreAlumno.equals(nombreAlumno1)){
						System.out.println("El nombre de Alumno y ALumno1 son iguales.");
					}else{
						if(nombreAlumno1.equals(nombreAlumno2)){
							System.out.println("El nombre del Alumno1 y el Alumno2 son iguales");
						}
					}
					Vector<String> nombre = new Vector<String>();
					Vector<String> apellidos = new Vector<String>();
					nombre.add(nombreAlumno1);
					nombre.add(nombreAlumno);
					nombre.add(nombreAlumno2);
					Collections.sort(nombre);
					System.out.println("");
					System.out.println("Nombres ordenados");
					for(String sElemento: nombre){
						   System.out.println(sElemento);	
						}
					apellidos.add(apellidosAlumno);
					apellidos.add(ApellidoAlumno1);
					apellidos.add(ApellidoAlumno2);
					Collections.sort(apellidos);
					System.out.println("");
					System.out.println("Apellidos ordenados");
					for(String sElemento: apellidos){
						System.out.println(sElemento);
					}
					break;
				case 7:
					System.out.println("Terminando programa...");
					break;
				default:
					System.out.println("Opción no válida.");
				}
				}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
