import java.util.*;

public class Grupo{
	
	private String curso;
	private SortedMap grupo;
	
	public Grupo(String curso) {
		this.curso = curso;
		this.grupo = new TreeMap();
	}
	
	public void add(String k, HorarioAsignatura v) {
		this.grupo.put(k,v);
	}
	
	public void add(String asignatura, DiaSemana d, Hora h) {
		try {
			if(this.contarHoras(asignatura) > 9) {
				throw new Ocupado();
			}
			HorarioAsignatura ha = (HorarioAsignatura)this.grupo.get(asignatura);
			if(ha != null) {
				
				ha.addHorarioAsignatura(d,h);
			}else {
				this.add(asignatura, new HorarioAsignatura(d, h));
			}
		}catch(Ocupado e) {
			System.out.println("Completo, no se puede añadir " + this.curso + "/" + asignatura + "/" + d + "/" + h.toString());
			return;
		}catch(DemasiadasHoras e) {
			DiaSemana n = d.next();
			System.out.println(this.curso + "/" + asignatura + "/" + d + "/" + h.toString() + " no entra, pasamos al " + n);
			this.add(asignatura, n, h);
		}
	}
	
	public int contarHoras(String asignatura) {
		int suma = 0;
		HorarioAsignatura ha = (HorarioAsignatura)this.grupo.get(asignatura);
		if(ha != null) {
			suma = ha.contarHoras();
		}
		return suma;
	}
	
	public String toString(String asignatura) {
		HorarioAsignatura a = (HorarioAsignatura)this.grupo.get(asignatura);
		if(a != null) {
			return asignatura + "\n" + a.toString();
		}
		return "No existe esa asignatura";
	}
		
	public String toString() {
		String s = this.curso + "\n" + "******" + "\n";
		String a;
		Set k = this.grupo.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			a = (String)it.next();
			s += a + "\n" + this.grupo.get(a).toString();
		}
		return s;
	}

	@Override
	public boolean equals(Object arg0) {
		Grupo g = (Grupo)arg0;
		Set gSet = this.grupo.keySet();
		Set pSet = g.grupo.keySet();
		return gSet.equals(pSet);
	}
}
