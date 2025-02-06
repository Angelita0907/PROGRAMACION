""" 
Ángela Chica Montero

Apartado 1
    funcion autocompletado (lista,letra)
    devuelve listaAtcompleta 
    
Apartado 2
    funcion BuscaporPalabra (lista, palabra)
    devuelve listaPalabraSimil
"""

def autocompletado (listaPalabras,letra):
    listaAutocompleta = []

    for i in range (len(listaPalabras)):
        producto = listaPalabras.index(letra[i])
        listaAutocompleta.append(producto)

    return listaAutocompleta

def BuscaporPalabra (listaPalabras, palabra):
    return

listaPalabras = ["Core i9", "Ryzen 9", "core i7", "Ryzen 5", "fury Beast", "Vengeance LPX", "trident Z5", "Ballistix Sport", 
                 "980 PRO", "Black SN850X", "barracuda HDD", "MX500 SSD", "geForce RTX", "radeon RX", "GeForce GTX", "Radeon 6600",  
                 "ROG STRIX", "MPG B550", "Aorus X570", "steel legend" ]

letra = input("Por cual letra desea buscar: ")

assert(autocompletado(listaPalabras,"r"))

print(autocompletado(listaPalabras,letra))
print(listaPalabras)