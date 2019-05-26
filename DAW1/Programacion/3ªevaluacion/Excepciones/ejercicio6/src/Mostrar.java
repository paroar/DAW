
public class Mostrar {

	public static String array(int[] a, int n) {
		String s = "[";
		int i = 0;
		while(i < n) {
			if(i == n-1) {
				s += a[i]+"]";
				break;
			}
			s += a[i]+", ";
			i++;
		}
		return s;
	}
}
