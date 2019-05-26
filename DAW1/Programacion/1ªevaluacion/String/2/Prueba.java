
public class Prueba {

	public static void main(String[] args) {
		
		String texto = InputData.leerCadena();
		String[] palabras = Separar.separarPalabras(texto);
		int numeroPalabras = palabras.length;
		
		System.out.println(numeroPalabras);

	}

}
