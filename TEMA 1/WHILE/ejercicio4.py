# Construye un programa que pida  al usuario que ingrese  números hasta que ingrese un cero y 
# luego muestra la suma de los números ingresados.

suma = 0

num = int(input("Introduce un número: "))

while num != 0:
    suma = suma + num
    num = int(input("Introduce un número: "))

print(suma)
