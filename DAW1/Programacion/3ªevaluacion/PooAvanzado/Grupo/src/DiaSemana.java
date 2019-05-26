
public enum DiaSemana {
	Lunes,Martes,Miercoles,Jueves,Viernes;
	
	public DiaSemana next() {
		switch(this) {
			case Lunes: 
				return Martes;
			case Martes: 
				return Miercoles;
			case Miercoles: 
				return Jueves;
			case Jueves: 
				return Viernes;
			case Viernes: 
				return Lunes;
		}
		return null;
	}
}
