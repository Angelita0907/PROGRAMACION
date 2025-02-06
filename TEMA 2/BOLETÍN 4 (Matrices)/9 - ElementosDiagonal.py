def diagonalPrincipal (matriz):
    listaDiagonal = []
    columna = 0
    fila = 0
    for filas in matriz:
        elemento = (matriz[fila][columna])
        listaDiagonal.append(elemento)
        columna = columna+1
        fila =  fila+1
    return listaDiagonal

def diagonalSecundaria (matriz):
    listaSecundaria= []
    columna = len(matriz) - 1
    for posfila in range (0,len(matriz)):
        elemento = (matriz[posfila][columna])
        listaSecundaria.append(elemento)
        columna = columna - 1

    return listaSecundaria

matriz = [[8, 1, 6], 
          [3, 5, 7], 
          [4, 9, 2]]

print(diagonalPrincipal(matriz))
print(diagonalSecundaria(matriz))