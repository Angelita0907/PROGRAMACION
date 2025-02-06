# Lea un número por teclado y nos diga si o no múltiplo de 3 y de 2.
# Si es par, mire si, además, es múltiplo de 6

numero = int(input("Indica un número: "))

if numero % 2 == 0 and numero % 3 == 0:
    print ("Es múltiplo de 2 y 3")

    if numero % 6 == 0:
        print("Además es múltiplo de 6")


