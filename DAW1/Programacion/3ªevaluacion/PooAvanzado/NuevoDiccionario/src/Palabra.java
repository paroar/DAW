
public class Palabra implements Traducible,Comparable{

	private String pal;
	
	public Palabra(String pal) {
		this.pal = pal;
	}
	
	public String getPal() {
		return this.pal;
	}
	
	public void setPal(String pal) {
		this.pal = pal;
	}
	
	@Override
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste {
		Palabra pal = (Palabra)d.getDic().get(this);
		if(pal == null) {
			throw new ExcepcionPalabraNoExiste();
		}else {
			return pal;
		}
	}

	@Override
	public double precio(double precio) {
		return precio;
	}

	@Override
	public int compareTo(Object arg0) {
		Palabra pal = (Palabra)arg0;
		return this.getPal().compareTo(pal.getPal());
	}
	
	public String toString() {
		return this.pal;
	}
	
	
	
	
}
