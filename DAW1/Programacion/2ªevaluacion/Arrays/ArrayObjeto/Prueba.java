
public class Prueba {

	public static void main(String[] args) {
		System.out.print("Tama�o del array: ");
		int tam = InputData.leerInt(); 
		System.out.print("N�mero de elementos ocupados: ");
		int n = InputData.leerInt();
		System.out.println("�Cu�les?: ");
		Array a = InputData.leerIntArray(tam, n);
		
		System.out.println("Elija el modo de ordenaci�n: ");
		System.out.println("1. Selecci�n directa");
		System.out.println("2. Inserci�n");
		System.out.println("3. Intercambio");
		System.out.println("4. Burbuja");
		
		switch (InputData.leerInt()){
			case 1: a.ordenarSelecci�nDirecta();
					break;
			case 2: a.ordenarInserci�n();
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
