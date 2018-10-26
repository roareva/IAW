package es.cj.ejerciciostablas.ej;

import java.util.Scanner;

public class Ejercicio04 {
	//Leer 2 tablas de n números y mezclarla en una tercera tabla de la siguiente forma: 1º de A, 1º de B, 
	//2º de A, 2º de B, 3º de A, 3º de B,...
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla1;
	
	private static int [] tabla2;
	
	private static int [] tabla3;
	
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("Nº de elementos de ambas tablas: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		//numeros = new int [tamanyo];

	}

}
