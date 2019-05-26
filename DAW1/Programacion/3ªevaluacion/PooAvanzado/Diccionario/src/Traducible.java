
public interface Traducible {

	public Palabra traduce(Diccionario d) throws ExcepcionPalabraNoExiste;
	public double precio(Preciator c, double $);	
}
