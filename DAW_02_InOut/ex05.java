package DAW_02_InOut;

import java.io.*;

public class ex05 {
	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número: ");
			String var1=buffer.readLine();
			int numero=Integer.parseInt(var1);
			int i=0;
			System.out.println("Su suma es:");
			while(i<10){
				i++;
				System.out.println(numero++);
			}
			int o=0;
			System.out.println("Su tabla de multipliacr és: ");
			while(o<10){
				o++;
				System.out.println(numero*o);
			}
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}

	}

}
