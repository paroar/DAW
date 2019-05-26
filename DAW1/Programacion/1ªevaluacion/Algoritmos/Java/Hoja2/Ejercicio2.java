/*Realizar un algoritmo que nos permita saber si dos números son amigos*/
package Hoja2;

import java.util.Scanner;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		//variables
		int sumb;
		int suma;
		int contadora;
		int contadorb;
		int b; 
		int a; 
		suma = 0;
		sumb = 0;
		contadora = 1;
		contadorb = 1;
		
		//input
		a = (new Scanner(System.in)).nextInt();
		b = (new Scanner(System.in)).nextInt();
		
		//output
		while (contadora<a)
		{
			if (a%contadora == 0)
			{
				suma = suma+contadora;
				contadora = contadora+1;
			}
			else
			{
				contadora = contadora+1;
			}
		}
		while (contadorb<b)
		{
			if (b%contadorb == 0)
			{
				sumb = sumb+contadorb;
				contadorb = contadorb+1;
			}
			else
			{
				contadorb = contadorb+1;
			}
		}
		if (suma == b && sumb == a)
		{
			System.out.println("son amigos");
		}
		else
		{
			System.out.println("no son amigos");
		}
	}

}