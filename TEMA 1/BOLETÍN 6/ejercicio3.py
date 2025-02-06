# Construye un programa que dado un número me pinte un cuadrado con tantos * por fila 
# como ese número.  Por ejemplo, para número = 4

numero = int(input("Introduce un número: "))

for i in range(numero):
    print("*" * numero)