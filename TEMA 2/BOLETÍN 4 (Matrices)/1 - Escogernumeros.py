# A
def getElementoMatriz (matriz, numFila,numColum):    
    elemento = matriz [numFila] [numColum]
    
    return elemento

#B

def getFila (matriz, numFila):
    fila = matriz [numFila]

    return fila

#C
def getColumna (matriz,numColum):
    columna = []
    for i in range(0,len(matriz)):
       columna.append(matriz[i][numColum])
    return columna

matriz = [[8,1,6], [3,5,7], [4,9,2]]

print("A: ",getElementoMatriz (matriz, 1, 1))
print("B: ", getFila(matriz,2))
print("C: ", getColumna(matriz, 0))