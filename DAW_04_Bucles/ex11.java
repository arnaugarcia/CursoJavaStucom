package DAW_04_Bucles;

import java.util.*;

public class ex11 {

	public static void main(String[] args) {
		try{
			int aleatorio=(int)(Math.random()*100);
			@SuppressWarnings("resource")
			Scanner entrada=new Scanner(System.in);
			int numero=0;
			int intentos=10;
			while (numero!=aleatorio && intentos>0){
				intentos--;
				System.out.println("Introduce un número, por favor");
				numero=entrada.nextInt();
				if (aleatorio<numero){
					System.out.println("Más bajo");
				}
				else if (aleatorio>numero){
					System.out.println("Más alto");
					}		
				}
			System.out.println("Te quedavan " + intentos + " intentos");
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}
		
}