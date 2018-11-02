package es.cj.ejerciciosemanales26Octubre.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioTabla {
	//Rellena una tabla de 20 n�meros positivos de manera aleatoria. Pida n�meros al usuario (0 para 
	//finalizar el bucle) y muestra cu�ntas veces se repite el n�mero en la tabla y cu�l es la primera 
	//posici�n en la que aparece (-1 si no se encuentra en la tabla)

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int [20];
	
	private static int veces = 0, posicion = -1;

	public static void main(String[] args) {
		rellenarTabla();
		
		mostrarTabla();
		
		int num = 0;
		do {
			System.out.println("N�: ");
			num = sc.nextInt();
			
		if(num > 0)
			calcularVecesPosicion(num);
			System.out.println("Veces: " + veces);
			System.out.println("Posicion: " + posicion);
			
			
		} while (num != 0);
		System.out.println("FIN");
		sc.close();
				
		
		

	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(numeros));
		
	}

	private static void rellenarTabla() {
		for (int i = 0;i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) +1;
		}
		
		
	}

	private static void calcularVecesPosicion(int num) {
		//Inicializo las variables globales
			veces = 0;
			posicion = -1;
			for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				veces++;
				if(veces ==1) {
					posicion = i;
				}
			}
		}
		
	}

	

	
		
		
	

}
