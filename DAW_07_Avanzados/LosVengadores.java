package DAW_07_Avanzados;
import java.io.*;
public class LosVengadores {

	public static void main(String[] args) {
		
		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
							
			int opcio = 0;
			
			String habilidad[] = new String[9];
			int nivel[] = {0,10,0,0,0,0,0,0,0};
			String bestFriend[] = {"","iron man","","","","","","",""};			
			habilidad[1] = "Superfuerza, Superinteligencia";
											
			int heroes = 1;
			int numBf = -1;
			
			while (opcio != 6){
						
				if (opcio < 0 || opcio > 6){
					
					System.out.println("La opción no ha sido válida.");
					
				}
				
				System.out.println("1. Yo quiero ser un Vengador");
				System.out.println("2. Número de Vengadores");
				System.out.println("3. Ordenar Vengadores");
				System.out.println("4. El más mejor amigo");
				System.out.println("5. Mejorar nivel de superhéroe");
				System.out.println("6. Salir");
										
				opcio = Integer.parseInt(buffer.readLine());
															
				switch (opcio){
		
				case 1: 
														
					System.out.println("Nombre:");
					String nom = buffer.readLine();
					String nom1 = nom.toLowerCase();
					
					int n = -1;
					boolean accept = false;
					
					if (nom1.equals("iron man") || nom1.equals("thor") || nom1.equals("hulk") || nom1.equals("avispa") || nom1.equals("ojo de halcón") || nom1.equals("henry pym") || nom1.equals("pantera negra") || nom1.equals("viuda negra")){
						
						accept = true;
						heroes ++;
					
					}
						
					while (accept == false){
						
						System.out.println("Personaje no aceptado. Prueba otra vez:");
						nom = buffer.readLine();
						nom1 = nom.toLowerCase();
						
						if (nom1.equals("iron man") || nom1.equals("thor") || nom1.equals("hulk") || nom1.equals("avispa") || nom1.equals("ojo de halcón") || nom1.equals("henry pym") || nom1.equals("pantera negra") || nom1.equals("viuda negra")){
							
							accept = true;
							heroes ++;
						
						}						
					}
					
					if (nom1.equals("iron man"))						
						n = 0;
					if (nom1.equals("thor"))
						n = 2;
					if (nom1.equals("hulk"))
						n = 3;
					if (nom1.equals("avispa"))
						n = 4;
					if (nom1.equals("ojo de halcón"))
						n = 5;
					if (nom1.equals("henry pym"))
						n = 6;
					if (nom1.equals("pantera negra"))
						n = 7;
					if (nom1.equals("viuda negra"))
						n = 8;
					
					System.out.println("Habilidad:");
					habilidad[n] = buffer.readLine();
					
					System.out.println("Nivel:");
					int lvl = Integer.parseInt(buffer.readLine());
					
					while (lvl < 1 || lvl > 10){
						
						System.out.println("Debe ser un número del 1 al 10. Prueba otra vez:");
						lvl = Integer.parseInt(buffer.readLine());						
						
					}
					
					nivel[n] = lvl;
						
					System.out.println("Mejor amigo:");
					String bf = buffer.readLine();
					String bf1 = bf.toLowerCase();
					
					boolean person = false;
					
					if (bf1.equals("iron man") || bf1.equals("capitán américa") || bf1.equals("thor") || bf1.equals("hulk") || bf1.equals("avispa") || bf1.equals("ojo de halcón") || bf1.equals("henry pym") || bf1.equals("pantera negra") || bf1.equals("viuda negra"))
						person = true;
					
					while (person == false){
						
						System.out.println("Éste personaje no se encuentra en la lista de Vengadores. Prueba otra vez:");
						bf = buffer.readLine();
						bf1 = bf.toLowerCase();
						
						if (bf1.equals("iron man") || bf1.equals("capitán américa") || bf1.equals("thor") || bf1.equals("hulk") || bf1.equals("avispa") || bf1.equals("ojo de halcón") || bf1.equals("henry pym") || bf1.equals("pantera negra") || bf1.equals("viuda negra"))
							person = true;
						
					}
					
					bestFriend[n] = bf1;
					
					break;
					
				case 2:								
					
					System.out.println("Hay " + heroes + " Vengadores registrados.");
					
					break;
					
				case 3:
					
					
					
					break;
				
				case 4:
								
					int bfs[] = new int[9];
					
					for (int i=0; i < 9; i++){
						
						if (bestFriend[i].equals("iron man"))
							bfs[0] += 1;
						if (bestFriend[i].equals("capitán américa"))
							bfs[1] += 1;
						if (bestFriend[i].equals("thor"))
							bfs[2] += 1;
						if (bestFriend[i].equals("hulk"))
							bfs[3] += 1;
						if (bestFriend[i].equals("avispa"))
							bfs[4] += 1;
						if (bestFriend[i].equals("ojo de halcón"))
							bfs[5] += 1;
						if (bestFriend[i].equals("henry pym"))
							bfs[6] += 1;
						if (bestFriend[i].equals("pantera negra"))
							bfs[7] += 1;
						if (bestFriend[i].equals("viuda negra"))
							bfs[8] += 1;
						
					}
																		
					int mejo = 0;
										
					for (int i=0; i < 9; i++){
						
						if (bfs[i] > mejo){
							
							mejo = bfs[i];
							numBf = i;
							
						}
					}
									
					if (numBf == 0)
						System.out.println("El más mejor amigo es Iron Man");
					if (numBf == 1)
						System.out.println("El más mejor amigo es Capitán América");
					if (numBf == 2)
						System.out.println("El más mejor amigo es Thor");
					if (numBf == 3)
						System.out.println("El más mejor amigo es Hulk");
					if (numBf == 4)
						System.out.println("El más mejor amigo es Avispa");
					if (numBf == 5)
						System.out.println("El más mejor amigo es Ojo de halcón");
					if (numBf == 6)
						System.out.println("El más mejor amigo es Henry Pym");
					if (numBf == 7)
						System.out.println("El más mejor amigo es Pantera Negra");
					if (numBf == 8)
						System.out.println("El más mejor amigo es Viuda Negra");
									
					break;
					
				case 5:
					
					System.out.println("Introduce tu nombre:");
					String nombre = buffer.readLine();
					String name = nombre.toLowerCase();
					
					int l = -1;
					
					if (name.equals("iron man"))						
						l = 0;
					if (name.equals("capitán américa"))
						l = 1;
					if (name.equals("thor"))
						l = 2;
					if (name.equals("hulk"))
						l = 3;
					if (name.equals("avispa"))
						l = 4;
					if (name.equals("ojo de halcón"))
						l = 5;
					if (name.equals("henry pym"))
						l = 6;
					if (name.equals("pantera negra"))
						l = 7;
					if (name.equals("viuda negra"))
						l = 8;
					
					while (nivel[l] == 0){
						
						System.out.println("Personaje no registrado. Prueba otra vez");
						nombre = buffer.readLine();
						name = nombre.toLowerCase();
												
						if (name.equals("iron man"))						
							l = 0;
						if (name.equals("capitán américa"))
							l = 1;
						if (name.equals("thor"))
							l = 2;
						if (name.equals("hulk"))
							l = 3;
						if (name.equals("avispa"))
							l = 4;
						if (name.equals("ojo de halcón"))
							l = 5;
						if (name.equals("henry pym"))
							l = 6;
						if (name.equals("pantera negra"))
							l = 7;
						if (name.equals("viuda negra"))
							l = 8;
						
					}
					
					if (nivel[l] < 10){
						
						System.out.println("2 + 2 = ?");
						int answr = Integer.parseInt(buffer.readLine());
						
						if (answr == 4){
							
							System.out.println("Enhorabuena! Has subido un nivel.");
							nivel[l] += 1;
							
						}
						else
							System.out.println("Fallaste... Te quedas como estabas.");
							
					}
					else
						System.out.println("El nivel no puede pasar de 10.");
					
					break;
				
				}		
			}								
		
			if (opcio == 6){
				
				System.out.println("El mundo está a salvo con nosotros.");
				System.exit(0);
			
			}
		
		}
		catch (Exception e){
			System.out.println("Error!" + e);
		}
	}
}
