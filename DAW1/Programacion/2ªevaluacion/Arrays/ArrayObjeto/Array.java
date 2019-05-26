
public class Array {

	private int n;
	private int[] a;
	
	public Array() {
		n = 0;
		a = new int[0];
	}
	
	public Array(int[] a, int n) {
		this.n = n;
		this.a = a;
	}
	
	public int getN() {
		return this.n;
	}
	
	public int getA(int i) {
		return this.a[i];
	}
	
	public int[] getArray() {
		return this.a;
	}
	
	public String toString() {
		String salida = "";
		int i = 0;
		while(i<this.n) {
			salida += ""+this.a[i]+" ";
			i++;
		}
		return salida;
	}
	
	public void insertarPorFinal(int dato) {
		if(this.n<a.length) {
			this.a[this.n] = dato;
			this.n++;
		}else {
			int[] b = new int[this.n+1];
			for(int i = 0; i<this.n; i++) {
				 b[i] = this.a[i];
			}
			this.a = b;
			this.a[this.n] = dato;
			this.n++;
		}
	}

	public void insertarPorPrincipio(int dato) {
		if(this.n<a.length) {
			for(int i = this.n; i>0; i--) {
				this.a[i+1] = this.a[i-1];
			}
			this.a[0] = dato;
			this.n++;
		}else {
			int[] b = new int[this.n+1];
			for(int i = 0; i<this.n; i++) {
				b[i] = this.a[i];
			}
			this.a = b;
			for(int i = this.n; i>0; i--) {
				this.a[i] = this.a[i-1];
			}
			this.a[0] = dato;
			this.n++;
		}
	}
	
	public void borrarPorFinal() {
		this.n--;
	}
	
	public void borrarPosicion(int k) {
		while(k < this.n) {
			this.a[k-1] = this.a[k];
			k++;
		}
		this.n--;
	}
	
	public int busquedaSecuencial(int dato) {
		int pos = -1;
		int i = 0;
		while(i < this.n) {
			if(dato == this.a[i]) {
				pos = i;
			}
			i++;
		}
		return pos;
	}
	
	public int busquedaCentinela(int dato) {
		this.insertarPorFinal(dato);
		int pos = -1;
		int i = 0;
		while(i < this.n) {
			if(dato == this.a[i]) {
				pos = i;
				this.borrarPorFinal();
				return pos;
			}
			i++;
		}
		this.borrarPorFinal();
		return pos;
	}
	
	public void ordenarSelecciónDirecta() {
		int menor;
		int j = 0;
		int i = 1;
		while(j < this.n) {
			menor = this.a[j];
			while(i<this.n) {
				if(menor>this.a[i]) {
					menor = this.a[i];
					this.a[i] = this.a[j];
					this.a[j] = menor;
				}
				i++;
			}
			j++;
			i = j+1;
		}
	}
	
	public void ordenarInserción() {
		int aux;
		int j = 1;
		int k;
		while(j < this.n) {
			if(this.a[j] < this.a[j-1]) {
				k = j;
				while(k != 0 && this.a[k] < this.a[k-1]) {
					aux = a[k-1];
					this.a[k-1] = this.a[k];
					this.a[k] = aux;
					k--;
				}
			}
			j++;
		}
	}
	
	public void ordenarIntercambio() {
		int aux;		
		int i = 0;
		while(i < this.n) {
			int j = i + 1;
			while(j < this.n) {
				if(this.a[j] < this.a[i]) {
					aux = this.a[j];
					this.a[j] = this.a[i];
					this.a[i] = aux;
				}
				j++;
			}
			i++;

		}
	}
	
	public void ordenarBurbuja() {
		boolean repetir = true;
		int k = this.n;
		int aux;
		while(0 < this.n && repetir) {
			repetir = false;
			int i = 0;
			while(i < (this.n-1)) {
			    if(this.a[i] > this.a[i+1]) {
			    	aux = this.a[i];
			    	this.a[i] = this.a[i+1];
			    	this.a[i+1] = aux;
			    	repetir = true;
			    }
			    i++;
			}
			k--;
		}
	}
	
	
}
