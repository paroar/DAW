
public class Fraccion {
	
	int numerador;
	int denominador;
	
	
	//CONSTRUCTORES
	public Fraccion() {
		
	}
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//INPUT FRACCION
	public void readFraction() {
		
		int numerador;
		int denominador;
		
		System.out.println("Introduce numerador y denominador: ");
		numerador=InputData.nextInt();
		denominador=InputData.nextInt();
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	//GETTERS & SETTERS
	public void setNumerador(int numerador) {
		this.numerador=numerador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador=denominador;
	}
	
	public int getNumerador() {
		return this.numerador;
	}
	
	public int getDenominador() {
		return this.denominador;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", "
				+ "denominador=" + denominador + "]";
	}
	
	//SUMA FRACCIONES
	public void sumaDosFracciones(Fraccion t, Fraccion u) {
		this.numerador=t.numerador*u.denominador+t.denominador*u.numerador;
		this.denominador=t.denominador*u.denominador;
	}
	
	
	//SIMPLIFICAR FRACCION
	public void simplificarFraccion(Fraccion t) {
		int divisor;
		
		divisor=2;
		while(divisor<=this.numerador && divisor<=this.denominador) {
			if(this.numerador%divisor==0 && this.denominador%divisor==0) {
				this.numerador=this.numerador/divisor;
				this.denominador=this.denominador/divisor;
			}else {
				divisor=divisor+1;
			}
		}
	}

	//IGUALES
	@Override
	public boolean equals(Object obj) {
		boolean res;
		Fraccion t=(Fraccion)obj;
		
		if(this.numerador/(double)this.denominador==t.numerador/(double)t.denominador) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
	
	

}
