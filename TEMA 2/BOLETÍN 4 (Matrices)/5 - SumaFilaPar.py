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