package DAW_07_ArraysII;
import java.io.*;
import java.util.Arrays;
public class ex07 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] enteros=new int[10];
			int[] enteros2=new int[10];
			int[] todos=new int[10];
			for(int i=0; i<enteros.length; i++){
				System.out.println("Introduce número " + i + ":");
				enteros[i]=Integer.parseInt(buffer.readLine());
				enteros2[i]=enteros[i]+1;
			}
			int[] array1and2 = new int[enteros.length + enteros2.length];
			System.arraycopy(enteros, 0, array1and2, 0, enteros.length);
			System.arraycopy(enteros2, 0, array1and2, enteros.length, enteros2.length);
			Arrays.sort(array1and2);
			for(int i=0; i<array1and2.length; i++){
				System.out.println(array1and2[i]);
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}