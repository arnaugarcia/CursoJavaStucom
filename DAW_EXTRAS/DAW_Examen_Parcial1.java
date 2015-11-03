package DAW_EXTRAS;
import java.io.*;
import java.util.*;
public class DAW_Examen_Parcial1 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcio = 0;
			boolean satLeoB = false;
			boolean satMichB = false;
			boolean satDonaB = false;
			boolean satRaphB = false;
			boolean satLeoB2 = false;
			boolean satMichB2 = false;
			boolean satDonaB2 = false;
			boolean satRaphB2 = false;
			int numMalos=0;
			int numInocentes=0;
			double satLeo=9.0;
			double satMich=2.0;
			double satDona=3.0;
			double satRaph=4.0;
			double satLeo2=0;
			double satMich2=0;
			double satDona2=0;
			double satRaph2=0;
			while(opcio != 8){
				System.out.println("1. Registrar malos");
				System.out.println("2. Registrar Inocentes");
				System.out.println("3. Registrar realización");
				System.out.println("4. Mostrar grado de incidencia de la ciudad");
				System.out.println("5. Ver equilibrio");
				System.out.println("6. Mejorar realización");
				System.out.println("7. Ranking de realización");
				System.out.println("8. Salir");
				opcio = Integer.parseInt(buffer.readLine());
				switch (opcio) {
				case 1: 
					System.out.println("Introduce el número de malos desarmados:");
					String var1 = buffer.readLine();
					numMalos = Integer.parseInt(var1);
					if(numMalos<0){
						System.out.println("El valor no puede ser negativo");
					}
					break;
				case 2:
					System.out.println("Introduce el número de inocentes:");
					String var2 = buffer.readLine();
					numInocentes = Integer.parseInt(var2);
					if(numInocentes<0){
						System.out.println("El valor no puede ser negativo");
					}
					break;
				case 3: 
					System.out.println("Que tortuga eres?");
					String var3 = buffer.readLine();
					if(var3.equals("Leonardo")){
						if(!satLeoB){
							System.out.println("Leonardo, que satisfacion tienes?");
							String var4 = buffer.readLine();
							satLeo = Double.parseDouble(var4);
							if(satLeo<0 || satLeo>10){
								System.out.println("Valor erróneo");
							}else{
								satLeo = Double.parseDouble(var4);
							}
							satLeoB = true;	
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var3.equals("Michelangelo")){
						if(!satMichB){
							System.out.println("Michelangelo, que satisfacion tienes?");
							String var5 = buffer.readLine();
							satMich = Double.parseDouble(var5);
							if(satMich<0 || satMich>10){
								System.out.println("Valor erróneo");
							}else{
								satMich = Double.parseDouble(var5);
							}
							satMichB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var3.equals("Donatello")){
						if(!satDonaB){
							System.out.println("Donatello, que satisfacion tienes?");
							String var6 = buffer.readLine();
							satDona = Double.parseDouble(var6);
							if(satDona<0 || satDona>10){
								System.out.println("Valor erróneo");
							}else{
								satDona = Double.parseDouble(var6);
							}
							satDonaB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var3.equals("Raphael")){
						if(!satRaphB){
							System.out.println("Raphael, que satisfacion tienes?");
							String var7 = buffer.readLine();
							satRaph = Double.parseDouble(var7);
							if(satRaph<0 || satRaph>10){
								System.out.println("Valor erróneo");
							}else{
								satRaph = Double.parseDouble(var7);
							}
							satRaphB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
						
					}else{
						
					}
					break;
				case 4: 
					System.out.println("Número incidéncia:");
					double var8 = Math.sqrt(numMalos);
					int incidencia = Math.round(numMalos);
					System.out.println(incidencia);
					break;
				case 5: 
					if(numMalos==numInocentes){
						System.out.println("El equilibrio es neutro");
					}else{
						if(numMalos>numInocentes){
							System.out.println("El equilibro es negativo");
						}else{
							if(numMalos<numInocentes){
								System.out.println("El equilibrio es positivo");
							}
						}
					}
					break;
				case 6: 
					System.out.println("Que tortuga eres?");
					String var9 = buffer.readLine();
					if(var9.equals("Leonardo")){
						if(!satLeoB){
							System.out.println("Leonardo, que satisfacion tienes ahora?");
							String var10 = buffer.readLine();
							satLeo2 = Double.parseDouble(var10);
							if(satLeo2<0 || satLeo2>10){
								System.out.println("Valor erróneo");
							}else{
								satLeo=satLeo+satLeo2;
							}
							satLeoB2 = true;	
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var9.equals("Michelangelo")){
						if(!satMichB){
							System.out.println("Michelangelo, que satisfacion tienes ahora?");
							String var11 = buffer.readLine();
							satMich2 = Double.parseDouble(var11);
							if(satMich2<0 || satMich2>10){
								System.out.println("Valor erróneo");
							}else{
								satMich2=satMich+satMich2;
							}
							satMichB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var9.equals("Donatello")){
						if(!satDonaB){
							System.out.println("Donatello, que satisfacion tienes ahora?");
							String var12 = buffer.readLine();
							satDona = Double.parseDouble(var12);
							if(satDona2<0 || satDona2>10){
								System.out.println("Valor erróneo");
							}else{
								satDona=satDona2+satDona;
							}
							satDonaB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
					}
					if(var9.equals("Raphael")){
						if(!satRaphB){
							System.out.println("Raphael, que satisfacion tienes ahora?");
							String var13 = buffer.readLine();
							satRaph2 = Double.parseDouble(var13);
							if(satRaph2<0 || satRaph2>10){
								System.out.println("Valor erróneo");
							}else{
								satRaph=satRaph2+satRaph;
							}
							satRaphB = true;
						}else{
							System.out.println("Error ya has introducido los datos.");
						}
						
					}else{
						
					}
					break;
				case 7: 
					double[] satTortugas = {satLeo, satMich, satDona, satRaph};
					Arrays.sort(satTortugas);
					for (int i = 4; i != 0; i--) {
				         System.out.println(satTortugas[i-1] + " ");
				         if(i==satLeo){
				        	 System.out.println("Leonardo"); 
				         }
				         if(i==satDona){
				        	 System.out.println("Donatello");
				         }
				         if(i==satMich){
				        	 System.out.println("Michelangelo");
				         }
				         if(i==satRaph){
				        	 System.out.println("Raphael");
				         }
				      }
					break;
				case 8: 
					System.out.println("Somos las tortugas ninja. ");
					break;
				default: System.out.println("Opcio incorrecta. 1 a 8.");
				}
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}