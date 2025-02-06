# Realizar un programa que solicite dos números por teclado e imprima en
# pantalla si son iguales, el primero mayor que el segundo o el primero más
# pequeño que el segundo.

num1 = int(input("Dime un número: "))
num2 = int(input("Dime otro número: "))

if num1 == num2:
    print("Son iguales")

elif num1 < num2:
    print("El primero más pequeño que el segundo")

elif num1 > num2:
    print("El primero mayor que el segundo")
