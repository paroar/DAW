/*Realizar un algoritmo que permita asignar a una variable un valor entero, 
incrementar el valor de la variable sumando 1 y visualizar el resultado.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio6 
{

	public static void main(String[] args) 
	{
		//variables
		int n;
		int sum;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un nº");
		n=teclado.nextInt();
		
		//output
		sum=n+1;
		System.out.println("El incremento de " + n + " es " + sum);
	}

}
