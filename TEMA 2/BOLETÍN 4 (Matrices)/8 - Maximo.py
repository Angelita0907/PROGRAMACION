# Por un número de fila, devuelve el numero mayor de esa
def maximoFila (matriz,numFila):
    max = -9999
    for fila in matriz[numFila]:
        if fila > max:
            max = fila
    return max

matriz = [[8, 1, 6], 
          [3, 5, 7], 
          [4, 9, 2], 
          [3, 2, 1]]

print(maximoFila(matriz,0))