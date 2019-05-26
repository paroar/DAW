/*Realizar un algoritmo que nos permita obtener el factorial de un número N 
introducido por teclado (N! = N*(N-1) ...*4* 3*2*1)*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio15 
{

	public static void main(String[] args) 
	{
		//variables
		int m;
		int n;
		m=1;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el número para calcular su factorial: ");
		n=teclado.nextInt();
		
		//output
		while(n>0) 
		{
			m=m*n;
			n=n-1;
		}
		System.out.print("El factorial de n es: "+m);

	}

}
