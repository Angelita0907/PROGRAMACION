# Lea por teclado un número correspondiente a un mes. Si el valor introducido es menor que 12 debe decir valor correcto 

# Modifica el programa anterior para incluir otra condición que nos diga,además, si el número es menor que 6

dia = int(input("Dime un día del mes: "))

if dia <12:
    print("Valor correcto")
    if dia <6:
        print ("Además es menor que 6")
else:
    print("Valor incorrecto")
