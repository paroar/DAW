
public class NodoFactura {

	private Facturable info;
	private NodoFactura sig;
	
	public NodoFactura(Facturable info) {
		this.info = info;
		this.sig = null;
	}
	
	public Facturable getInfo() {
		return this.info;
	}
	
	public NodoFactura getSig() {
		return this.sig;
	}
	
	public void setSig(NodoFactura sig) {
		this.sig = sig;
	}
}
