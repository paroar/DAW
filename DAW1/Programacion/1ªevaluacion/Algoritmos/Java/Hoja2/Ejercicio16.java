/*Realizar un algoritmo que lea un número por teclado  y visualice  series 
de números con la forma siguiente*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio16
{
	public static void main(String[] args)
	{
		//variables
		String salida2;
		String salida;
		int subcontador;
		int filas;
		int contador;
		int columnas;
		int n;
		salida = "";
		salida2 = "";
		filas = 1;
		columnas = 1;
		contador = 1;
		subcontador = 2;
		
		//input
		n = (new Scanner(System.in)).nextInt();
		
		//output
		while (filas<=n)
		{
			while (columnas<=n)
			{
				salida = salida+contador;
				columnas = columnas+1;
				contador = contador+1;
			}
			System.out.println(salida+salida2);
			salida = "";
			salida2 = salida2+0;
			columnas = 1;
			contador = subcontador;
			subcontador = subcontador+1;
			n = n-1;
		}
	}

}