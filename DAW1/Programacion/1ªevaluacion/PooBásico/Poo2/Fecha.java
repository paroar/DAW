
public class Fecha {
	
	int año;
	int mes;
	int dia;
	boolean validez;
	
	
	//CONSTRUCTORES
	public Fecha(int año, int mes, int dia) {
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	
	public Fecha() {
		
	}
	
	
	//GETTERS & SETTERS
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		if(this.dia==t.dia && this.mes==t.mes && this.año==t.año) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}

	@Override
	public String toString() {
		return año+"/"+mes+"/"+dia;
	} 
	
	
	//VALIDAR FECHA
	public void validarFecha(Fecha t) {

		int dia;
		int mes;
		int año;
		dia=0;
		mes=0;
		año=0;
		
		System.out.println("Introduce año");
		año=InputData.nextInt();
		System.out.println("Introduce mes");
		mes=InputData.nextInt();
		
		while(mes<1 || mes>12) 
		{
			System.out.println("Mes no válido, introduce otra vez el mes");
			mes=InputData.nextInt();
		}
		
		if(mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 ||mes==10 ||mes==12)
		{
			System.out.println("Introduce el día");
			dia=InputData.nextInt();
			while(dia<1 || dia>31) 
			{
				System.out.println("Introduce un día válido");
				dia=InputData.nextInt();
			}
		}else 
		{
			if(mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 ||mes==10 ||mes==12)
			{
				System.out.println("Introduce el día");
				dia=InputData.nextInt();
				while(dia<1 || dia>30) 
				{
					System.out.println("Introduce un día válido");
					dia=InputData.nextInt();
				}
			}else 
			{
				if((año%4==0) && (año%100!=0 || año%400==0)) 
				{
					System.out.println("Introduce el día");
					dia=InputData.nextInt();
					while(dia<1 || dia>29) 
					{
						System.out.println("Introduce un día válido");
						dia=InputData.nextInt();
					}
				}else 
				{
					System.out.println("Introduce el día");
					dia=InputData.nextInt();
					while(dia<1 || dia>28) 
					{
						System.out.println("Introduce un día válido");
						dia=InputData.nextInt();
					}
				}
			}
		}
		
		this.año=año;
		this.mes=mes;
		this.dia=dia;
	}
	
	
	//COMPARADOR
	public String compararDosFechas(Object obj) {
		Fecha t=(Fecha)obj;
		String res;
		res="";
		
		if(this.año==t.año) 
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
			if(this.año>t.año) 
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
