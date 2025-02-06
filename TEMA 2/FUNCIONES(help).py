# CALCULAR MÁXIMO DE UNA LISTA
def calcularMax (numeros):
    max = -9999

    for i in range (len(numeros)):
        if numeros[i] > max:
            max = numeros[i]
    
    return max

lista_max = []

while len(lista_max) <= 10:
    numero = int(input("Introduce números: "))
    lista_max.append(numero)

print(calcularMax(lista_max))
# ---------------------------------
# imprimir una lista
def imprimelista (lista):
    for i in lista:
        print(i)
# ---------------------------------
# imprime del final al principio
def filasfinal (lista):
    for i in range (len(lista)):
        print(lista[i-1])
# ---------------------------------
# filas del reves
def filasreves (fila):
    cadena = ""
    for i in range (len(fila)-1,-1,-1):
        if cadena == "":
            cadena = "["+fila[i]
        else:
            cadena = cadena +", "+ fila[i]
    return cadena+"]"
# ---------------------------------
# imprime las filas con la función que te da los numeros al reves
def imprimeFilaInvertida (lista):
     for fila in lista:
        print(filasreves(fila))
# ---------------------------------
#punto 4 (fila invertida y column invertida)
def matrizinvertida (lista):
    for i in range (len(lista)-1,-1,-1):
        print(filasreves(lista[i]))
# ---------------------------------
# punto 5
def dameColumna (lista,numColumna):
    columnas = []
    for i in range(0,len(columnas)):
       columnas.append(lista[i][numColumna])
    return columnas
# ---------------------------------
#punto 6
def imprimecolumna(lista):
    columnas = ""
    for j in range (len(lista)):
        columnas = imprimelista(lista[j])
    return columnas

ListaGeneral = [[8,1,6],[3,5,7],[4,9,2]]

# ---------------------------------

# Crea un programa que genere 100 números de forma aleatoria (del 0 al 1000)  
# y que posteriormente ofrezca al usuario la posibilidad de:
# Conocer el mayor
# Conocer el menor
# Obtener la suma de todos los números
# Obtener la media
# Sustituir el valor de un elemento por otro número introducido por teclado
# Mostrar todos los números

# ---------------------------------
# devuelve numero de fila y columna segun la posición que preguntes
def getElementoMatriz (matriz, numFila,numColum):    
    elemento = matriz [numFila] [numColum]
    
    return elemento
# devuelve toda la fila según la fila que preguntes
def getFila (matriz, numFila):
    fila = matriz [numFila]

    return fila
# devuelve la columna según el numero que preguntes
def getColumna (matriz,numColum):
    columna = []
    for i in range(0,len(matriz)):
       columna.append(matriz[i][numColum])
    return columna
matriz = [[8,1,6], [3,5,7], [4,9,2]]
# ---------------------------------
# SUMA ELEMENTOS MATRIZ
def calculaSuma (matriz):
    suma = 0

    for fila in matriz:
        for elemento in fila:
            suma = elemento + suma
    return suma

matriz = [[8,1,6], [3,5,7], [4,9,2]]

print(calculaSuma(matriz))
# ---------------------------------
# encontrar numeros pares 
def numerosPar (matriz):
    pares = []
    for fila in matriz:
        for elemento in fila:
            if elemento % 2 == 0:
                pares.append(elemento)
    return pares

matriz = [[8,1,6], [3,5,7], [4,9,2]]

print(numerosPar(matriz))
# ---------------------------------
# sumar filas
def sumaFila (matriz, numFila):
    sumaFila = 0
    for fila in matriz[numFila]:
        sumaFila = fila +  sumaFila
    return sumaFila

def sumaFilaPar (matriz):
    sumaPar = 0
    for numFila in range (len(matriz)):
        if numFila  % 2 == 0:
            sumaPar =  sumaPar + sumaFila(matriz, numFila)
    return sumaPar

matriz = [[8,1,6], [3,5,7], [4,9,2]]

print(sumaFilaPar(matriz))
# ---------------------------------
# Suma de columnas
def sumaColumna(matriz, numColumna):
    sumacolum = 0
    for fila in matriz:
        sumacolum = fila[numColumna] + sumacolum
    return sumacolum

def sumaColumnaPar (matriz):
    sumaPar = 0
    for numcolum in range (len(matriz)):
        if numcolum  % 2 == 0:
            sumaPar =  sumaPar + sumaColumna(matriz, numcolum)
    return sumaPar

matriz = [[8, 1, 6], [3, 5, 7], [4, 9, 2]]
# ---------------------------------
# como usar diagonales en matricez
# si la sumas de sus filas y columnas da lo mismo
def esCuadrada(matriz):
    cuadrada = False
    fila = len(matriz)
    columna = len(matriz[0])
    if fila == columna:
        cuadrada =True
    return cuadrada

# diagonal principal empezando en el 0,0
def diagonalPrincipal (matriz):
    listaDiagonal = []
    columna = 0
    fila = 0
    if esCuadrada(matriz):
        for filas in matriz:
            elemento = (matriz[fila][columna])
            listaDiagonal.append(elemento)
            columna = columna+1
            fila =  fila+1
    return listaDiagonal
# lo mismo pero al reves
def diagonalSecundaria (matriz):
    listaSecundaria= []
    columna = len(matriz) - 1
    if esCuadrada (matriz):
        for posfila in range (0,len(matriz)):
            elemento = (matriz[posfila][columna])
            listaSecundaria.append(elemento)
            columna = columna - 1

    return listaSecundaria

# ejercicio 11
def sumaDiagonal (matriz,esPrincipal):
    suma = 0
    if esPrincipal:
        diagonal = diagonalPrincipal(matriz)
    else:
        diagonal = diagonalSecundaria(matriz)

    for elemento in diagonal:
        suma = elemento + suma
    resultado = suma

    return resultado

matriz = [[8, 1, 6], 
          [3, 5, 7], 
          [4, 9, 2]]