
public class Divisores {

	public static int arrayPrimos(int[] array, int num) {
		int n = 0;
		int i = 1;
		while(i <= num) {
			if(Primo.esPrimo(i) && num % i == 0) {
				array[n] = i;
				n++;
			}
			i++;
		}
		return n;
	}
}
