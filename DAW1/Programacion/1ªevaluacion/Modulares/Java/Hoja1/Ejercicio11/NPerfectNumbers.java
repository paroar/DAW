
public class NPerfectNumbers {

	public static void main(String[] args) {

		int max;
		
		System.out.println("Introduce un número para calcular "
				+ "todos los números perfectos hasta él: ");
		max=InputData.nextInt();
		
		boolean isPerfect;
		int n;
		n=1;
		while(n<=max)
		{
			isPerfect=PerfectNumber.isPerfect(n);
			
			if(isPerfect)
			{
				System.out.println(n+" es un número perfecto");
			}
			n=n+1;
		}
		

	}

}
