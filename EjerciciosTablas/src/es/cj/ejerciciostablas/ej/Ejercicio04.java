package es.cj.ejerciciostablas.ej;

import java.util.Scanner;

public class Ejercicio04 {
	//Leer 2 tablas de n n�meros y mezclarla en una tercera tabla de la siguiente forma: 1� de A, 1� de B, 
	//2� de A, 2� de B, 3� de A, 3� de B,...
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla1;
	
	private static int [] tabla2;
	
	private static int [] tabla3;
	
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("N� de elementos de ambas tablas: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		//numeros = new int [tamanyo];

	}

}
