frase = "Esto es un ejemplo"

#A
print(frase.find("o"))

#B
print(frase.index("o"))

#C
print(frase.find("M")) # al buscar en mayúscula devuelve un -1 porque no lo encuentra

#D
print(frase.index("M")) # aquí igual pero el index devuelve un error 

#E
print(frase.upper().find("M")) # ahora si devuelve la posición de la M porque está todo en mayúsculas

