/*Realizar un algoritmo que nos permita calcular  la suma de los n�meros pares y la suma 
de los n�meros impares comprendidos entre x e y, siendo x e y dos n�meros enteros.*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio9
{
	public static void main(String[] args)
	{
		//variables
		int sumaPar;
		int sumaImpar;
		int x;
		int y;
		int aux;
		
	
		//input
		System.out.println("Introduce dos n�meros enteros: ");
		x = (new Scanner(System.in)).nextInt();
		y = (new Scanner(System.in)).nextInt();
		
		//output
		if (x<y)
		{
		}
		else
		{
			aux = x;
			x = y;
			y = aux;
		}
		sumaPar = 0;
		sumaImpar = 0;
		while (x<y)
		{
			if (x%2==0)
			{
				sumaPar = sumaPar+x;
			}
			else
			{
				sumaImpar = sumaImpar+x;
			}
			x = x+1;
		}
		System.out.println("La suma de los n�meros pares comprendidos entre x e y es: "+sumaPar);
		System.out.println("La suma de los n�meros impares comprendidos entre x e y es: "+sumaImpar);
	}

}