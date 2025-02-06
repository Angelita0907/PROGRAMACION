# Casa Rural. En la siguiente tabla se muestra el número de camas de las habitaciones 
# de una casa rural, además de la planta donde está ubicada cada una de ellas.

habitación = int(input("Introduce un número de habitación: "))

while habitación != 0:
    match habitación:
        case 1:
            print("La habitación azul está en la primera planta y tiene 2 camas")
        case 2:
            print("La habitación rojo está en la primera planta y tiene 1 camas")
        case 3:
            print("La habitación verde está en la segunda planta y tiene 3 camas")
        case 4:
            print("La habitación rosa está en la segunda planta y tiene 2 camas")
        case 5:
            print("La habitación gris está en la tercera planta y tiene 1 camas")
    habitación = int(input("Introduce un número de habitación: "))
