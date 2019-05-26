/*Realizar un algoritmo que permita introducir 10 números 
 por teclado visualizando el mayor de ellos.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio13 
{

	public static void main(String[] args) 
	{
		//variables
		int n;
		int m;
		int contador;
		contador=1;
		
		//input
		System.out.println("Introduzca 10 números: ");
		Scanner teclado=new Scanner(System.in);
		m=teclado.nextInt();
		
		//output
		do
		{
			n=teclado.nextInt();
			contador=contador+1;
			if(m<n) 
			{
				m=n;
			}
		}while(contador<10);
		System.out.print("El mayor número introducido es: "+m);
	}

}
