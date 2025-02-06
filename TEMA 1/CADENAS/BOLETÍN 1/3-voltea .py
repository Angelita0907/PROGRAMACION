# voltea: Le da la vuelta a un número. 

numero = int(input("Introduce un número"))

voltea = []

for i in range (len(numero) -1, -1, -1):
    voltea = voltea + numero[i]

print("El numero volteado es ", voltea)

