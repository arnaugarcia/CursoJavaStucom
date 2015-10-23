package DAW_02_InOut;

import java.io.*;

public class ex03 {
	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce base:");
			String num1 = buffer.readLine();
			System.out.println("Introduce altura:");
			String num2 = buffer.readLine();
			int base = Integer.parseInt(num1);
			int altura = Integer.parseInt(num2);
			int permietro=(base*altura)/2;
			System.out.println("La base es: " + base + " y la altura es: " + altura + " el perimetro es: " + permietro);
		}
		catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
