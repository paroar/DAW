import java.util.Random;

public class Prueba {

	public static void main(String[] args) {
		int[] a = new int[4];
		int[] b = new int[4];
		
		Random rand = new Random();
		for(int i = 0; i < 4; i++) {
			a[i] = rand.nextInt(10);
		}
		
		int contador = 0;
		while(contador < 10) {
			System.out.println("Introduce 4 d�gitos comprendidos entre 0-9: ");
			PreguntarNumeros.cuatroDigitos(b);
			String salidaAparecer = Aparecer.aparecen(a, b);
			System.out.println("Aparecen los n�meros: "+salidaAparecer);
			String salidaCoincidir = Coincidir.coinciden(a, b);
			System.out.println("Coinciden los n�meros: "+salidaCoincidir);
			
			if(salidaCoincidir.length() == 8) {
				System.out.println(" _________________________________");
				System.out.println("|***********ENHORABUENA***********|");
				System.out.println("|Has ganado, esos eran los n�meros|");
				System.out.println("|_________________________________|");
				System.exit(1);
			}
			contador++;
			System.out.println("---------------------------------------------");
			System.out.println("Te quedan "+(10-contador)+" intentos");
		}
		
		System.out.println(" ___________________________________");
		System.out.println("|Has perdido, los n�meros eran: "+Mostrar.mostrarArray(a)+"|");
		System.out.println("|___________________________________|");
		System.exit(1);

	}

}
