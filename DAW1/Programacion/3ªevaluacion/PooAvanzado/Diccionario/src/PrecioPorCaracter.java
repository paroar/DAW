
public class PrecioPorCaracter implements Preciator{

	@Override
	public double precio(Palabra p,double $) {
		int nChars = p.getPal().length();
		return nChars*$;
	}

}
