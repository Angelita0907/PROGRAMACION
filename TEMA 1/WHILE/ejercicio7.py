# Crea un programa que seleccione un número aleatorio y el usuario debe adivinarlo. 
# El bucle while se ejecuta hasta que el usuario adivine correctamente.

import random
numM=  random.randint(1, 10)
numH = int(input("Introduce un número: "))

while numH != numM:
    print("Adivina")
    numH = int(input("Introduce un número: "))
print("Lo adivinaste, el número es", numM)
