package DAW_08_ArraysIII;
import java.io.*;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			ArrayList array = new ArrayList();
			array.add("hola");
			array.add("pa");
			array.add("k");
			array.add("kieres");
			array.add("saber");
			array.add("eso");
			array.add("jaja");
			array.add("salud");
			array.add(2);
			System.out.println(array);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
