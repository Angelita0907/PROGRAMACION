#Lea un número entero por teclado y nos diga si es par, el cero se considera par. Pista Operador % = 0

numero = int(input("Escriba un número: "))

if numero % 2 == 0:
    print("Es par")

else:
    print("Es impar")
