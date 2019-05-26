
public class Prueba {

	public static void main(String[] args) {
		System.out.print("Tamaño del array: ");
		int tam = InputData.leerInt(); 
		System.out.print("Número de elementos ocupados: ");
		int n = InputData.leerInt();
		System.out.println("¿Cuáles?: ");
		Array a = InputData.leerIntArray(tam, n);
		
		System.out.println("Elija el modo de ordenación: ");
		System.out.println("1. Selección directa");
		System.out.println("2. Inserción");
		System.out.println("3. Intercambio");
		System.out.println("4. Burbuja");
		
		switch (InputData.leerInt()){
			case 1: a.ordenarSelecciónDirecta();
					break;
			case 2: a.ordenarInserción();
					break;
			case 3: a.ordenarIntercambio();
					break;
			case 4: a.ordenarBurbuja();
					break;
		}
		
		System.out.println(a.toString());
		System.out.println(a.busquedaCentinela(InputData.leerInt()));
	}

}
