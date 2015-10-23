package DAW_04_Bucles;

public class ex07 {

	public static void main(String[] args) {
		int num=1;
		long resultado = 1;
		while(num!=21){
			resultado = resultado*num;			
			num++;
		}
		System.out.println("El fcatorial de 20 es: " + resultado);

	}

}
