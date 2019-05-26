
public class Contar {

	public static String longitudPalabra(String[] palabras) {
		
		int i;
		int contadorLetras = 0;
		int maxContadorLetras = 0;
		int posicion = 0;
		
		i=0;
		while(i<palabras.length) {
			contadorLetras = palabras[i].length();
			if (contadorLetras>maxContadorLetras) {
				maxContadorLetras = contadorLetras;
				posicion = i;
			}
			i++;
		}
		return palabras[posicion]+": "+maxContadorLetras;
	}
}
