
public class NodoAsignatura {

	private Asignatura info;
	private NodoAsignatura sig;
	
	public NodoAsignatura(Asignatura a) {
		this.info = a;
		this.sig = null;
	}

	public Asignatura getInfo() {
		return info;
	}

	public void setInfo(Asignatura info) {
		this.info = info;
	}

	public NodoAsignatura getSig() {
		return sig;
	}

	public void setSig(NodoAsignatura sig) {
		this.sig = sig;
	}
}
