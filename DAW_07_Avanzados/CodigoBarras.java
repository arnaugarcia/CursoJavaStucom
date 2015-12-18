package DAW_07_Avanzados;
import java.io.*;
public class CodigoBarras {

	public static void main(String[] args) {
		int[] EAN8 = new int[8];
		int[] EAN13 = new int[13];
		int ultimoDigito;
		int totalEAN = 0;
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Introduce un coódigo de barras: ");
			String codigoBarras = buffer.readLine();
			int zeros = 8 - codigoBarras.length();
			for(int i=0; i<zeros; i++){
				codigoBarras="0" + codigoBarras;
			}
			if(codigoBarras.length()<=8 && codigoBarras.length()>1){
				System.out.print("Es EAN8 y está ");
				ultimoDigito=Integer.parseInt(String.valueOf(codigoBarras.charAt(codigoBarras.length()-1)));
				//Relleno el codigo con el Array
				for(int i=0; i<=EAN8.length-1; i++){
					EAN8[i]=Integer.parseInt(String.valueOf(codigoBarras.charAt(i)));
				}
				//comprovamos los impares y pares y rellanamos el array 
				for(int i=EAN8.length-2; i>=0; i--){
					if(i%2==0){
						totalEAN=totalEAN+(EAN8[i]*3);
					}else{
						totalEAN=totalEAN+(EAN8[i]*1);
					}
				}
				int digit = ((totalEAN/10)+1)*10;
				if(digit-totalEAN==ultimoDigito){
					System.out.print("bien");
				}else{
					System.out.print("mal");
				}
			}else{
				if(codigoBarras.length()>=9 && codigoBarras.length()<=13){
					zeros = 13 - codigoBarras.length();
					for(int i=0; i<zeros; i++){
						codigoBarras="0" + codigoBarras;
					}
					System.out.print("Es EAN13 y está ");
					ultimoDigito=Integer.parseInt(String.valueOf(codigoBarras.charAt(codigoBarras.length()-1)));
					//Relleno el codigo con el Array
					for(int i=0; i<=EAN13.length-1; i++){
						EAN13[i]=Integer.parseInt(String.valueOf(codigoBarras.charAt(i)));
					}
					//comprovamos los impares y pares y rellanamos el array 
					for(int i=EAN13.length-2; i>=0; i--){
						if(i%2==0){
							totalEAN=totalEAN+(EAN13[i]*3);
						}else{
							totalEAN=totalEAN+(EAN13[i]*1);
						}
					}
					int digit = ((totalEAN/10)+1)*10;
					if(digit%10==0){
						System.out.println("bien");
					}else{
						if(digit-totalEAN==ultimoDigito){
							System.out.print("bien");
						}else{
							System.out.print("mal");
						}
					}
					//Está completo?
				}else{
					System.out.println("El codigo introducido no es correcto.");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
