import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		boolean primo = true;
		int divisor = 1;
		int contador = 0;
		while(divisor<=num) {
			if(num%divisor==0) {
				contador++;
			}
			divisor++;
		}
		if(contador>2) {
			primo=false;
		}else {
			primo=true;
		}
		System.out.println(primo);

	}

}
