
semana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes","Sábado", "Domingo"]

# Muestra el valor del elemento 6 de un array f.
print(semana[6])

# Inicializa los 5 primeros elementos de un array unidimensional de enteros a 8.
import random
numeros= []

for i in range (0 , 8):
    numeros.append(random.randint(0,8))

print(numeros)


# Crea una lista con los 20 primeros número múltiplos de 3
multiplos = []

for j in range (0,61,3):
    multiplos.append(j)

print(multiplos)

# Usa la lista anterior para copiarle por el final la lista ['martes', 'miércoles', 'jueves']
dias = ["Martes","Miércoles","Jueves"]
multiplos.extend(dias)
print(multiplos)

# Partiendo de la lista de múltiplos de 3, inserta en la posición 8 la palabra “programo”
multiplos.insert(8, "programo")

print(multiplos)