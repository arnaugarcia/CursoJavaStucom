package DAW_03_IF_ELSE;

import java.io.*;

public class ex09 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce edad alumno 1: ");
			String var1 = buffer.readLine();
			int edad_al1 = Integer.parseInt(var1);
			System.out.println("Introduce altura alumno 1: ");
			String var2 = buffer.readLine();
			double alt_al1=Double.parseDouble(var2);
			System.out.println("Introduce edad alumno 2: ");
			String var3 = buffer.readLine();
			int edad_al2 = Integer.parseInt(var3);
			System.out.println("Introduce altura alumno 2: ");
			String var4 = buffer.readLine();
			double alt_al2=Double.parseDouble(var4);
			System.out.println("Introduce edad alumno 3: ");
			String var5 = buffer.readLine();
			int edad_al3 = Integer.parseInt(var5);
			System.out.println("Introduce altura alumno 3: ");
			String var6 = buffer.readLine();
			double alt_al3=Double.parseDouble(var6);
			System.out.println("Introduce edad alumno 4: ");
			String var7 = buffer.readLine();
			int edad_al4 = Integer.parseInt(var7);
			System.out.println("Introduce altura alumno 4: ");
			String var8 = buffer.readLine();
			double alt_al4=Double.parseDouble(var8);
			System.out.println("Introduce edad alumno 5: ");
			String var9 = buffer.readLine();
			int edad_al5 = Integer.parseInt(var9);
			System.out.println("Introduce altura alumno 5: ");
			String var10 = buffer.readLine();
			double alt_al5=Double.parseDouble(var10);
			int mayor = 0;
			if(edad_al1>=18){
				mayor++;
			}
			if(edad_al2>=18){
				mayor++;
			}
			if(edad_al3>=18){
				mayor++;
			}
			if(edad_al4>=18){
				mayor++;
			}
			if(edad_al5>=18){
				mayor++;
			}
			double alt_med = (alt_al1+alt_al2+alt_al3+alt_al4+alt_al5)/5;
			int edad_med = (edad_al1+edad_al2+edad_al3+edad_al4+edad_al5)/5;
			System.out.println("La altura media es: " + alt_med);
			System.out.println("La edad media es: " + edad_med);
			System.out.println("El número de alumnos con más de 18 años es: " + mayor);
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
		
		

	}

}
