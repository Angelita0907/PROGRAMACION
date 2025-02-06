# Diseña y codifica un programa que te vaya pidiendo grupos de 3 números. Para cada grupo de 3, 
# debes imprimirlos ordenados y volver a pedirte otros tres. El programa debe terminar cuando, 
# al menos, ha leído un grupo en los que dos o más números son 0 o menores que 0.

grupo = []

numero = int(input("Introduce número:"))

while len(grupo) !=3:
    numero = int(input("Introduce número:"))
    grupo.append(numero)

print(grupo)


