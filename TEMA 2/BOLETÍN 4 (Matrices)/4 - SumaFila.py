def sumaFila (matriz, numFila):
    sumaFila = 0
    for fila in matriz[numFila]:
        sumaFila = fila +  sumaFila
        
    return sumaFila

matriz = [[8,1,6], [3,5,7], [4,9,2]]

print(sumaFila(matriz,0))