
public class NodoCapitulo {

	private Capitulo info;
	private NodoCapitulo sig;
	
	public NodoCapitulo(Capitulo info) {
		this.info = info;
	}
	
	public Capitulo getInfo() {
		return this.info;
	}
	
	public void setInfo(Capitulo info) {
		this.info = info;
	}
	
	public NodoCapitulo getSig() {
		return this.sig;
	}
	
	public void setSig(NodoCapitulo sig) {
		this.sig = sig;
	}
}
