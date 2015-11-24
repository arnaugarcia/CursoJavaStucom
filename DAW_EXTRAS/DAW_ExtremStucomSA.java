package DAW_EXTRAS;
import java.io.*;
public class DAW_ExtremStucomSA {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		try{
			int opcio = 0;
			int precio_bicis=0;
			int precio_monopatines=0;
			int opcio2=0;
			int bicis=0;
			int monopatines=0;
			int compradores=0;
			int ingreso_bici=0;
			int ingreso_monopatin=0;
			System.out.println("Introduce el precio para las bicis:");
			precio_bicis = Integer.parseInt(buffer.readLine());
			System.out.println("Introduce el precio para los monopatines:");
			precio_monopatines = Integer.parseInt(buffer.readLine());
			while(precio_bicis>1000 || precio_bicis<200 || precio_monopatines>150 || precio_monopatines<20){
			System.out.println("Introduce el precio para las bicis:");
			precio_bicis = Integer.parseInt(buffer.readLine());
			System.out.println("Introduce el precio para los monopatines:");
			precio_monopatines = Integer.parseInt(buffer.readLine());
			}
			while(opcio != 8){
				System.out.println("[1] - Registrar ventas");
				System.out.println("[2] - Estadisticas");
				System.out.println("[3] - reiniciar");
				System.out.println("[4] - salir");
				opcio = Integer.parseInt(buffer.readLine());
				switch (opcio) {
				case 1: 
					System.out.println("Registrar ventas");
					System.out.println("¿Que ventas quieres registrar? ¿1 o 2?");
					opcio2 = Integer.parseInt(buffer.readLine());
					while(opcio2>3 || opcio2<0 || opcio2==-1){
						System.out.println("¿Que ventas quieres registrar? ¿1 o 2?");
						opcio2 = Integer.parseInt(buffer.readLine());
					}
						if(opcio2<3 && opcio2>0){
					if(opcio2==1){
						System.out.println("¿Cuantas bicis quieres registrar?");
						bicis = Integer.parseInt(buffer.readLine());
					}
					if(opcio2==2){
						System.out.println("¿Cuantos monopatines quieres registrar?");
						monopatines = Integer.parseInt(buffer.readLine());
					}
					if(opcio2==-1){
						break;
					}
						}
					compradores++;
					break;
				case 2:
					System.out.println("bicis vendidas: "+ bicis + " con un ingreso total de "+ bicis*precio_bicis);
					System.out.println("monopatines vendidos: "+ monopatines + " con un ingreso total de "+ monopatines*precio_monopatines);
					System.out.println("numero de compradores "+ compradores);
					break;
				case 3: 
					 precio_bicis=0;
					 precio_monopatines=0;
					 opcio2=0;
					 bicis=0;
					 monopatines=0;
					 compradores=0;
					 ingreso_bici=0;
					 ingreso_monopatin=0;	
					 System.out.println("Reseteo completado");
				break;
				case 4: 
				}
			}
		}
		catch (Exception e){
			System.out.println("Error al introducir los datos " + e);
		}
	}

}
