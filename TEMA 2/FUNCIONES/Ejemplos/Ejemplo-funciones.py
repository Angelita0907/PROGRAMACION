# programa que pida una cadena con longitud mínima de 4 y un numero
# si el número es multiplo de 2 --> calcule cadena con posicion 2 y 4 concatenando
#tantas veces como sea el número
# si es multiplo de 3 --> calcule cadena con posicion 1 y 2 concatenando tantas veces como 
#sea el numero
# si es multiplo de 7 calcile cadena con posicion 0 y 3 concatenando tantas veces el numero introducido

cadena = input("Introduce un texto: ")
numero = int(input("Indica un número: "))

longitud = len(cadena)
continuar = True

while continuar:

    if len(cadena) < 4:
        print("Vuelva a introducir la cadena.")
        cadena = input("Introduce un texto: ")
    else:
        continuar = False

if numero % 2 == 0 :
    resultado = (cadena[2]+cadena[4])*numero
    print("El resultado es: ",resultado)

elif numero % 3 == 0 :
    resultado = (cadena[1]+cadena[2])*numero
    print("El resultado es: ",resultado)

elif numero % 7 == 0 :
    resultado = (cadena[0]+cadena[3])*numero
    print("El resultado es: ",resultado)

