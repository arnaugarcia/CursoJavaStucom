package DAW_07_Avanzados;
import java.io.*;
import java.util.Arrays;
public class SistemaSolarv2 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int menu=0, opcion=0;
			String[] nombrePlaneta = new String[9];
			Double[] masaPlaneta = new Double[9];
			Double[] diametroPlaneta = new Double[9];
			Double[] distanciaSolPlaneta = new Double[9];
			nombrePlaneta[0] = "Mercurio";
			masaPlaneta[0] = 3.285;
			diametroPlaneta[0] = 4879.1;
			distanciaSolPlaneta[0] = 46.0;
			nombrePlaneta[1] = "Venus";
			masaPlaneta[1] = 4.868;
			diametroPlaneta[1] = 12092.0;
			distanciaSolPlaneta[1] = 50.0;
			nombrePlaneta[2] = "Tierra";
			masaPlaneta[2] = 5.9736;
			diametroPlaneta[2] = 43.0;
			distanciaSolPlaneta[2] = 150.0;
			nombrePlaneta[3] = "Marte";
			masaPlaneta[3] = 6.4185;
			diametroPlaneta[3] = 6794.0;
			distanciaSolPlaneta[3] = 190.8;
			nombrePlaneta[4] = "Júpiter";
			masaPlaneta[4] = 1898.9;
			diametroPlaneta[4] = 69.911;
			distanciaSolPlaneta[4] = 778500.0;
			nombrePlaneta[5] = "Saturno";
			masaPlaneta[5] = 568.3;
			diametroPlaneta[5] = 58.232;
			distanciaSolPlaneta[5] = 1433.000;
			nombrePlaneta[6] = "Urano";
			masaPlaneta[6] = 125.2;
			diametroPlaneta[6] =  1186.5;
			distanciaSolPlaneta[6] = 100.3;
			nombrePlaneta[7] = "Neptuno";
			masaPlaneta[7] = 86.81;
			diametroPlaneta[7] = 25.362;
			distanciaSolPlaneta[7] = 2877.000;
			nombrePlaneta[8] = "Plutón";
			masaPlaneta[8] = 125.2;
			diametroPlaneta[8] =  1186.5;
			distanciaSolPlaneta[8] = 100.3;
			while(menu!=4){
				System.out.println("Elige una opción:");
				System.out.println("1. Consultar planeta");
				System.out.println("2. Modificar planeta");
				System.out.println("3. Estadísticas");
				System.out.println("4. Salir");
				menu = Integer.parseInt(buffer.readLine());
				switch(menu){
				case 1:
					System.out.println("Escribe la opsición del planeta que quieres consultar:");
					for(int i=0; i<nombrePlaneta.length; i++){
						System.out.println(i + ". " + nombrePlaneta[i] );
					}
					opcion = Integer.parseInt(buffer.readLine());
					System.out.println("Nombre: " + nombrePlaneta[opcion]);
					System.out.println("Masa de " + nombrePlaneta[opcion] + " es: " + masaPlaneta[opcion]);
					System.out.println("Diametro de " + nombrePlaneta[opcion] + " es: " + diametroPlaneta[opcion]);
					System.out.println("La distancia entre el sol y " + nombrePlaneta[opcion] + " es: " + distanciaSolPlaneta[opcion]);
					break;
				case 2:
					System.out.println("Introduce el nombre del planeta que quieres introducir:");
					String consultaPlaneta=buffer.readLine();
					int consultaPlanetaNumero=9;
					for(int i=0; i<nombrePlaneta.length; i++){
						if(consultaPlaneta.equals(nombrePlaneta[i])){
							consultaPlanetaNumero=i;
						}
					}
					System.out.println("Nombre anterior " + nombrePlaneta[consultaPlanetaNumero]);
					System.out.println("Introduce nombre nuevo:");
					nombrePlaneta[consultaPlanetaNumero]=buffer.readLine();
					System.out.println("Masa anterior de " + nombrePlaneta[consultaPlanetaNumero] + " es: " + masaPlaneta[consultaPlanetaNumero]);
					System.out.println("Introduce nueva masa:");
					masaPlaneta[consultaPlanetaNumero]=Double.parseDouble(buffer.readLine());
					System.out.println("Diametro de " + nombrePlaneta[consultaPlanetaNumero] + " es " + diametroPlaneta[consultaPlanetaNumero]);
					System.out.println("Introduce nuevo diámetro:");
					diametroPlaneta[consultaPlanetaNumero]=Double.parseDouble(buffer.readLine());
					System.out.println("La distancia entre el sol y " + nombrePlaneta[consultaPlanetaNumero] + " es " + distanciaSolPlaneta[consultaPlanetaNumero]);
					System.out.println("Introduce nueva distancia");
					distanciaSolPlaneta[consultaPlanetaNumero]=Double.parseDouble(buffer.readLine());
					break;
				case 3:
					Arrays.sort(masaPlaneta);
					Arrays.sort(diametroPlaneta);
					Arrays.sort(distanciaSolPlaneta);
					   System.out.println("Las estadisticas de los planetas son:");
					   String mayorMasa="", menorMasa="", mayorDiametro="", menorDiametro="", masLejos="", menosLejos="";
					   for(int i=0; i<nombrePlaneta.length; i++) {
						   mayorMasa = (nombrePlaneta[i] + " tiene la mayor masa con " + masaPlaneta[i]);
					   }
					   for(int i=0; i<1; i++){
						   menorMasa = (nombrePlaneta[i] + " tiene la menor masa con " + masaPlaneta[i]);
					   }
					   for(int i=0; i<nombrePlaneta.length; i++){
						   mayorDiametro = (nombrePlaneta[i] + " tiene el mayor diametro " + diametroPlaneta[i]);
					   }
					   for(int i=0; i<1; i++){
						   menorDiametro = (nombrePlaneta[i] + " tiene el menor diametro " + diametroPlaneta[i]);
					   }
					   for(int i=0; i<nombrePlaneta.length; i++){
						   masLejos = (nombrePlaneta[i] + " es el más lejos al sol con una distáncia de " + distanciaSolPlaneta[i]);
					   }
					   for(int i=0; i<1; i++){
						   menosLejos = (nombrePlaneta[i] + " es el más cercano al sol con una distáncia de " + distanciaSolPlaneta[i]);
					   }
					   System.out.println(mayorMasa);
					   System.out.println(menorMasa);
					   System.out.println(mayorDiametro);
					   System.out.println(menorDiametro);
					   System.out.println(masLejos);
					   System.out.println(menosLejos);
					break;
				case 4:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Número incorrecto");
					break;
				}
			}
 		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}