import java.util.Scanner;

public class InputData {

	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	public static int[] leerArray(int tamaño, int n) {
		int[] array = new int[tamaño];
		for(int i = 0; i < n; i++) {
			array[i] = InputData.leerEntero();
		}
		return array;
	}
}
