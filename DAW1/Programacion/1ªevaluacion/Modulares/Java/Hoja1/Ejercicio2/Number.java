
public class Number {

	public static void main(String[] args) {
		
		long n;
		long number;
		
		System.out.println("Introduzca un número para calcular su factorial: ");
		n=InputData.nextLong();
		
		number=Factorial.factorial(n);
		System.out.println(number);
	}

}
