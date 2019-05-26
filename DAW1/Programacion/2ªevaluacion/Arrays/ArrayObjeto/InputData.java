import java.util.Scanner;

public class InputData {

	public static int leerInt() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	public static Array leerIntArray(int tam, int n) {
		int[] a = new int[tam];
		int i = 0;
		while(i < n) {
			a[i] = InputData.leerInt();
			i++;
		}
		Array b = new Array(a, n);
		return b;
	}
}
