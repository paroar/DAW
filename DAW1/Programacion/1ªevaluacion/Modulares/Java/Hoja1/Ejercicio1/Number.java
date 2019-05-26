
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		boolean number;
		long n;
		
		System.out.println("Introduzca un número para saber si es primo: ");
		n=InputData.nextLong();
		
		number=IsPrime.isPrime(n);
		
		if(number) 
		{
			System.out.println("El número "+n+" es primo");
		}else 
		{
			System.out.println("El número "+n+" no es primo");
		}

	}

}
