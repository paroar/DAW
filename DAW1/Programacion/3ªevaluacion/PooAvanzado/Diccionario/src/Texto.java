import java.util.*;

public class Texto implements Traducible {

	private LinkedList<Palabra> texto;
	
	public Texto() {
		this.texto = new LinkedList<Palabra>();
	}
	
	public Texto(LinkedList<Palabra> l) {
		this.texto = l;
	}
	
	public void add(Palabra p) {
		this.texto.add(p);
	}
	
	@Override
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste{
		Palabra n = new Palabra("");
		Palabra p;
		Iterator<Palabra> it = this.texto.iterator();
		while(it.hasNext()) {
			p = it.next();
			p = p.traduce(d);
			n.setPal(n.getPal() + p.getPal() + " ");
		}
		return n;
	}

	@Override
	public double precio(Preciator c, double $) {
		Palabra p;
		double sum = 0;
		Iterator<Palabra> it = this.texto.iterator();
		while(it.hasNext()) {
			p = it.next();
			sum += p.precio(c, $);
		}
		return sum;
	}
	
	public String toString() {
		String s = "";
		Palabra p;
		Iterator<Palabra> it = this.texto.iterator();
		while(it.hasNext()) {
			p = it.next();
			s += p.toString() + " ";
		}
		return s;
	}

}
