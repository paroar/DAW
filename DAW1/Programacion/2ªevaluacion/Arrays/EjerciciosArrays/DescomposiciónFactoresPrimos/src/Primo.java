
public class Primo {

	public static boolean esPrimo(int n) {
		int i = 2;
		if(n < i) {
			return false;
		}
		while(i*i <= n) {
			if(n % i == 0) {
				return false;
			}else {
				i++;
			}
		}
		return true;
	}
}
