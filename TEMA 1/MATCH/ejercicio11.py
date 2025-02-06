# De igual manera, partiendo del código del ejercicio 8, modifica el 
# código para que se jueguen 3 partidas. Si tras esas tres partidas, 
# no hay ganador, se pregunte si se desea seguir jugando.

apuestaHumamno = input("PIEDRA, PAPEL o TIJERAS: ").upper()

import random
apuestaMaquina = random.randint(0,2)

ganador = False

puntHum = 0
puntMq = 0

match apuestaMaquina:
    case 0:
        maquina = "PIEDRA"
    case 1:
        maquina = "PAPEL"
    case 2:
        maquina = "TIJERA"

while not ganador:
    print("El usuario elige: ", apuestaHumamno)
    print("La máquina elige: ", maquina)

    match apuestaHumamno:
        case "PIEDRA":
            if maquina == "PIEDRA":
                print("Empate")
            elif maquina == "PAPEL":
                puntHum += 1
                print("Usuario gana")
            else:
                puntMq += 1
                print("Usuario pierde")
        case "PAPEL":
            if maquina == "PIEDRA":
                puntHum += 1
                print("Usuario gana")
            elif maquina == "TIJERA":
                puntMq += 1
                print("Usuario pierde")
            else:
                print("Empate")
        case "TIJERA":
            if maquina == "PIEDRA":
                puntMq += 1
                print("Usuario pierde")
            elif maquina == "PAPEL":
                puntHum += 1
                print("Usuario gana")
            else:
                print("Empate")

    if  puntHum ==3 or puntMq == 3:
        ganador = True
        if puntHum == 3:
            print("El ganador final es el Usuario")
        else:
            print("El ganador final es la Máquina")
    else:
        apuestaHumamno = input("PIEDRA, PAPEL o TIJERAS: ").upper()
        apuestaMaquina = random.randint(0,2)
    
    print("Puntuación usuario: ", puntHum, "Puntuación Máquina: ", puntMq)
