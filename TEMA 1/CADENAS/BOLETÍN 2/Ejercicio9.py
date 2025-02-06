# Escribir una programa que reciba una cadena que contiene un número entero y devuelva 
# una cadena con el número y las separaciones de miles. Por ejemplo, si recibe 1234567890, 
# debe devolver 1.234.567.890.

numero = input("Introduce un número entero: ")
cadenaS = ""
contador = 0
for i in range (len(numero)-1, 0, -1):
    contador+=1
    if contador !=3:
        cadenaS = numero[i]+cadenaS

    else:
        cadenaS = "." + numero[i] + cadenaS
        contador=0

print(numero[0] + cadenaS)