
public class Separar {

	public static String[] separarPalabras(String texto) {
		String[] palabras = texto.split(" ");
		return palabras;
	}
	
	public static String[] separarCaracteres(String texto) {
		String[] caracteres = texto.split("");
		return caracteres;
	}
}
