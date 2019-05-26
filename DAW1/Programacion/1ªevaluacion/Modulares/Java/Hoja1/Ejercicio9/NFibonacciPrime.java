
public class NFibonacciPrime {

	public static void main(String[] args) {
		
		int anterior;
		int posterior;
		int auxiliar;
		int max;
		
		System.out.println("Introduce un número para obtener todos los primos de la sucesión de Fibonacci hasta él: ");
		max=InputData.nextInt();
		
		anterior=0;
		posterior=1;
		auxiliar=1;
		boolean isPrime;
		while(anterior<=max)
		{
			isPrime=Prime.isPrime(anterior);
			
			if(isPrime)
				{
					System.out.println(anterior+" es primo");
				}
			
			anterior=posterior;
			posterior=auxiliar;
			auxiliar=anterior+posterior;
		}

	}

}
