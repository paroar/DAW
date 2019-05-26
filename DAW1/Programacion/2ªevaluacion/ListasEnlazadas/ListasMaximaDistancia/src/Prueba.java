
public class Prueba {

	public static void main(String[] args) {
		Lista lista = new Lista();
		for(int i = 0; i < 7; i++) {
			lista.addEnd(InputData.leerEntero());
		}
		System.out.println(lista.mostrarLista());
		//System.out.println(lista.maximaDistancia(1));
		while(lista.buscar(1) != null) {
			lista.borrar(lista.buscar(1));
		}
		System.out.println(lista.mostrarLista());
	}
}
