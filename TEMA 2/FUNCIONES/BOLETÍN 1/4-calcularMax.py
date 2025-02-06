# Crea una función "calcularMaxMin" que recibe una lista con valores numéricos y devuelve 
# el valor máximo y el mínimo. Crea un programa que pida 10 números por teclado y muestre el 
# máximo y el mínimo, utilizando la función anterior.

def calcularMax (numeros):
    max = -9999

    for i in range (len(numeros)):
        if numeros[i] > max:
            max = numeros[i]
    
    return max

lista_max = []

while len(lista_max) <= 10:
    numero = int(input("Introduce números: "))
    lista_max.append(numero)

print(calcularMax(lista_max))
