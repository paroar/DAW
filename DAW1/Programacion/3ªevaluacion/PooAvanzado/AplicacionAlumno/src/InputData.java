import java.util.Scanner;

public class InputData {

	public static String leerString() {
		Scanner teclado = new Scanner(System.in);
		String n = teclado.nextLine();
		return n;
	}
	
	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		return n;
	}
	
	
}
