# Para el siguiente ejercicio, calcula cuánto valdrá al final de la ejecución la variable producto . 
# Realiza la traza de ejecución del programa para saber el valor de cada variable. 
# Piensa la solución sin ejecutar la respuesta

n = int(input("Ingrese un número entero positivo: "))
producto = 1
i = 1
while i <= n:
    producto *= i
    i += 1
print("El producto de los números del 1 al", n, "es:", producto)

