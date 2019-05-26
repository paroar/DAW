
import java.util.Scanner;

public class InputData {
	
	public static int readInt() {
		Scanner teclado = new Scanner(System.in);
		int n;
		n = teclado.nextInt();
		return n;
	}
	
	public static long readLong() {
		Scanner teclado = new Scanner(System.in);
		long n;
		n = teclado.nextLong();
		return n;
	}
	
	public static float readFloat() {
		Scanner teclado = new Scanner(System.in);
		float n;
		n = teclado.nextFloat();
		return n;
	}
	
	public static double readDouble() {
		Scanner teclado = new Scanner(System.in);
		double n;
		n = teclado.nextDouble();		
		return n;
	}
	
	public static boolean readBoolean() {
		Scanner teclado = new Scanner(System.in);
		boolean n;
		n = teclado.nextBoolean();		
		return n;
	}
	
	public static byte readByte() {
		Scanner teclado = new Scanner(System.in);
		byte n;
		n = teclado.nextByte();		
		return n;
	}
	
	public static short readShort() {
		Scanner teclado = new Scanner(System.in);
		short n;
		n = teclado.nextShort();		
		return n;
	}
	
	public static int[] readIntArray(int n, int tam) {
		int[] a = new int[tam];
		int i = 0;
		while(i < n) {
			a[i] = readInt();
			i++;
		}
		return a;
	}

}
