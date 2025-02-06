palabras = ["Hola", "Hello", "Ola", "Hello"]
palabras2 = ["Adios", "Bye", "Goodbye", "adio"]
palabras3 = [1,2,3]


palabras.insert(3, "Adios")
print(palabras)

palabras[1] = "HELLO"
print(palabras)

#anadir listas a otras

palabras = palabras2 + palabras
print(palabras)

palabras.extend(palabras2)
print(palabras)

palabras.extend(palabras3)
print(palabras)

palabras.append(palabras3)
print(palabras)

