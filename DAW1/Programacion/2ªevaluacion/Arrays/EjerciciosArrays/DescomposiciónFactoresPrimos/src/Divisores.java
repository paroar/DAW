
public class Divisores {

	public static int arrayPrimos(int[] array, int num) {
		int n = 0;
		int i = 1;
		while(num > 1) {
			if(Primo.esPrimo(i) && num % i == 0) {
				array[n] = i;
				n++;
				num /= i;
			}else {
				i++;
			}
			
		}
		return n;
	}
}
