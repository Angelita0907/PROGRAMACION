# Lea un número por teclado y nos diga si o no múltiplo de 3 y de 2.
# Si es par, mire si, además, es múltiplo de 6
# Modifica el programa anterior para que además nos muestre si el número es impar.


numero = int(input("Indica un número: "))

if numero % 3 == 0 and numero % 2 == 0:
    print ("Es múltiplo de 3 y 2")

    if numero % 6 == 0:
        print("Además el múltiplo de 6")

if numero % 2 !=0:
    print("Es impar")
