package DAW_10_Matrices;
import java.io.*;
import java.util.Arrays;
public class LosVengadores2 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcion=0, mision=0, puntuacionFinal=0;
			int[][] habilidades = new int[4][5];
			int[]	puntuacion	= new int[4];
			while(opcion!=5){
				System.out.println("Seleciona una opción:");
				System.out.println("[1] - Registrar datos aleatorios");
				System.out.println("[2] - Evaluar el más superhéroe");
				System.out.println("[3] - Analizar misiones");
				System.out.println("[4] - Reponer habilidades");
				System.out.println("[5] - Salir");
				opcion=Integer.parseInt(buffer.readLine());
				switch(opcion){
				case 1:
					System.out.println("Introduce la contraseña:");
					int contraseña = Integer.parseInt(buffer.readLine());
					if(contraseña==1234){
						for(int i=0; i<habilidades.length; i++){
							System.out.println("");
							if(i==0){
								System.out.println("Capitan America:");
							}else if(i==1){
								System.out.println("Iron Man:");
							}else if(i==2){
								System.out.println("Viuda Negra:");
							}else if(i==3){
								System.out.println("Thor:");
							}else{
								System.out.println("Da fuck?");
							}
							for(int j=0; j<habilidades[i].length; j++){
								habilidades[i][j]=0 + (int)(Math.random() * ((9 - 0) + 1));
								if(j==0){
									System.out.println("Fuerza: " + habilidades[i][j]);
								}else if(j==1){
									System.out.println("Inteligencia: " + habilidades[i][j]);
								}else if(j==2){
									System.out.println("Velocidad: " + habilidades[i][j]);
								}else if(j==3){
									System.out.println("Intuición: " + habilidades[i][j]);
								}else if(j==4){
									System.out.println("Imortalidad: " + habilidades[i][j]);
								}
							}
						}
					}else{
						System.out.println("Error al introducir la contraseña");
					}
					break;
				case 2:
					System.out.println("Ranking de super heroes \n");
					for(int i=0; i<habilidades.length; i++){
						if(i==0){
							System.out.print("Capitan America");
							puntuacion[i]= (int) ((habilidades[i][0] * 0.3) + (habilidades[i][1] * 0.3) + (habilidades[i][2] * 0.2) + (habilidades[i][3] * 0.1) + (habilidades[i][4] * 0.1));
							System.out.println(", su puntuación es: " + puntuacion[i]);
						}else if(i==1){
							System.out.print("Iron Man");
							puntuacion[i]= (int) ((habilidades[i][0] * 0.3) + (habilidades[i][1] * 0.3) + (habilidades[i][2] * 0.2) + (habilidades[i][3] * 0.1) + (habilidades[i][4] * 0.1));
							System.out.println(", su puntuación es: " + puntuacion[i]);
						}else if(i==2){
							System.out.print("Viuda Negra");
							puntuacion[i]= (int) ((habilidades[i][0] * 0.3) + (habilidades[i][1] * 0.3) + (habilidades[i][2] * 0.2) + (habilidades[i][3] * 0.1) + (habilidades[i][4] * 0.1));
							System.out.println(", su puntuación es: " + puntuacion[i]);
						}else if(i==3){
							System.out.print("Thor");
							puntuacion[i]= (int) ((habilidades[i][0] * 0.3) + (habilidades[i][1] * 0.3) + (habilidades[i][2] * 0.2) + (habilidades[i][3] * 0.1) + (habilidades[i][4] * 0.1));
							System.out.println(", su puntuación es: " + puntuacion[i] + "\n");
						}else{
							System.out.println("Da fuck?");
						}
						puntuacionFinal=puntuacionFinal+puntuacion[i];
					}
					break;
				case 3:
					System.out.println("Introduce valoración de la misión:");
					boolean select = false;
					Arrays.sort(puntuacion);
					mision=Integer.parseInt(buffer.readLine());
					if(mision<puntuacion[0]){
						System.out.println("Es necesita Capitan America");
					}else if(mision<puntuacion[0]+puntuacion[1]){
						System.out.println("Es necesiten Capitan America i Iron Man");
					}else if(mision<puntuacion[0]+puntuacion[1]+puntuacion[2]){
						System.out.println("Es necesiten Capitan America, Iron Man i Viuda Negra");
					}else if(mision<puntuacion[0]+puntuacion[1]+puntuacion[2]+puntuacion[3]){
						System.out.println("Es necesiten tots, be careful.");
					}
					break;
				case 4:
					System.out.println("Reponer habilidades");
					System.out.println("Que superheroe eres?");
					System.out.println("[0] - Capitan America");
					System.out.println("[1] - Iron Man");
					System.out.println("[2] - Viuda Negra");
					System.out.println("[3] - Thor");
					int superheroe = Integer.parseInt(buffer.readLine());
					System.out.println("Seleciona una opcion:");
					System.out.println("[1] - Mejorar fuerza");
					System.out.println("[2] - Mejorar inteligencia");
					System.out.println("[3] - Mejorar velocidad");
					System.out.println("[4] - Mejorar intuición");
					System.out.println("[5] - Mejorar inmortalidad:");
					switch(Integer.parseInt(buffer.readLine())){
					case 1:
						habilidades[superheroe][0]++;
						System.out.println("Fuerza mejorada");
						break;
					case 2:
						System.out.println("Cuanto es 4+4?");
						if(Integer.parseInt(buffer.readLine())==5){
							System.out.println("Inteligencia mejorada");
							habilidades[superheroe][1]++;
						}else{
							System.out.println("Me temo que no has estudiado suficiente");
						}
						break;
					case 3:
						System.out.println("Velocidad mejorada!");
						habilidades[superheroe][2]++;
						break;
					case 4:
						System.out.println("¿Que pesa más un quilo de hierro o un quilo de o un kilo de plumas");
						if(buffer.readLine().equals("IGUAL")){
							System.out.println("Me temo que tu intuición falla!");
						}else{
							habilidades[superheroe][3]++;
							System.out.println("Intuición mejorada!");
						}
						break;
					case 5:
						System.out.println("Aceptalo, vas a morir algún día TT");
					}					
					break;
				case 5:
					System.out.println("El mundo sigue a salvo con nosotros, aunque seamos menos.");
					break;
				default:
					System.out.println("La opción no és válida, vuleve a intentarlo;");
				}
			}
		}catch(Exception e){
			System.out.println("Error " + e);
		}
		
	}

}
