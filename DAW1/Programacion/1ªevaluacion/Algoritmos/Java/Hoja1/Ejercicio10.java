/*Realizar un algoritmo para introducir n�meros enteros positivos 
por teclado (hasta que se introduzca un n�mero negativo)  y cuente 
cuantos de esos n�meros son pares, cuantos son impares y el % que representan.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio10 
{

	public static void main(String[] args) 
	{
		//variables
		int contadorPar;
		int contadorImpar;
		int n;
		int porcientoPar;
		int porcientoImpar;
		contadorPar=0;
		contadorImpar=0;
		
		//input
		Scanner teclado=new Scanner(System.in);
		do 
		{
			System.out.println("Introduzca un n�mero entero");
			n=teclado.nextInt();
			if(n%2==0)
			{
				contadorPar=contadorPar+1;
			}else 
			{
				contadorImpar=contadorImpar+1;
			}
		}while(n>0);
		
		//output
		porcientoPar=100*contadorPar/(contadorPar+contadorImpar);
		porcientoImpar=100*contadorImpar/(contadorPar+contadorImpar);
		System.out.print("N�meros pares: "+contadorPar+" "+porcientoPar+"%"+" N�meros impares: "+contadorImpar+" "+porcientoImpar+"%");
	}

}
