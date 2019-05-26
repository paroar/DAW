/*Realizar un algoritmo para visualizar los divisores de un número N 
introducido por teclado.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio18 
{

	public static void main(String[] args) 
	{
		//variables
		int numero;
		int contador;
		
		//intput
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca un número para obtener sus divisores: ");
		numero=teclado.nextInt();
		contador=numero;
		
		//output
		while(contador>0) 
		{
			if(numero%contador==0) 
			{
				System.out.print(contador+" es divisor de "+numero+"\n");
				contador=contador-1;
			}else 
			{
				contador=contador-1;
			}
		}
	}

}
