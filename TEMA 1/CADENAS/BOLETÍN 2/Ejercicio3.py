# Crea una programa que tenga o muestre un mensaje para elegir las siguientes opciones:
# a) Escribir por pantalla cada carácter de una cadena introducida por teclado.
# b) Contar el % de veces que aparece un carácter que se ha introducido por teclado. 

mensaje = input("Escribe un mensaje: ")
print("¿Qué opción desea realizar?")
print("1. Escribir por pantalla cada carácter de una cadena por teclado")
print("2. Contar el % de veces que aparece un carácter que se introduce por teclado")
opciones = int(input("Indique que opción desea: "))
contador = 0

if opciones == 1:
    for i in mensaje:
        print(i)

elif opciones == 2:
    buscar = input("¿Que caracter deseas buscar? ")
    for c in mensaje:
        if c == buscar:
            contador+=1
    print("En", mensaje, "la letra", buscar, "aparece un", contador*100/len(mensaje),"%" ,"de veces")