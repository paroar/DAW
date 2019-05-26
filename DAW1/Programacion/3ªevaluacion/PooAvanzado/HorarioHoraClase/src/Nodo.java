
public class Nodo {

	private HoraClase info;
	private Nodo sig;
	
	public Nodo(HoraClase info) {
		this.info = info;
		this.sig = null;
	}
	
	public Nodo getSig() {
		return this.sig;
	}
	
	
}
