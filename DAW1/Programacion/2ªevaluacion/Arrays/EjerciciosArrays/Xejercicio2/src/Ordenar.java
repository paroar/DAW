
public class Ordenar {

	public static void burbuja(int[] a, int n) {
		int i = 0;
		while(i < n-1) {
			int j = 0;
			while(j < n-1) {
				if(a[j] > a[j+1]) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
				j++;
			}
			i++;
		}
	}
}
