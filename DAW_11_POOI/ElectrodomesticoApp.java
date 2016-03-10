package DAW_11_POOI;
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		try{
			System.out.println("1. crear electro vacío.");
			Electrodomestico nevera = new Electrodomestico();
			System.out.println("2. Crear electro con parametros. (letra consumo energético R y color lila");
			Electrodomestico lavadora = new Electrodomestico(1000,"lila",'R',500);
			System.out.println("3. Calcular precio final.");
			nevera.precioFinal();
			System.out.println("4 calcular precio final");
			lavadora.precioFinal();
		}catch(Exception e){
			System.out.println("Error " + e);
		}
	}
}
