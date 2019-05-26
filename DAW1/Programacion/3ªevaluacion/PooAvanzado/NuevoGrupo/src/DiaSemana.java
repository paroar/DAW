
public enum DiaSemana {

	L,M,X,J,V;
	
	public DiaSemana getSig() {
		switch(this) {
		case L: return M;
		case M: return X;
		case X: return J;
		case J: return V;
		default: return null;
		}
	}
}
