"""
Ángela Chica Montero

Apartado 1
    funcion imprime menu()
    devuelve menu hasta que se indique letra S

    funcion iniciar partida()
        situar 10 barcos por el sistema en lista
    devuelve partidaInicio

    funcion disparar()
        usa funcion anterior para jugar
    devuelve barcosHundidos

    funcion resultadoActual()
    devuelve nuemero disparos, barcos hundidos, sin hundir, puntuacionActual

Apartado 2
    funcion historial de disparos
    devuelve posiciones diaparadas
"""
import random

def imprimeMenu():
    print("---------- HUNDIR LA FLOTA ----------")
    print("I -- Iniciar partida")
    print("D -- Disparar")
    print("R -- Imprime resultado actual")
    print("S -- Salir")
    opcion = input("Indique que opción desea realizar: ").upper()
    while not(opcion== "I" or opcion== "D" or opcion== "R" or opcion== "S"):
        print("---------- HUNDIR LA FLOTA ----------")
        print("I -- Iniciar partida")
        print("D -- Disparar")
        print("R -- Imprime resultado actual")
        print("S -- Salir")
        opcion = input("Indique que opción desea realizar: ").upper()
    
    return opcion

def iniciarPartida():
    
    for j in range (0,10):
        barcos.append(random.randint(0,50))
        for i in range (0,50):
            tablero.append(" ")

        
    #for barco in range(len(tablero)):
        #tablero.append(random.randint(0,10))

    print(tablero)

    return

def disparar():
    disparo = int(input("Indica que posición deseas atacar (0 a 49): "))

    if disparo in tablero:
        print("¡Tocado y Hundido! Has acertado en la posición: ", disparo)
    
    else:
        print("¡Agua! No había barco en la posición: ", disparo)

    return disparo

def imprimirResultado():
    BarcosHundidos = 0
    totalDisparos = 0
    
    disparos = disparar()

    for i in disparos:
        totalDisparos+=1
    
    
    resultado = (BarcosHundidos/totalDisparos)*100

    print("El estado actual de la partida es:")
    print(totalDisparos, "disparos realizados,", BarcosHundidos," barcos hundidos,", " barcos sin hundir")
    print("Puntuación actual: ", resultado)


    return 

tablero = []
barcos = []

opcion =""
while opcion !="S":
    opcion = imprimeMenu()
    match opcion:
        case "I":
            print(iniciarPartida())
            
        case "D":
            print(disparar())
        
        case "R":
            print(imprimirResultado())
        
        case "S":
            print("Salir")