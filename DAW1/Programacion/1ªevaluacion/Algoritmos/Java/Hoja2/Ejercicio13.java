/*Diseñar un algoritmo que nos permita   leer un número real X entre 0 y  1 y  
obtener el mínimo número de términos n de la siguiente serie necesarios para que 
la suma de términos sea mayor que el número X = 1/2 + 1/2^2+1/2^3+ ... 1/2^n*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio13
{
	public static void main(String[] args)
	{
		//variable
		double suma;
		double divisor;
		int subcontador;
		double n; 
		int contador;
		suma = 0.0;
		contador = 1;
		divisor = 2.0;
		subcontador = 0;
		
		//input
		System.out.println("Introduzca un número real entre 0 y 1: ");
		n = (new Scanner(System.in)).nextDouble();
		
		//output
		do
		{
			suma = suma+1/divisor;
			contador = contador-1;
			subcontador = subcontador+1;
			while (contador<1)
			{
				divisor = divisor*2;
				contador = contador+1;
			}
			System.out.println(suma);
		} while (!(suma>=n));
		System.out.println(subcontador);
	}

}