import java.util.Scanner;

public class InputData {

	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	public static int[] leerArray(int tama�o, int n) {
		int[] array = new int[tama�o];
		for(int i = 0; i < n; i++) {
			array[i] = InputData.leerEntero();
		}
		return array;
	}
}
