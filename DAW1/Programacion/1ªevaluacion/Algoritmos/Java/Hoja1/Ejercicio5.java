/*Realizar un algoritmo que permita asignar un valor a una variable A 
y otro valor a un variable B y luego intercambie estos valores. 
Se visualizará el contenido de A y B*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio5 
{

	public static void main(String[] args) 
	{
		//variables
		int a;
		int b;
		int aux;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número A");
		a=teclado.nextInt();
		System.out.println("Introduce un número B");
		b=teclado.nextInt();

		//output
		aux=a;
		a=b;
		b=aux;
		System.out.println("El número A es "+ a +" y el número B es "+ b);
		
	}

}
