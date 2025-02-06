# Ejecuta y entiende  qué valor se devolverá con cada una de estas expresiones:

palabras = ["Lunes", "Martes", "Miércoles", "Jueves",]

#Primero --> es como un bucle el primero indica de donde empieza hasta que posiscion acaba
print(palabras[1:4])
print(palabras[1: len(palabras)])

#Segundo --> cuenta desde la posición 0 hasta la posición 2 por el -2
print(palabras[0:len(palabras)-2])

#Tercero --> -len imprime los ultimos y con +2 seria (-4+2 = -2) imprime los dos últimos
print(palabras[-len(palabras)+2:])

#Cuarto --> imprime las dos primeras (4 -2) len imprime todo hasta 2 por el intervalo -2
print(palabras[:len(palabras) -2])

#Quinto -->
print(palabras[len(palabras)-2] )

#Sexto --> devuelve el último elemento
print(palabras[-1])
