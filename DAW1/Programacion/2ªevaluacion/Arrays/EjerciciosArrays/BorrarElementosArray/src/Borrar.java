
public class Borrar {

	public static int borrarElementoArray(int[] array, int n, int num) {
		int i = 0;
		while(i < n) {
			if(array[i] == num) {
				int j = i;
				while(j < n-1) {
					array[j] = array[j+1];
					j++;
				}
				n--;
			}else {
				i++;
			}
		}
		return n;
	}
}
