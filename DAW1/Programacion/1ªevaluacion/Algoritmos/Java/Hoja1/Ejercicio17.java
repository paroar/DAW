/*Realizar un algoritmo que determine si un número D es divisor de un número N, 
introduciendo ambos por teclado.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio17 
{

	public static void main(String[] args) 
	{
		//variables
		int dividendo;
		int divisor;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca dividendo: ");
		dividendo=teclado.nextInt();
		System.out.print("Introduzca divisor: ");
		divisor=teclado.nextInt();
		
		//output
		if(divisor!=0) 
		{
			if(dividendo%divisor==0) 
			{
				System.out.print(divisor+" es divisor de "+dividendo);
			}else 
			{
				System.out.print(divisor+" no es divisor de "+dividendo);
			}
		}else 
		{
			System.out.print("0 no es divisor de ningún número");
		}

	}

}
