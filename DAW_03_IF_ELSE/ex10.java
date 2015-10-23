package DAW_03_IF_ELSE;

import java.io.*;

public class ex10 {

	public static void main(String[] args) {
	try{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduce dinero: ");
	String var1 = buffer.readLine();
	double dinero = Double.parseDouble(var1);
	if(dinero>100){
		System.out.println("30% de descuento en su compra, total: " + (30*dinero)/100);
	}else{
		if(dinero>50){
			System.out.println("15% de descuento en su compra, total: " + (15*dinero)/100);
		}else{
			if(dinero>25){
				System.out.println("10% de descuento en su compra, total: " + (10*dinero)/100);
			}else{
				System.out.println("No hay descuento");
			}
		}
	}
	}catch(Exception e){
		System.out.println("Error al introducir los datos");
	}

	}

}
