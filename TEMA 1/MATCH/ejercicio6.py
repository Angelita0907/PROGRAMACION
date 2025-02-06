# Calculadora Simple: Crea una calculadora que realice operaciones básicas 
# (suma, resta, multiplicación y división) según la elección del usuario. 
print("========================================")
print("		CALCULADORA")
print("========================================")
print("Introduzca + si desea sumar")
print("Introduzca - si desea restar")
print("Introduzca * si desea multiplicar")
print("Introduzca / si desea dividir")
print("Introduzca @ para salir del menú")
print("=======================================")

operacion = input("Introduce la operación que deseas: ")
num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))

while operacion != "@":
    match operacion:
        case "+":
            print(num1+num2)
        case "-":
            print(num1-num2)
        case "*":
            print(num1*num2)
        case "/":
            print(num1/num2)
    print("========================================")
    print("		CALCULADORA")
    print("========================================")
    print("Introduzca + si desea sumar")
    print("Introduzca - si desea restar")
    print("Introduzca * si desea multiplicar")
    print("Introduzca / si desea dividir")
    print("Introduzca @ para salir del menú")
    print("=======================================")
    
    operacion = input("Introduce la operación que deseas: ")
    if operacion != "@":
        num1 = int(input("Introduce un número: "))
        num2 = int(input("Introduce otro número: "))
