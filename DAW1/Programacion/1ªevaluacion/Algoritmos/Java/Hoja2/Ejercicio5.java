/*Realizar un algoritmo que obtenga todos los divisores primos de un número n leído por teclado.*/

package Hoja2;

import java.util.Scanner;


public class Ejercicio5
{
	public static void main(String[] args)
	{
		//variables
		boolean prime;
		int n; 
		int contador;
		int c;
		contador = 1;
		
		//input
		System.out.println("Introduzca un número: ");
		n = (new Scanner(System.in)).nextInt();
		
		//output
		while (contador<=n)
		{
			if (n%contador==0)
			{
				if (contador==1)
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
									else
									{
										c = c+2;
									}
								}
							}
						}
					}
				}
				if (prime==true)
				{
					System.out.println(contador+" es divisor de "+n+" y además primo");
				}
			}
			contador = contador+1;
		}
	}

}