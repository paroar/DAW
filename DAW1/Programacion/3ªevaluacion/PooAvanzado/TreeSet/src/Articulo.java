
public class Articulo implements Comparable<Articulo>{

	private int numero_articulo;
	private String descripcion;
	
	public Articulo(int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo-o.numero_articulo;
	}

	@Override
	public String toString() {
		return numero_articulo + " " + descripcion;
	}
	
	

}
