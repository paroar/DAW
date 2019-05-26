
public class Nodo {

	private int dato;
	private Nodo siguiente;
	
	public Nodo(int dato) {
		this.dato = dato;
	}
	
	public int getDato() {
		return this.dato;
	}
	
	public void setDato(int dato) {
		this.dato = dato;
	}
	
	public Nodo getSig() {
		return this.siguiente;
	}
	
	public void setSig(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
