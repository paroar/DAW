
public class NodoAsignatura {
	
	private NodoAsignatura sig;
	private Asignatura asignatura;
	
	public NodoAsignatura() {
		
	}

	public NodoAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public NodoAsignatura getSig() {
		return sig;
	}

	public void setSig(NodoAsignatura sig) {
		this.sig = sig;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return asignatura.toString();
	}
	
	
	
	
}
