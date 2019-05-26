
public class NodoFacturable {

	private Facturable info;
	private NodoFacturable sig;
	
	public NodoFacturable() {

	}

	public NodoFacturable(Facturable info) {
		this.info = info;
	}

	public Facturable getInfo() {
		return info;
	}

	public void setInfo(Facturable info) {
		this.info = info;
	}

	public NodoFacturable getSig() {
		return sig;
	}

	public void setSig(NodoFacturable sig) {
		this.sig = sig;
	}
	
	
	
	
	
}
