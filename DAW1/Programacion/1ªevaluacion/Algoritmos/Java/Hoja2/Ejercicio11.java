/*Realizar un algoritmo para obtener la suma de los números primos comprendidos entre 1 y N.*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio11
{
	public static void main(String[] args)
	{
		//variables
		int suma;
		boolean prime;
		int n; 
		int contador;
		int c;
		contador = 0;
		suma = 0;
		
		//input
		System.out.println("Introduce un número: ");
		n = (new Scanner(System.in)).nextInt();

		while (contador<=n)
		{
			if (contador<=1)
			{
				prime = false;
			}
			else
			{
				if (contador<=3)
				{
					prime = true;
				}
				else
				{
					if (contador%2==0)
					{
						prime = false;
					}
					else
					{
						if (contador%3==0)
						{
							prime = false;
						}
						else
						{
							c = 5;
							prime = true;
							while (c*c<=contador)
							{
								if (contador%c==0)
								{
									prime = false;
								}
								c = c+2;
							}
						}
					}
				}
			}
			if (prime==true)
			{
				suma = suma+contador;
			}
			contador = contador+1;
		}
		System.out.println("La suma de los números primos hasta n es: "+suma);
	}

}