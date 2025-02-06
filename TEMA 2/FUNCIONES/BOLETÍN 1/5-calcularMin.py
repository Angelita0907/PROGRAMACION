# ahora con el mínimo

def calcularMin (numeros):
    min = 9999

    for i in range (len(numeros)-1,-1,-1):
        if numeros[i] < min:
            min = numeros[i]
    
    return min

lista_min = []

while len(lista_min) <= 10:
    numero = int(input("Introduce números: "))
    lista_min.append(numero)

print(calcularMin(lista_min))
