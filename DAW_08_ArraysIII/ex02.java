package DAW_08_ArraysIII;
import java.io.*;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			ArrayList <Integer> array = new ArrayList();
			for(int i=0; i<15; i++){
			array.add(i);	
			}
			int suma=0;
			for(int i=0; i<3; i++){
				suma=suma+array.get(i);
			}
			if(array.contains(5)){
				System.out.println(array.get(5));
			}
			System.out.println(suma);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
