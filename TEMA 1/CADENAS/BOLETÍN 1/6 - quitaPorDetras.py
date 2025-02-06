# quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha). 

numeros = input("Introduce un número: ")
quitaDt = int(input("Indica cuantos números quieres quitar: "))

while quitaDt == len(numeros):
    quitaDt = int(input("Indica cuantos números quieres quitar: "))

salidaDt = numeros [0: len(numeros)-quitaDt]

print("Nos quedamos con: ",salidaDt)