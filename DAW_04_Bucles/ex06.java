package DAW_04_Bucles;

public class ex06 {

	public static void main(String[] args) {
		int num1 = 0;
		while(num1 !=1000){
			num1++;
			int resultado = num1%2;
			
			if(resultado>0){
			}else{
				System.out.println("El número " + num1 + " és par.");
			}
		}
	}

}