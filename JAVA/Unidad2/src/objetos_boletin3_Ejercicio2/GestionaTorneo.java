package objetos_boletin3_Ejercicio2;

public class GestionaTorneo {

	public static void main(String[] args) {

		Participante part1 = new Participante("Mimi","Alberto",22,4);
		Participante part2 = new Participante("Lia","Carmen",19,7);
		Participante part3 = new Participante("Port","Nuñez",23,3);
		Participante part4 = new Participante("Angi","Ángela",25,8);

		
		Participante [] jugadores = {part1,part2,part3,part4};
		Partida juego1 = new Partida("Catán",jugadores);
		Partida juego2 = new Partida("Dixit",jugadores);
		Partida juego3 = new Partida("Carcassone",jugadores);
		
		juego1.imprimeGanador();
	}

}