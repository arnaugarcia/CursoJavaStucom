package DAW_EXTRAS;
import java.io.*;
import java.util.Arrays;
public class PracticaMonos {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int menu=5, tipoChimpance=0, numeroRegistros=0, numeroChimpance=0, numeroGorilas=0, edadSimio=0, pesoSimio=0;
			int[] edadChimpance = null;
			double[] pesoChimpance = null;
			int[] edadGorila = null;
			double[] pesoGorila = null;
			while(menu!=0){
				System.out.println("***** MENÚ PRINCIPAL *****");
				System.out.println("==========================");
				System.out.println("[1] - REGSISTRAR INGRESOS");
				System.out.println("[2] - ESTADÍSTICAS");
				System.out.println("[3] - REINICIAR");
				System.out.println("[0] - SALIR");
				System.out.println("ELIJA OPCIÓN: ");
				menu = Integer.parseInt(buffer.readLine());
				switch(menu){
				case 1:
					System.out.println("Introduzca cuantos ingresos quiere registrar:");
					numeroRegistros=Integer.parseInt(buffer.readLine());
					edadChimpance = new int[numeroRegistros];
					pesoChimpance = new double[numeroRegistros];
					edadGorila = new int[numeroRegistros];
					pesoGorila = new double[numeroRegistros];
					for(int i=0; i!=numeroRegistros; i++){
						System.out.println("¿Que tipo de símio quieres regisrar?");
						System.out.println("1 - Chimpancé | 2 - Gorila");
						tipoChimpance=Integer.parseInt(buffer.readLine());
						switch(tipoChimpance){
						case 1:
							numeroChimpance++;
							edadSimio=0;
							while(!(edadSimio>0 && edadSimio<40)){
								System.out.println("Introduce edad del chimpancé "+ 1 +": [0-40]" );
								edadSimio=Integer.parseInt(buffer.readLine());
								if(!(edadSimio>0 && edadSimio<40)){
									System.out.println("Datos err�neos");
								}else{
									edadChimpance[i]=edadSimio;
								}
							}
								System.out.println("Introduce el peso del chimpancé "+ 1 +":" );
								pesoChimpance[i]=Double.parseDouble(buffer.readLine());
							break;
						case 2:
							numeroGorilas++;
							edadSimio=0;
							while(!(edadSimio>0 && edadSimio<40)){
								System.out.println("Introduce edad del chimpancé "+ 1 +": [0-40]" );
								edadSimio=Integer.parseInt(buffer.readLine());
								if(!(edadSimio>0 && edadSimio<40)){
									System.out.println("Datos erróneos");
								}else{
									edadGorila[i]=edadSimio;
								}
							}
								System.out.println("Introduce el peso del chimpancé "+ 1 +":" );
								pesoGorila[i]=Double.parseDouble(buffer.readLine());
							break;
						default:
							System.out.println("Datos erróneos");
							i--;
						}
					}
					break;
				case 2:
					System.out.println("*** ESTADISTICAS ***");
					Arrays.sort(edadChimpance);
					Arrays.sort(pesoChimpance);
					Arrays.sort(edadGorila);
					Arrays.sort(pesoGorila);
					   int menorEdadChimpance=Integer.MIN_VALUE, mayorEdadChimpance=0, edadTotalChimpance=0, mayorEdadGorila=0, menorEdadGorila=Integer.MIN_VALUE, edadTotalGorila=0;
					   double mayorPesoChimpance=0, menorPesoChimpance=Integer.MIN_VALUE, pesoTotalChimpance=0,  mayorPesoGorila=0, menorPesoGorila=Integer.MIN_VALUE, pesoTotalGorila=0;
					   //Edad Chimpance
					   for(int i=0; i<edadGorila.length; i++) {
						   mayorEdadChimpance = edadChimpance[i];
					   }
					   for(int i=0; i<1; i++){
						   menorEdadChimpance = edadChimpance[i];
					   }
					   //Peso Chimpance
					   for(int i=0; i<pesoGorila.length; i++) {
						   mayorPesoChimpance = pesoChimpance[i];
					   }
					   for(int i=0; i<1; i++){
						   menorPesoChimpance = pesoChimpance[i];
					   }
					   //Media Chimpance
					   //Edad
					   for(int i=0; i<edadChimpance.length; i++){
						   edadTotalChimpance=edadTotalChimpance+edadChimpance[i];
					   }
					   //Peso
					   for(int i=0; i<pesoChimpance.length; i++){
						   pesoTotalChimpance=pesoTotalChimpance+pesoChimpance[i];
					   }
					   //-------------------------------------------------------------
					   //Edad Gorila
					   for(int i=0; i<edadGorila.length; i++) {
						   mayorEdadGorila = edadGorila[i];
					   }
					   for(int i=0; i<1; i++){
						   menorEdadGorila = edadGorila[i];
					   }
					   //Peso Gorila
					   for(int i=0; i<pesoGorila.length; i++) {
						   mayorPesoGorila = pesoGorila[i];
					   }
					   for(int i=0; i<1; i++){
						   menorPesoGorila = pesoGorila[i];
					   }
					   //Media Gorila
					   //Edad
					   for(int i=0; i<edadGorila.length; i++){
						   edadTotalGorila=edadTotalGorila+edadGorila[i];
					   }
					   //Peso
					   for(int i=0; i<pesoGorila.length; i++){
						   pesoTotalGorila=pesoTotalGorila+pesoGorila[i];
					   }
					   System.out.println("Chimpance más viejo: " + mayorEdadChimpance);
					   System.out.println("Chimpance más joven: " + menorEdadChimpance);
					   System.out.println("Edad media chimpances: " + edadTotalChimpance/numeroChimpance);
					   System.out.println("Chimpance más con mayor peso: " + mayorPesoChimpance);
					   System.out.println("Chimpance más con menor peso: " + menorPesoChimpance);
					   System.out.println("Peso medio chimpances: " + pesoTotalChimpance/numeroChimpance);
					   System.out.println("\n\n");
					   System.out.println("Gorila más viejo: " + mayorEdadGorila);
					   System.out.println("Gorila más joven: " + menorEdadGorila);
					   System.out.println("Edad media Gorilas: " + edadTotalGorila/numeroGorilas);
					   System.out.println("Gorila más con mayor peso: " + mayorPesoGorila);
					   System.out.println("Gorila más con menor peso: " + menorPesoGorila);
					   System.out.println("Peso medio Gorilas: " + pesoTotalGorila/numeroGorilas);
					default:
						System.out.println("Opción errónea");
						break;
					case 3:
						System.out.println("Estadisticas reseteadas!");
						 menorEdadChimpance=0; mayorEdadChimpance=0; edadTotalChimpance=0; mayorEdadGorila=0; menorEdadGorila=0; edadTotalGorila=0;
						 mayorPesoChimpance=0; menorPesoChimpance=0; pesoTotalChimpance=0;  mayorPesoGorila=0; menorPesoGorila=0; pesoTotalGorila=0;
						break;
				}
			}
		}catch(Exception e ){
			System.out.println("Error " + e);
		}
	}

}
