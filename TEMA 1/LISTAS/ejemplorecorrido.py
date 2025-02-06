#recorrer una lista por las posiciones, usando len para que indiquemos cuantos elementos hay
semana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes","Sábado", "Domingo"]

for i in range (len(semana)):
    print(semana[i])

# hacer lo mismo que con el primer for pero con un while
posicion = 0

while posicion < len(semana):
    print(semana[posicion])
    posicion+=1

#otra forma de recorrerla
for valor_semana in semana:
    print(valor_semana)

