package objetos_boletin3_Ejercicio2;

import java.util.Arrays;

public class Partida {

	/*
	 * String nombreJuego Participantes [] participantes String ganador
	 *
	 * Metodos: String calculaJugadorGanador()
	 */

	private String nombreJuego;
	private Participante[] participantes;
	private Participante ganador;

	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}

	public Partida(String nombreJuego, Participante[] participantes) {
		super();
		this.nombreJuego = nombreJuego;
		this.participantes = participantes;
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Partida nombreJuego: " + nombreJuego + ", participantes: " + Arrays.toString(participantes)
				+ ", ganador: " + ganador;
	}

	private int calculaJugadorGanador() {
		int puntosGanador = 0;
		for (Participante p : this.participantes) {
			if (puntosGanador < p.getPuntuacion()) {
				puntosGanador = p.getPuntuacion();
			}
		}

		return puntosGanador;
	}

	void imprimeGanador() {
		int puntosGanador = calculaJugadorGanador();
		String nombreGanador;
		for (Participante p : this.participantes) {
			if (puntosGanador == p.getPuntuacion()) {
				nombreGanador = p.getNombre();
				System.out.println(nombreGanador);
			}
		}
	}

}