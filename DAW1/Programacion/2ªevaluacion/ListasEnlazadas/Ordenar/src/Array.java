
public class Array {

	public static void ordenar(int[] a) {
		int n = a.length;
		int aux;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i] > a[j]) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
				}
			}
		}
	}
	
	public static void ordenarWhile(int[] a) {
		int n = a.length;
		int aux;
		int i = 0;
		while (i < n-1) {
			int j = i+1;
			while(j < n) {
				if(a[i] > a[j]) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
				}
			j++;	
			}
		i++;	
		}
	}
}
