import java.util.*;

public class Diccionario{

	private SortedMap<Palabra,Palabra> pares;
	
	public Diccionario() {
		this.pares = new TreeMap<Palabra,Palabra>();
	}
	
	public Diccionario(Comparator c) {
		this.pares = new TreeMap<Palabra,Palabra>(c);
	}
	
	public SortedMap<Palabra,Palabra> getPares() {
		return pares;
	}

	public void setPares(SortedMap<Palabra,Palabra> pares) {
		this.pares = pares;
	}

	public void add(Palabra e, Palabra i) {
		this.pares.put(e,i);
	}

	public String toString() {
		// TODO Auto-generated method stub
		String s = "";
		Palabra p;
		Iterator<Palabra> it = this.pares.keySet().iterator();
		while(it.hasNext()) {
			p = it.next();
			s += p.toString() + "\n";
		}
		return s;
	}
}
