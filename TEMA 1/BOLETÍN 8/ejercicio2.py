# Diseña un programa que lee un número y calcula el número 
# elevado a 2.  El programa deja de calcular cuadrados cuando 
# el usuario introduce un número negativo.

numero = int(input("Introduce un número: "))

while not numero <0:
    print(numero**2)
    numero = int(input("Introduce un número: "))