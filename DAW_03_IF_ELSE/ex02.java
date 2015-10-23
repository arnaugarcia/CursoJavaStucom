package DAW_03_IF_ELSE;

import java.io.*;

public class ex02 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la nota 1: ");
		String var1 = buffer.readLine();
		double nota1 = Double.parseDouble(var1);
		System.out.println("Introduce la nota 2: ");
		String var2 = buffer.readLine();
		double nota2 = Double.parseDouble(var2);
		System.out.println("Introduce la nota 3: ");
		String var3 = buffer.readLine();
		double nota3 = Double.parseDouble(var3);
		System.out.println("Introduce la nota 4: ");
		String var4 = buffer.readLine();
		double nota4 = Double.parseDouble(var4);
		System.out.println("Introduce la nota 5: ");
		String var5 = buffer.readLine();
		double nota5 = Double.parseDouble(var5);
		System.out.println("Introduce la nota 6: ");
		String var6 = buffer.readLine();
		double nota6 = Double.parseDouble(var6);
		int cont_sus=0;
		int cont_aprv=0;
		int cont_con=0;
		if (nota1<5){
			cont_sus++;
		}
		if(nota2<5){
			cont_sus++;
		}
		if(nota3<5){
			cont_sus++;
		}
		if(nota4<5){
			cont_sus++;
		}
		if(nota5<5){
			cont_sus++;
		}
		if(nota6<5){
			cont_sus++;
		}
		if (nota1>=5){
			cont_aprv++;
		}
		if(nota2>=5){
			cont_aprv++;
		}
		if(nota3>=5){
			cont_aprv++;
		}
		if(nota4>=5){
			cont_aprv++;
		}
		if(nota5>=5){
			cont_aprv++;
		}
		if(nota6>=5){
			cont_aprv++;
		}
		if( nota1<5 && nota1>=4){
			cont_con++;
		}
		if( nota2<5 && nota2>=4){
			cont_con++;
		}
		if( nota3<5 && nota3>=4){
			cont_con++;
		}
		if( nota4<5 && nota4>=4){
			cont_con++;
		}
		if( nota5<5 && nota5>=4){
			cont_con++;
		}
		if( nota6<5 && nota6>=4){
			cont_con++;
		}
		System.out.println("El nombre de suspesos es: " + cont_sus);
		System.out.println("EL nombre de aprovats es: " + cont_aprv);
		System.out.println("El nombre de compormesos es: " + cont_con);
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");
		}
		

	}

}
