
public class prueba {

	public static void main(String[] args) {

		//PROGRAMACION
		HorarioSemana horarioProgramacion = new HorarioSemana();
		horarioProgramacion.addHora(DiaSemana.Lunes, new Tiempo(8,30));
		horarioProgramacion.addHora(DiaSemana.Lunes, new Tiempo(9,25));
		horarioProgramacion.addHora(DiaSemana.Miercoles, new Tiempo(11,40));
		horarioProgramacion.addHora(DiaSemana.Miercoles, new Tiempo(12,35));
		horarioProgramacion.addHora(DiaSemana.Jueves, new Tiempo(11,40));
		horarioProgramacion.addHora(DiaSemana.Jueves, new Tiempo(12,35));
		horarioProgramacion.addHora(DiaSemana.Viernes, new Tiempo(10,20));
		horarioProgramacion.addHora(DiaSemana.Viernes, new Tiempo(11,40));
		
		//LENGUAJE DE MARCAS
		HorarioSemana horarioMarcas = new HorarioSemana();
		horarioMarcas.addHora(DiaSemana.Lunes, new Tiempo(10,20));
		horarioMarcas.addHora(DiaSemana.Martes, new Tiempo(12,35));
		horarioMarcas.addHora(DiaSemana.Martes, new Tiempo(13,30));
		horarioMarcas.addHora(DiaSemana.Miercoles, new Tiempo(10,20));
		
		//BASES DE DATOS
		HorarioSemana horarioBases = new HorarioSemana();
		horarioBases.addHora(DiaSemana.Lunes, new Tiempo(11,40));
		horarioBases.addHora(DiaSemana.Lunes, new Tiempo(12,35));
		horarioBases.addHora(DiaSemana.Martes, new Tiempo(9,25));
		horarioBases.addHora(DiaSemana.Miercoles, new Tiempo(8,30));
		horarioBases.addHora(DiaSemana.Jueves, new Tiempo(11,40));
		horarioBases.addHora(DiaSemana.Viernes, new Tiempo(8,30));
		
		//SISTEMAS INFORMATICOS
		HorarioSemana horarioSistemas = new HorarioSemana();
		horarioSistemas.addHora(DiaSemana.Lunes, new Tiempo(13,30));
		horarioSistemas.addHora(DiaSemana.Martes, new Tiempo(10,20));
		horarioSistemas.addHora(DiaSemana.Martes, new Tiempo(11,40));
		horarioSistemas.addHora(DiaSemana.Jueves, new Tiempo(10,20));
		horarioSistemas.addHora(DiaSemana.Viernes, new Tiempo(12,35));
		horarioSistemas.addHora(DiaSemana.Viernes, new Tiempo(13,30));
		
		//ENTORNOS DE DESARROLLO
		HorarioSemana horarioEntornos = new HorarioSemana();
		horarioEntornos.addHora(DiaSemana.Martes, new Tiempo(8,30));
		horarioEntornos.addHora(DiaSemana.Miercoles, new Tiempo(9,25));
		horarioEntornos.addHora(DiaSemana.Jueves, new Tiempo(8,30));
		
		//FORMACION Y ORIENTACION LABORAL
		HorarioSemana horarioFol = new HorarioSemana();
		horarioFol.addHora(DiaSemana.Miercoles, new Tiempo(13,30));
		horarioFol.addHora(DiaSemana.Jueves, new Tiempo(9,25));
		horarioFol.addHora(DiaSemana.Viernes, new Tiempo(9,25));
		
		Programa p = new Programa();
		p.add("Programacion",horarioProgramacion);
		p.add("Lenguaje de Marcas",horarioMarcas);
		p.add("Bases de datos",horarioBases);
		p.add("Sistemas informáticos",horarioSistemas);
		p.add("Entornos de desarrollo",horarioEntornos);
		p.add("Formación y orientación laboral",horarioFol);
		
		System.out.println(p);

	}

}
