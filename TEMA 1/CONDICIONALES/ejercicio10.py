# Realizar un programa que solicite 4 números e imprima la media de los números. 
# También debe imprimir aquellos números que son superiores a la media.


num1 = int(input("Introduce el número 1: "))
num2 = int(input("Introduce el número 2: "))
num3 = int(input("Introduce el número 3: "))
num4 = int(input("Introduce el número 4: "))

media = (num1 + num2 + num3 + num4) / 4

print("La media de los números es:", media)

print("Los números superiores a la media son: ")

if num1 > media:
    print(num1)

if num2 > media:
    print(num2)

if num3 > media:
    print(num3)

if num4 > media:
    print(num4)
