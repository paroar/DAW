
public class Contar {

	public static int[] impares(int[] array, int n) {
		int[] arrayImpares = new int[n+1];
		int m = 1;
		int i = 0;
		while(i < n) {
			if(array[i] % 2 != 0) {
				arrayImpares[0]++;
				arrayImpares[m] = i;
				m++;
			}
			i++;
		}
		return arrayImpares;
	}
}
