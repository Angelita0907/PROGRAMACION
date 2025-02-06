# Realizar un programa que comprueba si una cadena leída por teclado comienza 
# por una subcadena introducida por teclado.

cadena = input("Introduce la cadena principal: ")
subcadena = input("Introduce la subcadena: ")

if len(subcadena) <= len(cadena):
    if cadena[:len(subcadena)] == subcadena:
        print("La cadena", cadena, "empieza por ",subcadena)
    else:
        print("La cadena", cadena, "no empieza por",subcadena)
else:
    print("La subcadena es más larga que la cadena introducida")

