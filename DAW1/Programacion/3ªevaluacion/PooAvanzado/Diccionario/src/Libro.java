import java.util.*;

public class Libro implements Traducible{

	private LinkedList<Texto> libro;
	
	public Libro() {
		this.libro = new LinkedList<Texto>();
	}
	
	public Libro(LinkedList<Texto> l) {
		this.libro = l;
	}
	
	public void add(Texto t) {
		this.libro.add(t);
	}

	@Override
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste{
		Palabra n = new Palabra("");
		Texto t;
		Palabra p;
		Iterator<Texto> it = this.libro.iterator();
		while(it.hasNext()) {
			t = it.next();
			p = t.traduce(d);
			n.setPal(n.getPal() + p.getPal() + "\n");
		}
		return n;
	}

	@Override
	public double precio(Preciator c, double d) {
		double sum = 0;
		Texto t;
		Iterator<Texto> it = this.libro.iterator();
		while(it.hasNext()) {
			t = it.next();
			sum += t.precio(c, d);
		}
		return sum;
	}
	
	public String toString() {
		String s = "";
		Texto t;
		Iterator<Texto> it = this.libro.iterator();
		while(it.hasNext()) {
			t = it.next();
			s += t.toString() + "\n";
		}
		return s;
	}
	
	
	
	
}
