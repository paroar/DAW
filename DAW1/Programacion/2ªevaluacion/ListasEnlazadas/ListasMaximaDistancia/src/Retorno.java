
public class Retorno {

	private int dist;
	private Nodo nodo;
	
	public Retorno(int dist, Nodo nodo) {
		this.dist = dist;
		this.nodo = nodo;
	}
	
	public int getDist() {
		return this.dist;
	}
	
	public Nodo getNodo() {
		return this.nodo;
	}
}
