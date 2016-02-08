package POO;
import java.io.*;
public class ex01 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un número: ");
			int op1 = Integer.parseInt(buffer.readLine());
			System.out.println("Introduce otro número: ");
			int op2 = Integer.parseInt(buffer.readLine());
			System.out.println("La suma de "+op1+" y "+op2+" igual a " + suma(op1, op2));
			System.out.println("La resta de "+op1+" y "+op2+" es igual a " + resta(op1, op2));
			System.out.println("La multipliación de "+op1+" y "+op2+" es igual a " + multipliacion(op1, op2));
			System.out.println("La división de "+op1+" y "+op2+" es igual a " + division(op1, op2));
			System.out.println("El módul de "+op1+" y "+op2+" es igual a " + modul(op1, op2));
			divisores(op1);
			factorial(op1);
		}catch(Exception e){
			System.out.println("Error " + e);
		}
		
	}
		static int suma (int operador1, int operador2) {
		int operador3;
		operador3 = operador1 + operador2;
		return operador3;
		}
		static int resta (int operador1, int operador2) {
		int operador3;
		operador3 = operador1 - operador2;
		return operador3;
		}
		static int multipliacion (int operador1, int operador2) {
		int operador3;
		operador3 = operador1 * operador2;
		return operador3;
		}
		static int division (int operador1, int operador2) {
		int operador3;
		operador3 = operador1 / operador2;
		return operador3;
		}
		static int modul (int operador1, int operador2) {
		int operador3;
		operador3 = operador1 % operador2;
		return operador3;
		}
		static void divisores (int operador1) {
		for (int i = 1 ; i <= operador1 ; i++)
            if (operador1 % i == 0){
                System.out.println ("Divisor del operador " + operador1 +" es: "+ i);
            }
		}
		public static void factorial(int operador1) {
	        int resultado = 1;
	        for (int i = 1; i <= operador1; i++) {
	            resultado *= i;
	        }
	        System.out.println("El factorial de " + operador1 + " es: " + resultado);
	    }

	}

