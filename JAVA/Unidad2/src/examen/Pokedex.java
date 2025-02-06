package examen;

import java.util.Scanner;
import java.util.Random;

public class Pokedex {

	public static void main(String[] args) {
		
		/*
		 * funcion imprimeMenu()
		 * {
		 * realizar menu
		 * }
		 * 
		 * funcion capturaPokemon()
		 * {
		 * String nombrePokemon (se guarda uno cada vez se deben de guardar para mostrar al final cuantos son)
		 * String nivelPokemon (igual que lo anterior)
		 * }
		 * 
		 * funcion realizarBatalla(int posPokemon, int posPokemonSistema)
		 * {
		 * totalBatallas = 0;
		 * ganadas = 0;
		 * perdidas = 0;
		 * empate = 0;
		 * comparar nivel de los pokemon
		 * if (posPokemon > posPokemonSistema)
		 * {
		 * 	ganadas +1
		 *  actualizarNivel(posPokemon);		 
		 * }
		 * elif (posPokemon < posPokemonSistema)
		 * {perdidas +1}
		 * 
		 * else {empate +1}
		 * }
		 * 
		 * actualizarNivel()
		 * {sumar nivel pokemon por posicion dada}
		 * 
		 * mostrarPokédex()
		 * {
		 * lista ordenada de total pokemon
		 * }
		 * 
		 * mediaNivel(listaNivelPokemon)
		 * {media = media de los niveles de los pokemons}
		 * 
		 * historialBatallas(listapokemon, mediaNivel, totalBatallas)
		 * {}
		 * 
		 * funciones de validar pokedex no mas de 15
		 * */
		
		Pokedex f = new Pokedex();
		Scanner sc = new Scanner(System.in);
		Random aleatorioP = new Random();
		f.imprimeMenú();
		System.out.print("Indica una opción: ");
		int opcion = sc.nextInt();
		
		while (opcion < 5) {
            switch (opcion) {
                case 1:
                	String [] nombres = f.nombrePokemon(sc);
                	int [] nivel = f.nivelPokemon(sc);
                 	f.imprimeMenú();
                 	opcion = sc.nextInt();
                    break;
                case 2:
                	//combate = f.realizarBatalla(aleatorioP);
                	
                	// poner menu en demas opciones
                	f.imprimeMenú();
                 	opcion = sc.nextInt();
                    break;
                   
                case 3:
                	//pokedex = f.mostrarPokedex(); 
                	
                	f.imprimeMenú();
                 	opcion = sc.nextInt();
                	break;
                
                case 4:
                	//partida = f.historialBatallas();
                	
                	f.imprimeMenú();
                 	opcion = sc.nextInt();
                	break;
                    
                default:
                    System.out.println("Elige una opción válida");
                    f.imprimeMenú();
                	System.out.print("Indica una opción: ");
                    opcion = sc.nextInt();
            }
        }

        if (opcion == 5) {
            System.out.println("Saliendo del juego");
        }
	}
	
	 void imprimeMenú() {
	        System.out.println("Bienvenido a su Pokédex, que desea realizar: ");
	        System.out.println("1. Capturar Pokemon");
	        System.out.println("2. Realizar Batalla");
	        System.out.println("3. Mostrar Pokédex");
	        System.out.println("4. Finalizar");
	    }
	 
	 
	 String[] nombrePokemon(Scanner sc)
	 {
		 System.out.print("Indica el nombre de tu pokemon: ");
		 String nombre = sc.next();	
		 String[] nombresPokemon = {nombre}; 
		 return nombresPokemon;
	 }
	 
	 int [] nivelPokemon(Scanner sc)
	 {
		 System.out.print("¿Cuál es su nivel?: ");
		 int nivel= sc.nextInt();
		 int [] nivelPokemon = {nivel};
		 return nivelPokemon;
	 }
	 
	 int posicionPokemon(String [] nombres, int [] niveles)
	 {
		 int usuPokemon = 0;
		 System.out.println("Que pokemon desea utilizar: ");
		 
		 return  usuPokemon;
	 }
	 
	 int mediaPokemon (int [] nivel)
	 {
		 int mediaNivel = 0;
		 
		 
		 
		 return mediaNivel;
	 }
}
