package principal;

import java.util.Scanner;

import funciones.Funciones;

public class Matrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de filas:");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas:");
		int columnas = teclado.nextInt();
		int matriz[][] = new int [filas][columnas];
		System.out.println("Introduce Los datos de la matriz:");
		Funciones.pedirMatriz(matriz);
		Funciones.mostrarMatriz(matriz);
		
	}

}
