# Escribe un programa que lea 10 números por teclado y que luego los muestre 
# en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
lista = []

for i in range(0,5,1):
    numero = int(input("Introduce un número: "))
    lista.append(numero)

for j in range (len(lista)-1,-1,-1):
    print(lista[j])


