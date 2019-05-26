
public class NodoAsignatura {

	private Asignatura info;
	private NodoAsignatura sig;
	
	public NodoAsignatura(Asignatura info) {
		this.info = info;
		this.sig = null;
	}
	
	public Asignatura getInfo() {
		return this.info;
	}
	
	public NodoAsignatura getSig() {
		return this.sig;
	}
}
