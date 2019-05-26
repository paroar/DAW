
public class Palabra implements Traducible,Comparable<Palabra>{

	private String pal;
	
	public Palabra() {
		
	}
	
	public Palabra(String pal) {
		this.pal = pal;
	}
	
	
	
	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public double precio(Preciator c, double $) {
		return c.precio(this, $);
	}
	
	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste{
		Palabra p = (Palabra)d.getPares().get(this);
		if(p == null) {
			throw new ExcepcionPalabraNoExiste(this.pal + " no existe en el diccionario");
		}
		return p;
	}

	@Override
	public int compareTo(Palabra p) {
		return this.pal.compareTo(p.pal);
	}
	
	public String toString() {
		return this.pal;
	}

}
