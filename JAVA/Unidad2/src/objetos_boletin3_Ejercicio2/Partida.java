package objetos_boletin3_Ejercicio2;

import java.util.Arrays;

public class Partida {
	
	/*
	 *String nombreJuego
	 *Participantes [] participantes
	 *String ganador
	 *
	 *Metodos:
	 *String calculaJugadorGanador()
	 * */
	
	String nombreJuego;
	Participante [] participantes;
	Participante ganador;
	
	
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



	private int  calculaJugadorGanador()
	{
		int puntosGanador = 0;
		for (Participante p: this.participantes)
		{
			if(puntosGanador < p.puntuacion)
			{
				puntosGanador = p.puntuacion;
			}
		}
		
		return puntosGanador;
	}

	void imprimeGanador() 
	{
		int puntosGanador = calculaJugadorGanador();
		String nombreGanador;
		for (Participante p: this.participantes)
		{
			if(puntosGanador == p.puntuacion)
			{
				nombreGanador = p.nombre;
				System.out.println(nombreGanador);
			}
		}
	}
	
}