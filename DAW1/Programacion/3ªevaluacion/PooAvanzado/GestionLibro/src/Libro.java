
public class Libro implements Imprimible{

	private String titulo;
	private Lista lista;
	
	public Libro(String titulo) {
		this.titulo = titulo;
		this.lista = new Lista();
	}

	public String imprimir() {
		String salida = "";
		salida = this.titulo + ": " + this.obtenerNumeroPaginas() + " páginas" +"\n\n" + 
				 this.lista.imprimir() +
				 "-----------------------";
		return salida;
	}
	
	public String imprimirCapitulo(int n) {
		String salida = "";
		salida = this.lista.imprimirCapitulo(n) +
				 "-----------------------";
		return salida;
	}

	public int obtenerNumeroPaginas() {
		int num = this.lista.obtenerNumeroPaginas();
		return num;
	}
	
	public void addBegin(Capitulo c) {
		this.lista.addBegin(c);
	}
	
	public void addEnd(Capitulo c) {
		this.lista.addEnd(c);
	}
	
	public void addOrdenado(Capitulo c, Comparator comp) {
		this.lista.addOrdenado(c, comp);
	}
}
