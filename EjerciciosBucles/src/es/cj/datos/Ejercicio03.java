package es.cj.datos;
import java.util.Scanner;

public class Ejercicio03 {
	private static Scanner sc = new Scanner(System.in);
	//Programa que muestre y calcule el producto de los n primeros números impares

	public static void main(String[] args) {
		System.out.println("Número: ");
		int numero = sc.nextInt();
		int producto = 1;
		for (int i = 1; i <= numero *2; i+= 2) {
			producto = i*producto;
			
		} 
		System.out.println("El producto de los " + numero + " primeros números impares son: " + producto);
		sc.close();	
} 
	
}
