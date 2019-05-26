
public class Punto{

	private int x;
	private int y;
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public double distancia() {
		double distancia;
		distancia = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		return distancia;
	}
	
	public boolean equals(Object o) {
		Punto p = (Punto) o;
		if(this.x == p.x && this.y == p.y) {
			return true;
		}else {
			return false;
		}
	}
	
	public int compareTo(Object o) {
		Punto p = (Punto) o;
		if(this.distancia() == p.distancia()) {
			return 0;
		}else if(this.distancia() > p.distancia()){
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
}
