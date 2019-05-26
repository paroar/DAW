
public class Prueba {

	public static void main(String[] args) {

		Diccionario d = new Diccionario();
		d.add(new Palabra("Hola"), new Palabra("Hello"));
		d.add(new Palabra("Adios"), new Palabra("Goodbye"));
		
		Palabra pal = new Palabra("Hola");
		
		try {
			System.out.println(pal.traduce(d));
		} catch (ExcepcionPalabraNoExiste e) {
			e.printStackTrace();
		}
		
		Texto tex = new Texto();
		tex.add(new Palabra("Hola"));
		tex.add(new Palabra("Adios"));
		
		try {
			System.out.println(tex.traduce(d));
		} catch (ExcepcionPalabraNoExiste e) {
			e.printStackTrace();
		}
		
		Libro lib = new Libro();
		lib.addTexto(tex);
		lib.addTexto(tex);
		
		try {
			System.out.println(lib.traduce(d));
		} catch (ExcepcionPalabraNoExiste e) {
			e.printStackTrace();
		}
	}

}
