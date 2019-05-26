
public class Nodo {

	private Facturable info;
	private Nodo sig;
	
	public Nodo(Facturable f) {
		this.info = f;
		this.sig = null;
	}
	
	public Facturable getInfo() {
		return this.info;
	}
	
	public void setInfo(Facturable f) {
		this.info = f;
	}
	
	public Nodo getSig() {
		return this.sig;
	}
	
	public void setSig(Nodo n) {
		this.sig = n;
	}
}
