# trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número 
# y devuelve el trozo correspondiente. 

numeros = input("Introduce una cadena: ")
posicioninicial = int(input("Indica que posción inicial deseas: "))
posicionfinal = int(input("Indica que posción inicial deseas: "))

# para validar las posiciones no estén fuera de rango
if posicioninicial < posicionfinal and posicioninicial < len(numeros) and posicionfinal < len(numeros):
    rango = numeros [posicioninicial:posicionfinal+1]
else:
    print("Fuera del rango")

print("Los numeros dentro del rango son: ",rango)