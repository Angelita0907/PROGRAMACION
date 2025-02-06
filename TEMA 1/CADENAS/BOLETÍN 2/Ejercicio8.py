# Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la 
# aparición del primer carácter en la cadena por el segundo carácter. Considera que el primer 
# carácter puede no aparecer en la cadena. 

cadena = input("Introduce una cadena: ")

sustituir = input("Introduce un carácter a sustituir: ")

while len(sustituir) !=1:
    print("Introduce un solo carácter")
    sustituir = input("Introduce un carácter a sustituir: ")

sustituir2 = input("Introduce otro caracter por el que sustituir: ")
while len(sustituir2) !=1:
    print("Introduce un solo carácter")
    sustituir2 = input("Introduce otro caracter por el que sustituir: ")

cadena_nueva = cadena.replace(sustituir, sustituir2)

print("La nueva cadena es:", cadena_nueva)