/*Realizar un algoritmo que permita visualizar los N primeros números 
de la serie Fibonacci que sean pares. (Serie Fibonnacci: 0,1,1,2,3,5,8,......) */

package Hoja2;

import java.util.Scanner;

public class Ejercicio10
{
	public static void main(String[] args)
	{
		//variables
		int suma;
		int posterior;
		int aux;
		int anterior;
		int n;
		anterior = 0;
		posterior = 0;
		aux = 1;
		suma = 0;
		
		//input
		System.out.println("Introduce el número de términos: ");
		n = (new Scanner(System.in)).nextInt();

		//output
		while (n!=0)
		{
			anterior = posterior;
			posterior = aux;
			aux = anterior+posterior;
			n = n-1;
			if (anterior%2==0)
			{
				suma = suma+anterior;
			}
		}
		System.out.println("La suma de los números pares es "+suma);
	}

}