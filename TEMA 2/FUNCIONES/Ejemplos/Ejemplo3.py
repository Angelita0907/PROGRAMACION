def exponente (num1,num2):
    if num2 == 0:
        resultado = 1

    for i in range(1,num2+1):
        resultado = resultado*num1
    return resultado

resultadoNum = exponente(5,0)
print(resultadoNum)

resultadoNum = exponente(5,1)
print(resultadoNum)
