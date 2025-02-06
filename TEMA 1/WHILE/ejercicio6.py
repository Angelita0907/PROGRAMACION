# Haz un programa que permita calcular la suma de dos números. 
# Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta 
# que ambos números introducidos sean 0.

num1 = int(input("Indica un número: "))
num2 = int(input("Indica otro número: "))

while not (num1 ==0 and num2 ==0):
    print(num1+num2)
    num1 = int(input("Indica un número: "))
    num2 = int(input("Indica otro número: "))

print("Los numeros son 0")
