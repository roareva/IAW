package es.cj.ejercicios.ej;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
// Si trabaja 40 horas o menos se le paga 16€ por hora
// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.

		System.out.println("Número de horas trabajadas: ");
		int horas = sc.nextInt();
		int salario;
		
		if (horas <=40 && horas > 0) {
			salario = horas * 16;
			System.out.println("Su salario semanal es: " + salario + " € por sus " + horas + " horas trabajadas" );
		} else if (horas > 40) {
			int extras = horas - 40;
			horas = horas - extras;
			salario = horas * 16;
			salario = salario + (extras*20); 
			System.out.println("Su salario semanal es: " + salario + " € por sus " + horas + " horas trabajadas" );
		} else {
			System.out.println("No se permiten números negativos.");
		}
		sc.close();
		
		
		
	}

}
