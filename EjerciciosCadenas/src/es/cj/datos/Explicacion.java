package es.cj.datos;

public class Explicacion {

	public static void main(String[] args) {
		String cadena1 = "hola";
		String cadena2 = "HOLA";
		
		//La siguiente sintaxis sirve para  que le de igual mayúsculas que minúsculas
		if(cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintas");
		}
		cadena1 = cadena1.concat(cadena2);
		System.out.println(cadena1);
		
		if(cadena1.contains("la"))
			System.out.println("Lo tiene");
		// Muestra en qué posición aparece la primera "a"
		System.out.println(cadena1.indexOf("a"));
		
		System.out.println(cadena1.toLowerCase().lastIndexOf("a"));
		
		if (cadena1.equals("") || cadena1.length() == 0 || cadena1.isEmpty())
			System.out.println("Cadena vacía");
		
		cadena1 = cadena1.replace("h", "P");
		System.out.println(cadena1);
		
		System.out.println(cadena1.substring(0, 3));
		
		StringBuffer sb = new StringBuffer(cadena1);
		sb.deleteCharAt(7);
		sb.replace(0, 3, "avion");
		System.out.println(sb.toString());
		
		sb.reverse();
		
		String frase = "Hola qué tal estás";
		//Esto me devolverá un array de cadenas
		String [] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

	}
	// Java API 8
	
	//Stack overflow
}
