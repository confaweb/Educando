package ar.edu.unlam.pb2.docente;

import ar.edu.unlam.pb2.competencia.Grado;
import ar.edu.unlam.pb2.interfaces.Competencia;

public class Docente implements Competencia {

	private String nombreDelDocente;
	private Integer dni;

	public Docente(String nombreDelDocente, Integer dni) {
		this.setNombreDelDocente(nombreDelDocente);
		this.dni = dni;
	}

	public String getNombreDelDocente() {
		return nombreDelDocente;
	}

	public void setNombreDelDocente(String nombreDelDocente) {
		this.nombreDelDocente = nombreDelDocente;

	}

	@Override
	public void agregarCompetencia(Grado grado) {
		// TODO Auto-generated method stub

	}

}
