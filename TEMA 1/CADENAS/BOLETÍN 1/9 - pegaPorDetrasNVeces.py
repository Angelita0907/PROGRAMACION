#  Modifica el ejercicio anterior para que ahora te pida el número, el número a poner 
# por el final y el número de veces que quiero que lo ponga.

numeros = input("Introduce cadena de números: ")
pegarDt = input("Indica números para añadir: ")
repetir = int(input("Cuantas veces quieres añadir ese número: "))


totalpegaDt = numeros + (pegarDt * repetir)

print("La cadena final es:",totalpegaDt)

# lo mismo pero con for
for i in range(0, repetir):
    numeros = numeros+pegarDt

print(numeros)