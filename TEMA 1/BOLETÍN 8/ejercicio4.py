# Dada las edades y las alturas de 4 alumnos, construye un programa 
# que te diga los alumnos que son mayores de 18. Luego que te diga 
# los que miden menos de la media. 


nombre1 = input("Indica un nombre: ")
edad1 = int(input("Indica la edad de " + nombre1 + ":"))
altura1 = int(input("Inidica la altura de " + nombre1 + ":"))

nombre2 = input("Indica un nombre: ")
edad2 = int(input("Indica la edad de " + nombre2 + ":"))
altura2 = int(input("Inidica la altura de " + nombre2 + ":"))

nombre3 = input("Indica un nombre: ")
edad3 = int(input("Indica la edad de " + nombre3 + ":"))
altura3 = int(input("Inidica la altura de " + nombre3 + ":"))

nombre4 = input("Indica un nombre: ")
edad4 = int(input("Indica la edad de " + nombre4 + ":"))
altura4 = int(input("Inidica la altura de " + nombre4 + ":"))

if edad1 > 18:
    print(nombre1, "es mayor de edad")

if edad2 > 18:
    print(nombre2, "es mayor de edad")

if edad3 > 18:
    print(nombre3, "es mayor de edad")

if edad4 > 18:
    print(nombre4, "es mayor de edad")


media = (altura1+altura2+altura3+altura4 / 4)
if altura1 < media:
    print(nombre1, "es más bajo que la media")

if altura2 < media:
    print(nombre2, "es más bajo que la media")

if altura3 < media:
    print(nombre3, "es más bajo que la media")

if altura4 < media:
    print(nombre4, "es más bajo que la media")