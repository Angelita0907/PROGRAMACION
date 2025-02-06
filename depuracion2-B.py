n = int(input("Introduce un número: "))
numCalculado = 0
    
if n != 1:
        numeros = [6, 3]
        for i in range(2, n):
            numCalculado = numeros[-2] - numeros[-1]
        
            if numCalculado %2 == 0 :
                numCalculado = numCalculado-2
            
            elif numCalculado %i == 0 and numCalculado != 5 :
                numCalculado = numCalculado-i
            
            numeros.append(numCalculado)
            print(numCalculado)
else :
    numeros = [0]
print ("Devolviendo resultados: ", numeros)