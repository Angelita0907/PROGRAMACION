# lo mismo pero guardamos la cadena del revés para compararla si se lee igual del derecho

cadena = int(input("Introduce una cadena de números:"))
cad_rev = []

for i in range (len(cadena-1)):
    cad_rev.append(i)
print(cad_rev)