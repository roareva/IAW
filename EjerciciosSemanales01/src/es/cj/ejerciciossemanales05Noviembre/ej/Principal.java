package es.cj.ejerciciossemanales05Noviembre.ej;

import java.util.Random;

public class Principal {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
	// función que devuelva el número que más se repite.
	
	private static int tablaNum[] = new int [10];
	
	private static int tablaRep[] = new int [7];

	public static void main(String[] args) {
		IniciarTabla();
		
		muestraTabla();
		
		BuscarRepTabla();
		
		
		

	}

	private static void BuscarRepTabla() {
		for (int i = 0; i < tablaNum.length; i++) {
			
		}		
	}

	private static void muestraTabla() {
		// TODO Auto-generated method stub
		
	}

	private static void IniciarTabla() {
		for (int i = 0; i < tablaNum.length ; i++) {
			tablaNum[i] = new Random().nextInt(5) + 1;
		
	}

}
}