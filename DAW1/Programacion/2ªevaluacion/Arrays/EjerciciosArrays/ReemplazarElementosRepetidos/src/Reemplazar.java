
public class Reemplazar {

	public static void repetidos(int[] array, int n) {
		boolean repetido = false;
		int i = 0;
		while(i < n-1) {
			int j = i+1;
			while(j < n) {
				if(array[j] == array[i]) {
					array[j] = -1;
					repetido = true;
				}
				j++;
			}
			if(repetido) {
				array[i] = -1;
				repetido = false;
			}
			i++;
		}
	}
}
