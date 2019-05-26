
public class Array {

	public static boolean iguales(char[] a, char[] b) {
		if(a.length == b.length) {
			int n = a.length-1;
			while(0 < n) {
				if(a[n] != b[n]) {
					return false;
				}
				n--;
			}
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean comprobarCaracter(char[] a, char c) {
		for(int i = 0; i < a.length; i++) {
			if(c == a[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void actualizar(char[] a, char[] b, char c) {
		for(int i = 0; i < a.length; i++) {
			if(c == a[i]) {
				b[i] = c;
			}
		}
	}
	
	public static String mostrar(char[] a) {
		String salida = "";
		for(int i = 0; i < a.length; i++) {
			salida += a[i];
		}
		return salida;
	}
}
