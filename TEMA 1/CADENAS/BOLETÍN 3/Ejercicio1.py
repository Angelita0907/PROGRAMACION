# 1. Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

palabra1 = input("Indica una palabra: ")
palabra2 = input("Indica otra palabra: ")

if len(palabra1) < len(palabra2):
    print(palabra1, "es más pequeña que", palabra2)

elif len(palabra2) < len(palabra1):
    print(palabra2, "es más pequeña que", palabra1)

else:
    print("Las dos palabras son de la misma longitud")