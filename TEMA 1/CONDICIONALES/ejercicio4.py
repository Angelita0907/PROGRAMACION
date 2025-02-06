# Lea un número por teclado y nos diga si o no múltiplo de 3 y de 2.

numero = int(input("Indica un número: "))

if numero % 3 == 0 and numero % 2 == 0:
    print ("Es múltiplo de 3 y 2")

else:
    print("No es múltiplo de ninguno")
