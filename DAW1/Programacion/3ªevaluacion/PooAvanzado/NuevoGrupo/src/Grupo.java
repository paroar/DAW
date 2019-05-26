import java.util.Comparator;
import java.util.*;

public class Grupo {

	private String nombre;
	private TreeMap asignaturas;
	
	public Grupo(String nombre, Comparator c) {
		this.nombre = nombre;
		this.asignaturas = new TreeMap(c);
	}
	
	public void addAsignatura(String asignatura) {
		this.asignaturas.put(asignatura, new HorarioAsignatura());
	}
	
	public void addDia(String asignatura, DiaSemana dS) {
		HorarioAsignatura hA = (HorarioAsignatura)this.asignaturas.get(asignatura);
		if(hA != null) {
			hA.addDia(dS);
		}else {
			this.addAsignatura(asignatura);
			this.addDia(asignatura, dS);
		}
	}
	
	public void addHora(String asignatura, DiaSemana dS, Hora hora) {
		HorarioAsignatura hA = (HorarioAsignatura)this.asignaturas.get(asignatura);
		if(hA != null) {
			try {
				hA.addHora(dS, hora);
			}catch(DemasiadasHoras e) {
				System.out.println("El "+dS+" está completo, probando "+dS.getSig());
				dS = dS.getSig();
				if(dS != null) {
					this.addHora(asignatura, dS, hora);
				}else {
					return;
				}
			}
		}else {
			this.addAsignatura(asignatura);
			this.addDia(asignatura, dS);
			this.addHora(asignatura, dS, hora);
		}
	}
	
	public boolean equals(Object o) {
		Grupo grupo = (Grupo)o;
		Set s1 = (Set)this.asignaturas.keySet();
		Set s2 = (Set)grupo.asignaturas.keySet();
		return s1.equals(s2) && s2.equals(s1);
	}
	
	public String visualizarDias() {
		String s = "";
		String aux;
		HorarioAsignatura hA;
		Set k = this.asignaturas.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			aux = (String)it.next();
			hA = (HorarioAsignatura)this.asignaturas.get(aux);
			s += aux +" "+ hA.visualizarDias(); 
		}
		return s;
	}
	
	public String visualizarHorarioAsignatura(String asignatura) {
		String s = asignatura +" ";
		HorarioAsignatura hA = (HorarioAsignatura)this.asignaturas.get(asignatura);
		if(hA != null) {
			s += hA.visualizarHorarioAsignatura();
		}
		return s;
	}
	
	public class Test{
		private SortedMap<Test,Test> t;
		
		public Test() {
			this.t = new TreeMap<Test,Test>();
		}
	}
	
	
}
