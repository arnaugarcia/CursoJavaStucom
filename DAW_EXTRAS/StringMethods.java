package DAW_EXTRAS;

public class StringMethods {
	@SuppressWarnings("unused")
	public static void main (String[] args) {

		//toUpperCase: Convierte todos los caracteres alfabéticos de una cadena a caracteres en mayúscula.
		String Str2 = new String("Programacion");
		System.out.println(Str2.toUpperCase() );


		//substring Lo que hace es iniciar el texto en el carácter especificado
		String Str = new String("Estoy usando un substring");

		System.out.print("Return Value :");
		System.out.println(Str.substring(16) );

		System.out.print("Return Value :" );
		System.out.println(Str.substring(12) );


		//Sirve para sumar cadena de carácteres.Tiene la misma función que el símbolo ""+"" pero en vez de sumar números suma letras.
		String s1="xavi ";  
		String s2="garcia";  
		String s3=s1.concat(s2);  
		System.out.println(s3);//xavi garcia

		//Elimina los espacios en blanco innecesarios.
		String Str10 = new String("   Texto con espacios   ");
		System.out.print("Valor a devolver: " );
		System.out.println(Str10.trim() );
		
		//replace: Método que reemplaza una parte concreta del texto principal por la part secondari.
		// Cadena sobre la que realizaremos la sustitución
		String cadena1 = "Tengo un tractor amarillo";
		// Cadena en la que almacenaremos el resultado
		String cadena2 = null;
		cadena2 = cadena1.replace("amarillo", "rojo");
		System.out.println(cadena2);
		// Tengo un tractor rojo.
		System.out.println(cadena1);
		// Tengo un tractor amarillo.
		/* Como vemos, el ejecutar el método 
		replace no afecta a la cadena original */
		
		//Str.toLowerCase hace que todas las letras mayusculas se vuelva minusculas
	      String Str15 = new String("ESTOY USANDO LOWERCASE");
	      
	      System.out.println(Str.toLowerCase());
	      
	      //contentEquals , devuelve si y sólo si esta Cadena representa la misma secuencia de caracteres como el especificado en StringBuffer.
	      String str1 = "Not ";
	           String str2 = "Strings are immutable";
	           StringBuffer str3 = new StringBuffer( "Not immutable");

	           boolean  result = str1.contentEquals( str3 );
	           System.out.println(result);
	     	  
	           result = str2.contentEquals( str3 );
	           System.out.println(result);
	      
	           //CharAt: Metodo que regresa un caracter especifico de un string
	           String str20 = "Ejemplo de CharAt";
	           char var20 = str20.charAt(11);
	           System.out.println("Imprime el caracter en la posicion 11 : "+var20);
	           
	   // isEmpty: Métode que serveix per saber si el string esta buit o no

	   String str = "proba";
	   // prints length of string
	      System.out.println("length of string = " + str.length());
	      
	      // checks if the string is empty or not
	      System.out.println("is this string empty? = " + str.isEmpty());
	      String sCadena1 = new String("Avila");
	      String sCadena2 = new String("Salamanca");
	      String sCadena3 = new String("Avila");
	                      
	      if (sCadena1.equals(sCadena2))
	       System.out.println(sCadena1 + " y " + sCadena2 + " son IGUALES");
	      else
	       System.out.println(sCadena1 + " y " + sCadena2 + " son DIFERENTES");
	              
	      if (sCadena1.equals(sCadena3))
	       System.out.println(sCadena1 + " y " + sCadena3 + " son IGUALES");
	      else
	       System.out.println(sCadena1 +" y " + sCadena3 + " son DIFERENTES");  
	      // Metodo Equals: Compara la cadena de texto contra un objeto.
	   

	      //lastindexOf: Nos devuelve la ultima posición mediante un numero entero, 
	      // una cadena de texto o un caracter dentro de una cadena. En el caso de que el carácter 
	      // o la cadena no exista se devuelve un -1.  Str = cadena a ser buscada; ch= caracter a ser buscado;
	      // from index= indice de la cadena a partir del cual buscar.


	            String Str78 = new String("Welcome to Tutorialspoint.com");
	            String SubStr7 = new String("Tutorials" );
	            
	            System.out.print("Found Last Index :" );
	            System.out.println(Str78.lastIndexOf( 'o' ));
	            System.out.print("Found Last Index :" );
	            System.out.println(Str78.lastIndexOf( 'o', 5 ));
	            System.out.print("Found Last Index :" );
	            System.out.println( Str78.lastIndexOf( SubStr7 ));
	            System.out.print("Found Last Index :" );
	            System.out.println( Str78.lastIndexOf( SubStr7, 15 ));
	        
	      
	      
		//replaceAll reemplaza todas las cadenas que coinciden con la expresión dada
		String frase = "El LoL es el mejor juego";
		frase = frase.replaceAll("LoL", "Smite");
		System.out.println(frase);

		// indexOf: Sirve para contar el número de veces que aparece una palabra en un String. En el caso de que el carácter o la cadena no exista se devuelve un -1.
		String str8 = "var8 o var8 y var8";
		// Texto que vamos a buscar
		String str8Buscado = "var8";
		// Contador de ocurrencias 
		int cont = 0;

		while (str8.indexOf(str8Buscado) > -1) {
			str8 = str8.substring(str8.indexOf(
					str8Buscado)+str8Buscado.length(),str8.length());
			cont++; 
		}
		System.out.println (cont);

		// 	Exemple per a pow: 	
		
		
		// math.pow: Métode que ens permet executar poténcies	
		
		int result123 = (int) Math.pow(2, 8);
	
		System.out.println("Math.pow(2, 8) : " + result123);
		
		
		//Random: Metodo que genera un valor aleatorio entre los dos valores que indicas
		int val22 = (int) (100*Math.random()+1); 
		//100 es el valor maximo del numero generado y 1 es el valor minimo (incluidos)
		System.out.println("El valor aleatorio generado es:" + val22);
		//Si no se especifica el valor minimo se generara un valor aleatorio entre 0 y el numero maximo (sin incluir el maximo)

		//endsWith: Comprueba si la cadena termina con el sufijo pasado como par�metro.
		String emails[] = {"jordi@gmail.com","xavi@gmail.es","xavi@gmail.com","javi@gmail.it","laura@gmail.fr",
				"eric@gmail.com","enrique@gmail.cat"};

		for (String email: emails)
			if (email.endsWith(".com")) System.out.println(email);

		//replacefirst remplaza el substring del primer string por la expression seleccionada.
		String Str45 = new String("replace first.com");

		System.out.print("Return Value :" );
		System.out.println(Str45.replaceFirst("(.*)first(.*)",
				"tomorrow" ));

		System.out.print("Return Value :" );
		System.out.println(Str45.replaceFirst("first", "tomorrow" ));

		String str11 = "hola, bon dia", str23 = "Que tal?";

		//compareTo: Métode que compara dos variables, indicant quina és més gran que el altre segons la taula de la ASCII

		String var3="audi";
		String str34="volskwagen";

		System.out.println(var3.compareTo(str34));


		boolean retval = str11.contains("on");
		System.out.println("Method returns : " + retval);
		//comprova si conté el caracter indicat en els string.
		retval = str2.contains("?Q");   
		System.out.println("Methods returns: " + retval);

		//Math.ceil=Devuelve el valor redondeado al alza del número o expresión especificada  

		double var27 = 12.58;    

		System.out.println(Math.ceil(var27));

		//Round: redondea los decimales para obtener el numero aproximado.
		double d = 100.675;
		double e = 100.500;
		float f = 100;
		float g = 90f;

		System.out.println(Math.round(d));
		System.out.println(Math.round(e)); 
		System.out.println(Math.round(f)); 
		System.out.println(Math.round(g));

		//abs: devuelve el valor absoluto
		int var24 = -4; 
		double string24 = -100; 

		System.out.println(Math.abs(var24));
		System.out.println(Math.abs(string24));

		// Obtiene el numero que, elevado al cuadrado es igual e este
		double x = 9;
		double y = 49;

		System.out.println("Math.sqrt(" + x + ")=" + Math.sqrt(x));
		System.out.println("Math.sqrt(" + y + ")=" + Math.sqrt(y));
	}
}