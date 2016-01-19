package DAW_07_Avanzados;
import java.io.*;
import java.util.ArrayList;
public class ForceAwakens {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcion = 0, aleatorio=0, maximaEnergia=Integer.MAX_VALUE, masSupervivientes=Integer.MAX_VALUE, masDefensa=Integer.MAX_VALUE, SoladosTope=0,
					energiaMaximaImperio=0,energiaMaximaResistencia=0,masSupervivientesResistencia=0,masSupervivientesImperio=0;
			//resistencia
			ArrayList <Integer> DefensaResistencia = new ArrayList();
			ArrayList <Integer> EnergiaResistencia = new ArrayList();
			//Imperio
			ArrayList <Integer> DefensaImperio = new ArrayList();
			ArrayList <Integer> EnergiaImperio = new ArrayList();
			//Soldado Imperio
			Integer[] soldadoResistencia = new Integer[11];
			Integer[] soldadoImperio = new Integer[11];
			while(opcion!=4){
				System.out.println("Elige una opcion:");
				System.out.println("1. Asignar valores");
				System.out.println("2. Iniciar batalla");
				System.out.println("3. Analisis de batalla");
				System.out.println("4. Salir");
				opcion=Integer.parseInt(buffer.readLine());
				switch(opcion){
				case 1:
					//Nivel Defensa
					for(int i = 0; i<=9; i++){
						DefensaResistencia.add((int)(Math.random()*10 + 1));
					}
					System.out.println("El nivel de la de defensa de la resitencia: " + DefensaResistencia);
					//Nivel energia Resistencia
					for(int i = 0; i<=9; i++){
						EnergiaResistencia.add((int)(Math.random()*10 + 1));
					}
				     System.out.println("El nivel de energia de la resitencia es: " + EnergiaResistencia);
				   //Nivel Defensa Imperio
					for(int i = 0; i<=9; i++){
						DefensaImperio.add((int)(Math.random()*10 + 1));
					}
					System.out.println("El nivel de la de defensa del imperio: " + DefensaImperio);
					//Nivel energia imperio
					for(int i = 0; i<=9; i++){
						EnergiaImperio.add((int)(Math.random()*10 + 1));
					}
					System.out.println("El nivel de energia del imperio es: " + EnergiaImperio);
					break;
				case 2:
					if((int)(Math.random()*2 + 0)==1){
						System.out.println("Ataca resistencia");
						for(int i=0; i<10; i++){
							//ataque soldado resistencia
						soldadoImperio[i]=Integer.parseInt(String.valueOf(EnergiaResistencia.get(i)))-Integer.parseInt(String.valueOf(DefensaImperio.get(i)));
							if(soldadoImperio[i]<0){
								soldadoImperio[i]=0;
							}else{
								soldadoImperio[i]=EnergiaImperio.get(i)-(EnergiaResistencia.get(i)-DefensaImperio.get(i));
							}
						}
					}else{
						System.out.println("Ataca Imperio");
						for(int i=0; i<10; i++){
							//ataque soldado imperio
							soldadoResistencia[i]=Integer.parseInt(String.valueOf(EnergiaImperio.get(i)))-Integer.parseInt(String.valueOf(DefensaResistencia.get(i)));
							if(soldadoResistencia[i]<0){
								soldadoResistencia[i]=0;
							}else{
								soldadoResistencia[i]=EnergiaResistencia.get(i)-(EnergiaImperio.get(i)-DefensaResistencia.get(i));
							}
						}
					}
					for(int i=0; i<10; i++){
						System.out.println("El soldado de la resistencia número " + i + " ha echo:"+ soldadoResistencia[i]);
					}
					for(int i=0; i<10; i++){
						System.out.println("El soldado del imperio número " + i + " ha echo:"+ soldadoImperio[i]);
					}
					break;
				case 3:
					for(int i=0; i<10; i++){
						energiaMaximaImperio=maximaEnergia+EnergiaImperio.get(i);
						energiaMaximaResistencia=maximaEnergia+EnergiaResistencia.get(i);
						if(soldadoResistencia[i]>soldadoImperio[i]){
							masSupervivientesResistencia++;
						}else{
							masSupervivientesImperio++;
						}
					}
					if(energiaMaximaImperio>energiaMaximaResistencia){
						System.out.println("Mas energia el imperio");
						}else{
						System.out.println("Más energia resistencia");
					}
					if(masSupervivientesResistencia>masSupervivientesImperio){
						System.out.println("Mas supervivientes resistencia");
						}else{
						System.out.println("Mas supervivientes Imperio");
					}
					break;
				case 4:
					System.out.println("LA RESISTENCIA a no rendirese jamás, y que recuerde que... Hazlo o no lo hagas pero no lo intentes.");
					break;
				default:
					System.out.println("El número introducido no és válido, vuelve a intentar lo!");
				break;
				}	
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
