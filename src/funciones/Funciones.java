package funciones;

import java.util.Scanner;

public class Funciones
{

	public static void pedirMatriz(int matriz[][])
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("Introduce el elemmento (%d,%d):", fila, col);
				matriz[fila][col] = teclado.nextInt();
			}
		}
	}

	public static void mostrarMatriz(int matriz[][])
	{
		// TODO Auto-generated method stub
		for (int fila = 0; fila < matriz.length; fila++)
		{
			for (int col = 0; col < matriz[0].length; col++)
			{
				System.out.printf("Casilla (%d,%d): %d\n", fila, col, matriz[fila][col]);
			}
		}
	}

}
