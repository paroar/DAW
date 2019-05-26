
public class Capitulo implements Imprimible{
	
	private String titulo;
	private int colocacion;
	private String texto;
	private int numeroPaginas;
	
	public Capitulo(String titulo, int colocacion, String texto, int numeroPaginas){
		this.titulo = titulo;
		this.colocacion = colocacion;
		this.texto = texto;
		this.numeroPaginas = numeroPaginas;
	}
	
	public int getColocacion() {
		return this.colocacion;
	}
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public String imprimir() {
		String salida = "";
	    salida = "Titulo: " + this.titulo + "\n" +
	    		" colocacion: " + this.colocacion + "\n" + 
	    		" texto: " + this.texto +  "\n" +
	    		" numero de paginas: " + this.numeroPaginas + "\n\n";
	    return salida;
	}
	
	public String imprimirCapitulo() {
		String salida = "";
	    salida = "Titulo: " + this.titulo + "\n" +
	    		" texto: " + this.texto +  "\n" +
	    		" numero de paginas: " + this.numeroPaginas + "\n\n";
	    return salida;
	}

	public int obtenerNumeroPaginas() {
		return this.numeroPaginas;
	}
	
}
