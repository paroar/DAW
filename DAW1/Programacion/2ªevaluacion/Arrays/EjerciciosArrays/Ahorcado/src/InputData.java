import java.util.Scanner;

public class InputData {

	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	public static String leerPalabra() {
		Scanner teclado = new Scanner(System.in);
		String n = teclado.nextLine();
		return n;
	}
}
