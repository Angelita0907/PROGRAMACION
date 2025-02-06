# Crea un programa que genere dos números al azar entre el 0 y el 10, 
# y pida al usuario que calcule e introduzca su suma. Si la respuesta no es correcta, 
# deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte.  

import random
random1 = random.randint(0, 10)
random2 = random.randint(0, 10)

suma= random1 + random2

suma2 = int(input(""))

while suma2!= suma:
    suma2 = int(input(""))
