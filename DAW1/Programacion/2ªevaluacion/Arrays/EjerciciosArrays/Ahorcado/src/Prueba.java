
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra: ");
		String palabra = InputData.leerPalabra();
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
		char[] arrayPalabra = new char[palabra.length()+1];
		for(int i = 0; i < palabra.length(); i++) {
			arrayPalabra[i] = palabra.charAt(i);
		}
		arrayPalabra[palabra.length()] = '*';

		char[] nuevoArrayPalabra = new char[palabra.length()+1];
		for(int i = 0; i < nuevoArrayPalabra.length; i++) {
			nuevoArrayPalabra[i] = '-';
		}
		nuevoArrayPalabra[palabra.length()] = '*';
		
		String mencionados = "";
		int intentos = 10;
		while(intentos > 0) {
			System.out.println("Introduce un caracter: ");
			char caracter =  InputData.leerPalabra().charAt(0);
			if(Array.comprobarCaracter(arrayPalabra, caracter)) {
				Array.actualizar(arrayPalabra, nuevoArrayPalabra, caracter);
				System.out.println("La letra "+caracter+" sí está :D");
				if(Array.iguales(arrayPalabra, nuevoArrayPalabra)) {
					System.out.println(Array.mostrar(nuevoArrayPalabra)+"\n"
						+ "¡Felicidades has ganado!");
					System.exit(1);
				}	
				mencionados += caracter + " ";
				System.out.println("Letras mencionadas anteriormente: " + mencionados+ "\n"
					+ Array.mostrar(nuevoArrayPalabra)
					+ "..............................................................");			
			}else {
				intentos--;
				mencionados += caracter + " ";
				System.out.println("La letra "+caracter+" no está D:\n"
					+ "Te quedan "+intentos+" intentos\n"
					+ "Letras mencionadas anteriormente: " + mencionados + "\n"
					+ Array.mostrar(nuevoArrayPalabra)
					+ "..............................................................");
			}
		}
		System.out.println("Has perdido :(\n"
			+ "+La palabra era: " + palabra);
	}

}
