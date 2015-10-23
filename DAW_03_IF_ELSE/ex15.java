package DAW_03_IF_ELSE;

import java.io.*;

public class ex15 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce el año en que naciste: ");
			String var1 = buffer.readLine();
			int año = Integer.parseInt(var1);
			System.out.println("Introduce el mes en que naciste: ");
			String var2 = buffer.readLine();
			int mes = 0;
			if(var2.equals("enero")){
				mes = 1;
			}else{
				if(var2.equals("febrero")){
					mes = 2;
				}else{
					if(var2.equals("marzo")){
						mes = 3;
					}else{
						if(var2.equals("abril")){
							 mes = 4;
						}else{
							if(var2.equals("mayo")){
								mes = 5;
							}else{
								if(var2.equals("junio")){
									mes = 6;
								}else{
									if(var2.equals("julio")){
										mes = 7;
									}else{
										if(var2.equals("agosto")){
											mes = 8;
										}else{
											if(var2.equals("setiembre")){
												mes = 9;
											}else{
												if(var2.equals("octubre")){
													mes = 10;
												}else{
													if(var2.equals("noviembre")){
														mes = 11;
													}else{
														if(var2.equals("diciembre")){
															mes = 12;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println("Introduce el día en que naciste: ");
			String var3 = buffer.readLine();
			int dia = Integer.parseInt(var3);
			System.out.println("Naciste el: " + dia + " de " + mes +" del año "+ año);
			int sort = dia+mes+año;
			System.out.println("Tu número de la suerte es: " + sort);
		}catch(Exception e){
			
		}
		
	}

}
