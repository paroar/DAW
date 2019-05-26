import java.util.*;

/**
 * 
 * @author paroar
 *
 */
public class Diccionario {

	private TreeMap dicc;
	
	public Diccionario() {
		this.dicc = new TreeMap();
	}
	
	public TreeMap getDic() {
		return this.dicc;
	}

	/**
	 * 
	 * @param clave. Añade una clave al diccionario
	 * @param valor. Añade un valor al diccionario
	 */
	public void add(Palabra clave, Palabra valor) {
		this.dicc.put(clave,valor);
	}
	
	
}
