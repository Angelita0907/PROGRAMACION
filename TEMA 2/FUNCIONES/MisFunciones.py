def suma (num1,num2):
    return num1+num2

# si no le decimos un exponente (num2) se consediera que esta elevado a 1
def exponente (num1, num2=1):
    contador = 0 
    if num2 == 0:
        resultado = 1
    else:
        resultado = 1
        for i in range (1, num2):
            resultado= resultado*num1
            contador+=1
    return resultado

