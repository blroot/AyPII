package Guia4.ej2;

public class Examen {
	
	private String fecha;
	private String nombreAlumno;
	private int numeroDeLegajo;
	private int nota;
	
	Examen(String nombreAlumno, String fecha, int numeroDeLegajo, int nota) 
			throws ErrorNotaInvalida, ErrorNumeroDeLegajo {

		this.setNota(nota);
		this.setNumeroDeLegajo(numeroDeLegajo);
		
		this.fecha = fecha;
		this.nombreAlumno = nombreAlumno;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	public void setNumeroDeLegajo(int numeroDeLegajo) throws ErrorNumeroDeLegajo {
		if (numeroDeLegajo < 10000 || numeroDeLegajo > 15000) {
			throw new ErrorNumeroDeLegajo();
		}
		this.numeroDeLegajo = numeroDeLegajo;
	}
	
	public void setNota(int nota) throws ErrorNotaInvalida {
		if (nota <= 0 || nota > 10) {
			throw new ErrorNotaInvalida();
		}
		this.nota = nota;
	}

}
