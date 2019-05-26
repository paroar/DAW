/*Dise�ar  que permita introducir un n�mero N y visualice la suma de sus cifras 
devuelve la suma de sus cifras.*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio14
{
	public static void main(String[] args)
	{
		//variables
		int n;
		int suma;
		suma = 0;
	
		//input
		System.out.println("Introduce un n�mero para sumar sus d�gitos: ");
		n = (new Scanner(System.in)).nextInt();
		
		//output
		while (n>=1)
		{
			suma = suma+n%10;
			n = n/10;
		}
		System.out.println("La suma de sus d�gitos es: "+suma);
	}

}