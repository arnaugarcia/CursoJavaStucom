package DAW_03_IF_ELSE;

import java.io.*;

public class ex14 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce año: ");
			String var = buffer.readLine();
			int año = Integer.parseInt(var);
			System.out.println("Introduce mes: ");
			String mes = buffer.readLine();
			int diasEnero = 31;
			int diasFebrero = 30;
			int diasMarzo = 31;
			int diasAbril = 30;
			int diasMayo = 31;
			int diasJunio = 30;
			int diasJulio = 31;
			int diasAgosto = 31;
			int diasSetiembre = 30;
			int diasOctubre = 31;
			int diasNoviembre = 30;
			int diasDiciembre = 31;
			if(mes.equals("enero")){
				System.out.println("Enero, del año " + año + " tiene " + diasEnero + " días.");
			}else{
				if(mes.equals("febrero")){
					if ((año%4 == 0) && ((año%100 != 0) || (año%400 == 0))){
						System.out.println("Febrero del año " + año + " es bisiesto, por lo tanto. Tiene 29 días.");
					}else{
						System.out.println("Febrero del año " + año + " tiene " + diasFebrero + " días.");
					}
				}else{
					if(mes.equals("marzo")){
						System.out.println("Marzo del año " + año + " tiene " + diasMarzo + " días.");
					}else{
						if(mes.equals("abril")){
							System.out.println("Abril del año " + año + "  tiene " + diasAbril + " días.");
						}else{
							if(mes.equals("mayo")){
								System.out.println("Mayo del año " + año + "  tiene " + diasMayo + " días.");
							}else{
								if(mes.equals("junio")){
									System.out.println("Junio del año " + año + " tiene " + diasJunio + " días.");
								}else{
									if(mes.equals("julio")){
										System.out.println("Julio del año " + año + " tiene " + diasJulio + " días.");
									}else{
										if(mes.equals("agosto")){
											System.out.println("Agosto del año " + año + " tiene " + diasAgosto + " días.");
										}else{
											if(mes.equals("setiembre")){
												System.out.println("Setiembre del año " + año + " tiene " + diasSetiembre + " días.");
											}else{
												if(mes.equals("octubre")){
													System.out.println("Ocutbre del año " + año + " tiene " + diasOctubre + " días.");
												}else{
													if(mes.equals("noviembre")){
														System.out.println("Noviembre del año " + año + " tiene " + diasNoviembre + " días.");
													}else{
														if(mes.equals("diciembre")){
															System.out.println("Diciembre del año " + año + " tiene " + diasDiciembre + " días.");
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
		}catch(Exception e){
			
		}

	}

}
