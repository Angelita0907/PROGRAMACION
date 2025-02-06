# Crea un función "ConvertirEspaciado", que reciba como parámetro un texto y devuelve una 
# cadena con un espacio adicional tras cada letra. Por ejemplo, "Hola, tú" devolverá 
# "H o l a , t ú ". Crea un programa principal donde se use dicha función.

def convertirespaciado(cadena):
    cadenaresultado = ""
    
    for i in cadena:
        if i != " ":    
            cadenaresultado = cadenaresultado + i + " "    
    return cadenaresultado

cadena = input("Introduce un texto:")

resultado = convertirespaciado(cadena)
print(resultado)