#  Crea un programa que te pida por teclado tu nombre y tus dos apellidos y los guarde en una lista. 
# A continuación, crea una función que reciba esta lista e imprima cuántas letras “a” contiene. 

def numeroAes (lista):
    Aes = 0
    letra = "a"
    for palabra in lista:
        for caracter in palabra:
            if caracter == letra:
                Aes+=1
    return Aes

nombre = input("Indica tu nombre: ")
apellido1 = input("Indica tu priemr apellido: ")
apellido2 = input("Indica tu segundo apellido: ")
nombre_completo = [nombre,apellido1,apellido2]

totalA = numeroAes(nombre_completo)
print("Tu nombre es: ", nombre_completo)
print("Tiene en total", totalA, "letras 'A'.")
