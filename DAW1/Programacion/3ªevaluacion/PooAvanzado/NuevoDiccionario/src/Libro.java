import java.util.*;

public class Libro implements Traducible{

	private LinkedList libro;
	
	public Libro() {
		this.libro = new LinkedList();
	}
	
	public void addTexto(Texto tex){
		this.libro.add(tex);
	}
	
	public LinkedList getLibro() {
		return this.libro;
	}
	
	public void setLibro(LinkedList libro) {
		this.libro = libro;
	}

	@Override
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste {
		String traduccion = "";
		Texto aux;
		Palabra pal;
		Iterator it = this.libro.iterator();
		while(it.hasNext()) {
			aux = (Texto)it.next();
			pal = aux.traduce(d);
			traduccion += pal.getPal();
		}
		return new Palabra(traduccion);
	}

	@Override
	public double precio(double precio) {
		double sum = 0;
		Texto aux;
		Iterator it = this.libro.iterator();
		while(it.hasNext()) {
			aux = (Texto)it.next();
			sum += aux.precio(precio);
		}
		return sum;
	}
	
	
}
