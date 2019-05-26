
import java.util.Scanner;

public class InputData {
	
	public static int nextInt() {
		
		Scanner teclado = new Scanner(System.in);
		int n;
		n = teclado.nextInt();
		return n;
	}
	
	public static long nextLong() {
		
		Scanner teclado = new Scanner(System.in);
		long n;
		n = teclado.nextLong();
		return n;
	}
	
	public static float nextFloat() {
		
		Scanner teclado = new Scanner(System.in);
		float n;
		n = teclado.nextFloat();
		return n;
	}
	
	public static double nextDouble() {
		
		Scanner teclado = new Scanner(System.in);
		double n;
		n = teclado.nextDouble();		
		return n;
	}
	
	public static boolean nextBoolean() {
		
		Scanner teclado = new Scanner(System.in);
		boolean n;
		n = teclado.nextBoolean();		
		return n;
	}
	
	public static byte nextByte() {
		
		Scanner teclado = new Scanner(System.in);
		byte n;
		n = teclado.nextByte();		
		return n;
	}
	
	public static short nextShort() {
		
		Scanner teclado = new Scanner(System.in);
		short n;
		n = teclado.nextShort();		
		return n;
	}
	
	public static String nextLine() {
		
		Scanner teclado = new Scanner(System.in);
		String n;
		n = teclado.nextLine();		
		return n;
	}
	
	/*public static Coche readCoche() {
		Scanner teclado=new Scanner(System.in);
		Coche c=new Coche();
		
		System.out.println("¿Qué modelo quieres?");
		String modelo=teclado.nextLine();
		
		String color;
		do {
			System.out.println("¿Qué color quieres?");
			color=teclado.nextLine().toUpperCase();
			if(color == Color.AZUL.toString()) {
				c.setColor(Color.AZUL);
				break; //rompe el while
			}
			else if(color == Color.ROJO.toString()) {
				c.setColor(Color.ROJO);
				break; //rompe el while
			} 
			else if(color == Color.VERDE.toString()) {
				c.setColor(Color.VERDE);
				break; //rompe el while
			}
			else if(color == Color.BLANCO.toString()) {
				c.setColor(Color.BLANCO);
				break; //rompe el while
			}
			else if(color == Color.NEGRO.toString()) {
				c.setColor(Color.NEGRO);
				break; //rompe el while
			}
		}while(true);
		
		boolean pinturaMetalizada=teclado.nextBoolean();
		
		String matricula=teclado.nextLine();
		
		String tipoCoche=teclado.nextLine();
		
		int añoFabricacion=teclado.nextInt();
		
		String modalidadSeguro;
		do {
			System.out.println("¿Qué modalidad de seguro quieres?");
			modalidadSeguro=teclado.nextLine().toUpperCase();
			if(modalidadSeguro == TipoDeSeguro.A_TERCEROS.toString()) {
				c.setModalidadSeguro(TipoDeSeguro.A_TERCEROS);
				break; //rompe el while
			}
			else if(modalidadSeguro == TipoDeSeguro.A_TODO_RIESGO.toString()) {
				c.setModalidadSeguro(TipoDeSeguro.A_TODO_RIESGO);				
				break; //rompe el while
			} 
		
		
		return c;
	}*/
	
	

}
