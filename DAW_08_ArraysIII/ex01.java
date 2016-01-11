package DAW_08_ArraysIII;
import java.io.*;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			ArrayList array = new ArrayList();
			array.add('a');
			array.add("pa");
			array.add("k");
			array.add("kieres");
			array.add("saber");
			array.add("eso");
			array.add("jaja");
			array.add("salud");
			array.add(2);
			if(array.get(3)=="hola"){
				System.out.println("Conté 'Hola'");
			}else{
				System.out.println("No conté 'Hola'");
			}
			for(int i=0; i<array.size(); i++){
				array.removeAll(array);
			}
			System.out.println(array);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
