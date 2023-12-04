package ar.edu.unlam.pb2.timer;

import java.time.LocalDate;
import java.time.LocalTime;

public class PruebaTimer {

	public static void main(String[] args) {
		LocalTime horaFin = null;
		LocalTime tiempoTotal = null;
		LocalTime horaInico = null;
		Timer cronometro= new Timer(horaInico, horaFin);
		
		cronometro.setHoraInicio(horaInico);//1639
		System.out.println("Hora de Inicio: "+cronometro.getHoraInicio());
		javax.swing.Timer.setLogTimers(true);
		
		cronometro.calcularTiempo();
		System.out.println("Hora de fin: "+cronometro.getHoraFin());
		System.out.println("Tiempo transcurrido: "+cronometro.getTiempoTotal());
		

	}

}
