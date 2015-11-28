package DAW_07_Avanzados;
import java.io.*;
import java.util.Arrays;
public class SistemaSolar {

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
						System.out.println(nombrePlaneta[i] + " está en la posición " + i);
					}
					opcion = Integer.parseInt(buffer.readLine());
					switch(opcion){
					case 0:
						System.out.println("Nombre: " + nombrePlaneta[0]);
						System.out.println("Masa de " + nombrePlaneta[0] + " es " + masaPlaneta[0]);
						System.out.println("Diametro de" + nombrePlaneta[0] + " es " + diametroPlaneta[0]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[0] + " es " + distanciaSolPlaneta[0]);
						break;
					case 1:
						System.out.println("Nombre: " + nombrePlaneta[1]);
						System.out.println("Masa de " + nombrePlaneta[1] + " es " + masaPlaneta[1]);
						System.out.println("Diametro de" + nombrePlaneta[1] + " es " + diametroPlaneta[1]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[1] + " es " + distanciaSolPlaneta[1]);
						break;
					case 2:
						System.out.println("Nombre: " + nombrePlaneta[2]);
						System.out.println("Masa de " + nombrePlaneta[2] + " es " + masaPlaneta[2]);
						System.out.println("Diametro de" + nombrePlaneta[2] + " es " + diametroPlaneta[2]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[2] + " es " + distanciaSolPlaneta[2]);
						break;
					case 3:
						System.out.println("Nombre: " + nombrePlaneta[3]);
						System.out.println("Masa de " + nombrePlaneta[3] + " es " + masaPlaneta[3]);
						System.out.println("Diametro de" + nombrePlaneta[3] + " es " + diametroPlaneta[3]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[3] + " es " + distanciaSolPlaneta[3]);
						break;
					case 4:
						System.out.println("Nombre: " + nombrePlaneta[4]);
						System.out.println("Masa de " + nombrePlaneta[4] + " es " + masaPlaneta[4]);
						System.out.println("Diametro de" + nombrePlaneta[4] + " es " + diametroPlaneta[4]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[4] + " es " + distanciaSolPlaneta[4]);
						break;
					case 5:
						System.out.println("Nombre: " + nombrePlaneta[5]);
						System.out.println("Masa de " + nombrePlaneta[5] + " es " + masaPlaneta[5]);
						System.out.println("Diametro de" + nombrePlaneta[5] + " es " + diametroPlaneta[5]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[5] + " es " + distanciaSolPlaneta[5]);
						break;
					case 6:
						System.out.println("Nombre: " + nombrePlaneta[6]);
						System.out.println("Masa de " + nombrePlaneta[6] + " es " + masaPlaneta[6]);
						System.out.println("Diametro de" + nombrePlaneta[6] + " es " + diametroPlaneta[6]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[6] + " es " + distanciaSolPlaneta[6]);
						break;
					case 7:
						System.out.println("Nombre: " + nombrePlaneta[7]);
						System.out.println("Masa de " + nombrePlaneta[7] + " es " + masaPlaneta[7]);
						System.out.println("Diametro de" + nombrePlaneta[7] + " es " + diametroPlaneta[7]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[7] + " es " + distanciaSolPlaneta[7]);
						break;
					case 8:
						System.out.println("Nombre: " + nombrePlaneta[8]);
						System.out.println("Masa de " + nombrePlaneta[8] + " es " + masaPlaneta[8]);
						System.out.println("Diametro de" + nombrePlaneta[8] + " es " + diametroPlaneta[8]);
						System.out.println("La distancia entre el sol y " + nombrePlaneta[8] + " es " + distanciaSolPlaneta[8]);
						break;
					default:
						System.out.println("Número incorrecto");
						break;
					}
					break;
				case 2:
					System.out.println("Introduce el nombre del planeta que quieres introducir:");
					String consultaPlaneta=buffer.readLine();
					if(consultaPlaneta.equals(nombrePlaneta[0])){
						System.out.println("Nombre anterior " + nombrePlaneta[0]);
						System.out.println("Introduce nombre nuevo:");
						nombrePlaneta[0]=buffer.readLine();
						System.out.println("Masa anterior de " + nombrePlaneta[0] + " es: " + masaPlaneta[0]);
						System.out.println("Introduce nueva masa:");
						masaPlaneta[0]=Double.parseDouble(buffer.readLine());
						System.out.println("Diametro de" + nombrePlaneta[0] + " es " + diametroPlaneta[0]);
						System.out.println("Introduce nuevo diámetro:");
						diametroPlaneta[0]=Double.parseDouble(buffer.readLine());
						System.out.println("La distancia entre el sol y " + nombrePlaneta[0] + " es " + distanciaSolPlaneta[0]);
						System.out.println("Introduce nueva distancia");
						distanciaSolPlaneta[0]=Double.parseDouble(buffer.readLine());
						}else{
							if(consultaPlaneta.equals(nombrePlaneta[1])){
								System.out.println("Nombre anterior " + nombrePlaneta[1]);
								System.out.println("Introduce nombre nuevo:");
								nombrePlaneta[1]=buffer.readLine();
								System.out.println("Masa anterior de " + nombrePlaneta[1] + " es: " + masaPlaneta[1]);
								System.out.println("Introduce nueva masa:");
								masaPlaneta[1]=Double.parseDouble(buffer.readLine());
								System.out.println("Diametro de" + nombrePlaneta[1] + " es " + diametroPlaneta[1]);
								System.out.println("Introduce nuevo diámetro:");
								diametroPlaneta[1]=Double.parseDouble(buffer.readLine());
								System.out.println("La distancia entre el sol y " + nombrePlaneta[1] + " es " + distanciaSolPlaneta[1]);
								System.out.println("Introduce nueva distancia");
								distanciaSolPlaneta[1]=Double.parseDouble(buffer.readLine());
							}else{
								if(consultaPlaneta.equals(nombrePlaneta[2])){
									System.out.println("Nombre anterior " + nombrePlaneta[2]);
									System.out.println("Introduce nombre nuevo:");
									nombrePlaneta[2]=buffer.readLine();
									System.out.println("Masa anterior de " + nombrePlaneta[2] + " es: " + masaPlaneta[2]);
									System.out.println("Introduce nueva masa:");
									masaPlaneta[2]=Double.parseDouble(buffer.readLine());
									System.out.println("Diametro de" + nombrePlaneta[2] + " es " + diametroPlaneta[2]);
									System.out.println("Introduce nuevo diámetro:");
									diametroPlaneta[2]=Double.parseDouble(buffer.readLine());
									System.out.println("La distancia entre el sol y " + nombrePlaneta[2] + " es " + distanciaSolPlaneta[2]);
									System.out.println("Introduce nueva distancia");
									distanciaSolPlaneta[2]=Double.parseDouble(buffer.readLine());
								}else{
									if(consultaPlaneta.equals(nombrePlaneta[3])){
										System.out.println("Nombre anterior " + nombrePlaneta[3]);
										System.out.println("Introduce nombre nuevo:");
										nombrePlaneta[3]=buffer.readLine();
										System.out.println("Masa anterior de " + nombrePlaneta[3] + " es: " + masaPlaneta[3]);
										System.out.println("Introduce nueva masa:");
										masaPlaneta[3]=Double.parseDouble(buffer.readLine());
										System.out.println("Diametro de" + nombrePlaneta[3] + " es " + diametroPlaneta[3]);
										System.out.println("Introduce nuevo diámetro:");
										diametroPlaneta[3]=Double.parseDouble(buffer.readLine());
										System.out.println("La distancia entre el sol y " + nombrePlaneta[3] + " es " + distanciaSolPlaneta[3]);
										System.out.println("Introduce nueva distancia");
										distanciaSolPlaneta[3]=Double.parseDouble(buffer.readLine());
									}else{
										if(consultaPlaneta.equals(nombrePlaneta[4])){
											System.out.println("Nombre anterior " + nombrePlaneta[4]);
											System.out.println("Introduce nombre nuevo:");
											nombrePlaneta[4]=buffer.readLine();
											System.out.println("Masa anterior de " + nombrePlaneta[4] + " es: " + masaPlaneta[4]);
											System.out.println("Introduce nueva masa:");
											masaPlaneta[4]=Double.parseDouble(buffer.readLine());
											System.out.println("Diametro de" + nombrePlaneta[4] + " es " + diametroPlaneta[4]);
											System.out.println("Introduce nuevo diámetro:");
											diametroPlaneta[4]=Double.parseDouble(buffer.readLine());
											System.out.println("La distancia entre el sol y " + nombrePlaneta[4] + " es " + distanciaSolPlaneta[4]);
											System.out.println("Introduce nueva distancia");
											distanciaSolPlaneta[4]=Double.parseDouble(buffer.readLine());
										}else{
											if(consultaPlaneta.equals(nombrePlaneta[5])){
												System.out.println("Nombre anterior " + nombrePlaneta[5]);
												System.out.println("Introduce nombre nuevo:");
												nombrePlaneta[5]=buffer.readLine();
												System.out.println("Masa anterior de " + nombrePlaneta[5] + " es: " + masaPlaneta[5]);
												System.out.println("Introduce nueva masa:");
												masaPlaneta[5]=Double.parseDouble(buffer.readLine());
												System.out.println("Diametro de" + nombrePlaneta[5] + " es " + diametroPlaneta[5]);
												System.out.println("Introduce nuevo diámetro:");
												diametroPlaneta[5]=Double.parseDouble(buffer.readLine());
												System.out.println("La distancia entre el sol y " + nombrePlaneta[5] + " es " + distanciaSolPlaneta[5]);
												System.out.println("Introduce nueva distancia");
												distanciaSolPlaneta[5]=Double.parseDouble(buffer.readLine());
											}else{
												if(consultaPlaneta.equals(nombrePlaneta[6])){
													System.out.println("Nombre anterior " + nombrePlaneta[6]);
													System.out.println("Introduce nombre nuevo:");
													nombrePlaneta[6]=buffer.readLine();
													System.out.println("Masa anterior de " + nombrePlaneta[6] + " es: " + masaPlaneta[6]);
													System.out.println("Introduce nueva masa:");
													masaPlaneta[6]=Double.parseDouble(buffer.readLine());
													System.out.println("Diametro de" + nombrePlaneta[6] + " es " + diametroPlaneta[6]);
													System.out.println("Introduce nuevo diámetro:");
													diametroPlaneta[6]=Double.parseDouble(buffer.readLine());
													System.out.println("La distancia entre el sol y " + nombrePlaneta[6] + " es " + distanciaSolPlaneta[6]);
													System.out.println("Introduce nueva distancia");
													distanciaSolPlaneta[6]=Double.parseDouble(buffer.readLine());
												}else{
													if(consultaPlaneta.equals(nombrePlaneta[7])){
														System.out.println("Nombre anterior " + nombrePlaneta[7]);
														System.out.println("Introduce nombre nuevo:");
														nombrePlaneta[7]=buffer.readLine();
														System.out.println("Masa anterior de " + nombrePlaneta[7] + " es: " + masaPlaneta[7]);
														System.out.println("Introduce nueva masa:");
														masaPlaneta[7]=Double.parseDouble(buffer.readLine());
														System.out.println("Diametro de" + nombrePlaneta[7] + " es " + diametroPlaneta[7]);
														System.out.println("Introduce nuevo diámetro:");
														diametroPlaneta[7]=Double.parseDouble(buffer.readLine());
														System.out.println("La distancia entre el sol y " + nombrePlaneta[7] + " es " + distanciaSolPlaneta[7]);
														System.out.println("Introduce nueva distancia");
														distanciaSolPlaneta[7]=Double.parseDouble(buffer.readLine());
													}else{
														if(consultaPlaneta.equals(nombrePlaneta[8])){
															System.out.println("Nombre anterior " + nombrePlaneta[8]);
															System.out.println("Introduce nombre nuevo:");
															nombrePlaneta[8]=buffer.readLine();
															System.out.println("Masa anterior de " + nombrePlaneta[8] + " es: " + masaPlaneta[8]);
															System.out.println("Introduce nueva masa:");
															masaPlaneta[8]=Double.parseDouble(buffer.readLine());
															System.out.println("Diametro de" + nombrePlaneta[8] + " es " + diametroPlaneta[8]);
															System.out.println("Introduce nuevo diámetro:");
															diametroPlaneta[8]=Double.parseDouble(buffer.readLine());
															System.out.println("La distancia entre el sol y " + nombrePlaneta[8] + " es " + distanciaSolPlaneta[8]);
															System.out.println("Introduce nueva distancia");
															distanciaSolPlaneta[8]=Double.parseDouble(buffer.readLine());
														}else{
															System.out.println("Número incorrecto.");
														}
													}
												}
											}
										}
									}
								}
							}
					}
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
						   masLejos = (nombrePlaneta[i] + " es el más lejos con una distáncia de " + distanciaSolPlaneta[i]);
					   }
					   for(int i=0; i<1; i++){
						   menosLejos = (nombrePlaneta[i] + " es el más lejos con una distáncia de " + distanciaSolPlaneta[i]);
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