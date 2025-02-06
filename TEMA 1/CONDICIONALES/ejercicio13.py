# Realizar un programa que lea un carácter y dos números enteros por teclado.
# Si el carácter leído es un operador aritmético, calcular la operación
# correspondiente, si es cualquier otro debe mostrar un error.

operador = input("Introduce operador aritmético: ")

if operador == "+" or operador == "-" or operador == "/" or operador == "%" or operador == "*":
    num1 = int(input("Indica un número: "))
    num2 = int(input("Indica otro número: "))

    if operador == "+":
        print("El resultado es", num1+num2)
    elif operador == "-":
        print("El resultado es", num1-num2 )
    elif operador == "*":
        print("El resultado es", num1*num2)
    elif operador == "/":
        print("El resultado es", num1/num2)
    elif operador == "%":
        print("El resultado es", num1%num2)

else:
    print("Error")