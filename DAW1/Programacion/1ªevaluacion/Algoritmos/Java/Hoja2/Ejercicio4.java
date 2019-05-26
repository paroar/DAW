/*Realizar un algoritmo  que nos permita obtener los números amigos que 
existen entre los n primeros números*/
package Hoja2;

import java.util.Scanner;


public class Ejercicio4
{
	public static void main(String[] args)
	{
		//variables
		int top;
		int sumb;
		int suma;
		int max; 
		int contadorb;
		int contadora;
		int bot;
		suma = 0;
		sumb = 0;
		contadora = 1;
		contadorb = 1;
		top = 1;
		bot = 1;
		
		//input
		max = (new Scanner(System.in)).nextInt();
		while (bot<=max)
		{
			while (top<=max)
			{
				//solo tenemos que contar los divisores hasta top/2+1
				while (contadora<top/2+1)
				{
					if (top%contadora == 0)
					{
						suma = suma+contadora;
						contadora = contadora+1;
					}
					else
					{
						contadora = contadora+1;
					}
				}
				contadora = 1;
				while (contadorb<bot/2+1)
				{
					if (bot%contadorb == 0)
					{
						sumb = sumb+contadorb;
						contadorb = contadorb+1;
					}
					else
					{
						contadorb = contadorb+1;
					}
				}
				contadorb = 1;
				if (suma == bot && sumb == top && bot!=top)
				{
					System.out.println(top+" y "+bot+" son amigos");
				}
				else
				{
					//System.out.println(top+" y "+bot+" no son amigos");
				}
				top = top+1;
				suma = 0;
				sumb = 0;
			}
			//La característica de que dos números sean amigos es conmutativa
			bot = bot+1;
			top = bot;
		}
	}

}