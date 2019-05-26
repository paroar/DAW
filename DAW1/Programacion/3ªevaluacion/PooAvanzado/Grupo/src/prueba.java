
public class prueba {

	public static void main(String[] args){

		Grupo p = new Grupo("1º DAW");
		
		//PROGRAMACION
		String programacion = "Programación";
		p.add(programacion, DiaSemana.Lunes, new Hora(8,30));
		p.add(programacion, DiaSemana.Lunes, new Hora(9,25));
		p.add(programacion, DiaSemana.Martes, new Hora(11,40));
		p.add(programacion, DiaSemana.Martes, new Hora(12,35));
		p.add(programacion, DiaSemana.Miercoles, new Hora(11,40));
		p.add(programacion, DiaSemana.Miercoles, new Hora(12,35));
		p.add(programacion, DiaSemana.Jueves, new Hora(12,30));
		p.add(programacion, DiaSemana.Jueves, new Hora(13,30));
		p.add(programacion, DiaSemana.Viernes, new Hora(10,20));
		p.add(programacion, DiaSemana.Viernes, new Hora(11,40));
		p.add(programacion, DiaSemana.Viernes, new Hora(19,40));
		
		//LENGUAJE DE MARCAS
		String marcas = "Marcas";
		p.add(marcas, DiaSemana.Lunes, new Hora(10,20));
		p.add(marcas, DiaSemana.Martes, new Hora(12,35));
		p.add(marcas, DiaSemana.Martes, new Hora(13,30));
		p.add(marcas, DiaSemana.Miercoles, new Hora(10,20));
		
		//BASES DE DATOS
		String bases = "Bases";
		p.add(bases, DiaSemana.Lunes, new Hora(11,40));
		p.add(bases, DiaSemana.Lunes, new Hora(12,35));
		p.add(bases, DiaSemana.Martes, new Hora(9,25));
		p.add(bases, DiaSemana.Miercoles, new Hora(8,30));
		p.add(bases, DiaSemana.Jueves, new Hora(11,40));
		p.add(bases, DiaSemana.Viernes, new Hora(8,30));
		
		//SISTEMAS INFORMATICOS
		String sistemas = "Sistemas";
		p.add(sistemas, DiaSemana.Lunes, new Hora(13,30));
		p.add(sistemas, DiaSemana.Martes, new Hora(10,20));
		p.add(sistemas, DiaSemana.Martes, new Hora(11,40));
		p.add(sistemas, DiaSemana.Jueves, new Hora(10,20));
		p.add(sistemas, DiaSemana.Viernes, new Hora(13,30));
		p.add(sistemas, DiaSemana.Viernes, new Hora(12,35));
		p.add(sistemas, DiaSemana.Viernes, new Hora(17,35));
		
		//ENTORNOS DE DESARROLLO
		String entornos = "Entornos";
		p.add(entornos, DiaSemana.Martes, new Hora(8,30));
		p.add(entornos, DiaSemana.Miercoles, new Hora(9,25));
		p.add(entornos, DiaSemana.Jueves, new Hora(8,30));
		
		//FORMACION Y ORIENTACION LABORAL
		String fol = "Fol";
		p.add(fol, DiaSemana.Miercoles, new Hora(13,30));
		p.add(fol, DiaSemana.Viernes, new Hora(9,25));
		p.add(fol, DiaSemana.Jueves, new Hora(9,25));

		System.out.println(p);
		System.out.println(p.toString("Fopl"));
		
		/*Grupo pp = new Grupo("2º DAW");
		pp.add(programacion, DiaSemana.Lunes, new Hora(8,30));
		pp.add(marcas, DiaSemana.Lunes, new Hora(10,20));
		pp.add(bases, DiaSemana.Lunes, new Hora(11,40));
		pp.add(sistemas, DiaSemana.Lunes, new Hora(13,30));
		pp.add(entornos, DiaSemana.Martes, new Hora(8,30));
		//pp.add(fol, DiaSemana.Miercoles, new Hora(13,30));
		
		System.out.println(p.equals(pp));*/
	}
}
