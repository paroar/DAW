/*Realizar un  algoritmo  que calcule  el valor  de N t�rminos  de la serie :
= 1 + x/1! + x  /2! + ... +  x  /N! Siendo x y N dos enteros le�dos por teclado.*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio7
{
	public static void main(String[] args)
	{
		//variables
		double suma;
		double factorial;
		int n; 
		int contador;
		int subContador;
		suma = 0.0;
		
		//input
		System.out.println("introduce el n�mero de elementos que quieres sumar: ");
		n = (new Scanner(System.in)).nextInt();
		contador = n;

		//output
		while (contador>0)
		{
			subContador = contador;
			factorial = 1.0;
			while (subContador>0)
			{
				factorial = factorial*subContador;
				subContador = subContador-1;
			}
			suma = suma+1/factorial;
			contador = contador-1;
		}
		System.out.println("La suma de "+n+" t�rminos es: "+suma);
	}

}