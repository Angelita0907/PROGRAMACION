# lo mismo que el 4 pero que ahoracomo acaba no como empieza

cadena = input("Introduce la cadena principal: ")
subcadena = input("Introduce la subcadena: ")

if len(subcadena) <= len(cadena):
    if cadena[len(cadena) - len(subcadena) : len(cadena)] == subcadena:
        print("La cadena", cadena, "acaba por ",subcadena)
    else:
        print("La cadena", cadena, "no acaba por",subcadena)
else:
    print("La subcadena es más larga que la cadena introducida")