# Diseñar una función que calcule el área y el perímetro de una circunferencia. 
# Utiliza dicha función en un programa principal que lea el radio de una circunferencia y 
# muestre su área y perímetro.

import math

def calculaArea (radio):
    area = radio ** 2 * math.pi
    return area

def calculaperimetro (radio):
    perimetro = 2 * math.pi * radio
    return perimetro

def calculaAreayPerimetro(radio):
    area = calculaArea(radio)
    perimetro = calculaperimetro(radio)    
    return[area,perimetro]

radio = int(input("Dame el radio de la circunferencia: "))
resultado = calculaAreayPerimetro(radio)
print("El área es: ",resultado[0],"y","el perímetro es: " ,resultado[1])