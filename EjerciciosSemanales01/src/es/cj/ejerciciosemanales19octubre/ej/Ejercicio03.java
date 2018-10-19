package es.cj.ejerciciosemanales19octubre.ej;

import java.util.Scanner;

public class Ejercicio03 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	//Escriba un programa que lea un número entero por el teclado y muestre en la pantalla si es un 
	//número abundante. Un número es abundante si la suma de sus divisores es mayor que él. 		
	//Ejemplo: 12 es abundante ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
		System.out.println("Número entero: ");
		int num = sc.nextInt();
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num%i == 0) {
				suma = suma + i;			
			}
		}
		if(suma>num)
		System.out.println("El " + num + " es abundante.");
		else
			System.out.println("El " + num + " no es abundante");

	}

}
