package es.cj.ejerciciosif.ejif;

import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Segundo número: ");
		int n2 = sc.nextInt();
		//Ejercicio 1. Pedir dos números y decir si son iguales o no.
		System.out.println("Comparación de los números: ");
		if (n1 == n2)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		sc.close();
	}

}
