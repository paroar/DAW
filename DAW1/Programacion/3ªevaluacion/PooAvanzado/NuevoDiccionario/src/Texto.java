import java.util.*;

public class Texto implements Traducible{

	private LinkedList texto;
	
	public Texto() {
		this.texto = new LinkedList();
	}
	
	public LinkedList getTexto() {
		return this.texto;
	}
	
	public void setTexto(LinkedList texto) {
		this.texto = texto;
	}
	
	public void add(Palabra pal) {
		this.texto.add(pal);
	}

	@Override
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste {
		String traduccion = "";
		Palabra aux;
		Iterator it = this.texto.iterator();
		while(it.hasNext()) {
			aux = (Palabra)it.next();
			traduccion += aux.traduce(d).getPal();
		}
		return new Palabra(traduccion);
	}

	@Override
	public double precio(double precio) {
		double sum = 0;
		Iterator it = this.texto.iterator();
		while(it.hasNext()) {
			it.next();
			sum += precio;
		}
		return sum;
	}
}
