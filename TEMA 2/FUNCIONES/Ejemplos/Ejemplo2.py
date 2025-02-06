# funcion que calcule el exponente

def exponente (num1,num2):
    resultado = 1
    for i in range(1,num2+1):
        resultado = resultado *num1
    return resultado

resultado_funcion = exponente (5,1)
print(resultado_funcion)

resultado_funcion = exponente(5,2)
print(resultado_funcion)

resultado_funcion = exponente (5,3)
print(resultado_funcion)
