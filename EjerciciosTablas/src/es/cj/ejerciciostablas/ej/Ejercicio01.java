package es.cj.ejerciciostablas.ej;

import java.util.Scanner;

public class Ejercicio01 {
	//Leer n n�meros enteros, guardarlos en la tabla y mostrar la media de los positivos, media negativos y 
	//el n�mero de ceros
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("N�meros");
		int numero = sc.nextInt();
		int tablas[] = new int [numero];
		int sumP, sumaN, contP, contN, contC;
		for(int i = 0; i < numero; i++) {
			System.out.println("Num " + i);
			tablas[i] = sc.nextInt();
			if (tablas[i] < 0)
				System.out.println("No v�lido");
			else
				System.out.println();
		}

	}

}
