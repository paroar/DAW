
public class Lista {
	
	private Nodo  com;
	
	public Lista(){
		this.com=null;
	}
	
	public  void add(Paso paso){
		Nodo nodo = new Nodo(paso);
		nodo.setSig(this.com);
		this.com=nodo;
	}
	
	public Tiempo tiempoTotal(){
		Tiempo tiempoTotal = new Tiempo();
		Nodo p= this.com;
		while(p!=null){
			tiempoTotal.suma(p.getInfo().getTiempoPreparacion());
			p=p.getSig();
		}
		return tiempoTotal;
	}
	
	@Override
	public String toString() {
		String s="ListaPasosPreparación";
		Nodo p =this.com;
		while(p!=null){
			s=s+p;
			p=p.getSig();
			
		}
		return s;
	}
	

}
