/*Realizar un algoritmo que nos permita leer dos n�meros A y B por teclado y calcule la suma, la resta, la 
divisi�n A/B o  el producto. Se visualizar�n los resultados por pantalla.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		/*variables*/
		int a;
		int b;
		int sum;
		int res;
		int pro;
		
		/*input*/
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame el valor de a");
		a=teclado.nextInt();
		System.out.println("Dame el valor de b");
		b=teclado.nextInt();
		
		
		//outputs
		/*suma*/
		sum=a+b;
		System.out.println("El resultado de la suma es: " + sum);
		
		/*resta*/
		res=a-b;
		System.out.println("El resultado de la resta es: " + res);
		
		/*producto*/
		pro=a*b;
		System.out.println("El resultado de la multiplicaci�n es: " +pro);
		
		/*division*/
		if (b==0) 
		{
			System.out.println("Error");
		} else 
		{
			System.out.println("El resultado de la divisi�n es: " + a/b);
		}

	}

}
