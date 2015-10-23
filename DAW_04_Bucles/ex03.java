package DAW_04_Bucles;

public class ex03 {

	public static void main(String[] args) {
		int num1 = 0;
		while(num1 !=10000){
			num1++;
			int resultado = num1%5;
			if(resultado>0){
				System.out.println("El número " + num1 + " es múltiplo de 5");
			}else{
				System.out.println("El numero " + num1 + " no es múltiplo de 5");
			}
		}
	}

}
