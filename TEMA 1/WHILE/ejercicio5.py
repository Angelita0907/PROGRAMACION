# Escribe un programa que pida al usuario un número y devuelva 
# la tabla de múltiplicar de ese número del 1 al 10

num = int(input("Indica un número: "))
i = 1

while i <=10:
    num = i * num
    i += 1
print(num)
