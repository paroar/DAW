
import java.util.Comparator;

public class Lista {
	
	private Nodo com;
	
	public Lista(){
		com=null;
	}
	
	public Nodo getCom() {
		return com;
	}
	
	public void add(Anuarioable o){
		Nodo nodo= new Nodo(o);
		nodo.setSig(this.com);
		this.com=nodo;
	}
	
	public void ordenar(Comparator c){
		Nodo p=com;
		Nodo q;
		Anuarioable x;
		if (p.getSig()!=null){
			while(p.getSig()!=null){
				q=p.getSig();
				while(q!=null){
					if(c.compare( p.getInfo(), q.getInfo())>0){
						x=p.getInfo();
						p.setInfo(q.getInfo());	
						q.setInfo(x);
					}	
					q=q.getSig();
				}
				p=p.getSig();
			}
			
		}
	}
	
	@Override
	public String toString() {
		String s="ANUARIO" ;
		Nodo p;
		p=this.com;
		while(p!=null){
			s= s+ p.getInfo();
			//s= s+(p.getInfo()).toString();
			p=p.getSig();
		}
		return s;
	}
	
}
