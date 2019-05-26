/*Realizar un algoritmo que calcule y visualice la media aritmética 
de N números enteros introducidos por teclado.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio14 
{

	public static void main(String[] args) 
	{
		//variables
		int n;
		int contador;
		int nota;
		int media;
		contador=0;
		nota=0;

		//input
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca la cantidad de ejercicios calificados: ");
		n=teclado.nextInt();
		
		//output
		while(contador<n)
		{
			System.out.print("Introduzca nota: ");
			nota=nota+teclado.nextInt();
			contador=contador+1;
		}
		media=nota/n;
		System.out.print("La media aritmética del alumno es: "+media);
	}

}
