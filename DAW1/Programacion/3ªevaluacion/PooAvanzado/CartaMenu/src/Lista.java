
public class Lista {
	private Nodo inicio;
	public Lista() {
		
	}
	public void addInicio(Nodo p) {
		p.setSig(this.inicio);
		this.inicio= p;
	}
	public void addFinal(Nodo p) {
		if (this.inicio==null) {
			this.addInicio(p);
		}else {
			p=this.inicio;
			while (p.getSig()!=null) {
				p=p.getSig();
			}
		};
	}
	public Tiempo tiempoTotal(){
		Tiempo = this.pasosPreparacion.tiempoTotal();
	}
}
