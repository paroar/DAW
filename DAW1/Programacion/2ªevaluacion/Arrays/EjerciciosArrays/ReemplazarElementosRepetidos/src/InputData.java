import java.util.Scanner;

public class InputData {

	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	public static int[] llenarArray(int tama�o, int n) {
		int[] array = new int[tama�o];
		int i = 0;
		while(i < n) {
			array[i] = InputData.leerEntero();
			i++;
		}
		return array;
	}
}
