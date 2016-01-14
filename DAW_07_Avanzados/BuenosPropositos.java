package DAW_07_Avanzados;
import java.io.*;
import java.util.ArrayList;
public class BuenosPropositos {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcion = 0, ejercicioTotal = 0, mediaPiezas=0, productividad=0, media=0;
			String[] dias = new String[7];
			dias[0]="Lunes";
			dias[1]="Martes";
			dias[2]="Miercoles";
			dias[3]="Jueves";
			dias[4]="Viernes";
			dias[5]="Sabado";
			dias[6]="Domingo";
			ArrayList ejercicio = new ArrayList();
			ArrayList fruta = new ArrayList();
			ArrayList verdura = new ArrayList();
			ArrayList horasProductivas = new ArrayList(); 
			while(opcion!=8){
				System.out.println("Elige una opcion:");
				System.out.println("1. Propósito hacer ejercicio");
				System.out.println("2. Propósito alimentarse bien");
				System.out.println("3. Propósito aprovechar el tiempo y trabajar más");
				System.out.println("4. Valorar ejercicio hecho");
				System.out.println("5. Valorar alimentación");
				System.out.println("6. Valorar productividad de cada día");
				System.out.println("7. Valoración general");
				System.out.println("8. Salir");
				opcion=Integer.parseInt(buffer.readLine());
				switch(opcion){
				case 1:
					for(int i=0; i<dias.length; i++){
						System.out.println("Cuantos minutos de ejercicio has echo el " + dias[i]);
						ejercicio.add(Integer.parseInt(buffer.readLine()));
					}
					System.out.println(ejercicio);
				break;
				case 2:
					for(int i=0; i<dias.length; i++){
						System.out.println("Piezas de fruta comidas el " + dias[i]);
						fruta.add(Integer.parseInt(buffer.readLine()));
						System.out.println("Piezas de verdura comidas el " + dias[i]);
						verdura.add(Integer.parseInt(buffer.readLine()));
					}
				break;
				case 3:
					for(int i=0; i<dias.length; i++){
						System.out.println("Horas productivas el " + dias[i]);
						horasProductivas.add(String.valueOf(Integer.parseInt(buffer.readLine())));
					}
				break;
				case 4:
					for(int i=0; i<dias.length; i++){
						ejercicioTotal=ejercicioTotal+Integer.parseInt(String.valueOf(ejercicio.get(i)));
					}
					if(ejercicioTotal>=7){
						System.out.println("Has echo suficiente ejercicio");
					}else{
						System.out.println("No has echo suficiente ejercicio");
					}
					break;
				case 5:
					for(int i=0; i<dias.length; i++){
						mediaPiezas=mediaPiezas+Integer.parseInt(String.valueOf(fruta.get(i)));
						mediaPiezas=mediaPiezas+Integer.parseInt(String.valueOf(verdura.get(i)));
						media++;
					}
					System.out.println("La media de piezas de fruta y verdura són: " + mediaPiezas/media);
					break;
				case 6:
						for(int i=0; i<dias.length; i++){
							if(Integer.parseInt(String.valueOf(ejercicio.get(i)))>=45){
								System.out.println("Has echo ejercicio el "  + dias[i] + ", muy bien. Productividad +2");
								productividad=productividad+2;
							}
							if(verdura.get(i)!="" && fruta.get(i)!=""){
								System.out.println("Has comido sano el  "  + dias[i] + ", muy bien. Productividad +2");
								productividad=productividad+2;
							}
							if(horasProductivas.get(i)!=""){
								System.out.println("Has echo horas productivas el   "  + dias[i] + ", muy bien. Productividad +2");
								productividad=productividad++;
							}
						}
					break;
				case 7:
					for(int i=0; i<dias.length; i++){
						if(ejercicio.get(i)=="" || verdura.get(i)=="" || fruta.get(i)=="" || horasProductivas.get(i)==""){
							System.out.println("Tienes que esforzarte más " + dias[i]);
						}else{
							if((fruta.get(i)=="" && verdura.get(i)=="") && Integer.parseInt(String.valueOf(horasProductivas.get(i)))<=5){
								System.out.println("Enhorabuena, puedes comer un trozo de tarta!");
							}
						}
					}
					break;
				case 8:
					System.out.println("Keep calm and carry on!");
					break;
				default:
					System.out.println("El número introducido no és válido, vuelve a intentar lo!s");
				break;
				}	
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
