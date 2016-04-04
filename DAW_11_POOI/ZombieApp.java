package DAW_11_POOI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZombieApp {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		try {

			Zombie zombie1 = new Zombie();
			System.out.println("Hola, mi nombre es " + zombie1.getNombre() + " tengo " + zombie1.getanoConversion()+ " años de conversión y me quedan " + (5 - zombie1.getanoConversion())+" años para convertirme en una bonita flor.");

			System.out.println("¿Cual es tu nombre?");
			String nombre = buffer.readLine();

			System.out.println("¿Año de conversión?");
			int ano = Integer.parseInt(buffer.readLine());
			
			while(ano>5 || ano<1){
				System.out.println("¿Año de conversión?");
				ano=Integer.parseInt(buffer.readLine());
			}

			System.out.println("¿Nivel?");
			int nivel = Integer.parseInt(buffer.readLine());
			
			while(nivel<1 || nivel>10){
				System.out.println("¿Nivel?");
				nivel = Integer.parseInt(buffer.readLine());
			}
			int[] PersonaCon = new int[ano];
			for (int i = 0; i < PersonaCon.length; i++) {
				System.out.println("¿Cuántas personas has convertido el año " + (i + 1) + "?");
				PersonaCon[i] = Integer.parseInt(buffer.readLine());
				while(PersonaCon[i]<0){
					System.out.println("¿Cuántas personas has convertido el año " + (i + 1) + "?");
					PersonaCon[i] = Integer.parseInt(buffer.readLine());
				}
			}
			Zombie zombie2 = new Zombie(nombre, ano, nivel, PersonaCon);
			muestra(zombie2,PersonaCon,nivel);
		} 
		catch (Exception e) {
			System.out.println("error" + e);
		}
	}
	static void muestra (Zombie zombie2,int[]PersonaCon,int nivel){
		System.out.println("Mi nombre es " + zombie2.getNombre());
		System.out.println("Mi mejor año es " + zombie2.MejorAo(PersonaCon));
		System.out.println("Máximo de conversiones " + zombie2.maxConver(PersonaCon));
		System.out.println("Media por año "+ zombie2.mediaConver(PersonaCon));
		System.out.println("Total de conversiones " + zombie2.totalConver(PersonaCon));
		if(zombie2.haConver(PersonaCon)==true){
			System.out.println("Si he convertido a alguien");
		}else{
			System.out.println("No he convertido a nadie");	
		}
		if(zombie2.esBueno(nivel)==true){
			System.out.println("Soy un Zombie Alfa");
		}else{
			System.out.println("No soy un Zombie Alfa :(");	
		}
	}
}
