/*Realizar un algoritmo que visualice un mensaje indicando si un número 
N introducido por teclado es primo o no*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio19 
{

	public static void main(String[] args) 
	{
		//variables
		long n;
		boolean prime;
		
		//input
		Scanner teclado=new Scanner(System.in);
		n=teclado.nextLong();
		
		//output
		if(n<=1) 
		{
			prime=false;
		}else 
		{ 
			if(n<=3) 
			{
				prime=true;
			}else 
			{
				if(n%2==0) 
				{
					prime=false;
				}else 
				{
					if(n%3==0) 
					{
						prime=false;
					}else 
					{
						long c;
						c=5;
						prime=true;
						while (c*c<=n) 
						{
							if(n%c!=0) 
							{
								c=c+2;
								prime=true;
							}else 
							{
								prime=false;
								break;
							}
						}	
					}
				}
			}
		}
		if(prime==true) 
		{
			System.out.println(n+" es primo");
		}else 
		{
			System.out.println(n+" no es primo");
		}
	}
}	
