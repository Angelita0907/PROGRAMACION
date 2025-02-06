# Si tenemos una cadena con un nombre y apellidos, realizar un programa 
# que muestre las iniciales en mayúsculas.

nombre = input("Introduce un nombre y apellidos: ")

separacion = nombre.split()

for mayuscula in separacion:
# sumo la posición 0 que es la máyuscula y luego desde la 1 al final las concateno normales
    print(mayuscula[0].upper() + mayuscula[1:-1].lower() + mayuscula[-1].upper())


