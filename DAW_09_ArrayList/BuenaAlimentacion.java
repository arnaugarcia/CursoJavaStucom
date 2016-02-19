package DAW_09_ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BuenaAlimentacion {

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opcio = 0;					
			ArrayList<Integer> fruit= new ArrayList<Integer>();
			ArrayList<Integer> vegetal = new ArrayList<Integer>();
			ArrayList<Double> calories = new ArrayList<Double>();
			ArrayList<Double> sal = new ArrayList<Double>();
			while(opcio != 8){
				System.out.println("[1] - Comer más fruta y verdura");
				System.out.println("[2] - Comer calorias justas");
				System.out.println("[3] - Consumir poca sal");
				System.out.println("[4] - Calcular calorias consumidas");
				System.out.println("[5] - Media de calorias");
				System.out.println("[6] - Valorar consumo de fruta y verudura");
				System.out.println("[7] - Valoración general");
				System.out.println("[8] - Salir");
				System.out.println("Elige una opción:");
				opcio = Integer.parseInt(buffer.readLine());
				switch (opcio) {
					case 1: 						
						for (int i=0; i < 7; i++){
							System.out.println("Fruta consumida el día " + i + ":");
							fruit.add(Integer.parseInt(buffer.readLine()));													
						}
						for (int i=0; i < 7; i++){
							System.out.println("Verdura consumida el día " + i + ":");
							vegetal.add(Integer.parseInt(buffer.readLine()));													
						}
						break;
					case 2:
						for (int i=0; i < 7; i++){
							System.out.println("Calorías que has consumido el día  " + i + ":");											
							calories.add(Double.parseDouble(buffer.readLine()));						
						}
						break;								
					case 3:
						for (int i=0; i < 7; i++){
							System.out.println("Cucharadas de sal el día " + i + ":");							
							double cuchara = Double.parseDouble(buffer.readLine());
							while (((cuchara * 10) % 10 != 5 && ((cuchara * 10) % 10 != 0))){
								System.out.println("Error, vuelve a introducir la cantidad:");
								cuchara = Double.parseDouble(buffer.readLine());
							}
							sal.add(cuchara * 4.5);
						}
						break;
					case 4:
						for (int i=0; i < 7; i++){
							if (sal.get(i) > 5)
								calories.set(i, (calories.get(i) + (calories.get(i) * 0.01)));
							if ((fruit.get(i) + vegetal.get(i)) > 5)
								calories.set(i, (calories.get(i) - (calories.get(i) * 0.01)));
							}
						break;
					case 5:
						double avgCal = 0;
						int cal3 = 0, cal15 = 0;
						for (int i=0; i < 7; i++){
							avgCal += calories.get(i);
							if (calories.get(i) > 3000){
								cal3 ++;	
							}
							if (calories.get(i) < 1500){
								cal15 ++;	
							}
						}
						avgCal /= 7;
						System.out.println("La cantidad de calorías que se ha consumido de media esta semana es " + avgCal);
						if (cal3 >= 2){
							System.out.println("Debes controlar la cantidad de calorías consumidas REDUCIENDO la cantidad");
						}
						if (cal15 >= 2){
							System.out.println("Debes controlar la cantidad de calorías consumidas AUMENTANDO la cantidad");
						}
						break;
					case 6:
						double avgFv = 0;
						int max = 0, min = 99;
						int diaMax = 0, diaMin = 0;
						for (int i=0; i < 7; i++){
							avgFv += (fruit.get(i) + vegetal.get(i));																			
							if ((fruit.get(i) + vegetal.get(i)) > max){
								max = (fruit.get(i) + vegetal.get(i));
								diaMax = i;
							}
							if ((fruit.get(i) + vegetal.get(i)) < min){		
								min = (fruit.get(i) + vegetal.get(i));
								diaMin = i;
							}				
						}
						avgFv /= 7;
						System.out.println("Media semanal de piezas de fruta y verdura consumidas: " + avgFv);
						System.out.println("Día que se ha consumido más fruta y verdura: día " + diaMax);
						System.out.println("Día que se ha consumido menos fruta y verdura: día " + diaMin);
						break;
					case 7:				
						boolean salt = false;
						int kcal = 0, fv = 0;
						for (int i=0; i < 7; i++){
							if (sal.get(i) > 4){
								salt = true;	
							}
							if (calories.get(i) > 3000){
								kcal ++;
							}
							if ((fruit.get(i) + vegetal.get(i)) < 5){
								fv ++;	
							}
						}
						int prop = 0;
						if (salt == true){
							prop ++;	
						}
						if (kcal > 1){
							prop ++;	
						}
						if (fv > 1){
							prop ++;	
						}
						if (prop >= 2){
							System.out.println("Solo has cummplido " + (3 - prop) + " de 3 propósitos. Tu puedes conseguirlo!");	
						}
						if (prop < 2){
							System.out.println("Enhorabuena! Has logrado cumplir " + (3 - prop) + " de los 3 propósitos esta semana.");
							System.out.println("Como recompensa podrás comerte un trozo de chocolate hoy :)");							
						}
						break;
					case 8:
						System.out.println("No hay nada imposible!");
						break;
					default: System.out.println("Opción inválida!");
				}
			}
		}
		catch(Exception e){
			System.out.println("Error " + e);
		}
	}
}