
public class Prueba {

	public static void main(String[] args) {
		
		System.out.print("Introduce el tama�o del array: ");
		int tam = InputData.readInt();
		System.out.print("Introduce el n�mero de elementos ocupados: ");
		int n = InputData.readInt();
		System.out.println("Introduce los n elementos: ");
		int[] a = InputData.readIntArray(n, tam);
		
		System.out.println("Elija el modo de ordenaci�n: ");
		System.out.println("1. Selecci�n directa");
		System.out.println("2. Inserci�n");
		System.out.println("3. Intercambio");
		System.out.println("4. Burbuja");
		
		switch (InputData.readInt()){
			case 1: OrdenarArray.selecci�nDirecta(a, n);;
			case 2: OrdenarArray.inserci�n(a, n);;
			case 3: OrdenarArray.intercambio(a, n);;
			case 4: OrdenarArray.burbuja(a, n);;
		}
		
		System.out.print(MostrarArray.intArray(a, n));
	}

}
