/*Realizar un algoritmo que visualice los números primos entre 2 y n(ambos inclusive).*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio20 
{

	public static void main(String[] args) 
	{
		//variables
		long n;
		boolean prime;
		long max;
		n=2;
		
		//input
		System.out.println("Números primos entre 2 y n(ambos inclusive), introduzca n: ");
		Scanner teclado=new Scanner(System.in);
		max=teclado.nextLong();
		
		//output
		while(n<=max) 
		{
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
			}
			n=n+1;
		}
		
	}
}	
