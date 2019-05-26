/*Realizar  un algoritmo que permita calcular la potencia de un  número x  
elevado  a  un exponente y. Siendo x e y dos enteros leídos por teclado.*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio6
{
	public static void main(String[] args)
	{
		//variables
		int y; 
		int x; 
		int potencia;
		int contador;
		contador = 0;
		potencia = 1;

		//input
		System.out.println("Introduce dos valores para calcular x^y: ");
		x = (new Scanner(System.in)).nextInt();
		y = (new Scanner(System.in)).nextInt();

		//output
		while (contador<y)
		{
			potencia = potencia*x;
			contador = contador+1;
		}
		System.out.println("x^y = "+potencia);
	}

}