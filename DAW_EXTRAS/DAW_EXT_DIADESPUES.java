package DAW_EXTRAS;

import java.io.*;

public class DAW_EXT_DIADESPUES {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce día: ");
		String var1 = buffer.readLine();
		int dia = Integer.parseInt(var1);
		System.out.println("Introduce mes: ");
		String var2 = buffer.readLine();
		int mes = Integer.parseInt(var2);
		System.out.println("Introduce año: ");
		String var3 = buffer.readLine();
		int año = Integer.parseInt(var3);
		int diasEnero = 31;
		int diasFebrero = 28;
		int diasMarzo = 31;
		int diasAbril = 30;
		int diasMayo = 31;
		int diasJunio = 30;
		int diasJulio = 31;
		int diasAgosto = 31;
		int diasOctubre = 31;
		int diasNoviembre = 30;
		int diasDiciembre = 31;
		int mesesAño = 12;
		int diaFinal = dia;
		int mesFinal = mes;
		int añoFinal = año;
		if (dia>31 || mes>mesesAño){
			System.out.println("Error al introducir la fecha");
		}else{
			if(dia<1 || mes<1 || año<1 ){
				System.out.println("Error al introducir la fecha");
			}else{
				if(mes==01){
					do{
						if(dia==diasEnero){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasEnero){
							mesFinal=02;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasEnero);
				}
				if(mes==02){
					do{
						if((año%4 == 0) && ((año%100 != 0) || (año%400 == 0)) && dia==28){
							diaFinal++;
						}else{
							if((año%4 == 0) && ((año%100 != 0) || (año%400 == 0)) && dia==29){
								diaFinal=01;
								mesFinal=03;
							}
							if(dia==diasFebrero){
								mesFinal=03;
							}
						}
					}while(dia>30);
				}
				if(mes==03){
					do{
						if(dia==diasMarzo){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasMarzo){
							mesFinal=04;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasMarzo);
				}
				if(mes==04){
					do{
						if(dia==diasAbril){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasAbril){
							mesFinal=05;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasAbril);
				}
				if(mes==05){
					do{
						if(dia==diasMayo){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasMayo){
							mesFinal=06;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasMayo);
				}
				if(mes==06){
					do{
						if(dia==diasJunio){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasJunio){
							mesFinal=07;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasJunio);
				}
				if(mes==07){
					do{
						if(dia==diasJulio){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasJunio){
							mesFinal=8;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasJulio);
				}
				if(mes==8){
					do{
						if(dia==diasJunio){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasJunio){
							mesFinal=8;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasJunio);
				}
				if(mes==9){
					do{
						if(dia==diasAgosto){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasAgosto){
							mesFinal=9;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasAgosto);
				}
				if(mes==10){
					do{
						if(dia==diasOctubre){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasOctubre){
							mesFinal=11;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasOctubre);
				}
				if(mes==11){
					do{
						if(dia==diasNoviembre){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==diasNoviembre){
							mesFinal=12;
						}else{
							mesFinal=mes;
						}
					}while(dia>diasNoviembre);
				}
				if(mes==12){
					do{
						if(dia==diasDiciembre){
							diaFinal=01;
						}else{
							diaFinal++;
						}
						if(dia==31){
							mesFinal=01;
							añoFinal++;
						}
					}while(dia>diasDiciembre);
				}
			}
		}
		System.out.println("El día es " + diaFinal + " el mes es " + mesFinal + " y el año es " + añoFinal);
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
