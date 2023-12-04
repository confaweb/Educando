package ar.edu.unlam.pb2.timer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Timer {
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private long tiempoTotal;

	public Timer(LocalTime horaInicio,LocalTime horaFin) {
		this.horaInicio=horaInicio;
		this.horaFin=horaFin;
		this.tiempoTotal=tiempoTotal;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInico) {
		this.horaInicio = LocalTime.now();
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = LocalTime.now();
	}

	public long getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(long tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}
	public void calcularTiempo() {
		this.setHoraFin(horaFin);
		if (this.horaFin.isAfter(this.horaInicio))
		 tiempoTotal=ChronoUnit.MINUTES.between(horaFin, horaInicio);
		
	}

}
