
public class Divisores {
	
	public static int divisoresPrimos(int[] array, int num) {
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
	
	public static int descomposiciónFactoresPrimos(int[] array, int num) {
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
