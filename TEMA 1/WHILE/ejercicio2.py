# Para el siguiente ejercicio, calcula cuánto valdrá al final de la ejecución la variable suma. 
# Realiza la traza de ejecución del programa para saber el valor de cada variable. 
# Piensa la solución sin ejecutar la respuesta
N = 6
suma = 0
i = 1
while i <= N:
    if i % 2 == 0:
        suma += i
    i += 1
print(suma)