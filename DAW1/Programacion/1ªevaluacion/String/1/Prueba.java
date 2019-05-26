
public class Prueba {

	public static void main(String[] args) {
		
		String texto = InputData.leerCadena();
		String[] palabras = Separar.separarPalabras(texto);
		String palabraMasLarga = Contar.longitudPalabra(palabras);
		
		System.out.println(palabraMasLarga);
	}
}
