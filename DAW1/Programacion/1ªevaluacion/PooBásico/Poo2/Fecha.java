
public class Fecha {
	
	int a�o;
	int mes;
	int dia;
	boolean validez;
	
	
	//CONSTRUCTORES
	public Fecha(int a�o, int mes, int dia) {
		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;
	}
	
	public Fecha() {
		
	}
	
	
	//GETTERS & SETTERS
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	//EQUALS & TOSTRING
	@Override
	public boolean equals(Object arg0) {
		boolean res;
		Fecha t=(Fecha)arg0;
		if(this.dia==t.dia && this.mes==t.mes && this.a�o==t.a�o) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}

	@Override
	public String toString() {
		return a�o+"/"+mes+"/"+dia;
	} 
	
	
	//VALIDAR FECHA
	public void validarFecha(Fecha t) {

		int dia;
		int mes;
		int a�o;
		dia=0;
		mes=0;
		a�o=0;
		
		System.out.println("Introduce a�o");
		a�o=InputData.nextInt();
		System.out.println("Introduce mes");
		mes=InputData.nextInt();
		
		while(mes<1 || mes>12) 
		{
			System.out.println("Mes no v�lido, introduce otra vez el mes");
			mes=InputData.nextInt();
		}
		
		if(mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 ||mes==10 ||mes==12)
		{
			System.out.println("Introduce el d�a");
			dia=InputData.nextInt();
			while(dia<1 || dia>31) 
			{
				System.out.println("Introduce un d�a v�lido");
				dia=InputData.nextInt();
			}
		}else 
		{
			if(mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 ||mes==10 ||mes==12)
			{
				System.out.println("Introduce el d�a");
				dia=InputData.nextInt();
				while(dia<1 || dia>30) 
				{
					System.out.println("Introduce un d�a v�lido");
					dia=InputData.nextInt();
				}
			}else 
			{
				if((a�o%4==0) && (a�o%100!=0 || a�o%400==0)) 
				{
					System.out.println("Introduce el d�a");
					dia=InputData.nextInt();
					while(dia<1 || dia>29) 
					{
						System.out.println("Introduce un d�a v�lido");
						dia=InputData.nextInt();
					}
				}else 
				{
					System.out.println("Introduce el d�a");
					dia=InputData.nextInt();
					while(dia<1 || dia>28) 
					{
						System.out.println("Introduce un d�a v�lido");
						dia=InputData.nextInt();
					}
				}
			}
		}
		
		this.a�o=a�o;
		this.mes=mes;
		this.dia=dia;
	}
	
	
	//COMPARADOR
	public String compararDosFechas(Object obj) {
		Fecha t=(Fecha)obj;
		String res;
		res="";
		
		if(this.a�o==t.a�o) 
		{
			if(this.mes==t.mes) 
			{
				if(this.dia==t.dia) 
				{
					res=this+" y "+t+" son iguales";
				}else 
				{
					if(this.dia>t.dia) 
					{
						res=this+" es mayor que "+t;
					}else 
					{
						res=this+" es menor que "+t;
					}
				}
			}else 
			{
				if(this.mes>t.mes) 
				{
					res=this+" es mayor que "+t;
				}else 
				{
					res=this+" es menor que "+t;
				}		
			}	
		}else {
			if(this.a�o>t.a�o) 
			{
				res=this+" es mayor que "+t;
			}else 
			{
				res=this+" es menor que "+t;
			}
		}
		return res;
	}
}
