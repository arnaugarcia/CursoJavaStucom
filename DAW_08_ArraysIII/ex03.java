package DAW_08_ArraysIII;
import java.io.*;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> array = new ArrayList();
			array.add("HOLA");
			array.add("HOLA2");
			array.add("HOLA3");
			array.add("HOLA4");
			array.add("HOLA5");
			array.add("HOLA6");
			array.add("HOLA7");
			array.add("HOLA8");
			System.out.println(array);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
