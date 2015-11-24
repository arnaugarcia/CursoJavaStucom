package DAW_01_Ejercicios_Operadores;

public class ex02 {

	public static void main(String[] args) {
		int segundos=34378;
		int resultado_minutos;
		int resultado_horas;
		System.out.println("Segundos: " + segundos);
		resultado_minutos=segundos/60;
		System.out.println("Minutos: " + resultado_minutos);
		resultado_horas=resultado_minutos/60;
		System.out.println("Horas: " + resultado_horas);
	}

}
