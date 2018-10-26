package es.cj.ejerciciostablas.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	
	//Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("Nº de elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numeros = new int [tamanyo];
		pares = new int [tamanyo];
		impares = new int [tamanyo];
		
		inicializarTablaNumeros();
		
		dividirParesImpares();
		
		mostrarResultado();
		
		
		sc.close();

	}
	private static void mostrarResultado() {
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
		for (int i = 0; i < pares.length && pares[i] != 0; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < impares.length && impares[i] != 0; i++) {
			System.out.print(impares[i] + " ");
			
		}
		
	}
	private static void dividirParesImpares() {
		int contPares = 0, contImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] %2 == 0) {
				pares[contPares] = numeros[i];
				contPares++;
			} else {
				impares[contImpares] = numeros[i];
				contImpares++;
			}
			
		}
		
	}
	private static void inicializarTablaNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
		
	}

}
