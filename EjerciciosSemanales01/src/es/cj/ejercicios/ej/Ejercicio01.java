package es.cj.ejercicios.ej;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Se solicita leer un n�mero entero positivo y determinar si es un n�mero de 1,2,3 o 4 cifras.
		System.out.println("N�mero entero positivo: ");
		int n1 = sc.nextInt();
		
		if (n1 > 0 && n1 <= 9)
			System.out.println("Este n�mero es de una cifra");
		else if (n1 >= 10 && n1 <= 99)
			System.out.println("Este n�mero es de dos cifras");
		else if (n1 >= 100 && n1 <= 999)
			System.out.println("Este n�mero es de tres cifras");
		else if (n1 >= 1000 && n1 <= 9999)
			System.out.println("Este n�mero es de cuatro cifras");
		else
			System.out.println("Este n�mero contiene cuatro cifras o m�s");
		
		sc.close();

	}

}
