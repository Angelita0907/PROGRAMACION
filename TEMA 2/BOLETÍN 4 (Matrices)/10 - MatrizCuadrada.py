#ejercicio 10
def esCuadrada(matriz):
    cuadrada = False
    fila = len(matriz)
    columna = len(matriz[0])
    if fila == columna:
        cuadrada =True
    return cuadrada

#ejercicio 9
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

print(diagonalPrincipal(matriz))
print(diagonalSecundaria(matriz))
print(esCuadrada(matriz))

print(sumaDiagonal(matriz,True))