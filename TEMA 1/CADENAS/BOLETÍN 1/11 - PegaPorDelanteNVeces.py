# como el nueve pero con el 10

numeros = input("Introduce cadena de números: ")
pegarDl = input("Indica números para añadir: ")
repetir = int(input("Cuantas veces quieres añadir ese número: "))


totalpegaDl = (repetir*pegarDl) + numeros

print("La cadena final es:",totalpegaDl)

#Lo mismo pero con for
for i in range(repetir):
    numeros = pegarDl + numeros
print(numeros)