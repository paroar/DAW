
public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l = new Libro("Novelas y fantas�as");
		Comparator comp = new CompararNumeroCapitulo();
		Capitulo c2 = new Capitulo("El olvido", 2, "�Sonr�es! exclam� tristemente...", 36);
		l.addOrdenado(c2, comp);
		Capitulo c1 = new Capitulo("�Cr�menes?", 1, "...Todo est� en calma...", 1);
		l.addOrdenado(c1, comp);
		System.out.println(l.imprimirCapitulo(4));
		System.out.println(l.imprimir());
	}

}
