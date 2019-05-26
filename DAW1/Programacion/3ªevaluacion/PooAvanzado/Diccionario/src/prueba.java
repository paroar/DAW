
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diccionario espIng = new Diccionario();
		espIng.add(new Palabra("hola"), new Palabra("hello"));
		espIng.add(new Palabra("adios"), new Palabra("bye"));
		espIng.add(new Palabra("y"), new Palabra("and"));
		espIng.add(new Palabra("dia"), new Palabra("day"));
		espIng.add(new Palabra("noche"), new Palabra("night"));
		
		/*System.out.println(espIng);*/
		
		Texto texto = new Texto();
		texto.add(new Palabra("hola"));
		texto.add(new Palabra("y"));
		texto.add(new Palabra ("adios"));
		/*System.out.println(texto);
		Palabra p = texto.traduce(espIng);
		System.out.println(p);*/
		
		Texto texto2 = new Texto();
		texto2.add(new Palabra("dia"));
		texto2.add(new Palabra("y"));
		texto2.add(new Palabra ("noche"));
		/*System.out.println(texto2);
		Palabra p2 = texto2.traduce(espIng);
		System.out.println(p2);*/
		
		Libro libro = new Libro();
		libro.add(texto);
		libro.add(texto2);
		System.out.println(libro);
		try {
			Palabra lib;
			lib = libro.traduce(espIng);
			System.out.println(lib);
		} catch (ExcepcionPalabraNoExiste e) {
			System.out.println(e.getMessage());
		}
		Preciator p = new PrecioPorPalabra();
		System.out.println(libro.precio(p, 0.12));
				
	}

}
