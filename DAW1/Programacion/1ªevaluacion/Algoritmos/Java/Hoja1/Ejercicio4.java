/*Representar una sentencia para visualizar un mensaje �par�   o �impar� dependiendo 
del valor almacenado en una variable x entera*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		//variables
		int n;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un n�");
		n=teclado.nextInt();
		
		//output
		if(n%2==0) 
		{
			System.out.println("El n� introducido es par: "+ n);
		} else 
		{
			System.out.println("El n� introducido es impar: "+ n);
		}

	}

}
