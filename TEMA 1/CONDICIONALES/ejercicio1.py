# Lea por teclado un número correspondiente a un mes. Si el valor introducido es menor que 12 debe decir valor correcto #

dia = int(input("Dime un día del mes: "))

if dia <= 12:
    print("Valor correcto")
else:
    print("Valor incorrecto")
