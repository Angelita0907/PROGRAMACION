# Crear una función que calcule la temperatura media de un día a partir de la temperatura 
# máxima y mínima. Crear un programa principal, que utilizando la función anterior, vaya 
# pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la media. El programa 
# pedirá el número de días que se van a introducir.

def tempmedia (min, max):
    media = (min+max)/2
    return media

dia = int(input("Cuantos días quieres saber la temperatura: "))

for i in range (0, dia):
    min = int(input("Introduce temperatura mínima: "))
    max = int(input("Introduce temperatuta máxima: "))
    
    resultadomedia = tempmedia(min,max)
    print("La temperatura media es ",resultadomedia)

