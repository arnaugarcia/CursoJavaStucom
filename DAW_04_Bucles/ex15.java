package DAW_04_Bucles;

import java.io.*;

public class ex15 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un número entre 0-99999");
		String var = buffer.readLine();
		int num1 = Integer.parseInt(var);
		if (num1<10){
			System.out.println("Tiene una cifra");
		}else{
			if(num1<100 && num1>9){
				System.out.println("Tiene dos cifras");
			}
			if (num1<1000 && num1>99){
				System.out.println("Tiene tres cifras");
			}else{
				if(num1<10000 && num1>999){
					System.out.println("Tiene cuatro cifras");
				}else{
					if(num1<100000 && num1>9999){
						System.out.println("Tiene cinco cifras");
					}
				}
			}
		}
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
