
public class Serie {

	public static void main(String[] args) {

		int n;
		double number;
		
		System.out.println("Introduce número de términos a sumar de la serie: ");
		n=InputData.nextInt();
		
		number=Factorial.serieDenominadorFactorial(n);
		System.out.println("El valor de la suma de los "+n+" primeros términos es: "+number);
		
	}

}
