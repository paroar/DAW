
public class MisMétodos {

	public static String[] mayorLongitud(String texto) {
		String[] palabras = texto.split(" ");
		int n = palabras.length;
		String maxLongitud = "";
		int max = 0;
		int longitud;
		int i = 0;
		while(i < n) {
			longitud = palabras[i].length();
			if(longitud > max) {
				maxLongitud = palabras[i];
			}
			i++;
		}
		int repetido = 0;
		i = 0;
		while(i < n) {
			if(palabras[i].equals(maxLongitud)) {
				repetido ++;
			}
			i++;
		}
		
		String[] salida = new String[3];
		salida[0] = maxLongitud;
		salida[1] = String.valueOf(maxLongitud.length());
		salida[2] = String.valueOf(repetido);
		return salida;
	}
}
