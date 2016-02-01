package DAW_10_Matrices;
import java.io.*;
import java.util.*;

public class Puertas {

	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int[][] portes = new int[3][3];

			for (int i = 0; i < portes.length; i++) {

				boolean bona = false;

				for (int j = 0; j < portes[i].length; j++) {

					if (bona == false){

						if (j == 2)
							portes[i][j] = 1;
						else						
							portes[i][j] = (int) (Math.random()*2);

						if (portes[i][j] == 1)
							bona = true;

					}
					else
						portes[i][j] = 0;

				}

			}

			System.out.println("Elige un nivel de dificultad:");
			System.out.println("    [1] NIVEL F¡CIL");
			System.out.println("    [2] NIVEL MEDIO");
			System.out.println("    [3] NIVEL DIFÕCIL");
			System.out.println("");

			int lvl = Integer.parseInt(buffer.readLine());
			int lfs = 7;

			for (int i = 0; i < 3 && (lvl == 1 || lvl == 2); i++) {						

				System.out.println("");
				System.out.println("ªªªª Nivel " + (i+1) + " ´´´´");
				System.out.println("");
				System.out.println("Elige una puerta: ");
				System.out.println(" ______________");
				System.out.println("|    |    |    |");
				System.out.println("| 1  | 2  | 3  |");
				System.out.println("|    |    |    |");
				System.out.println("|____|____|____|");
				System.out.println("");			

				int p = Integer.parseInt(buffer.readLine());				
				p -= 1;

				System.out.println("");

				if (portes[i][p] == 1){					

					if (i < 2)					
						System.out.println("Pasas al siguiente nivel! :)");
					if (i == 2)
						System.out.println("HAS GANADO EL JUEGO!");

				}
				else{

					System.out.println("Fallaste...");

					if (i == 0){

						System.out.println("Te quedas en el nivel 1.");
						i --;

					}
					else{

						if (lvl == 2){							

							System.out.println("Vuelves al nivel " + i);
							i -= 2;

						}
						else{

							System.out.println("Te quedas en el nivel " + (i + 1));
							i --;

						}												
					}
				}						
			}

			for (int i=0; i < 3 && lvl == 3 && lfs > 0; i++){

				System.out.println("");
				System.out.println("VIDAS: " + lfs);
				System.out.println("");
				System.out.println("ªªªª Nivel " + (i+1) + " ´´´´");
				System.out.println("");
				System.out.println("Elige una puerta: ");
				System.out.println(" ______________");
				System.out.println("|    |    |    |");
				System.out.println("| 1  | 2  | 3  |");
				System.out.println("|    |    |    |");
				System.out.println("|____|____|____|");
				System.out.println("");			


				int p = Integer.parseInt(buffer.readLine());				
				p -= 1;

				System.out.println("");

				if (portes[i][p] == 1){					

					if (i < 2)					
						System.out.println("Pasas al siguiente nivel! :)");
					if (i == 2)
						System.out.println("HAS GANADO EL JUEGO!");

				}
				else{
					
					lfs --;
					
					if (lfs == 0)				
						System.out.println("GAME OVER");

					else{
						
						System.out.println("Fallaste...");

						for (int k = 0; k < portes.length; k++) {

							boolean bona = false;

							for (int j = 0; j < portes[k].length; j++) {

								if (bona == false){

									if (j == 2)
										portes[k][j] = 1;
									else						
										portes[k][j] = (int) (Math.random()*2);

									if (portes[k][j] == 1)
										bona = true;

								}
								else
									portes[k][j] = 0;

								System.out.print(portes[k][j]);

							}

							System.out.println("");

						}

						if (i == 0){

							System.out.println("Te quedas en el nivel 1.");
							i --;

						}
						else{
							
							System.out.println("Vuelves al nivel " + i);
							i -= 2;
							
						}						
					}	
				}				
			}			
		}
		catch(Exception e){
			System.out.println("Error! " + e);
		}
	}
}