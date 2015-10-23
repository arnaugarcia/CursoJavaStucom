package DAW_04_Bucles;

import java.io.*;

public class ex12 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce dinero: ");
			String var1 = buffer.readLine();
			int monedas = Integer.parseInt(var1);
			int moneda50 = 0;
			int moneda20 = 0;
			int moneda10 = 0;
			int moneda5 = 0;
			int moneda2 = 0;
			int moneda1 = 0;
			do{
			while(monedas>=50){
				moneda50++;
				monedas = monedas-50;
			}
			while(monedas>=20){
				moneda20++;
				monedas = monedas-20;
			}
			while(monedas>=10){
				moneda10++;
				monedas = monedas-10;
			}
			while(monedas>=5){
				moneda5++;
				monedas = monedas-5;
			}
			while(monedas>=2){
				moneda2++;
				monedas = monedas-2;
			}
			while(monedas==1){
				moneda1++;
				monedas = monedas-1;
			}
			}while(monedas!=0);
			System.out.println("Moneda 50: " + moneda50);
			System.out.println("Moneda 20: " + moneda20);
			System.out.println("Moneda 10: " + moneda10);
			System.out.println("Moneda 5: " + moneda5);
			System.out.println("Moneda 2: " + moneda2);
			System.out.println("Moneda 1: " + moneda1);
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}
		
}