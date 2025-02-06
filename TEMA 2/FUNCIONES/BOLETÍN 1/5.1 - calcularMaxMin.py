# lo mismo pero que devuelva minimo y máximo a la vez

def calcularMaxMin (numeros):
    max = -9999
    min = 9999
    for i in range (len(numeros)):
        if numeros[i] > max:
            max = numeros[i]

        if numeros[i] < min:
            min = numeros[i]

    return max,min

lista = []
while len(lista) <= 10:
    numero = int(input("Introduce números: "))
    lista.append(numero)

max,min = calcularMaxMin(lista)
print("El mínimo es: ",min)
print("El míáximo es: ",max)
