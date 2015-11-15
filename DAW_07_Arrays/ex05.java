package DAW_07_Arrays;
import java.io.*;
public class ex05 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String empleadosNombre[] = new String [20];
			Double empleadosSueldo[]= new Double[20];
			Double suledoSuperior=0.0;
			String nombreEmpleadoSuperior="";
			for(int i=0; i<empleadosNombre.length; i++){
				System.out.println("Introduce nombre empleado " + i+1 + ":");
				empleadosNombre[i]=buffer.readLine();
				System.out.println("Introduce sueldo empleado " + i+1 + ":");
				empleadosSueldo[i]=Double.parseDouble(buffer.readLine());
				System.out.println(empleadosNombre[i] + " - " +  empleadosSueldo[i]);
				if(empleadosSueldo[i]>suledoSuperior){
					suledoSuperior=empleadosSueldo[i];
					nombreEmpleadoSuperior=empleadosNombre[i];
				}
			}
			System.out.println("El empleado con un sueldo mayor es: " + nombreEmpleadoSuperior + " con un sueldo de: " + suledoSuperior);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
