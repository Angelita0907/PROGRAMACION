'''
Se desea registrar el número de veces que un dado cae en su máximo número posible.
Para ello, generarenmos una matriz con 6 filas (1 para cada dado diferente utilizado)
y 20 columnas (para los resultados de lanzar el dado.)

    a) Construye una función que genere la matriz de forma aleatoria con números con valores entre 1 y 20
    b) construye una función que registre el número de veces que el número "20" aparezca
'''
import random

def generaMatriz ():
    matriz = []
    for numfila in range (0,6):
        fila = []
        for numcolum in range (0, 20):
            fila.append(random.randint(0,20))
        matriz.append(fila)
    
    return matriz

def veinteveces ():
    veinterepe = 0
    matriz  = generaMatriz()
    for fila in matriz:
        for elemento in fila:
            if elemento == 20:
                veinterepe +=1 

    return veinterepe

print(generaMatriz())

print(veinteveces())