package DAW_EXTRAS;
import java.io.*;
public class ArrayBasico {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			int[] b = new int[10];
			int[] suma = new int[10];
			for(int i=0; i<a.length; i++){
				System.out.println("Introduce un número:");
				b[i]= Integer.parseInt(buffer.readLine());
			}
			for(int i=0; i<a.length; i++){
				suma[i]=a[i]+b[i];
				System.out.print(suma[i] + " - ");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}
	}
}
