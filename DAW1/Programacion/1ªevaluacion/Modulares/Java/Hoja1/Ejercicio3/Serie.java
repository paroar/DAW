
public class Serie {

	public static void main(String[] args) {

		int n;
		double number;
		
		System.out.println("Introduce n�mero de t�rminos a sumar de la serie: ");
		n=InputData.nextInt();
		
		number=Factorial.serieDenominadorFactorial(n);
		System.out.println("El valor de la suma de los "+n+" primeros t�rminos es: "+number);
		
	}

}
