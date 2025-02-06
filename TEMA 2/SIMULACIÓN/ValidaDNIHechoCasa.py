def valida_dni(dni):
    tabla_letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
                    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
                    "C", "K", "E"]
    
    # Separar números y letra final de forma manual
    numeros = []
    letra = None
    for i in range(len(dni)):
        if i < len(dni) - 1: 
            numeros.append(dni[i])
        else:
            letra = dni[i]
    
    if españolResidente(numeros, letra):
        numero = 0
        for caracter in numeros:
            numero = numero * 10 + (ord(caracter) - ord("0"))  # Convertir a entero
        
        resto = numero % 23
        letra_calculada = tabla_letras[resto]
        return letra.upper() == letra_calculada
    
    if dniExtranjero(numeros, letra):
        letra_inicial = numeros[0]
        numero = 0

        for caracter in numeros[1:]:
            numero = numero * 10 + (ord(caracter) - ord("0"))
        
# según la letra del nie
        if letra_inicial.upper() == "X":
            numero = numero
        elif letra_inicial.upper() == "Y":
            numero += 10000000
        elif letra_inicial.upper() == "Z":
            numero += 20000000
        else:
            return False
        
        resto = numero % 23
        letra_calculada = tabla_letras[resto]
        return letra.upper() == letra_calculada
    
    return False


def españolResidente(numeros, letra):
    longitud = 0
    for _ in numeros:
        longitud += 1
    if longitud < 7 or longitud > 8:
        return False
    
    for caracter in numeros:
        if not (caracter >= "0" and caracter <= "9"):
            return False
    
    return True


def dniExtranjero(numeros, letra):
    longitud = 0
    for _ in numeros:
        longitud += 1
    if longitud != 8:  
        return False
    
#  Lo primero sean las letras
    letra_inicial = numeros[0]
    if letra_inicial.upper() not in ["X", "Y", "Z"]:
        return False
    
    return True



print(valida_dni("12345678Z")) 
print(valida_dni("X1234567L"))  
