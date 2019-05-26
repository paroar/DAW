import java.util.Comparator;

public class Prueba {

	public static void main(String[] args) {
		
		Comparator c = new CompararAlfabeticamente();
		Grupo g = new Grupo("DAW1",c);
		g.addHora("Programaci�n", DiaSemana.L, new Hora(8,30));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(9,25));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(10,20));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(11,15));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(11,16));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(11,17));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(11,18));
		g.addHora("Programaci�n", DiaSemana.L, new Hora(11,19));
		
		
		Grupo g2 = new Grupo("DAW2",c);
		g2.addAsignatura("Programaci�n");
		System.out.println(g.equals(g2));
		
		System.out.println(g.visualizarDias());
		System.out.println(g.visualizarHorarioAsignatura("Programaci�n"));
	}

}
