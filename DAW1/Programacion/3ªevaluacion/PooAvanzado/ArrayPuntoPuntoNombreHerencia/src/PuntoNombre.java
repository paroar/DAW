
public class PuntoNombre extends Punto {
	
	private String nombre;
	
	public PuntoNombre() {
		super();
		this.nombre = null;
	}

	public PuntoNombre(int x, int y, String nombre) {
		super(x, y);
		this.nombre = nombre;
	}
	
	public int get() {
		return super.getX();
	}
	
	public boolean equals(Object o) {
		PuntoNombre p = (PuntoNombre) o;
		if(super.equals(p) && this.nombre.equals(p.nombre)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int compareTo(Object o) {
		PuntoNombre p = (PuntoNombre) o;
		if(this.equals(p)) {
			return 0;
		}else if(super.equals(p) && this.nombre.compareTo(p.nombre) == 1) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return nombre + "=" + super.toString();
	}
	

}
