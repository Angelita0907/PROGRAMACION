# quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda). 

numeros = input("Introduce cadena de números: ")

quitaDL = int(input("Indica cuantas posiciones quieres quitar por delante: "))

while len(numeros) == quitaDL:
    quitaDL = int(input("Indica cuantas posiciones quieres quitar por delante: "))

salidaDL = numeros [quitaDL-len(numeros):len(numeros)]

print("Nos quedamos con:",salidaDL)