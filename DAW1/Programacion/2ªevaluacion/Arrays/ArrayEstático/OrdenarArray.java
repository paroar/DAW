
public class OrdenarArray {

	//SELECCIÓN DIRECTA: COMPLEJIDAD N^2
	public static void selecciónDirecta(int[] a, int n) {
		int menor;
		int j = 0;
		int i = 1;
		while(j < n) {
			menor = a[j];
			while(i<n) {
				if(menor>a[i]) {
					menor = a[i];
					a[i] = a[j];
					a[j] = menor;
				}
				i++;
			}
			j++;
			i = j+1;
		}
		
	}
	
	//INSERCIÓN: COMPLEJIDAD N^2
	public static void inserción(int[] a, int n) {
		int aux;
		int j = 1;
		int k;
		while(j < n) {
			if(a[j] < a[j-1]) {
				k = j;
				while(k != 0 && a[k] < a[k-1]) {
					aux = a[k-1];
					a[k-1] = a[k];
					a[k] = aux;
					k--;
				}
			}
			j++;
		}
		
	}
	
	//INTERCAMBIO: COMPLEJIDAD N^2
	public static void intercambio(int[] a, int n) {
		int aux;		
		int i = 0;
		while(i < n) {
			int j = i + 1;
			while(j < n) {
				if(a[j] < a[i]) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
				}
				j++;
			}
			i++;

		}
	}
	
	//BURBUJA: COMPLEJIDAD N^2
	public static void burbuja(int[] a, int n) {
		boolean repetir = true;
		int aux;
		while(0 < n && repetir) {
			repetir = false;
			int i = 0;
			while(i < (n-1)) {
			    if(a[i] > a[i+1]) {
			    	aux = a[i];
			    	a[i] = a[i+1];
			    	a[i+1] = aux;
			    	repetir = true;
			    }
			    i++;
			}
			n--;
		}
	}
	
}
