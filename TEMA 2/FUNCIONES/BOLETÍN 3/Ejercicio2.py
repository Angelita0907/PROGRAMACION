# Construye un programa que almacene en una lista de listas los siguientes valores
# punto 1
def imprimelista (lista):
    for i in lista:
        print(i)
# punto 2
def filasfinal (lista):
    for i in range (len(lista)):
        print(lista[i-1])
# punto 3
def filasreves (fila):
    cadena = ""
    for i in range (len(fila)-1,-1,-1):
        if cadena == "":
            cadena = "["+fila[i]
        else:
            cadena = cadena +", "+ fila[i]
    return cadena+"]"

def imprimeFilaInvertida (lista):
     for fila in lista:
        print(filasreves(fila))

#punto 4 (fila invertida y column invertida)
def matrizinvertida (lista):
    for i in range (len(lista)-1,-1,-1):
        print(filasreves(lista[i]))

# punto 5
def dameColumna (lista,numColumna):
    columnas = []
    for i in range(0,len(columnas)):
       columnas.append(lista[i][numColumna])
    return columnas

#punto 6
def imprimecolumna(lista):
    columnas = ""
    for j in range (len(lista)):
        columnas = imprimelista(lista[j])
    return columnas



ListaGeneral = [[8,1,6],[3,5,7],[4,9,2]]
lista = [["a","b","c"],["d","e","f"],["g","h","i"]]
imprimelista(ListaGeneral)
print("------------------")
filasfinal(ListaGeneral)
print("------------------")
imprimeFilaInvertida(lista)
print("------------------")
matrizinvertida(lista)
print("------------------")
dameColumna(lista,2)
#print(dameColumna(lista,2))
#print("------------------")
#imprimecolumna(lista)