# Construye un programa que dado un número me devuelva un triángulo de *. 
# Imagina que le damos el 5, la primera fila tendrá un *, dos la segunda, 
# así hasta que la quinta tenga 5. 

numero = int(input("Introduce un número: "))

triangulo = 1
while triangulo <= numero:
    estrella = ""
    for i in range(triangulo):
        estrella += "*"
    print(estrella)
    triangulo += 1