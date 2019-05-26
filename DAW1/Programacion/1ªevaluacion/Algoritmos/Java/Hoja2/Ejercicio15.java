/*Diseñar  un  módulo  ArbolNavidad()  que  dibuje  un  árbol  de  
Navidad  como  los  del  ejemplo:  El  módulo recibirá un  número N*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio15
{
	public static void main(String[] args)
	{
		//variables 
		String salida1;
		int salida2;
		int n;
		int filas;
		int columnas;
		int aux;
		salida1 = "";
		
		

		//input
		n = (new Scanner(System.in)).nextInt();
		salida2 = n;
		columnas = n;
		aux = n;
		
		//output
		while (n>1)
		{
			while (columnas>1)
			{
				salida1 = salida1+"b";
				columnas = columnas-1;
			}
			System.out.println(salida1+salida2+"|"+salida2+salida1);
			salida1 = "";
			salida2 = ""+salida2+aux;
			n = n-1;
			columnas = n;
		}
	}

}