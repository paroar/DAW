
public class Prueba {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int n = 1069078;
		lista = Convertir.convertirEnLista(n);
		System.out.println(lista.mostrarLista());
	}

}
