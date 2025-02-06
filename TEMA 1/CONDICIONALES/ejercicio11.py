# .Realizar un programa que solicite un carácter por teclado e informe por pantalla si el carácter 
# es una vocal o no lo es. Si es una vocal mostrará el mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.

letra = input("Introduce una letra (minúsculas) : ")

"""
if letra == 'a':
    print("Es la primera vocal (A).")

elif letra == 'e':
    print("Es la segunda vocal (E).")

elif letra == 'i':
    print("Es la tercera vocal (I).")

elif letra == 'o':
    print("Es la cuarta vocal (O).")

elif letra == 'u':
    print("Es la quinta vocal (U).")

else:
    print("El carácter no es una vocal.")

"""

if letra == 'a' or letra == 'e' or letra == 'i' or letra == 'o' or letra == 'u':
    print("")

else:
    print("El carácter no es una vocal.")