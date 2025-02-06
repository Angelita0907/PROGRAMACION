# Diseña y escribe  un programa Python que permita introducir números hasta que se escriba el 0

lista = []

numeros = int(input("Introduce un número:"))

while numeros !=0:
    lista.append(numeros)
    numeros = int(input("Introduce un número:"))
print(lista)

creciente = True
decreciente = True

for i in range(len(lista) - 1):
    if lista[i] < lista[i + 1]:
        decreciente = False
    if lista[i] > lista[i + 1]:
        creciente = False

if creciente:
    print("Orden creciente")
elif decreciente:
    print("Orden decreciente")
else:
    print("Están desordenados")

    