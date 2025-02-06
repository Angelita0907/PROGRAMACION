# programa para introducir unos números y que los devuelva al reves (5,7,4 --> 4,7,5)

def alreves (lista):
    print(lista)
    for lista in range (len(lista),0,-1):
        print(lista)

    return lista   

def construyeLista (repetir):
    lista_num = []
    for repetir in range (0,repetir,1):
        num_repetir = int(input("Introduce número: "))
        lista_num.append(num_repetir)
    return lista_num

numeros = int(input("Cuantos números desea introducir: "))
construir = construyeLista(numeros)

listacontrario = alreves(construir)

