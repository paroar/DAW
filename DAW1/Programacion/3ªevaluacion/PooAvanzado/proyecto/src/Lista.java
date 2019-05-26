
public class Lista {
	private Nodo inicio;
	
	public Lista() {
		
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public  void add(Paso paso){
		Nodo p = new Nodo();
		p.setInfo(paso);
		p.setSig(this.inicio);
		this.inicio=p;
	}
	
	public void addEnd(Paso paso) {
		
	}
	
	public Tiempo tiempoTotal(){
		Tiempo tiempoTotal = new Tiempo();
		Nodo p = this.inicio;
		while (p!=null) {
			tiempoTotal.suma(p.getInfo().getTiempoPreparacion());
			p=p.getSig();
		}
		return tiempoTotal;
	}

}
