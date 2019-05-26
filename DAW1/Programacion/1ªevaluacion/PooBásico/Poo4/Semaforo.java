
public class Semaforo {
	
	String nombre;
	String color;
	int orden;
	
	
	//CONSTRUCTORES
	public Semaforo() {
		System.out.println("Introduce nombre del semáforo: ");
		this.nombre=InputData.nextLine();
		System.out.println("Introduce un color (rojo,ambar,verde): ");
		this.color=InputData.nextLine();
		
		if (this.color.equals("rojo")) 
		{
			this.orden=1;			
		}else 
		{ 
			if(this.color.equals("verde"))
			{
				this.orden=3;
			}else 
			{
				if (this.color.equals("ambar")) 
				{
					this.orden=2;
				}
			}
		}
	}
	
	
	//GETTERS & SETTERS
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
		
		if (this.color.equals("rojo")) 
		{
			this.orden=1;			
		}else 
		{ 
			if(this.color.equals("verde"))
			{
				this.orden=3;
			}else 
			{
				if (this.color.equals("ambar")) 
				{
					this.orden=2;
				}
			}
		}
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Semaforo [nombre=" + nombre + ", color=" + color + ", orden="
				+ orden + "]";
	}

	//CAMBIAR
	public void cambiarSemaforo() {
			
		if(this.orden==1)
		{
			this.setColor("verde");
		}else 
		{
			if(this.orden==3)
			{
				this.setColor("ambar");

			}else 
			{
				if(this.orden==2)
				{
					this.setColor("rojo");
				}
			}
		}
	}

	
	//IGUALES
	@Override
	public boolean equals(Object obj) {
		Semaforo s=(Semaforo)obj;
		boolean res;
		
		if(this.color==s.color)
		{
			res=true;
		}else
		{
			res=false;
		}
		return res;
	}
	

	//COMPARADOR
	public static String compararSemaforos(Semaforo t, Semaforo u, Semaforo v) {
		
		Semaforo a=(Semaforo)t;
		Semaforo b=(Semaforo)u;
		Semaforo c=(Semaforo)v;
		Semaforo m=(null);
		
		
		if(a.getOrden()<b.getOrden()) 
		{
			if(b.getOrden()<c.getOrden()) 
			{
			}else
			{
				m=b;
				b=c;
				c=m;
				if(a.getOrden()<b.getOrden())
				{
				}else 
				{
					m=a;
					a=b;
					b=m;
				}
			}
		}else 
		{
			m=a;
			a=b;
			b=m;
			if(b.getOrden()<c.getOrden()) 
			{
			}else
			{
				m=b;
				b=c;
				c=m;
				if(a.getOrden()<b.getOrden()) 
				{
				}else 
				{
					m=a;
					a=b;
					b=m;
				}
			}
		}
		return a.getNombre()+"<"+b.getNombre()+"<"+c.getNombre();
	}
	
	
}
