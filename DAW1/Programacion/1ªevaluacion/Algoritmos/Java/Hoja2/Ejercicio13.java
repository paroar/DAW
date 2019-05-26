/*Dise�ar un algoritmo que nos permita   leer un n�mero real X entre 0 y  1 y  
obtener el m�nimo n�mero de t�rminos n de la siguiente serie necesarios para que 
la suma de t�rminos sea mayor que el n�mero X = 1/2 + 1/2^2+1/2^3+ ... 1/2^n*/

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
		System.out.println("Introduzca un n�mero real entre 0 y 1: ");
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