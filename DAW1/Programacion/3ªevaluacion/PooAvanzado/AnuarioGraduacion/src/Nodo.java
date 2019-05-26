
public class Nodo {
	
	private Anuarioable info;
	private Nodo sig;

	public Nodo(){
		this.sig=null;
	}
	
	public Nodo(Anuarioable info){
		this.info=info;
		this.sig=null;
	}
	
	/**
	 * @return the info
	 */
	public Anuarioable getInfo() {
		return info;
	}
	
	public void setInfo(Anuarioable info) {
		this.info = info;
	}
	
	public Nodo getSig() {
		return sig;
	}
	
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	@Override
	public String toString() {
		return "Nodo [info=" + info + ", sig=" + sig + "]";
	}
	

}
