
public class Prueba {

	public static void main(String[] args) {
		Lista lista = new Lista();
		for(int i = 0; i < 2; i++) {
			lista.addBegin(InputData.leerEntero());
		}
		System.out.println(lista.mostrarLista());
		lista.ordenarBurbuja();
		System.out.println(lista.mostrarLista());
		lista.invertir();
		System.out.println(lista.mostrarLista());
	}

}
