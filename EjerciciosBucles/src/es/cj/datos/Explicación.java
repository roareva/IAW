package es.cj.datos;

import java.util.Scanner;

public class Explicación {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// do while
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();	
		} while (numero < 0);
		// while
		while (numero >= 0) {
			System.out.println(numero);
			numero--;
		}
		
		// for
		for (int i = 10; i >=0; i++) {
			
		}
	}

}
