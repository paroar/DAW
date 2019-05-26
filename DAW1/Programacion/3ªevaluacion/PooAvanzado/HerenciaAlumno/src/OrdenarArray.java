import java.util.Comparator;

public class OrdenarArray{

	//SELECCIÓN DIRECTA: COMPLEJIDAD N^2
	public static void selecciónDirecta(Alumno[] a, int n, Comparator c) {
		Alumno menor;
		int j = 0;
		int i = 1;
		while(j < n) {
			menor = a[j];
			while(i<n) {
				if(c.compare(menor, a[i]) > 0) {
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
	public static void inserción(Alumno[] a, int n, Comparator c) {
		Alumno aux;
		int j = 1;
		int k;
		while(j < n) {
			if(c.compare(a[j], a[j-1]) < 0) {
				k = j;
				while(k != 0 && c.compare(a[k], a[k-1]) < 0) {
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
	public static void intercambio(Alumno[] a, int n, Comparator c) {
		Alumno aux;		
		int i = 0;
		while(i < n) {
			int j = i + 1;
			while(j < n) {
				if(c.compare(a[j], a[i]) < 0) {
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
	public static void burbuja(Alumno[] a, int n, Comparator c) {
		boolean repetir = true;
		Alumno aux;
		while(0 < n && repetir) {
			repetir = false;
			int i = 0;
			while(i < (n-1)) {
			    if(c.compare(a[i], a[i+1]) > 0){
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
