import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int nPrimeros = InputData.leerEntero();
		int[] nPrimerosFibonacci = Fibonacci.nPrimerosFibonacci(nPrimeros);
		System.out.println(Arrays.toString(nPrimerosFibonacci));

	}

}
