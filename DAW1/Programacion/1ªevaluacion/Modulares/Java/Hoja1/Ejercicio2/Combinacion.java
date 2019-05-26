
public class Combinacion {

	public static void main(String[] args) {
		
		int m;
		int n;
		
		System.out.println("Introduzca dos números (primero el mayor de ellos): ");
		m=InputData.nextInt();
		n=InputData.nextInt();

		int resta;
		resta=m-n;
		long f;
		long g;
		long h;
		
		f=Factorial.factorial(m);
		g=Factorial.factorial(n);
		h=Factorial.factorial(resta);
		
		double combinacion;
		combinacion=f/(g*h);
		System.out.println(combinacion);
		
	}

}
