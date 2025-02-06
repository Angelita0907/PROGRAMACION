# 6. Suma columna. Diseña y construye  una función que te sume los elementos de una 
# columna que se recibe por parámetros.

def sumaColumna(matriz, numColumna):
    sumacolum = 0
    for fila in matriz:
        sumacolum = fila[numColumna] + sumacolum
    return sumacolum

# 7. Suma columna pares.  Diseña y construye  una función que recorra una matriz y  
# la suma de los elementos que están en una columna par. Considera el 0 como par.

def sumaColumnaPar (matriz):
    sumaPar = 0
    for numcolum in range (len(matriz)):
        if numcolum  % 2 == 0:
            sumaPar =  sumaPar + sumaColumna(matriz, numcolum)
    return sumaPar

matriz = [[8, 1, 6], [3, 5, 7], [4, 9, 2]]

#Sumar columnas
print(sumaColumna(matriz,1))

#Sumar numeros de columna par
print(sumaColumnaPar(matriz))