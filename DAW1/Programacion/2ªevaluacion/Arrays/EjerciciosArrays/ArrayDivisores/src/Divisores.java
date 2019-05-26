
public class Divisores {

	public static int array(int[] array, int num) {
		int n = 0;
		int i = 1;
		while(i <= num) {
			if(num % i == 0) {
				array[n] = i;
				n++;
			}
			i++;
		}
		return n;
	}
}
