
public class Hora implements Comparable{

	private int h;
	private int m;
	
	public Hora(int h, int m) {
		this.h = h;
		this.m = m;
	}
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	@Override
	public int compareTo(Object arg0) {
		Hora h = (Hora)arg0;
		if(this.h > h.h) {
			return 1;
		}else if(this.h < h.h) {
			return -1;
		}else if(this.m > h.m) {
			return 1;
		}else if(this.m < h.m) {
			return -1;
		}
		return 0;
	}
	
	
	
	
}
