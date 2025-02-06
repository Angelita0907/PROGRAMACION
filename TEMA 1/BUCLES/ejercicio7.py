# Escribe un programa que pida al usuario un número y devuelva 
# la tabla de múltiplicar de ese número del 1 al 10

numero = int(input("Dime un número: "))

for i in range(10,0,-1):
    print(numero, "x",i,"=",numero*i)

