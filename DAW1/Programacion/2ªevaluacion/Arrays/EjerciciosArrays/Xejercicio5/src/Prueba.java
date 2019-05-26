import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Lista lista = new Lista();
		int[] num = {1,2,3,4,5,4,3,4,5,6,7,8,9,8,7,8,9,8,7,6,5,4,3,4,5,6,7};
		for(int i = 0; i < 27; i++) {
			lista.addEnd(num[i]);
		}
		int n = MisMétodos.montañaRusa(lista);
		System.out.println(n);
	}

}
