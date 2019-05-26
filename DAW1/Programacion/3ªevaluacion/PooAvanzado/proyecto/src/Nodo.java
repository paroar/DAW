
public class Nodo {
	private Paso info;
	private Nodo sig;
	public Nodo() {
		this.sig = null;
	}
	public Nodo(Paso info) {
		this.info = info;
		this.sig = sig;
	}
	public Paso getInfo() {
		return info;
		
	}
	public void setInfo(Paso info) {
		this.info = info;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig){
		this.sig = sig;
	}
	public String toString(){
		String s="";
		s= s+ this.info.toString()+"-->";
		return s;
	}

}
