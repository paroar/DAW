
public class NodoAsignatura {
	private Asignatura info;
	private NodoAsignatura sig;
	
	public NodoAsignatura() {
		this.sig = null;
	}
	
	public NodoAsignatura (Asignatura info) {
		this.info = info;
		this.sig = null;
	}

	public Asignatura getInfo() {
		return this.info;
	}

	public void setInfo(Asignatura info) {
		this.info = info;
	}
	
	public void setSig(NodoAsignatura sig) {
		this.sig = sig;
	}

	public NodoAsignatura getSig() {
		return this.sig;
	}
	
	
	public String toString() {
		return "[" + this.info + "]-->";
	}

	
}
